
package loadimageusingfilechooser;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;

public class LoadImageUsingFileChooser extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        
        // create image View
        ImageView imgV = new ImageView();
        // limit dimensions of the image view
        imgV.setFitWidth(200);
        imgV.setPreserveRatio(true);
        root.setCenter(imgV);

        // button to load 
        Button btn = new Button("Import");
        HBox h = new HBox();
        h.getChildren().add(btn);
        root.setTop(h);
        
        // label to show path
        Label path = new Label();
        root.setBottom(path);
        
        btn.setOnAction(event->{
            String absolutePath = new FileChooser().showOpenDialog(primaryStage).toString();
            // verifier si une image est selectionnée
            if (absolutePath.endsWith(".png") || 
                    absolutePath.endsWith(".jpg") ||
                        absolutePath.endsWith(".webp"))
            {

                imgV.setImage(new Image("file:" + absolutePath));
            }else {
                System.out.println("Il faut selectionner seulement les images");
                return;
            }
            path.setText("File Path : " + absolutePath);
        });
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Load images");
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
