/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wavegame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Alex
 */
public class Player extends GameObject {
    
    
    Random random = new Random();
    public Player (int x, int y, ID id){
        super(x,y,id);
              
    }
    
    @Override
    public void tick(){
        x += velocityX;
        y += velocityY;
    }
    
    @Override
    public void render(Graphics g){
        g.setColor(Color.white);
        g.fillRect(x, y, 32, 32);
    }
}
