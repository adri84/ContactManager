/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu.controller.mainControllers;

import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import m1.piu.LayoutLoader;
import m1.piu.controller.addContactController.FXMLFormAddContact;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class FXMLToolbarController implements Initializable {

    public ToolBar mainToolbar;

    public FXMLToolbarController() throws IOException {
        mainToolbar = (ToolBar) LayoutLoader.loadLayout("view/mainViews/toolbarView.fxml", this);
    }

    public ToolBar getObject() {
        return mainToolbar;
    }

    public void addContact() {

        FXMLFormAddContact.getInstance().show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
               
        
    }    
    
}
