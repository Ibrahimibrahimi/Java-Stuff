
package fileloader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.util.Duration;
import javax.swing.JOptionPane;

public class FileLoader extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        
        
        

        // scrolled pane 
        ScrollPane scroll = new ScrollPane();
        root.setCenter(scroll);
        
        FlowPane container = new FlowPane();
        scroll.setContent(container);
        
        ImageView selected = null;
        
        // add button to decrease size of image
        Button dec = new Button("-");
        Button inc = new Button("+");
        Button left = new Button("<");
        Button right  = new Button(">");
        
        // button to load 
        Button btn = new Button("Import images");
        HBox h = new HBox();
        h.getChildren().add(btn);
        root.setTop(h);
        
        // label to show path
        Label path = new Label();
        root.setBottom(path);
        Button animate = new Button("Animate");
        
        
            
        
        btn.setOnAction(event->{
            String absolutePath = new FileChooser().showOpenDialog(primaryStage).toString();
            // verifier si une image est selectionnee
            if (absolutePath.endsWith(".png") || 
                    absolutePath.endsWith(".jpg") ||
                        absolutePath.endsWith(".webp"))
            {
                // create image View
                ImageView imgV = new ImageView();
                // limit dimensions of the image view
                imgV.setFitWidth(200);
                imgV.setPreserveRatio(true);
                imgV.setImage(new Image("file:" + absolutePath));
                
                // append to container vertical 
                container.getChildren().add(imgV);
                
                path.setText("File Path : " + absolutePath);
                
                // add event to other buttons 
                    dec.setOnAction(e->{
                selected.setFitWidth(selected.getFitWidth() - 5);
            });
            inc.setOnAction(e->{
                selected.setFitWidth(selected.getFitWidth() + 5);
            });
            left.setOnAction(e->{
                selected.setTranslateX(selected.getTranslateX() - 5);
            });
            left.setOnAction(e->{
                selected.setTranslateX(selected.getTranslateX() + 5);
            });
            animate.setOnAction(e->{
                // create animation 
                TranslateTransition translate = new TranslateTransition();
                translate.setDuration(Duration.millis(1000));
                translate.setNode(selected);
                translate.setByX(30);
                translate.setByX(30);
                translate.setByY(30);
                // play animation
                translate.play();
            });
            }else {
                System.out.println("Il faut selectionner seulement les images");
                JOptionPane.showMessageDialog(null , " Select only for images");
            }
        });
        
        
        
        
        
        Button importAll = new Button("poly Import ");
        importAll.setOnAction(e->{
            List<File> images = new FileChooser().showOpenMultipleDialog(primaryStage);
            for(File i : images){
                // create image View
                ImageView imgV = new ImageView();
                // limit dimensions of the image view
                imgV.setFitWidth(200);
                imgV.setPreserveRatio(true);
                imgV.setImage(new Image("file:" + i.getAbsolutePath()));
                
                // append to container vertical 
                container.getChildren().add(imgV);
                
                path.setText("File Path : " + i.getAbsolutePath());
            }
        });
        
        
        
        h.getChildren().addAll(inc,dec,left,right,animate,importAll);
        
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
