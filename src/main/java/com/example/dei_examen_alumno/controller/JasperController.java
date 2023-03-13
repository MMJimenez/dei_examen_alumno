package com.example.dei_examen_alumno.controller;

import com.example.dei_examen_alumno.utils.JDBCUtils;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import net.sf.jasperreports.view.JasperViewer;

import java.sql.SQLException;
import java.util.HashMap;

public class JasperController {
    public static void showReport() throws JRException, ClassNotFoundException, SQLException {
        HashMap hm = new HashMap();

        JasperReport report = JasperCompileManager.compileReport("src/main/resources/reports/alumnos.jrxml");

        JasperPrint print = JasperFillManager.fillReport(
                report,
                hm,
                JDBCUtils.getConnection()
        );

        JasperViewer view = new JasperViewer(print, false);
        view.getDefaultCloseOperation();
        view.setVisible(true);
    }

    public static void generateReport() throws JRException, ClassNotFoundException, SQLException {

        HashMap hm = new HashMap();


        JasperReport report = JasperCompileManager.compileReport("src/main/resources/reports/alumnos.jrxml");

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                report,
                hm,
                JDBCUtils.getConnection()
        );

        JRPdfExporter exp = new JRPdfExporter();
        exp.setExporterInput(new SimpleExporterInput(jasperPrint));
        exp.setExporterOutput(new SimpleOutputStreamExporterOutput("alumnos.pdf"));
        SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
        exp.setConfiguration(conf);
        exp.exportReport();
    }

}
