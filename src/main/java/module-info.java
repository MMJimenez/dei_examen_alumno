module com.example.dei_examen_alumno {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires org.hibernate.commons.annotations;
    requires java.naming;
    requires java.sql;
    requires java.base;

    requires mysql.connector.java;
    requires jasperreports;

    opens com.example.dei_examen_alumno to javafx.fxml;
    exports com.example.dei_examen_alumno;
    opens com.example.dei_examen_alumno.model to javafx.fxml, org.hibernate.orm.core;
    exports com.example.dei_examen_alumno.model;
    opens com.example.dei_examen_alumno.controller to javafx.fxml;
    exports com.example.dei_examen_alumno.controller;
}