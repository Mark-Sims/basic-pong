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
public class GO_Wall extends GameObject{
    
    public static final int STD_SIZE = 16;
    
    private GO_Ball ball;
    
    public GO_Wall(float x, float y, float sizeX, float sizeY, GO_Ball ball){
        this.x = x;
        this.y = y;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.ball = ball;
    }
    
    @Override
    public void update(){
        if(Physics.checkCollisions(this, ball)){
            ball.reverseY();
        }
    }
}
