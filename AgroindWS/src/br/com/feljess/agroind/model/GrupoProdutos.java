package br.com.feljess.agroind.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * Modificado by Felipe Oliveira on 15/11/2016.
 */

/**
 *
 * @author Felipe Augusto
 */
@XmlRootElement
public class GrupoProdutos {
    private int id;
    private String nome;
    private String descricao;
    private boolean animal;
    private boolean aves, suinos, bovinos;
    private boolean racao, medicamento, vacinas;
    private boolean insumo;
    private boolean consumo;
    private boolean comercializacao;

    public GrupoProdutos() {

    }

    public GrupoProdutos(ResultSet rs) {
        try {
            this.id = rs.getInt("ID");
            this.nome = rs.getString("NOME");
            this.descricao = rs.getString("DESCRICAO");
            this.animal = rs.getBoolean("ISANIMAL");
            this.aves = rs.getBoolean("ISAVE");
            this.suinos = rs.getBoolean("ISSUINO");
            this.bovinos = rs.getBoolean("ISBOVINO");
            this.racao = rs.getBoolean("ISRACAO");
            this.medicamento = rs.getBoolean("ISMEDICAMENTO");
            this.vacinas = rs.getBoolean("ISVACINAS");
            this.insumo = rs.getBoolean("ISINSUMO");
            this.consumo = rs.getBoolean("ISCONSUMO");
            this.comercializacao = rs.getBoolean("ISCOMERCIALIZACAO");
        } catch (SQLException erro) {
//            GravarLogs.gravarLogsDeErros(erro);
//            JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setValues(ResultSet rs) {
        try {
            this.id = rs.getInt("ID");
            this.nome = rs.getString("NOME");
            this.descricao = rs.getString("DESCRICAO");
            this.animal = rs.getBoolean("ISANIMAL");
            this.aves = rs.getBoolean("ISAVE");
            this.suinos = rs.getBoolean("ISSUINO");
            this.bovinos = rs.getBoolean("ISBOVINO");
            this.racao = rs.getBoolean("ISRACAO");
            this.medicamento = rs.getBoolean("ISMEDICAMENTO");
            this.vacinas = rs.getBoolean("ISVACINAS");
            this.insumo = rs.getBoolean("ISINSUMO");
            this.consumo = rs.getBoolean("ISCONSUMO");
            this.comercializacao = rs.getBoolean("ISCOMERCIALIZACAO");
        } catch (SQLException erro) {
//            GravarLogs.gravarLogsDeErros(erro);
//            JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the animal
     */
    public boolean isAnimal() {
        return animal;
    }

    /**
     * @param animal the animal to set
     */
    public void setAnimal(boolean animal) {
        this.animal = animal;
    }

    /**
     * @return the aves
     */
    public boolean isAves() {
        return aves;
    }

    /**
     * @param aves the aves to set
     */
    public void setAves(boolean aves) {
        this.aves = aves;
    }

    /**
     * @return the suinos
     */
    public boolean isSuinos() {
        return suinos;
    }

    /**
     * @param suinos the suinos to set
     */
    public void setSuinos(boolean suinos) {
        this.suinos = suinos;
    }

    /**
     * @return the bovinos
     */
    public boolean isBovinos() {
        return bovinos;
    }

    /**
     * @param bovinos the bovinos to set
     */
    public void setBovinos(boolean bovinos) {
        this.bovinos = bovinos;
    }

    /**
     * @return the racao
     */
    public boolean isRacao() {
        return racao;
    }

    /**
     * @param racao the racao to set
     */
    public void setRacao(boolean racao) {
        this.racao = racao;
    }

    /**
     * @return the medicamento
     */
    public boolean isMedicamento() {
        return medicamento;
    }

    /**
     * @param medicamento the medicamento to set
     */
    public void setMedicamento(boolean medicamento) {
        this.medicamento = medicamento;
    }

    /**
     * @return the vacinas
     */
    public boolean isVacinas() {
        return vacinas;
    }

    /**
     * @param vacinas the vacinas to set
     */
    public void setVacinas(boolean vacinas) {
        this.vacinas = vacinas;
    }

    /**
     * @return the insumo
     */
    public boolean isInsumo() {
        return insumo;
    }

    /**
     * @param insumo the insumo to set
     */
    public void setInsumo(boolean insumo) {
        this.insumo = insumo;
    }

    /**
     * @return the consumo
     */
    public boolean isConsumo() {
        return consumo;
    }

    /**
     * @param consumo the consumo to set
     */
    public void setConsumo(boolean consumo) {
        this.consumo = consumo;
    }

    /**
     * @return the comercializacao
     */
    public boolean isComercializacao() {
        return comercializacao;
    }

    /**
     * @param comercializacao the comercializacao to set
     */
    public void setComercializacao(boolean comercializacao) {
        this.comercializacao = comercializacao;
    }

	/**
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (animal ? 1231 : 1237);
		result = prime * result + (aves ? 1231 : 1237);
		result = prime * result + (bovinos ? 1231 : 1237);
		result = prime * result + (comercializacao ? 1231 : 1237);
		result = prime * result + (consumo ? 1231 : 1237);
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + id;
		result = prime * result + (insumo ? 1231 : 1237);
		result = prime * result + (medicamento ? 1231 : 1237);
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + (racao ? 1231 : 1237);
		result = prime * result + (suinos ? 1231 : 1237);
		result = prime * result + (vacinas ? 1231 : 1237);
		return result;
	}

	/**
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GrupoProdutos other = (GrupoProdutos) obj;
		if (animal != other.animal)
			return false;
		if (aves != other.aves)
			return false;
		if (bovinos != other.bovinos)
			return false;
		if (comercializacao != other.comercializacao)
			return false;
		if (consumo != other.consumo)
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id != other.id)
			return false;
		if (insumo != other.insumo)
			return false;
		if (medicamento != other.medicamento)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (racao != other.racao)
			return false;
		if (suinos != other.suinos)
			return false;
		if (vacinas != other.vacinas)
			return false;
		return true;
	}

	/**
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public String toString() {
		return "GrupoProdutos [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", animal=" + animal
				+ ", aves=" + aves + ", suinos=" + suinos + ", bovinos=" + bovinos + ", racao=" + racao
				+ ", medicamento=" + medicamento + ", vacinas=" + vacinas + ", insumo=" + insumo + ", consumo="
				+ consumo + ", comercializacao=" + comercializacao + "]";
	}
    
}
