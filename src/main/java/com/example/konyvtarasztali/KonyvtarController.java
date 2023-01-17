package com.example.konyvtarasztali;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

public class KonyvtarController {

    @FXML
    private TableView<Konyv> KonyvTablazat;
    @FXML
    private TableColumn<Konyv, String> cimOszlop;
    @FXML
    private TableColumn<Konyv, String> szerzoOszlop;
    @FXML
    private TableColumn<Konyv, Integer> kiadasEve;
    @FXML
    private TableColumn<Konyv, Integer> oldalszamOszlop;
    @FXML
    private Button torlesGomb;

    private Adatbazis db;


        public void initialize() {
            cimOszlop.setCellValueFactory(new PropertyValueFactory<>("title"));
            szerzoOszlop.setCellValueFactory(new PropertyValueFactory<>("author"));
            kiadasEve.setCellValueFactory(new PropertyValueFactory<>("publish_year"));
            cimOszlop.setCellValueFactory(new PropertyValueFactory<>("page_count"));
        }

        private void tablazatFeltoltese() throws SQLException {
            KonyvTablazat.getItems().clear();
            KonyvTablazat.getItems().addAll(db.readAllBook());
        }

    @FXML
    public void torlesKatt(ActionEvent actionEvent) {
    }
}