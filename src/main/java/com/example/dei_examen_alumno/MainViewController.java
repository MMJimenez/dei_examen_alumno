package com.example.dei_examen_alumno;

import com.example.dei_examen_alumno.model.Alumno;
import com.example.dei_examen_alumno.utils.HibernateUtil;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {
    @FXML
    private Button btnAddToTable;

    @FXML
    private Button btnDownload;

    @FXML
    private Button btnExit;

    @FXML
    private TableColumn<?, ?> colAD;

    @FXML
    private TableColumn<?, ?> colApellido;

    @FXML
    private TableColumn<?, ?> colDI;

    @FXML
    private TableColumn<?, ?> colEIE;

    @FXML
    private TableColumn<?, ?> colHLC;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPMDM;

    @FXML
    private TableColumn<?, ?> colPSP;

    @FXML
    private TableColumn<?, ?> colSGE;

    @FXML
    private TextField inputAD;

    @FXML
    private TextField inputDI;

    @FXML
    private TextField inputEIE;

    @FXML
    private TextField inputHCL;

    @FXML
    private TextField inputLastName;

    @FXML
    private TextField inputName;

    @FXML
    private TextField inputPMDM;

    @FXML
    private TextField inputPSP;

    @FXML
    private TextField inputSGE;

    @FXML
    private TableView<Alumno> table;

    public ArrayList<Alumno> alumnos;

    @Override

    public void initialize(URL url, ResourceBundle resourceBundle) {
        alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Miguel", "Garcia", 3.5, 4.5, 5.6, 7.3, 6.8, 5.4, 8.4));
        alumnos.add(new Alumno("Pepe", "Macias", 4.5, 6.5, 1.7, 9.3, 2.5, 6.9, 3.10));
        alumnos.add(new Alumno("Antonia", "Fernandez", 3.5, 4.9, 1.9, 4.8, 10.0, 5.4, 7.3));
        inflateTable();
        updateTable();
    }

    @FXML
    void addToTheTable(ActionEvent event) {
        if (inputAD.getText().isEmpty() || inputDI.getText().isEmpty() || inputEIE.getText().isEmpty() ||
                inputHCL.getText().isEmpty() || inputLastName.getText().isEmpty() || inputName.getText().isEmpty() ||
                inputPMDM.getText().isEmpty() || inputPSP.getText().isEmpty() || inputSGE.getText().isEmpty()) {
            Alert fail = new Alert(Alert.AlertType.INFORMATION);
            fail.setHeaderText("ERROR");
            fail.setContentText("Faltan campos por rellenar");
            fail.showAndWait();
            return;
        }

        Alumno alumno = new Alumno(
            inputName.getText(),
            inputLastName.getText(),
            Double.valueOf(inputAD.getText()),
            Double.valueOf(inputSGE.getText()),
            Double.valueOf(inputDI.getText()),
            Double.valueOf(inputPMDM.getText()),
            Double.valueOf(inputEIE.getText()),
            Double.valueOf(inputPSP.getText()),
            Double.valueOf(inputHCL.getText())
        );

        alumnos.add(alumno);
        updateTable();
    }


    private void inflateTable() {
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        colID.setCellValueFactory(new PropertyValueFactory("id"));
        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colApellido.setCellValueFactory(new PropertyValueFactory("lastName"));
        colAD.setCellValueFactory(new PropertyValueFactory("AD"));
        colSGE.setCellValueFactory(new PropertyValueFactory("SGE"));
        colDI.setCellValueFactory(new PropertyValueFactory("DI"));
        colPMDM.setCellValueFactory(new PropertyValueFactory("PMDM"));
        colPSP.setCellValueFactory(new PropertyValueFactory("PSP"));
        colEIE.setCellValueFactory(new PropertyValueFactory("EIE"));
        colHLC.setCellValueFactory(new PropertyValueFactory("HLC"));
    }

    private void updateTable() {
        table.getItems().clear();
        table.getItems().addAll(alumnos);
    }

    @FXML
    private void descargar() {
        var s = HibernateUtil.getSessionFactory().openSession();
        var q = s.createQuery("from Alumno ");
        var lista = (ArrayList<Alumno>) q.list();
        alumnos.addAll(lista);

        updateTable();
    }

    @FXML
    private void salir() {
        System.exit(0);
    }
}
