/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu.controller.addContactController;

import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import m1.piu.LayoutLoader;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class FXMLFormAddressTabController implements Initializable {

    public GridPane addressPane;
    public Pane contactTypeData;

    private GridPane proData;
    private GridPane studData;

    public ChoiceBox<String> trainYear;


    public FXMLFormAddressTabController() throws IOException {
        addressPane = (GridPane) LayoutLoader.loadLayout("view/newContactView/addressTab.fxml", this);
        proData = (GridPane) LayoutLoader.loadLayout("view/newContactView/contactTypeViews/proTypeView.fxml", this);
        studData = (GridPane) LayoutLoader.loadLayout("view/newContactView/contactTypeViews/studTypeView.fxml", this);

        trainYear.getItems().addAll("M1", "M2");

    }

    public GridPane getObject() {
        return addressPane;
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
               
        
    }

    public void setPane(String type) {
        if (type.equals("Professional")) {
            contactTypeData.getChildren().clear();
            contactTypeData.getChildren().add(proData);
        }
        else if (type.equals("Student")) {
            contactTypeData.getChildren().clear();
            contactTypeData.getChildren().add(studData);
        }
        else {
            contactTypeData.getChildren().clear();
        }

    }
}
