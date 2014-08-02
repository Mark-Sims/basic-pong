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
public class GO_Player extends GameObject {
    
    public static final float SIZE_X = 16;
    public static final float SIZE_Y = 16 * 7; 
    public static final int SPEED = 4;
    
    private GO_Ball ball;

    public GO_Player(float x, float y, GO_Ball ball){
        this.x = x;
        this.y = y;
        this.sizeX = SIZE_X;
        this.sizeY = SIZE_Y;
        this.ball = ball;
    }
    
    @Override
    void update() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(Physics.checkCollisions(this, ball)){
            ball.reverseX(getCenterY());
        }
    }
    
    public void move(int direction){
        this.y = this.y + (SPEED * direction);
    }
    
}
