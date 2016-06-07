/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guibasics;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author snobo_000
 */
public class GuiBasicsController extends BorderPane {
    @FXML private TextField myTextField;
    @FXML private Label validity;
    @FXML private Button myButton;
    @FXML private Label output;
    
    public GuiBasicsController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
            "GuiBasics.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        }
        catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    
}
