/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu.controller.mainControllers;

import javafx.fxml.Initializable;
import javafx.scene.control.TitledPane;
import m1.piu.LayoutLoader;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class FXMLIdentityPaneController implements Initializable {

    public TitledPane identityPane;


    public FXMLIdentityPaneController() throws IOException {
        identityPane = (TitledPane) LayoutLoader.loadLayout("view/mainViews/identityPane.fxml", this);
    }

    public TitledPane getObject() {
        return identityPane;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
               
        
    }    
    
}
