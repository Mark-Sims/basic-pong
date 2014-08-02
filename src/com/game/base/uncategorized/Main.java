/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.game.base.uncategorized;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;


/**
 *
 * @author Mark
 */
public class Main {
    
    private static Game game;
    
    
    public static void main(String[] args){
        // 1 - Start Display
        initDisplay();
        initGL();
        
        // 2 - Start Game
        initGame();
        
        gameLoop();
            // 3 - Get Input
            // 4 - Update Logic
            // 5 - Render Updates
        
        // 6 - Clean Up Leftovers
        cleanUp();
        
    }    
    

    
    private static void getInput(){
        game.getInput();
    }
    private static void initGame(){
        game = new Game();
    }
    
    private static void update(){
        game.update();
    }
    
    private static void render(){
        glClear(GL_COLOR_BUFFER_BIT);
        glLoadIdentity();
        
        game.render();
        
        Display.update();
        Display.sync(60);
    }


    private static void gameLoop(){
        
        while(!Display.isCloseRequested() && !Keyboard.isKeyDown(Keyboard.KEY_Q)){
            // 3 - Get Input
            getInput();
            // 4 - Update Logic
            update();
            // 5 - Render Updates
            render();
            
        }   
    }
    
    private static void initGL(){
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, Display.getWidth(), 0, Display.getHeight(), -1, 1);
        glMatrixMode(GL_MODELVIEW);
        
        glDisable(GL_DEPTH_TEST);
        glClearColor(0, 0, 0, 1);
    }
    private static void cleanUp(){
        Display.destroy();
        Keyboard.destroy();
    }
    private static void initDisplay(){
        // Create Display
        try {
            Display.setDisplayMode(new DisplayMode(800,600));
            Display.create();    
            Display.setVSyncEnabled(true);
            Keyboard.create();
        } 
        
        catch (LWJGLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);   
        }
    }
    
}
