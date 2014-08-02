/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.game.base.uncategorized;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glPopMatrix;
import static org.lwjgl.opengl.GL11.glPushMatrix;
import static org.lwjgl.opengl.GL11.glRotatef;
import static org.lwjgl.opengl.GL11.glTranslatef;
import static org.lwjgl.opengl.GL11.glVertex2f;

/**
 *
 * @author Mark
 */
public class Draw {
    public static void rect(int x, int y, int width, int height){
        rect(x, y, width, height, 0);
    }
    public static void rect(int x, int y, int width, int height, int rotation){
        glPushMatrix();
        {
            glTranslatef(x,y,0);
            glRotatef(rotation, 0, 0, 1);
            glBegin(GL_QUADS);
            {
                glVertex2f(0,0);
                glVertex2f(0,height);
                glVertex2f(width,height);
                glVertex2f(width,0);
            }
            glEnd();
        }
        glPopMatrix();
    }
}

//        glColor3f(.25f, .75f, .5f);
//        
//        drawRect(56,56,35,400);
//        drawRect(56,56,400,35);
