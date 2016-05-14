package m1.piu.controller.addContactController;

import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import m1.piu.LayoutLoader;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class FXMLFormPhoneTabController implements Initializable {

    public GridPane phonePane;
    private FXMLFormNewPhoneController newPhone;

    public FXMLFormPhoneTabController() throws IOException {
        phonePane = (GridPane) LayoutLoader.loadLayout("view/newContactView/phoneTab.fxml", this);
        newPhone = new FXMLFormNewPhoneController();
    }

    public GridPane getObject() {
        return phonePane;
    }

    public void addNumber() {
        newPhone.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }

}
