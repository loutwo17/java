/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wavegame;

import java.awt.Graphics;

/**
 *
 * @author Alex
 */
public abstract class GameObject {
    
    protected int x,y; // protected means can only be accessed by class that inherits gameobject
    
    protected ID id;
    
    protected int velocityX,velocityY;
    
    
    
    public GameObject(int x, int y, ID id){
        this.x =x;
        this.y=y;
        this.id=id;
        
    }
    
    public abstract void tick();
    
    public abstract void render(Graphics g);
    
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }public void setId(ID id){
        this.id=id;
    }
    public ID getId(){
        return id;
    }
    
    public void setVelocityX(int velocityX){
        this.velocityX=velocityX;
    }
    public int getVelocityX(){
        return velocityX;
    }
    
    public void setVelocityY(int velocityY){
        this.velocityY=velocityY;
    }
    public int getVelocityY(){
        return velocityY;
    }
}
