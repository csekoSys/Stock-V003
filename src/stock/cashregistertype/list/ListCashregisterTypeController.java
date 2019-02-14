
package stock.cashregistertype.list;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ListCashregisterTypeController implements Initializable {

    @FXML
    private VBox updateVBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        updateVBox.getChildren().add(new Label("egy viszonylag széles helyet foglaló szöveg"));
    }    
    
}
