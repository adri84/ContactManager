package m1.piu;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import m1.piu.controller.mainControllers.FXMLMainPanelController;

/**
 *
 * @author uapv1302368
 */
public class ContactManagerFX extends Application {

    private Scene mainScene;
    private FXMLMainPanelController mainPanelController;

    
    @Override
    public void start(Stage stage) throws Exception {

        loadWindow();

        mainScene = new Scene(mainPanelController.display());

        stage.setScene(mainScene);
        stage.show();
    }

    private void loadWindow() {
        mainPanelController = new FXMLMainPanelController();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
