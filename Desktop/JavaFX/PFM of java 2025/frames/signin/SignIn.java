/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frames.signin;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

// importer les autres classes
import tools.Animate;
import frames.login.Login;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class SignIn {    
    public  static Scene getScene(Stage primaryStage){
        StackPane root = new StackPane();
        
        // anchor pane for shapes => background 
        AnchorPane bg = new AnchorPane();
        root.getChildren().add(bg);
        // add some shapes (panes)
        Pane p1 = new Pane();
        p1.setStyle("-fx-background-color : #765;-fx-background-radius : 500 ;");
        p1.setPrefSize(300, 300);
        AnchorPane.setTopAnchor(p1, -150.0);
        AnchorPane.setLeftAnchor(p1,-150.0);
        Pane p2 = new Pane();
        p2.setStyle("");
        Pane p3 = new Pane();
        p3.setStyle("");
        
        bg.getChildren().addAll(p1,p2,p3);
        
        // main pane
        AnchorPane form = new AnchorPane();
        root.getChildren().add(form);
        
        
        Button label = new Button("Login");
        root.getChildren().add(label);
        label.setOnAction(d->{
            // redirect
            primaryStage.setScene(Login.getScene(primaryStage));
        });
        Scene scene = new Scene(root,900,700);
        scene.getStylesheets().add(SignIn.class.getResource("/frames/ressources/css/index.css").toExternalForm());
        return scene;
    }
}
