/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wavegame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

/**
 *
 * @author Alex
 */
public class Game extends Canvas implements Runnable {
          

    public static final int WIDTH=1120, HEIGHT= WIDTH/12*9;
    private static final long serialVersionUID = -936280009401218795L;
    
    private Thread thread;
    private boolean running= false;
    private final Handler handler;
    private final Random random;
    
    public Game(){
        handler = new Handler();
        this.addKeyListener(new KeyInput(handler));

        
        Window window = new Window(WIDTH,HEIGHT,"Lets Build a game!", this);
        
       
        random = new Random();
       
        handler.addObject(new Player(WIDTH/2-32,HEIGHT/2-32, ID.Player));
                handler.addObject(new Player(WIDTH/2+64,HEIGHT/2-32, ID.Player2));

        
    }
    
    public synchronized void start(){
        thread = new Thread(this);
        thread.start();
        running=true; 
        
    }
    
    public synchronized void stop(){
        try{
            thread.join();
            running = false;
        }catch(InterruptedException e){
        }
        
    }
    
    @Override
    public void run(){
        long lastTime= System.nanoTime();
        long timer= System.currentTimeMillis();
        double amountOfTicks=60.0;
        double ns= 1000000000/amountOfTicks;
        double delta = 0;
        int frames=0;
        
        while (running){
            long now = System.nanoTime();
            delta += (now-lastTime)/ ns;
            lastTime=now;
            while (delta >=1){
                tick();
                delta--;
                
            }
            if (running)
                render();
            frames++;
            
            if(System.currentTimeMillis()-timer > 1000){
                timer += 1000;
            //    System.out.println("FPS: "+ frames);
                frames=0;
            }
        }
        stop();
        
    }
    private void tick(){
        handler.tick();
    }
    
    private void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if (bs==null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        
        g.setColor(Color.black);
        g.fillRect(0,0, WIDTH, HEIGHT);
        
        handler.render(g);
        g.dispose();
        bs.show();
    }
    public static void main(String args[]){
        Game game = new Game();
        
    }
}
