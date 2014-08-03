/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.game.base.uncategorized;

import org.lwjgl.opengl.Display;

/**
 *
 * @author Mark
 */
public class MainMenu {
    
    private StartGameButton start;
    
    public MainMenu(){
        start = new StartGameButton(Display.getWidth() / 2,
                Display.getHeight() / 2,
                120,
                30,
                "Start Game");
        
    }
    
    public void render(){
        start.render();
    }
    
    public void getInput(){
        if(start.isClicked()){
            System.out.println("New Game");
        }
    }

}
