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
public class Parallelogram extends Shapes{

    public Parallelogram(GraphicsContext gc, Canvas canvas) {
        super(gc, canvas);
    }

    @Override
   public void drawShapes(){
        gc.strokePolygon(new double[]{110.0, 150.0, 50.0,10}, new double[]{120.0, 60.0, 60.0, 120.0}, 4);
   }
    
    
}
