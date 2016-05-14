package m1.piu.controller.addContactController;

import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import m1.piu.LayoutLoader;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class FXMLFormIdentityTabController implements Initializable {

    public GridPane companyPane;
    public TextField firstName;
    public TextField lastName;
    public ToggleGroup Gender;

    public FXMLFormIdentityTabController() throws IOException {
        companyPane = (GridPane) LayoutLoader.loadLayout("view/newContactView/identityTab.fxml", this);

        setListeners();
    }

    private void setListeners() {
        firstName.textProperty().addListener((observable, oldValue, newValue) -> {
            FXMLFormAddContact.getInstance().setFNameLabel(newValue);
        });

        lastName.textProperty().addListener((observable, oldValue, newValue) -> {
            FXMLFormAddContact.getInstance().setLNameLabel(newValue);
        });

        Gender.selectedToggleProperty().addListener((ov, old_toggle, new_toggle) -> {
            FXMLFormAddContact.getInstance().setGenderLabel(((RadioButton) new_toggle).getText());

        });
    }

    public GridPane getObject() {
        return companyPane;
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }
    
}
