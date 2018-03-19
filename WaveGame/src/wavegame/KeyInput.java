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
public class KeyInput extends KeyAdapter {

    private Handler handler;

    public KeyInput(Handler handler) {
        this.handler = handler;
    }

    public void KeyPresed(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getId() == ID.Player) {
                //player 1 kev events
                if (key == KeyEvent.VK_W) {
                    tempObject.setVelocityY(-5);
                }
                if (key == KeyEvent.VK_S) {
                    tempObject.setVelocityY(5);
                }
                if (key == KeyEvent.VK_D) {
                    tempObject.setVelocityX(5);
                }
                if (key == KeyEvent.VK_A) {
                    tempObject.setVelocityX(-5);
                }
                if (tempObject.getId() == ID.Player2) {
                    //player 2 kev events
                    if (key == KeyEvent.VK_UP) {
                        tempObject.setVelocityY(-5);
                    }
                    if (key == KeyEvent.VK_DOWN) {
                        tempObject.setVelocityY(5);
                    }
                    if (key == KeyEvent.VK_RIGHT) {
                        tempObject.setVelocityX(5);
                    }
                    if (key == KeyEvent.VK_LEFT) {
                        tempObject.setVelocityX(-5);
                    }
                }
            }
        }
    }

    public void KeyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getId() == ID.Player) {
                //player 1 kev events
                if (key == KeyEvent.VK_W) {
                    tempObject.setVelocityY(0);
                }
                if (key == KeyEvent.VK_S) {
                    tempObject.setVelocityY(0);
                }
                if (key == KeyEvent.VK_D) {
                    tempObject.setVelocityX(0);
                }
                if (key == KeyEvent.VK_A) {
                    tempObject.setVelocityX(0);
                }
                if (tempObject.getId() == ID.Player2) {
                    //player 2 kev events
                    if (key == KeyEvent.VK_UP) {
                        tempObject.setVelocityY(0);
                    }
                    if (key == KeyEvent.VK_DOWN) {
                        tempObject.setVelocityY(0);
                    }
                    if (key == KeyEvent.VK_RIGHT) {
                        tempObject.setVelocityX(0);
                    }
                    if (key == KeyEvent.VK_LEFT) {
                        tempObject.setVelocityX(0);
                    }
                }

            }
        }
    }
}
