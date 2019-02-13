
package stock.util;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Tools {

    /**
     * Új ablakban nyitja meg a részprogramot
     * @param loc
     * @throws IOException 
     */
    public void openWindow(String loc) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(loc));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
