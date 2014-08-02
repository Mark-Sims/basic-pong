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
public class GO_Ball extends GameObject {
    
    public static final int SIZE = 16;
    public static final float MAX_SPEED_X = 4f;
    public static final float MAX_SPEED_Y = 8f;
    public static final float DAMPENING = 0.05f;
    
    public float velX;
    public float velY;
    
    public float startX;
    public float startY;
    
    public GO_Ball(float x, float y){
        this.x = x;
        this.y = y;
        this.sizeX = SIZE;
        this.sizeY = SIZE;
        velX = -MAX_SPEED_X;
        velY = 0;
        
        startX = x;
        startY = y;
    }

    @Override
    void update() {
        x += velX;
        y += velY;
    }
    
    public void reverseX(float center){
        velX *= -1;
        velY += (getCenterY() - center) * DAMPENING;
                
        if(velY > MAX_SPEED_Y){
            velY = MAX_SPEED_Y;
        }
        else if(velY < -MAX_SPEED_Y){
            velY = -MAX_SPEED_Y;
        }
    }
    
    public void reverseY(){
        velY *= -1;
    }

    public void reset() {
        this.x = startX;
        this.y = startY;
        
        velY = 0;
        velX *= -1;
    }
    
}
