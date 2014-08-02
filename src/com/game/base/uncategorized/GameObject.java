/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.game.base.uncategorized;

/**
 *
 * @author Mark
 */
public abstract class GameObject {
    protected float x, y;
    
    protected float sizeX, sizeY;
    
    abstract void update();
    
    public void render(){
        Draw.rect((int)x, (int)y, (int)sizeX, (int)sizeY);        
    }
    
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public float getSizeX(){
        return sizeX;
    }
    public float getSizeY(){
        return sizeY;
    }
    
    public float getCenterY(){
        return y + (sizeY / 2);
    }
}
