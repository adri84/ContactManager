/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu.controller.mainControllers;

import javafx.fxml.Initializable;
import javafx.scene.control.ToolBar;
import m1.piu.LayoutLoader;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class FXMLContactDetailController implements Initializable {

    public ToolBar contactToolbar;


    public FXMLContactDetailController() throws IOException {
        contactToolbar = (ToolBar) LayoutLoader.loadLayout("view/mainViews/contactDetailView.fxml", this);
    }

    public ToolBar getObject() {
        return contactToolbar;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
               
        
    }    
    
}
