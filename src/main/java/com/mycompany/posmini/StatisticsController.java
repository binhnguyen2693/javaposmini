package com.mycompany.posmini;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

public class StatisticsController {

    @FXML private TableView<?> invoiceTable;
    @FXML private Label totalLabel;

    @FXML
    private void goBack() throws Exception {
        App.setRoot("Main");
    }
}