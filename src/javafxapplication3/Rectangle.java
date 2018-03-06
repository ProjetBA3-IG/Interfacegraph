   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import static java.lang.System.gc;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Baldé
 */
public class Rectangle extends Shapes{ 

    public Rectangle(GraphicsContext gc, Canvas canvas) {
        super(gc, canvas);
    }
 
    @Override
   public void drawShapes() {
        double y = canvas.getHeight();
        double x= canvas.getWidth();
        
        gc.strokeRect(10, 440, x /5,y / 8);   
    }       
}
