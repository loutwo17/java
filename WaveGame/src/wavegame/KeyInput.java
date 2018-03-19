/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wavegame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Alex
 */ 
public class KeyInput extends KeyAdapter{
     
    
    public void KeyPresed(KeyEvent e){
    int key =  e.getKeyCode();
    System.out.println(key);
    }
    
    public void KeyReleased(KeyEvent e){
    int key = e.getKeyCode();
    }
} 