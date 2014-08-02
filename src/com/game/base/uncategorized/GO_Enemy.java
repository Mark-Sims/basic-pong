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
public class GO_Enemy extends GameObject{
    
    public static final float SIZE_X = 16f;
    public static final float SIZE_Y = 16f * 7f;
    public static final float MAX_SPEED_Y = 4f;
    public static final float DAMPENING = 0.05f;
    
    private GO_Ball ball;
    
    public GO_Enemy(float x, float y, GO_Ball ball){
        this.x = x;
        this.y = y;
        this.sizeX = SIZE_X;
        this.sizeY = SIZE_Y;
        this.ball = ball;
    }
    
    public void update(){
        if (Physics.checkCollisions(this, ball)){
            ball.reverseX(getCenterY());
        }
        
        float speed = (ball.getCenterY() - getCenterY()) * DAMPENING;
                
        if(speed > MAX_SPEED_Y){
            speed = MAX_SPEED_Y;
        }
        else if(speed < -MAX_SPEED_Y){
            speed = -MAX_SPEED_Y;
        }
        
        y  = y + speed;
    }
}
