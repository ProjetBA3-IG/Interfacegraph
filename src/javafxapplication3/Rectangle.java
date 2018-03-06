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
public class Rectangle
{ 
    private GraphicsContext gc;
    private Canvas canvas;
    private String text;
    private Listner listner;

    public Rectangle(Canvas c){
        this.listner = new Listner();
        this.canvas = c;
        this.gc = this.canvas.getGraphicsContext2D();
        this.drawShapes();             
    }
    
    private void drawShapes() {
        double x = this.canvas.getWidth();
        double y = this.canvas.getHeight();
        this.gc.strokeRect(10, 10, x /5,y / 5);
        this.gc.fillText(text, 20,20);
        this.gc.strokeText("helo avec rectangle", 20, 20);
        
        System.out.println(" hi "+x /2);
    }       
}
