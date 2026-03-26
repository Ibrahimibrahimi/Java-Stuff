package classes;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class Background extends StackPane{
	public static final String DEFAULT = "imgs/default.png";
	String path = Background.DEFAULT;
	private int Width , Height ;
	public Background(int w, int h) {
		super();
		this.setPrefSize(w, h);
	}
	public Background(String path,int w , int h) {
		super();
		this.setPrefSize(w, h);
		this.path = path;
	}
	private void _init() {
		ImageView imgV = new ImageView();
		imgV.setFitHeight(Width);
		imgV.setFitWidth(Height);
		try {
			// add image as first layer (current solution)
			imgV.setImage(new Image(path));
		}
		catch (Exception e){
			System.out.printf("\n Image '%s' not found. setting default.. \n.",path);
			imgV.setImage(new Image(DEFAULT));
		}
		this.getChildren().add(imgV);
	}
}
