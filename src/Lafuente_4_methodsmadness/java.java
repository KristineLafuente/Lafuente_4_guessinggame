/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lafuente_4_javafxintro;

import java.awt.Transparency;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author Kristine
 */
public class Lafuente_4_JavaFXintro extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(400, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Strawberry(gc);
        Mint(gc);
        Cherry(gc);
        Cone(gc);
        Rect(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
        private void Strawberry(GraphicsContext gc) {
        gc.setFill(Color.HOTPINK);
        gc.fillOval(70, 110, 100, 100);
       }
        private void Mint(GraphicsContext gc) {
        gc.setFill(Color.MEDIUMSPRINGGREEN);
        gc.fillOval(62, 187, 120, 120);
        }
        private void Cherry(GraphicsContext gc) {
        gc.setFill(Color.RED);
        gc.fillOval(90, 85, 30, 30);
        }
        private void Cone(GraphicsContext gc) {  
        gc.setFill(Color.TAN);
        gc.fillRect(87, 300, 70, 130);
        }
        private void Rect(GraphicsContext gc) {
        gc.fillRect(75, 290, 95, 60);
        }
        }

    
    
    
    
