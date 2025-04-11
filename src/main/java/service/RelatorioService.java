package com.seuusuario.relatorio.service;

import net.sf.jasperreports.engine.*;
import java.util.HashMap;

public class RelatorioService {
    public void gerarRelatorio() {
        try {
            JasperReport report = JasperCompileManager.compileReport("src/main/resources/relatorios/relatorio.jrxml");
            JasperPrint print = JasperFillManager.fillReport(report, new HashMap<>(), new JREmptyDataSource());
            JasperExportManager.exportReportToPdfFile(print, "relatorio-gerado.pdf");
            System.out.println("Relatório gerado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new RelatorioService().gerarRelatorio();
    }
}
