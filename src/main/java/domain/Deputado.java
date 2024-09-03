package domain;

import java.io.Serializable;

public class Deputado implements Serializable {

	private static final long serialVersionUID = -8869815428866724722L;
	
	private Integer idDeputado;
	private String condicao;
	private String mandato;
	private Integer matricula;
	private String nomeParlamentar;
	private String nomeCivil;
	private String sexo;
	private String dataNascimento;
	private String municipioNatal;
	private String ufNatal;
	private String nomeConjuge;
	private String religiao;
	private String profissao;
	private String escolaridade;
	private Integer ideCadastro;
	private Integer idePessoa;
	private String legendaPartidoEleito;
	private String legendaPartidoAtual;
	private String nomPartidoAtual;
	private String ufEleito;
	private Integer numeroLegislatura;
	private Integer qtdMandatos;
	private String mandatos;
	private String cpf;
	private Integer gabinete;
	private Integer anexo;
	private String andar;
	private String complemento;
	private String telefone;
	private String fax;
	private String email;
	private Boolean divulgaEmail;
	private String url;
	private String ponto;
	private String pontoMatricula; 
	private Integer codTipoServidor;
	private Integer idePartidoInfoleg;
	private Integer ideBlocoParlamentar;
	private String nomBlocoParlamentarAtual;
	private Integer indExercicioAtual;
	private String nomTipoOcorrenciaMandato;
	private String datFalecimento;
	private String nomPaisNacionalidade;
	private String carteira;
	private String codAutor;
	private Boolean eleito;
	
	private boolean exSuplente = false;

	public Deputado(Integer idCadastroDeputado) {
		this.ideCadastro = idCadastroDeputado;
	}
	
	public Integer getMatricula() {
		if (matricula == null && carteira != null)
			return Integer.valueOf(carteira);
		
		return matricula;
	}
	
	public Integer getIdDeputado() {
		return idDeputado;
	}

	public void setIdDeputado(Integer idDeputado) {
		this.idDeputado = idDeputado;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}

	public String getMandato() {
		return mandato;
	}

	public void setMandato(String mandato) {
		this.mandato = mandato;
	}

	public String getNomeParlamentar() {
		return nomeParlamentar;
	}

	public void setNomeParlamentar(String nomeParlamentar) {
		this.nomeParlamentar = nomeParlamentar;
	}

	public String getNomeCivil() {
		return nomeCivil;
	}

	public void setNomeCivil(String nomeCivil) {
		this.nomeCivil = nomeCivil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getMunicipioNatal() {
		return municipioNatal;
	}

	public void setMunicipioNatal(String municipioNatal) {
		this.municipioNatal = municipioNatal;
	}

	public String getUfNatal() {
		return ufNatal;
	}

	public void setUfNatal(String ufNatal) {
		this.ufNatal = ufNatal;
	}

	public String getNomeConjuge() {
		return nomeConjuge;
	}

	public void setNomeConjuge(String nomeConjuge) {
		this.nomeConjuge = nomeConjuge;
	}

	public String getReligiao() {
		return religiao;
	}

	public void setReligiao(String religiao) {
		this.religiao = religiao;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Integer getIdeCadastro() {
		return ideCadastro;
	}

	public void setIdeCadastro(Integer ideCadastro) {
		this.ideCadastro = ideCadastro;
	}

	public Integer getIdePessoa() {
		return idePessoa;
	}

	public void setIdePessoa(Integer idePessoa) {
		this.idePessoa = idePessoa;
	}

	public String getLegendaPartidoEleito() {
		return legendaPartidoEleito;
	}

	public void setLegendaPartidoEleito(String legendaPartidoEleito) {
		this.legendaPartidoEleito = legendaPartidoEleito;
	}

	public String getLegendaPartidoAtual() {
		return legendaPartidoAtual;
	}

	public void setLegendaPartidoAtual(String legendaPartidoAtual) {
		this.legendaPartidoAtual = legendaPartidoAtual;
	}

	public String getNomPartidoAtual() {
		return nomPartidoAtual;
	}

	public void setNomPartidoAtual(String nomPartidoAtual) {
		this.nomPartidoAtual = nomPartidoAtual;
	}

	public String getUfEleito() {
		return ufEleito;
	}

	public void setUfEleito(String ufEleito) {
		this.ufEleito = ufEleito;
	}

	public Integer getNumeroLegislatura() {
		return numeroLegislatura;
	}

	public void setNumeroLegislatura(Integer numeroLegislatura) {
		this.numeroLegislatura = numeroLegislatura;
	}

	public Integer getQtdMandatos() {
		return qtdMandatos;
	}

	public void setQtdMandatos(Integer qtdMandatos) {
		this.qtdMandatos = qtdMandatos;
	}

	public String getMandatos() {
		return mandatos;
	}

	public void setMandatos(String mandatos) {
		this.mandatos = mandatos;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getGabinete() {
		return gabinete;
	}

	public void setGabinete(Integer gabinete) {
		this.gabinete = gabinete;
	}

	public Integer getAnexo() {
		return anexo;
	}

	public void setAnexo(Integer anexo) {
		this.anexo = anexo;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getDivulgaEmail() {
		return divulgaEmail;
	}

	public void setDivulgaEmail(Boolean divulgaEmail) {
		this.divulgaEmail = divulgaEmail;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPonto() {
		return ponto;
	}

	public void setPonto(String ponto) {
		this.ponto = ponto;
	}

	public String getPontoMatricula() {
		return pontoMatricula;
	}

	public void setPontoMatricula(String pontoMatricula) {
		this.pontoMatricula = pontoMatricula;
	}

	public Integer getCodTipoServidor() {
		return codTipoServidor;
	}

	public void setCodTipoServidor(Integer codTipoServidor) {
		this.codTipoServidor = codTipoServidor;
	}

	public Integer getIdePartidoInfoleg() {
		return idePartidoInfoleg;
	}

	public void setIdePartidoInfoleg(Integer idePartidoInfoleg) {
		this.idePartidoInfoleg = idePartidoInfoleg;
	}

	public Integer getIdeBlocoParlamentar() {
		return ideBlocoParlamentar;
	}

	public void setIdeBlocoParlamentar(Integer ideBlocoParlamentar) {
		this.ideBlocoParlamentar = ideBlocoParlamentar;
	}

	public String getNomBlocoParlamentarAtual() {
		return nomBlocoParlamentarAtual;
	}

	public void setNomBlocoParlamentarAtual(String nomBlocoParlamentarAtual) {
		this.nomBlocoParlamentarAtual = nomBlocoParlamentarAtual;
	}

	public Integer getIndExercicioAtual() {
		return indExercicioAtual;
	}

	public void setIndExercicioAtual(Integer indExercicioAtual) {
		this.indExercicioAtual = indExercicioAtual;
	}

	public String getNomTipoOcorrenciaMandato() {
		return nomTipoOcorrenciaMandato;
	}

	public void setNomTipoOcorrenciaMandato(String nomTipoOcorrenciaMandato) {
		this.nomTipoOcorrenciaMandato = nomTipoOcorrenciaMandato;
	}

	public String getDatFalecimento() {
		return datFalecimento;
	}

	public void setDatFalecimento(String datFalecimento) {
		this.datFalecimento = datFalecimento;
	}

	public String getNomPaisNacionalidade() {
		return nomPaisNacionalidade;
	}

	public void setNomPaisNacionalidade(String nomPaisNacionalidade) {
		this.nomPaisNacionalidade = nomPaisNacionalidade;
	}

	public String getCarteira() {
		return carteira;
	}

	public void setCarteira(String carteira) {
		this.carteira = carteira;
	}

	public String getCodAutor() {
		return codAutor;
	}

	public void setCodAutor(String codAutor) {
		this.codAutor = codAutor;
	}

	public Boolean getEleito() {
		return eleito;
	}

	public void setEleito(Boolean eleito) {
		this.eleito = eleito;
	}

	public boolean isExSuplente() {
		return exSuplente;
	}

	public void setExSuplente(boolean exSuplente) {
		this.exSuplente = exSuplente;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((andar == null) ? 0 : andar.hashCode());
		result = prime * result + ((anexo == null) ? 0 : anexo.hashCode());
		result = prime * result + ((carteira == null) ? 0 : carteira.hashCode());
		result = prime * result + ((codAutor == null) ? 0 : codAutor.hashCode());
		result = prime * result + ((codTipoServidor == null) ? 0 : codTipoServidor.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((condicao == null) ? 0 : condicao.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((datFalecimento == null) ? 0 : datFalecimento.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((divulgaEmail == null) ? 0 : divulgaEmail.hashCode());
		result = prime * result + ((eleito == null) ? 0 : eleito.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((escolaridade == null) ? 0 : escolaridade.hashCode());
		result = prime * result + (exSuplente ? 1231 : 1237);
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((gabinete == null) ? 0 : gabinete.hashCode());
		result = prime * result + ((idDeputado == null) ? 0 : idDeputado.hashCode());
		result = prime * result + ((ideBlocoParlamentar == null) ? 0 : ideBlocoParlamentar.hashCode());
		result = prime * result + ((ideCadastro == null) ? 0 : ideCadastro.hashCode());
		result = prime * result + ((idePartidoInfoleg == null) ? 0 : idePartidoInfoleg.hashCode());
		result = prime * result + ((idePessoa == null) ? 0 : idePessoa.hashCode());
		result = prime * result + ((indExercicioAtual == null) ? 0 : indExercicioAtual.hashCode());
		result = prime * result + ((legendaPartidoAtual == null) ? 0 : legendaPartidoAtual.hashCode());
		result = prime * result + ((legendaPartidoEleito == null) ? 0 : legendaPartidoEleito.hashCode());
		result = prime * result + ((mandato == null) ? 0 : mandato.hashCode());
		result = prime * result + ((mandatos == null) ? 0 : mandatos.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((municipioNatal == null) ? 0 : municipioNatal.hashCode());
		result = prime * result + ((nomBlocoParlamentarAtual == null) ? 0 : nomBlocoParlamentarAtual.hashCode());
		result = prime * result + ((nomPaisNacionalidade == null) ? 0 : nomPaisNacionalidade.hashCode());
		result = prime * result + ((nomPartidoAtual == null) ? 0 : nomPartidoAtual.hashCode());
		result = prime * result + ((nomTipoOcorrenciaMandato == null) ? 0 : nomTipoOcorrenciaMandato.hashCode());
		result = prime * result + ((nomeCivil == null) ? 0 : nomeCivil.hashCode());
		result = prime * result + ((nomeConjuge == null) ? 0 : nomeConjuge.hashCode());
		result = prime * result + ((nomeParlamentar == null) ? 0 : nomeParlamentar.hashCode());
		result = prime * result + ((numeroLegislatura == null) ? 0 : numeroLegislatura.hashCode());
		result = prime * result + ((ponto == null) ? 0 : ponto.hashCode());
		result = prime * result + ((pontoMatricula == null) ? 0 : pontoMatricula.hashCode());
		result = prime * result + ((profissao == null) ? 0 : profissao.hashCode());
		result = prime * result + ((qtdMandatos == null) ? 0 : qtdMandatos.hashCode());
		result = prime * result + ((religiao == null) ? 0 : religiao.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + ((ufEleito == null) ? 0 : ufEleito.hashCode());
		result = prime * result + ((ufNatal == null) ? 0 : ufNatal.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deputado other = (Deputado) obj;
		if (andar == null) {
			if (other.andar != null)
				return false;
		} else if (!andar.equals(other.andar))
			return false;
		if (anexo == null) {
			if (other.anexo != null)
				return false;
		} else if (!anexo.equals(other.anexo))
			return false;
		if (carteira == null) {
			if (other.carteira != null)
				return false;
		} else if (!carteira.equals(other.carteira))
			return false;
		if (codAutor == null) {
			if (other.codAutor != null)
				return false;
		} else if (!codAutor.equals(other.codAutor))
			return false;
		if (codTipoServidor == null) {
			if (other.codTipoServidor != null)
				return false;
		} else if (!codTipoServidor.equals(other.codTipoServidor))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (condicao == null) {
			if (other.condicao != null)
				return false;
		} else if (!condicao.equals(other.condicao))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (datFalecimento == null) {
			if (other.datFalecimento != null)
				return false;
		} else if (!datFalecimento.equals(other.datFalecimento))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (divulgaEmail == null) {
			if (other.divulgaEmail != null)
				return false;
		} else if (!divulgaEmail.equals(other.divulgaEmail))
			return false;
		if (eleito == null) {
			if (other.eleito != null)
				return false;
		} else if (!eleito.equals(other.eleito))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (escolaridade == null) {
			if (other.escolaridade != null)
				return false;
		} else if (!escolaridade.equals(other.escolaridade))
			return false;
		if (exSuplente != other.exSuplente)
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (gabinete == null) {
			if (other.gabinete != null)
				return false;
		} else if (!gabinete.equals(other.gabinete))
			return false;
		if (idDeputado == null) {
			if (other.idDeputado != null)
				return false;
		} else if (!idDeputado.equals(other.idDeputado))
			return false;
		if (ideBlocoParlamentar == null) {
			if (other.ideBlocoParlamentar != null)
				return false;
		} else if (!ideBlocoParlamentar.equals(other.ideBlocoParlamentar))
			return false;
		if (ideCadastro == null) {
			if (other.ideCadastro != null)
				return false;
		} else if (!ideCadastro.equals(other.ideCadastro))
			return false;
		if (idePartidoInfoleg == null) {
			if (other.idePartidoInfoleg != null)
				return false;
		} else if (!idePartidoInfoleg.equals(other.idePartidoInfoleg))
			return false;
		if (idePessoa == null) {
			if (other.idePessoa != null)
				return false;
		} else if (!idePessoa.equals(other.idePessoa))
			return false;
		if (indExercicioAtual == null) {
			if (other.indExercicioAtual != null)
				return false;
		} else if (!indExercicioAtual.equals(other.indExercicioAtual))
			return false;
		if (legendaPartidoAtual == null) {
			if (other.legendaPartidoAtual != null)
				return false;
		} else if (!legendaPartidoAtual.equals(other.legendaPartidoAtual))
			return false;
		if (legendaPartidoEleito == null) {
			if (other.legendaPartidoEleito != null)
				return false;
		} else if (!legendaPartidoEleito.equals(other.legendaPartidoEleito))
			return false;
		if (mandato == null) {
			if (other.mandato != null)
				return false;
		} else if (!mandato.equals(other.mandato))
			return false;
		if (mandatos == null) {
			if (other.mandatos != null)
				return false;
		} else if (!mandatos.equals(other.mandatos))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (municipioNatal == null) {
			if (other.municipioNatal != null)
				return false;
		} else if (!municipioNatal.equals(other.municipioNatal))
			return false;
		if (nomBlocoParlamentarAtual == null) {
			if (other.nomBlocoParlamentarAtual != null)
				return false;
		} else if (!nomBlocoParlamentarAtual.equals(other.nomBlocoParlamentarAtual))
			return false;
		if (nomPaisNacionalidade == null) {
			if (other.nomPaisNacionalidade != null)
				return false;
		} else if (!nomPaisNacionalidade.equals(other.nomPaisNacionalidade))
			return false;
		if (nomPartidoAtual == null) {
			if (other.nomPartidoAtual != null)
				return false;
		} else if (!nomPartidoAtual.equals(other.nomPartidoAtual))
			return false;
		if (nomTipoOcorrenciaMandato == null) {
			if (other.nomTipoOcorrenciaMandato != null)
				return false;
		} else if (!nomTipoOcorrenciaMandato.equals(other.nomTipoOcorrenciaMandato))
			return false;
		if (nomeCivil == null) {
			if (other.nomeCivil != null)
				return false;
		} else if (!nomeCivil.equals(other.nomeCivil))
			return false;
		if (nomeConjuge == null) {
			if (other.nomeConjuge != null)
				return false;
		} else if (!nomeConjuge.equals(other.nomeConjuge))
			return false;
		if (nomeParlamentar == null) {
			if (other.nomeParlamentar != null)
				return false;
		} else if (!nomeParlamentar.equals(other.nomeParlamentar))
			return false;
		if (numeroLegislatura == null) {
			if (other.numeroLegislatura != null)
				return false;
		} else if (!numeroLegislatura.equals(other.numeroLegislatura))
			return false;
		if (ponto == null) {
			if (other.ponto != null)
				return false;
		} else if (!ponto.equals(other.ponto))
			return false;
		if (pontoMatricula == null) {
			if (other.pontoMatricula != null)
				return false;
		} else if (!pontoMatricula.equals(other.pontoMatricula))
			return false;
		if (profissao == null) {
			if (other.profissao != null)
				return false;
		} else if (!profissao.equals(other.profissao))
			return false;
		if (qtdMandatos == null) {
			if (other.qtdMandatos != null)
				return false;
		} else if (!qtdMandatos.equals(other.qtdMandatos))
			return false;
		if (religiao == null) {
			if (other.religiao != null)
				return false;
		} else if (!religiao.equals(other.religiao))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (ufEleito == null) {
			if (other.ufEleito != null)
				return false;
		} else if (!ufEleito.equals(other.ufEleito))
			return false;
		if (ufNatal == null) {
			if (other.ufNatal != null)
				return false;
		} else if (!ufNatal.equals(other.ufNatal))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	public Deputado() {
		super();
	}

	

}