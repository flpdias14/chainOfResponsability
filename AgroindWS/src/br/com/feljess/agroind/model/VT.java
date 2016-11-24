package br.com.feljess.agroind.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import com.mysql.fabric.xmlrpc.base.Array;

/**
 * 
 * Classe VT.java classe responsável por centralizar todas as informações necessárias na visita técnica.
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 * @sice 21:14:21 23 de nov de 2016
 * @version 1.0
 */
@XmlRootElement
public class VT {
	private ArrayList<AlojamentoAves> alojamentoAves;
	private ArrayList<Contato> contato;
	private ArrayList<DadosAlojamentoPorGalpao> dadosAlojamentoPorGalpaos;
	private ArrayList<DadosPreAlojamentoPorGalpao> dadosPreAlojamentoPorGalpaos;
	private ArrayList<Endereco> enderecos;
	private ArrayList<EstruturaIntegrado> estruturaIntegrados;
	private ArrayList<GrupoProdutos> grupoProdutos;
	private ArrayList<Produtos> produtos;
	private ArrayList<Tecnico> tecnicos;
	private ArrayList<Unidades> unidades;
	private ArrayList<Vacinas> vacinas;
	private ArrayList<Pessoa> pessoas;
	
	public ArrayList<Pessoa> getPessoas(){
		return pessoas;
	}
	
	
	public void setPessoas(ArrayList<Pessoa> pessoas){
		this.pessoas = pessoas;
	}
	
	
	public ArrayList<AlojamentoAves> getAlojamentoAves(){
		return alojamentoAves;
	}
	
	
	public void setAlojamentoAves(ArrayList<AlojamentoAves> alojamentoAves){
		this.alojamentoAves = alojamentoAves;
	}
	
	public ArrayList<Contato> getContato(){
		return contato;
	}
	
	
	public void setContato(ArrayList<Contato> contatos){
		this.contato = contatos;
	}
	


	/**
	 * @return the dadosAlojamentoPorGalpaos
	 */
	public ArrayList<DadosAlojamentoPorGalpao> getDadosAlojamentoPorGalpaos() {
		return dadosAlojamentoPorGalpaos;
	}


	/**
	 * @param dadosAlojamentoPorGalpaos the dadosAlojamentoPorGalpaos to set
	 */
	public void setDadosAlojamentoPorGalpaos(ArrayList<DadosAlojamentoPorGalpao> dadosAlojamentoPorGalpaos) {
		this.dadosAlojamentoPorGalpaos = dadosAlojamentoPorGalpaos;
	}


	/**
	 * @return the dadosPreAlojamentoPorGalpaos
	 */
	public ArrayList<DadosPreAlojamentoPorGalpao> getDadosPreAlojamentoPorGalpaos() {
		return dadosPreAlojamentoPorGalpaos;
	}


	/**
	 * @param dadosPreAlojamentoPorGalpaos the dadosPreAlojamentoPorGalpaos to set
	 */
	public void setDadosPreAlojamentoPorGalpaos(ArrayList<DadosPreAlojamentoPorGalpao> dadosPreAlojamentoPorGalpaos) {
		this.dadosPreAlojamentoPorGalpaos = dadosPreAlojamentoPorGalpaos;
	}


	/**
	 * @return the enderecos
	 */
	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}


	/**
	 * @param enderecos the enderecos to set
	 */
	public void setEnderecos(ArrayList<Endereco> enderecos) {
		this.enderecos = enderecos;
	}


	/**
	 * @return the estruturaIntegrados
	 */
	public ArrayList<EstruturaIntegrado> getEstruturaIntegrados() {
		return estruturaIntegrados;
	}


	/**
	 * @param estruturaIntegrados the estruturaIntegrados to set
	 */
	public void setEstruturaIntegrados(ArrayList<EstruturaIntegrado> estruturaIntegrados) {
		this.estruturaIntegrados = estruturaIntegrados;
	}


	/**
	 * @return the grupoProdutos
	 */
	public ArrayList<GrupoProdutos> getGrupoProdutos() {
		return grupoProdutos;
	}


	/**
	 * @param grupoProdutos the grupoProdutos to set
	 */
	public void setGrupoProdutos(ArrayList<GrupoProdutos> grupoProdutos) {
		this.grupoProdutos = grupoProdutos;
	}


	/**
	 * @return the produtos
	 */
	public ArrayList<Produtos> getProdutos() {
		return produtos;
	}


	/**
	 * @param produtos the produtos to set
	 */
	public void setProdutos(ArrayList<Produtos> produtos) {
		this.produtos = produtos;
	}


	/**
	 * @return the tecnicos
	 */
	public ArrayList<Tecnico> getTecnicos() {
		return tecnicos;
	}


	/**
	 * @param tecnicos the tecnicos to set
	 */
	public void setTecnicos(ArrayList<Tecnico> tecnicos) {
		this.tecnicos = tecnicos;
	}


	/**
	 * @return the unidades
	 */
	public ArrayList<Unidades> getUnidades() {
		return unidades;
	}


	/**
	 * @param unidades the unidades to set
	 */
	public void setUnidades(ArrayList<Unidades> unidades) {
		this.unidades = unidades;
	}


	/**
	 * @return the vacinas
	 */
	public ArrayList<Vacinas> getVacinas() {
		return vacinas;
	}


	/**
	 * @param vacinas the vacinas to set
	 */
	public void setVacinas(ArrayList<Vacinas> vacinas) {
		this.vacinas = vacinas;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alojamentoAves == null) ? 0 : alojamentoAves.hashCode());
		result = prime * result + ((contato == null) ? 0 : contato.hashCode());
		result = prime * result + ((dadosAlojamentoPorGalpaos == null) ? 0 : dadosAlojamentoPorGalpaos.hashCode());
		result = prime * result
				+ ((dadosPreAlojamentoPorGalpaos == null) ? 0 : dadosPreAlojamentoPorGalpaos.hashCode());
		result = prime * result + ((enderecos == null) ? 0 : enderecos.hashCode());
		result = prime * result + ((estruturaIntegrados == null) ? 0 : estruturaIntegrados.hashCode());
		result = prime * result + ((grupoProdutos == null) ? 0 : grupoProdutos.hashCode());
		result = prime * result + ((produtos == null) ? 0 : produtos.hashCode());
		result = prime * result + ((tecnicos == null) ? 0 : tecnicos.hashCode());
		result = prime * result + ((unidades == null) ? 0 : unidades.hashCode());
		result = prime * result + ((vacinas == null) ? 0 : vacinas.hashCode());
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
		VT other = (VT) obj;
		if (alojamentoAves == null) {
			if (other.alojamentoAves != null)
				return false;
		} else if (!alojamentoAves.equals(other.alojamentoAves))
			return false;
		if (contato == null) {
			if (other.contato != null)
				return false;
		} else if (!contato.equals(other.contato))
			return false;
		if (dadosAlojamentoPorGalpaos == null) {
			if (other.dadosAlojamentoPorGalpaos != null)
				return false;
		} else if (!dadosAlojamentoPorGalpaos.equals(other.dadosAlojamentoPorGalpaos))
			return false;
		if (dadosPreAlojamentoPorGalpaos == null) {
			if (other.dadosPreAlojamentoPorGalpaos != null)
				return false;
		} else if (!dadosPreAlojamentoPorGalpaos.equals(other.dadosPreAlojamentoPorGalpaos))
			return false;
		if (enderecos == null) {
			if (other.enderecos != null)
				return false;
		} else if (!enderecos.equals(other.enderecos))
			return false;
		if (estruturaIntegrados == null) {
			if (other.estruturaIntegrados != null)
				return false;
		} else if (!estruturaIntegrados.equals(other.estruturaIntegrados))
			return false;
		if (grupoProdutos == null) {
			if (other.grupoProdutos != null)
				return false;
		} else if (!grupoProdutos.equals(other.grupoProdutos))
			return false;
		if (produtos == null) {
			if (other.produtos != null)
				return false;
		} else if (!produtos.equals(other.produtos))
			return false;
		if (tecnicos == null) {
			if (other.tecnicos != null)
				return false;
		} else if (!tecnicos.equals(other.tecnicos))
			return false;
		if (unidades == null) {
			if (other.unidades != null)
				return false;
		} else if (!unidades.equals(other.unidades))
			return false;
		if (vacinas == null) {
			if (other.vacinas != null)
				return false;
		} else if (!vacinas.equals(other.vacinas))
			return false;
		return true;
	}


	
	
	
}
