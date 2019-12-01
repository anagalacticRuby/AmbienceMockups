package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This entire program is a mockup for the Ambience application. All screens may be subject to
 * change if there is a desire, so nothing is 100% certain to be in the final just yet. Last edited
 * on: 12/1/2019. 
 *
 * @author Nicholas Hansen
 */
public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("MainMenuDemo.fxml"));
    primaryStage.setTitle("Ambience Ui Mockup");
    primaryStage.setResizable(false);
    Scene scene = new Scene(root, 335, 600);
    scene.getStylesheets().add(getClass().getResource("AmbienceStyle.css").toExternalForm());
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
