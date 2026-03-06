/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loginwindow;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author admin
 */
public class animations extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        
        Button myBtn = new Button("animated");
        root.setTop(myBtn);
        
        Button Btn = new Button("Animate");
        Btn.setOnAction(event->{
            // keyframes
            TranslateTransition translate = new TranslateTransition(); 
            translate.setNode(myBtn);
            translate.setDuration(Duration.millis(1200));
            translate.setByX(500);
            translate.setByY(0);
            translate.setRate(3);
            translate.play();            
        });
        root.setBottom(Btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Animations ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
