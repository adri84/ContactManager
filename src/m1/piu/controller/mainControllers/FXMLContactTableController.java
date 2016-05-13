/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu.controller.mainControllers;

import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import m1.piu.LayoutLoader;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class FXMLContactTableController implements Initializable {

    public TableView contactTable;


    public FXMLContactTableController() throws IOException {
        contactTable = (TableView) LayoutLoader.loadLayout("view/mainViews/contactTableView.fxml", this);
    }

    public TableView getObject() {
        return contactTable;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
               
        
    }    
    
}
