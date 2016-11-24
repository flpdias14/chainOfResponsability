package br.com.feljess.agroind.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Integrado {
	private Pessoa pessoa;
	
	
	public Integrado() {
		pessoa = new Pessoa();
	}
	
	public Integrado(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void setValues(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	/**
	 * @return the pessoa
	 */
	public Pessoa getPessoa() {
		return pessoa;
	}

	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
