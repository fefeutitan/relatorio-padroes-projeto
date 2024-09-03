package service;

public class GeneroFeminino implements GeneroStrategy {

	public String getMensagemContaBancaria() {
        return "A Deputada indica conta bancéria para crédito de valores referentes a reembolsos processados por meio da";
	}

	public String getCasoGenero() {
        return "Caso a parlamentar";
	}

	public String getGenero() {
        return "DA DEPUTADA";
	}

}
