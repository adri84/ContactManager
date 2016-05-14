package m1.piu.controller.addContactController;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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


public class FXMLFormAddContact implements Initializable {

    private Stage addStage;

    private static FXMLFormAddContact INSTANCE = new FXMLFormAddContact();
    public static FXMLFormAddContact getInstance() {
        return INSTANCE;
    }


    public GridPane addContactPane;
    public TabPane tabPane;
    public ChoiceBox<String> contactType;
    public Label genderLabel,fNameLabel,lNameLabel;

    private FXMLFormIdentityTabController identityTab;
    private FXMLFormPhoneTabController phoneTab;
    private FXMLFormAddressTabController addressTab;

    private FXMLFormAddContact() {

        try {

            addContactPane = (GridPane) LayoutLoader.loadLayout("view/newContactView/newContactView.fxml", this);

            Scene addContactScene = new Scene(this.getObject());

            addStage = new Stage();
            addStage.setScene(addContactScene);

            initChoiceBox();
            initControllers();
            createTabs();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initChoiceBox() {
        contactType.getItems().addAll("Professional", "Private", "Student");

        contactType.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> {
            addressTab.setPane(contactType.getItems().get((Integer) newValue));
        });
    }

    private void initControllers() throws IOException {
        identityTab = new FXMLFormIdentityTabController();
        phoneTab = new FXMLFormPhoneTabController();
        addressTab = new FXMLFormAddressTabController();
    }

    private void createTabs() {
        Tab identityT = new Tab("Identity", identityTab.getObject());
        Tab phoneT = new Tab("Phone", phoneTab.getObject());
        Tab addressT = new Tab("Address", addressTab.getObject());

        tabPane.getTabs().addAll(identityT,phoneT,addressT);
    }

    public GridPane getObject() {
        return addContactPane;
    }

    public void show() {

        addStage.show();
    }

    public void close() {
        addStage.close();
    }

    public void setGenderLabel(String gender) {

        if (gender.equals("Male")) {
            genderLabel.setText("Mr.");
        }
        else {
            genderLabel.setText("Mrs.");
        }

    }

    public void setFNameLabel(String name) {
        this.fNameLabel.setText(name);
    }

    public void setLNameLabel(String name) {
        this.lNameLabel.setText(name);
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
               
        
    }    
    
}
