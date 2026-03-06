// ------------- write this class in another file 
class Animate{
    public static void translate(Label label,int x , int y){
        TranslateTransition translate = new TranslateTransition();
        translate.setByX(x);
        translate.setByY(y);
        translate.setDuration(Duration.millis(1000));
        translate.setNode(label);
        translate.play();
    }
    public static void translate(Pane pane,int x , int y){
        TranslateTransition translate = new TranslateTransition();
        translate.setByX(x);
        translate.setByY(y);
        translate.setDuration(Duration.millis(1000));
        translate.setNode(pane);
        translate.play();
    }
    public static void translate(TextField textField,int x , int y){
        TranslateTransition translate = new TranslateTransition();
        translate.setByX(x);
        translate.setByY(y);
        translate.setDuration(Duration.millis(1000));
        translate.setNode(textField);
        translate.play();
    }
    public static void translate(PasswordField textField,int x , int y){
        TranslateTransition translate = new TranslateTransition();
        translate.setByX(x);
        translate.setByY(y);
        translate.setDuration(Duration.millis(1000));
        translate.setNode(textField);
        translate.play();
    }
	public static void translate(Button btn,int x , int y){
        TranslateTransition translate = new TranslateTransition();
        translate.setByX(x);
        translate.setByY(y);
        translate.setDuration(Duration.millis(1000));
        translate.setNode(btn);
        translate.play();
    }
}