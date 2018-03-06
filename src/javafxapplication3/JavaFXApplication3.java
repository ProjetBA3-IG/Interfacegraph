/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author Baldé
 */
public class JavaFXApplication3 extends Application {
    
    @Override
    public void start(Stage primaryStage) 
    {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(700, 550);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
 //*******************************************************
        Shapes shapes[] = new Shapes[4];
        shapes[0] = new Rectangle(gc,canvas);
        shapes[1] = new Ellipse(gc, canvas);
        shapes[2] = new Diamond(gc, canvas);
        shapes[3] = new Parallelogram(gc, canvas);
         //gc.fillPolygon(new double[]{10.0, 100.0, 20.0, 0.0}, new double[]{10.0, 10.0, 20.0, 0.0}, 4);
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
}