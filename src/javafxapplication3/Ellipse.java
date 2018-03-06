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
public class Ellipse {
    private GraphicsContext gc;
    private Canvas canvas;
    private String text;
   // private Listner listner;

    public Ellipse(Canvas canvas) {
        this.gc = this.canvas.getGraphicsContext2D();
        this.canvas = canvas;
        //this.listner = listner;
        this.drawShapes();
    }
    
   private void drawShapes(){
       double x = this.canvas.getWidth();
       double y = this.canvas.getHeight();
       this.gc.fillOval(10, 60, x/5, y/5);
       this.gc.fillText(text, x, y);
       this.gc.strokeText("hello avec Ellipse", x, y);
   }
    
}
