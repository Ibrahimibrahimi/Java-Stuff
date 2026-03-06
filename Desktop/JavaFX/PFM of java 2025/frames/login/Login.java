package frames.login;

import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Duration;

// importer les autres classes
import tools.Animate;
import frames.signin.SignIn;

public class Login {

    private static boolean animationFinie = false;

    public static Scene getScene(Stage primaryStage) {
        String emptyProfilePng = "/frames/ressources/media/empty-profile.png";
        String showPassIcon = "/frames/ressources/media/show.png";
        String exitImage = "/frames/ressources/media/closeApp.png";

        AnchorPane root = new AnchorPane();

        // Exit button
        Button exit = new Button();
        ImageView io = new ImageView();
        exit.setGraphic(io);
        io.setImage(new Image(Login.class.getResourceAsStream(exitImage)));
        io.setFitWidth(30);
        io.setPreserveRatio(true);
        AnchorPane.setTopAnchor(exit, 0.0);
        AnchorPane.setRightAnchor(exit, 0.0);
        exit.getStyleClass().add("exit-btn");
        root.getChildren().add(exit);

        exit.setOnAction(d -> primaryStage.hide());

        // SVG background panel
        Pane svg = new Pane();
        svg.setStyle("-fx-background-color : #34495e;-fx-background-radius : 300;");
        svg.setPrefSize(800, 800);
        root.getChildren().add(svg);
        AnchorPane.setBottomAnchor(svg, 0.0);
        AnchorPane.setRightAnchor(svg, 400.0);

        // Welcome text
        Label welcome = new Label("Bonjour\nchez\nConectify...");
        welcome.setStyle("-fx-font-size : 60;-fx-text-fill : white;-fx-padding : 12;");
        welcome.setPrefWidth(350);
        welcome.setWrapText(true);
        root.getChildren().add(welcome);
        AnchorPane.setTopAnchor(welcome, 70.0);
        AnchorPane.setLeftAnchor(welcome, 30.0);

        welcome.setTranslateX(-200);
        Animate.translate(welcome, 200, 0);

        // Profile circle
        BorderPane emptyProfile = new BorderPane();
        emptyProfile.setStyle("-fx-background-color : #34495a;-fx-background-radius : 200;");
        emptyProfile.setPrefSize(150, 150);
        root.getChildren().add(emptyProfile);
        AnchorPane.setRightAnchor(emptyProfile, 140.0);
        AnchorPane.setTopAnchor(emptyProfile, 60.0);

        ImageView i = new ImageView();
        i.setImage(new Image(Login.class.getResourceAsStream(emptyProfilePng)));
        i.setFitWidth(100);
        i.setPreserveRatio(true);
        emptyProfile.setCenter(i);

        // Username label
        Label username = new Label("Nom d'utilisateur");
        username.getStyleClass().add("l");
        root.getChildren().add(username);
        AnchorPane.setRightAnchor(username, 180.0);
        AnchorPane.setTopAnchor(username, 250.0);

        // Username input
        StackPane textContainer = new StackPane();
        textContainer.setPrefSize(290, 50);
        textContainer.getStyleClass().add("input-container");
        root.getChildren().add(textContainer);
        AnchorPane.setLeftAnchor(textContainer, 440.0);
        AnchorPane.setTopAnchor(textContainer, 290.0);

        TextField usernameI = new TextField();
        usernameI.setFocusTraversable(false);
        usernameI.getStyleClass().add("input");
        usernameI.setPrefSize(320, 50);
        textContainer.getChildren().add(usernameI);

        Label usernameErr = new Label("Nom d'utilisateur introuvable");
        usernameErr.getStyleClass().add("err-l");
        usernameErr.setVisible(false);
        root.getChildren().add(usernameErr);
        AnchorPane.setLeftAnchor(usernameErr, 445.0);
        AnchorPane.setTopAnchor(usernameErr, 340.0);

        // Password label (hidden initially)
        Label password = new Label("Mot de passe");
        password.getStyleClass().add("l");
        root.getChildren().add(password);
        AnchorPane.setRightAnchor(password, 180.0);
        AnchorPane.setTopAnchor(password, 270.0);
        password.setTranslateX(380);

        StackPane passContainer = new StackPane();
        passContainer.setPrefSize(260, 50);
        passContainer.getStyleClass().add("input-container");
        root.getChildren().add(passContainer);
        AnchorPane.setLeftAnchor(passContainer, 440.0);
        AnchorPane.setTopAnchor(passContainer, 310.0);
        passContainer.setTranslateX(380);

        PasswordField passwordI = new PasswordField();
        passwordI.setFocusTraversable(false);
        passwordI.getStyleClass().add("input");
        passwordI.setPrefSize(320, 50);
        passContainer.getChildren().add(passwordI);

        Label passwordErr = new Label("Mot de passe incorrect");
        passwordErr.getStyleClass().add("err-l");
        passwordErr.setTranslateX(380);
        passwordErr.setVisible(false);
        root.getChildren().add(passwordErr);
        AnchorPane.setLeftAnchor(passwordErr, 445.0);
        AnchorPane.setTopAnchor(passwordErr, 360.0);

        Button showPass = new Button("");
        showPass.getStyleClass().add("show-pass-btn");
        ImageView imgV = new ImageView(new Image(Login.class.getResourceAsStream(showPassIcon)));
        imgV.setFitWidth(27);
        imgV.setPreserveRatio(true);
        showPass.setGraphic(imgV);
        showPass.setPrefSize(50, 49);
        showPass.setTranslateX(135);
        showPass.setTranslateY(-1);
        passContainer.getChildren().add(showPass);

        showPass.setOnAction(d -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Mot de passe");
            alert.setHeaderText(null);
            alert.setContentText("Mot de passe :" + passwordI.getText());
            alert.showAndWait();
        });

        Button loginBtn = new Button("Continue");
        loginBtn.getStyleClass().add("btn");
        loginBtn.setPrefSize(150, 50);
        loginBtn.setAlignment(Pos.CENTER);
        root.getChildren().add(loginBtn);
        AnchorPane.setBottomAnchor(loginBtn, 140.0);
        AnchorPane.setRightAnchor(loginBtn, 150.0);

        Label noAcc = new Label("Besoin de compte?");
        root.getChildren().add(noAcc);
        AnchorPane.setBottomAnchor(noAcc, 30.0);
        AnchorPane.setRightAnchor(noAcc, 80.0);

        Hyperlink noAccount = new Hyperlink("Creer un");
        noAccount.setFocusTraversable(false);
        root.getChildren().add(noAccount);
        AnchorPane.setBottomAnchor(noAccount, 26.0);
        AnchorPane.setRightAnchor(noAccount, 23.0);

        loginBtn.setOnAction(e -> {
            if (usernameI.getText().equals("")) {
                usernameErr.setVisible(true);
                usernameErr.setText("Champ vide !");
                return;
            }
            boolean exist = true;
            if (!exist) {
                usernameErr.setText("Nom d'utilisateur introuvable");
                usernameErr.setVisible(true);
                return;
            }
            usernameErr.setVisible(false);
            if (!animationFinie) {
                ScaleTransition scale = new ScaleTransition();
                scale.setByX(-0.2);
                scale.setByY(-0.2);
                scale.setNode(emptyProfile);
                scale.play();

                Animate.translate(emptyProfile, -10, -50);
                Animate.translate(username, 0, -90);
                Animate.translate(textContainer, 0, -90);
                Animate.translate(usernameErr, 0, -90);
                Animate.translate(password, -420, 0);
                Animate.translate(passContainer, -380, 0);
                Animate.translate(passwordErr, -380, 0);
                Animate.translate(svg, -50, -10);

                RotateTransition rotate = new RotateTransition();
                rotate.setByAngle(25);
                rotate.setDuration(Duration.millis(1000));
                rotate.setNode(svg);
                rotate.play();

                animationFinie = true;
                loginBtn.setText("Login");
                return;
            }
            if (passwordI.getText().equals("")) {
                passwordErr.setText("Champ vide !");
                passwordErr.setVisible(true);
                return;
            }
            boolean isCorrect = false;
            if (!isCorrect) {
                passwordErr.setVisible(true);
                passwordErr.setText("Mot de passe incorrect");
                return;
            }
            passwordErr.setVisible(false);
            String current = usernameI.getText();
        });
        
        
        noAccount.setOnAction(d->{
            // redirect
            primaryStage.setScene(SignIn.getScene(primaryStage));
        });

        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(SignIn.class.getResource("/frames/ressources/css/index.css").toExternalForm());
        
        
        return scene;
    }
}
