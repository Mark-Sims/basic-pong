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
public class StartGameButton extends Button{

    public StartGameButton(float x, float y, float sizeX, float sizeY, String buttonText) {
        super(x, y, sizeX, sizeY, buttonText);
    }

    @Override
    public void PerformClickedAction() {
        System.out.println("Performed Click Action");
    }
    
}
