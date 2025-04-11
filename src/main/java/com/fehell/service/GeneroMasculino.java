package com.fehell.service;

public class GeneroMasculino implements GeneroStrategy {

	public String getMensagemContaBancaria() {
        return "O Deputado indica conta banc�ria para cr�dito de valores referentes a reembolsos processados por meio da";
	}

	public String getCasoGenero() {
        return "Caso o parlamentar";
	}

	public String getGenero() {
        return "DO DEPUTADO";
	}
 
}