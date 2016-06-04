package application;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Main extends Application {

	@FXML Label text;
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane border = new BorderPane();
			TextField myTextField = new TextField();
			VBox vBox = new VBox();
			
			Label label = new Label("John Ferguson");
			Label output = new Label("Output");
			
			//vBox.set
			border.setTop(label);
			border.setCenter(vBox);
			border.setBottom(myTextField);
			Scene scene = new Scene(border, 500, 500);

			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
