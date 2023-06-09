package org.joaocastillo.com.report;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.joaocastillo.com.dao.Conexion;

import java.io.InputStream;
import java.util.Map;

public class GenerateReport {
    public static void mostrarReporte(String reportName, String reportTitle, Map parameters) {
        try {
            InputStream reporte = GenerateReport.class.getResourceAsStream(reportName + ".jasper");

            System.out.println(reportName);
            System.out.println(reporte.available());
            JasperReport report = (JasperReport) JRLoader.loadObject(reporte);
            JasperPrint jasperPrint = JasperFillManager.fillReport(report,
                    parameters,
                    Conexion.getInstance().getConnection());
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setTitle(reportTitle);
            jviewer.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
