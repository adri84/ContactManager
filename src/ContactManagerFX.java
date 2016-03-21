/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import m1.piu.controller.FXMLCenterPanelController;
import m1.piu.controller.FXMLLeftPanelController;
import m1.piu.controller.FXMLMainPanelController;
import m1.piu.controller.FXMLTopPanelController;

/**
 *
 * @author uapv1302368
 */
public class ContactManagerFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        
        FXMLTopPanelController mpT = new FXMLTopPanelController();
        FXMLLeftPanelController mpL = new FXMLLeftPanelController();
        FXMLCenterPanelController mpC = new FXMLCenterPanelController();
        
        VBox v = new VBox();
        BorderPane leftPane = new BorderPane();
        BorderPane centerPane = new BorderPane();
        BorderPane mainPane = new BorderPane();
        TableView topView = new TableView();
        
        try {
           
            
            FXMLLoader leftPloader = new FXMLLoader();
            FXMLLoader topPloader = new FXMLLoader();
            FXMLLoader centerPloader = new FXMLLoader();
  
            
            
            leftPloader.setLocation(getClass().getResource("/home/etudiants/inf/uapv1302368/NetBeansProjects/ContactManager/src/m1/piu/view/FXMLLeftPanel.fxml"));
            leftPloader.setController(mpL);
            
            topPloader.setLocation(getClass().getResource("/home/etudiants/inf/uapv1302368/NetBeansProjects/ContactManager/src/m1/piu/view/FXMLTopPanel.fxmll"));
            topPloader.setController(mpT);
            
            centerPloader.setLocation(getClass().getResource("/home/etudiants/inf/uapv1302368/NetBeansProjects/ContactManager/src/m1/piu/view/FXMLCenterPanel.fxml"));
            centerPloader.setController(mpC);
        
    
            //leftPane = leftPloader.load();
            topView = topPloader.load();
            centerPane = centerPloader.load();
            
            v.getChildren().addAll(topView,centerPane);
            
            mainPane = new BorderPane();
            
            mainPane.setCenter(v);
            mainPane.setLeft(leftPane);
            
                    } catch (IOException ex) {
            Logger.getLogger(FXMLMainPanelController.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
        
        
        FXMLLoader mainPloader = new FXMLLoader();
        mainPloader.setLocation(getClass().getResource("/home/etudiants/inf/uapv1302368/NetBeansProjects/ContactManager/src/m1/piu/view/FXMLCenterPanel.fxml"));
        //FXMLMainPanelController mainPanelc = new FXMLMainPanelController();
       // mainPloader.setController(mainPanelc);
            
        
        
        Scene scene = new Scene(mainPane);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
