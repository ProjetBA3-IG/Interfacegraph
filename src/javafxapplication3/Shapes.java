/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Baldé
 */
public abstract class Shapes {
    
   protected GraphicsContext gc;
   protected Canvas canvas;
   protected String text;
    protected Listner listner;

    public Shapes(GraphicsContext gc, Canvas canvas) {
        this.listner = new Listner();
        this.canvas = canvas;
        this.gc = this.canvas.getGraphicsContext2D();
        this.drawShapes(); 
    }
   
     public abstract void drawShapes();
    
}
