/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.game.base.uncategorized;

import java.awt.Font;
import org.lwjgl.input.Mouse;

/**
 *
 * @author Mark
 */
public abstract class Button {
    
    protected float x;
    protected float y;
    
    protected float xLeft;
    protected float xRight;
    protected float yBottom;
    protected float yTop;
    
    protected float sizeX;
    protected float sizeY;
    
    protected String text;
    
    public Button(float x, float y, float sizeX, float sizeY, String buttonText){
        this.x = x;
        this.y = y;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.text = buttonText;
        
        xLeft = x - (sizeX / 2);
        xRight = x + (sizeX / 2);
        yBottom = y - (sizeY / 2);
        yTop = y + (sizeY / 2);
        
    }

    public boolean isClicked(){
        int currentMouseX = Mouse.getX();
        int currentMouseY = Mouse.getY();
        
        if(currentMouseX >= xLeft && currentMouseX <= xRight){
            if(currentMouseY >= yBottom && currentMouseY <= yTop){
                return Mouse.isButtonDown(0);
            }
        }
        return false;
    }
    
    public void render(){
        Draw.rectCenterPt((int)xLeft, (int)yBottom, (int)sizeX, (int)sizeY);
    }
    abstract public void PerformClickedAction();
}
