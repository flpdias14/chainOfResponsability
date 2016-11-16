package br.com.feljess.agroind.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tecnico {
	
	private Integer id;
	private String nome;
	private Boolean isBloqueado;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the isBloqueado
	 */
	public Boolean getIsBloqueado() {
		return isBloqueado;
	}
	/**
	 * @param isBloqueado the isBloqueado to set
	 */
	public void setIsBloqueado(Boolean isBloqueado) {
		this.isBloqueado = isBloqueado;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tecnico [id=" + id + ", nome=" + nome + ", isBloqueado=" + isBloqueado + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isBloqueado == null) ? 0 : isBloqueado.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tecnico other = (Tecnico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isBloqueado == null) {
			if (other.isBloqueado != null)
				return false;
		} else if (!isBloqueado.equals(other.isBloqueado))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	

	
}
