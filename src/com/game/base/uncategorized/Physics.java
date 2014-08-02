/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.game.base.uncategorized;

import java.awt.Rectangle;

/**
 *
 * @author Mark
 */

//TODO: Implement this intersection detection yourself.
//      Implement this rectangle class as a child of shape class.
//      Other Shape possibilities. Triangle, circle
public class Physics {
    public static boolean checkCollisions(GameObject go1, GameObject go2){
        Rectangle r1 = new Rectangle((int)go1.getX(), (int)go1.getY(), (int)go1.getSizeX(), (int)go1.getSizeY());
        Rectangle r2 = new Rectangle((int)go2.getX(), (int)go2.getY(), (int)go2.getSizeX(), (int)go2.getSizeY());
        
        return r1.intersects(r2);
    }
}
