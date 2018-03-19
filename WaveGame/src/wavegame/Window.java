/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wavegame;


import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Alex
 */
public class Window extends Canvas{

    private static final long serialVersionUID = 3022413001403188373L;
    
        public Window(int width, int height, String title, Game game){
            JFrame frame = new JFrame(title);
            frame.setPreferredSize(new Dimension(width,height));
            frame.setMaximumSize(new Dimension(width,height));
            frame.setMinimumSize(new Dimension(width,height));
            
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null); // not needed
            frame.add(game);
            frame.setVisible(true);
            game.start();
            
            
            
        }
}
