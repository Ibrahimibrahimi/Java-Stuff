package TestIcons;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
public class TestIcons extends Application
{

@Override
public void start(Stage stage)
{
    BorderPane root = new BorderPane();
    
    
    Button create = new Button("Create");
    create.setOnAction(exdfgh->{
        String r = FileManager.getText(new File("carss.txt"));
        
    });
    
    
    // use serialization 
        
        
        Post posts[] = new Post[]{
        new Post("First poste","Ibrahim"),
            new Post("Second post","Ahmed"),
        new Post("First poste","Ibrahim"),
            new Post("Second post","Ahmed"),
        new Post("First poste","Ibrahim"),
            new Post("Second post","Ahmed"),
        new Post("First poste","Ibrahim"),
            new Post("Second post","Ahmed"),
        new Post("First poste","Ibrahim"),
            new Post("Second post","Ahmed"),
        new Post("First poste","Ibrahim"),
            new Post("Second post","Ahmed"),
        new Post("First poste","Ibrahim"),
            new Post("Second post","Ahmed"),
        new Post("First poste","Ibrahim"),
            new Post("Second post","Ahmed"),
        new Post("First poste","Ibrahim"),
            new Post("Second post","Ahmed")
        };
        // write posts 
        String sepa = "Separator1234"; //  separator between datas
        for(Post i : posts){
            FileManager.createFile(new File("posts/" + i.id + ".txt"), i.author + sepa + i.text);
        }
    
    
    root.setCenter(create);
    
    
// create and configure the scene
Scene scene = new Scene(root, 500, 200);
// configure the stage
stage.setScene(scene);
stage.setTitle("Testing ");
stage.show();
}
public static void main(String[] args)
{
launch(args);
}
}