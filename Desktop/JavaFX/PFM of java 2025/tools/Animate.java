package tools;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Animate{
    public static void translate(Node node,int x , int y){
        TranslateTransition translate = new TranslateTransition(Duration.millis(1000),node);
        translate.setByX(x);
        translate.setByY(y);
        translate.play();
    }
}