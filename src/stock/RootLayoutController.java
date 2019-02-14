package stock;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import stock.util.Tools;

public class RootLayoutController implements Initializable {

    private Tools tools;

    @FXML
    private VBox contentVBox;
    @FXML
    private BorderPane rootPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        contentVBox.getChildren().add(new Label("Kezdőképernyő"));
    }

    public Parent loadWindow(String url) throws IOException {
        contentVBox.getChildren().clear();
        Parent window = FXMLLoader.load(getClass().getResource(url));
        return window;
    }

    @FXML
    private void addCashregisterTypeMenu(ActionEvent event) throws IOException {
        try {
            contentVBox.getChildren().add(loadWindow("/stock/cashregistertype/add/AddCashregisterType.fxml"));
        } catch (IOException ex) {
            System.err.println("Hiba a /stock/cashregistertype/add/AddCashregisterType.fxml betöltése közben");
            Logger.getLogger(RootLayoutController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void addCashregisterTypeButton(ActionEvent event) {
        try {
            tools.openWindow("/stock/cashregistertype/add/AddCashregisterType.fxml");
        } catch (IOException ex) {
            System.err.println("Hiba a /stock/cashregistertype/add/AddCashregisterType.fxml betöltése közben");
            Logger.getLogger(RootLayoutController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void listCashregisterTypeMenu(ActionEvent event) {
        try {
            contentVBox.getChildren().add(loadWindow("/stock/cashregistertype/list/ListCashregisterType.fxml"));
        } catch (IOException ex) {
            System.err.println("Hiba a /stock/cashregistertype/list/ListCashregisterType.fxml betöltése közben");
            Logger.getLogger(RootLayoutController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void listCashregisterTypeButton(ActionEvent event) {
        try {
            contentVBox.getChildren().add(loadWindow("/stock/cashregistertype/list/ListCashregisterType.fxml"));
        } catch (IOException ex) {
            System.err.println("Hiba a /stock/cashregistertype/list/ListCashregisterType.fxml betöltése közben");
            Logger.getLogger(RootLayoutController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
