package frames.home;

import frames.login.Login;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Home extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(Login.getScene(primaryStage));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Conectify0 - Intégrer dans un monde de connexion");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
