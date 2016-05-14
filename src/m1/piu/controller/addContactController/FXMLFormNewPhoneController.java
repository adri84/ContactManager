/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu.controller.addContactController;

import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import m1.piu.LayoutLoader;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class FXMLFormNewPhoneController implements Initializable {

    private Stage addPhoneStage;

    public GridPane addContactPane;
    public ChoiceBox<String> phoneType;

    public FXMLFormNewPhoneController() {

        try {

            addContactPane = (GridPane) LayoutLoader.loadLayout("view/newContactView/newPhoneView.fxml", this);

            phoneType.getItems().addAll("Home", "Mobile", "Office");

            addPhoneStage = new Stage();
            addPhoneStage.setScene(new Scene(this.getObject()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public GridPane getObject() {
        return addContactPane;
    }

    public void show() {
        addPhoneStage.show();
    }

    public void close() {
        addPhoneStage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {}

}
