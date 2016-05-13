package m1.piu.controller.mainControllers;

import javafx.fxml.Initializable;
import javafx.scene.control.TitledPane;
import m1.piu.LayoutLoader;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class FXMLPhonePaneController implements Initializable {

    public TitledPane phonePane;


    public FXMLPhonePaneController() throws IOException {
        phonePane = (TitledPane) LayoutLoader.loadLayout("view/mainViews/phonePane.fxml", this);
    }

    public TitledPane getObject() {
        return phonePane;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
               
        
    }    
    
}
