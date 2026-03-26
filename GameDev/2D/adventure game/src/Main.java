import classes.Background;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage stage) {
		
		Background root = new Background(0, 0)	
		
		
		
		// app config
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
