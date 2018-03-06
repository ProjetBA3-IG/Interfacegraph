/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

/**
 *
 * @author Baldé
 */
public class Diamond extends Shapes{

    public Diamond(GraphicsContext gc, Canvas canvas) {
        super(gc, canvas);
    }
    
     @Override
   public void drawShapes(){
     
      gc.strokePolygon(new double[]{80.0, 150.0, 80.0,10}, new double[]{280.0, 220.0, 160.0, 220.0}, 4);
       
   }
   
}
