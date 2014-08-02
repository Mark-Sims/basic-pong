/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.game.base.uncategorized;

import java.util.ArrayList;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

/**
 *
 * @author Mark
 */
public class Game {
    
    private ArrayList<GameObject> objects;
    GO_Ball ball;
    GO_Player player1;
    GO_Enemy enemy;
    
    int playerScore, enemyScore;
    
    public Game(){
        objects = new ArrayList<GameObject>();
        ball = new GO_Ball((Display.getWidth() / 2 - GO_Ball.SIZE / 2),
                (Display.getHeight() / 2 - GO_Ball.SIZE / 2));
        
        player1 = new GO_Player(0,
                Display.getHeight() / 2 - GO_Player.SIZE_Y / 2,
                ball);
    
        enemy = new GO_Enemy(Display.getWidth() - GO_Enemy.SIZE_X,
                Display.getHeight() / 2 - GO_Enemy.SIZE_Y / 2,
                ball);
        
        GO_Wall wallBottom = new GO_Wall(0,
                0,
                Display.getWidth(),
                GO_Wall.STD_SIZE,
                ball);
//        GO_Wall wallRight = new GO_Wall(Display.getWidth() - GO_Wall.STD_SIZE,
//                0,
//                GO_Wall.STD_SIZE,
//                Display.getHeight(),
//                ball);
        GO_Wall wallTop = new GO_Wall(0,
                Display.getHeight() - GO_Wall.STD_SIZE,
                Display.getWidth(),
                GO_Wall.STD_SIZE,
                ball);
//        GO_Wall wallLeft = new GO_Wall(0,
//                0,
//                GO_Wall.STD_SIZE,
//                Display.getHeight(),
//                ball);                
        
        objects.add(ball);
        objects.add(player1);
        objects.add(enemy);   
        objects.add(wallBottom);
        //objects.add(wallRight);
        objects.add(wallTop);
        //objects.add(wallLeft);
    }
    public void update(){
        for(GameObject go : objects){
            go.update();
        }
        
        if(ball.getX() > Display.getWidth() - ball.getSizeX()){
            playerScore++;
            ball.reset();
        }
        if(ball.getX() < 0){
            enemyScore++;
            ball.reset();
        }
    }
    
    public void render(){
        for(GameObject go : objects){
            go.render();
        }
        Display.setTitle("Player: " + playerScore + " | Computer: " + enemyScore);
    }
    public void getInput(){
        if(Keyboard.isKeyDown(Keyboard.KEY_W) || Keyboard.isKeyDown(Keyboard.KEY_UP)){
            player1.move(1);
        }
        else if(Keyboard.isKeyDown(Keyboard.KEY_S) || Keyboard.isKeyDown(Keyboard.KEY_DOWN)){
            player1.move(-1);
        }
    }

}
