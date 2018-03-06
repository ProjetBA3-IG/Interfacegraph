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
public class Ellipse extends Shapes
{  

    public Ellipse(GraphicsContext gc, Canvas canvas) {
        super(gc, canvas);
    }

    
   @Override
   public void drawShapes(){
       double y = this.canvas.getHeight();
        double x = this.canvas.getWidth();
        gc.strokeOval(10, 300, x/5, y/5);
   }
   
    
}
