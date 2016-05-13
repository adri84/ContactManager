package m1.piu;

import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class LayoutLoader {

    public static Object loadLayout(String resourcePath, Object Controller) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(LayoutLoader.class.getResource(resourcePath));
        fxmlLoader.setController(Controller);

        return fxmlLoader.load();
    }
}
