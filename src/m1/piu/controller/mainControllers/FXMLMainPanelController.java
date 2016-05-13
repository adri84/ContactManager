/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu.controller.mainControllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import m1.piu.LayoutLoader;


public class FXMLMainPanelController implements Initializable {

    public GridPane mainPane;

    private FXMLToolbarController mainToolbar;
    private FXMLAddressBookListController addressBookList;
    private FXMLContactTableController contactTable;
    private FXMLContactDetailController contactToolbar;
    private FXMLIdentityPaneController identityPane;
    private FXMLPhonePaneController phonePane;
    private FXMLCompanyPaneController companyPane;



    private void initControllers() throws IOException {
        mainToolbar = new FXMLToolbarController();
        addressBookList = new FXMLAddressBookListController();
        contactTable = new FXMLContactTableController();
        contactToolbar = new FXMLContactDetailController();
        identityPane = new FXMLIdentityPaneController();
        phonePane = new FXMLPhonePaneController();
        companyPane = new FXMLCompanyPaneController();
    }

    private void initLayout() throws IOException {

        initControllers();
        mainPane = (GridPane) LayoutLoader.loadLayout("view/mainViews/mainPanel.fxml", this);

        mainPane.setConstraints(mainToolbar.getObject(),1,2);
        mainPane.setColumnSpan(mainToolbar.getObject(),3);


        Label addressBookLabel = new Label("Address Books:");
        mainPane.setConstraints(addressBookLabel,1,3);
        mainPane.setMargin(addressBookLabel, new Insets(5, 10, 5, 10));
        mainPane.setHalignment(addressBookLabel, HPos.LEFT);

        mainPane.setConstraints(addressBookList.getObject(),1,4);
        mainPane.setRowSpan(addressBookList.getObject(),3);
        mainPane.setMargin(addressBookList.getObject(), new Insets(5, 10, 5, 10));


        mainPane.setConstraints(contactTable.getObject(),2,4);
        mainPane.setRowSpan(contactTable.getObject(),3);
        mainPane.setMargin(contactTable.getObject(), new Insets(5, 10, 5, 10));


        mainPane.setConstraints(identityPane.getObject(),3,4);
        mainPane.setMargin(identityPane.getObject(), new Insets(5, 10, 5, 10));


        mainPane.setConstraints(phonePane.getObject(),3,5);
        mainPane.setMargin(phonePane.getObject(), new Insets(5, 10, 5, 10));


        mainPane.setConstraints(companyPane.getObject(),3,6);
        mainPane.setMargin(companyPane.getObject(), new Insets(5, 10, 5, 10));


        mainPane.setConstraints(contactToolbar.getObject(),1,7);
        mainPane.setColumnSpan(contactToolbar.getObject(),3);


        mainPane.getChildren().addAll(
                mainToolbar.getObject(),
                addressBookLabel,
                addressBookList.getObject(),
                contactTable.getObject(),
                identityPane.getObject(),
                phonePane.getObject(),
                companyPane.getObject(),
                contactToolbar.getObject()

        );

    }

    public GridPane display() throws IOException {

        initLayout();
        return mainPane;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
               
        
    }    
    
}
