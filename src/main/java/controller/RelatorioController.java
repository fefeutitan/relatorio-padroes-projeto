package controller;


import net.sf.jasperreports.engine.*;
import service.GeneroStrategy;
import service.GeneroStrategyFactory;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RelatorioController {

    @GetMapping(value = "/irpf", produces = "application/pdf")
    public ResponseEntity<byte[]> gerarRelatorioIrpf() throws Exception {

        String genero = "M"; // Mock do genero
        GeneroStrategy generoStrategy = GeneroStrategyFactory.getStrategy(genero);

        InputStream relatorio = getClass().getResourceAsStream("/relatorios/relatorio-IRPF-mock.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(relatorio);

        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("GENERO1", generoStrategy.getMensagemContaBancaria());
        parameters.put("CASOGENERO", generoStrategy.getCasoGenero());
        parameters.put("GENERO", generoStrategy.getGenero());

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

        // Mock de gera PDF
        byte[] pdf = JasperExportManager.exportReportToPdf(jasperPrint);

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_PDF)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=Relatorio_IRPF.pdf")
                .body(pdf);
    }
    
    private Map<String, Object> criarParametros(Deputado deputado, String secaoDestino) throws Exception {
		Map<String, Object> parameters = new HashMap<>();

    	String numGabinete;
    	
		parameters.put("BRASAO", "brasao.png");
		parameters.put("EDOC", "edoc.png");
		parameters.put("CECAO_DESTINO", secaoDestino);
		parameters.put("DATA_SOLICITACAO", LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		parameters.put("NOME_PARLAMENTAR",
				deputado.getNomeParlamentar() == null ? " " : deputado.getNomeParlamentar().toUpperCase());
		parameters.put("NOME_CIVIL", deputado.getNomeCivil() == null ? " " : deputado.getNomeCivil());
		parameters.put("CARTEIRA", deputado.getCarteira() == null ? " " : deputado.getCarteira());
		parameters.put("TELEFONE", deputado.getTelefone() == null ? " " : deputado.getTelefone());
		parameters.put("RAMAL", deputado.getTelefone() == null ? " " : deputado.getTelefone());
		parameters.put("EMAIL", deputado.getEmail() == null ? " " : deputado.getEmail());
		parameters.put("PONTO", deputado.getPontoMatricula() == null ? " " : deputado.getPontoMatricula());

		String partidoUf = deputado.getLegendaPartidoEleito() == null ? " " : deputado.getLegendaPartidoEleito();
		partidoUf = partidoUf.concat(deputado.getUfEleito() == null ? "" : "/" + deputado.getUfEleito());
		parameters.put("PARTIDO_UF", partidoUf);

		parameters.put("GABINETE", numGabinete == null ? " " : numGabinete);

		return parameters;
	}
}
