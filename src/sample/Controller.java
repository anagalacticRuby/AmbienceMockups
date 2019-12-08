package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

  @FXML public Button upButton;

  @FXML private CheckBox themeCheck;

  @FXML private TextField roomName;

  @FXML private Button joinRoomButt;

  @FXML private TextField roomPassCode;

  @FXML private Button createRoomButt;

  @FXML private Hyperlink createRoomLink;

  @FXML private Hyperlink joinRoomLink;

  @FXML private Hyperlink nicknameLink;

  @FXML private Hyperlink roomLink;

  @FXML private Label bgColorText;

  @FXML private Label headerTextColor;

  @FXML private Label bodyTextColor;

  /**
   * This method takes you to the create a room example scene.
   *
   * @param event click listener
   * @throws IOException you need the correct files for this to work.
   */
  @FXML
  void goToCreate(MouseEvent event) throws IOException {
    Parent primaryScreenParent = FXMLLoader.load(getClass().getResource("CreateRoomScene.fxml"));
    Scene primaryScreen = new Scene(primaryScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(primaryScreen);
    window.show();
  }

  /**
   * This method takes you to the join room scene example.
   *
   * @param event click listener
   * @throws IOException you need the files for this to work
   */
  @FXML
  void goToJoin(MouseEvent event) throws IOException {
    Parent primaryScreenParent = FXMLLoader.load(getClass().getResource("JoinRoomScene.fxml"));
    Scene primaryScreen = new Scene(primaryScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(primaryScreen);
    window.show();
  }

  /**
   * This method takes you to the nickname scene example.
   *
   * @param event click listener
   * @throws IOException you need the file otherwise you get an IO exception
   */
  @FXML
  void goToNickname(MouseEvent event) throws IOException {
    Parent primaryScreenParent = FXMLLoader.load(getClass().getResource("NicknameScene.fxml"));
    Scene primaryScreen = new Scene(primaryScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(primaryScreen);
    window.show();
  }

  /**
   * This method takes you to the example scene of what I imagined the rooms to look like.
   *
   * @param event click button
   * @throws IOException changing scenes can cause an IO Exception if you miss the file
   */
  @FXML
  void goToRoom(MouseEvent event) throws IOException {
    Parent primaryScreenParent = FXMLLoader.load(getClass().getResource("RoomExampleScene.fxml"));
    Scene primaryScreen = new Scene(primaryScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(primaryScreen);
    window.show();
  }

  /**
   * This method changes the theme ONLY on the main menu. There are only two options because I
   * didn't want to spend forever on this.
   *
   * @param event click listener
   */
  @FXML
  void changeTheme(ActionEvent event) {
    if (themeCheck.isSelected()) {
      themeCheck.getScene().getStylesheets().remove("sample/AmbienceStyle.css");
      themeCheck.getScene().getStylesheets().add("sample/AltStyle.css");
      bgColorText.setText("Background Color: #172317");
      bodyTextColor.setText("Body Text Color: #96ccb2");
      headerTextColor.setText("Header Text Color: #63dda0");
    } else {
      themeCheck.getScene().getStylesheets().add("sample/AmbienceStyle.css");
      bgColorText.setText("Background Color: #212128");
      bodyTextColor.setText("Body Text Color: #e178f6");
      headerTextColor.setText("Header Text Color: #f5007a");
    }
  }

  /**
   * This method takes you to the main menu of the demo, and is attached to all the "up" buttons on
   * multiple demo screens.
   *
   * @param event click listener
   * @throws IOException you need the files required for this to work.
   */
  @FXML
  void returnToMainMenu(MouseEvent event) throws IOException {
    Parent primaryScreenParent = FXMLLoader.load(getClass().getResource("MainMenuDemo.fxml"));

    Scene primaryScreen = new Scene(primaryScreenParent);
    primaryScreen
        .getStylesheets()
        .add(getClass().getResource("AmbienceStyle.css").toExternalForm());
    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(primaryScreen);
    window.show();
    window.requestFocus();
  }

  @FXML
  void initialize() {}
}
