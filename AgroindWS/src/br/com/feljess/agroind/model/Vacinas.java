package br.com.feljess.agroind.model;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Modificado by Felipe Oliveira on 07/11/16.
 */

/**
 *
 * @author Felipe Augusto
 */
@XmlRootElement
public class Vacinas {
	private int id, und, preAlojamento, alojamento, complementoAlojamento, vacina, dosagem;
	private String dataFabricacao, dataVencimento, partida, nomeLaboratório, dataAplicacao;
	
	public Vacinas() {
		
	}
	
	public Vacinas(ResultSet rs) {
		try {
			this.id = rs.getInt("ID");
			this.und = rs.getInt("UND");
			this.preAlojamento = rs.getInt("PREALOJAMENTO");
			this.alojamento = rs.getInt("ALOJAMENTO");
			this.complementoAlojamento = rs.getInt("COMPLEMENTOALOJAMENTO");
			this.vacina = rs.getInt("VACINA");
			this.dataFabricacao = rs.getString("DATAFABRICACAO");
			this.dataVencimento = rs.getString("DATAVENCIMENTO");
			this.partida = rs.getString("PARTIDA");
			this.nomeLaboratório = rs.getString("NOMELABORATORIO");
			this.dataAplicacao = rs.getString("DATAAPLICACAO");
			this.dosagem = rs.getInt("DOSAGEM");
		} catch (SQLException erro) {
//			GravarLogs.gravarLogsDeErros(erro);
//			JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void setValues(ResultSet rs) {
		try {
			this.id = rs.getInt("ID");
			this.und = rs.getInt("UND");
			this.preAlojamento = rs.getInt("PREALOJAMENTO");
			this.alojamento = rs.getInt("ALOJAMENTO");
			this.complementoAlojamento = rs.getInt("COMPLEMENTOALOJAMENTO");
			this.vacina = rs.getInt("VACINA");
			this.dataFabricacao = rs.getString("DATAFABRICACAO");
			this.dataVencimento = rs.getString("DATAVENCIMENTO");
			this.partida = rs.getString("PARTIDA");
			this.nomeLaboratório = rs.getString("NOMELABORATORIO");
			this.dataAplicacao = rs.getString("DATAAPLICACAO");
			this.dosagem = rs.getInt("DOSAGEM");
		} catch (SQLException erro) {
//			GravarLogs.gravarLogsDeErros(erro);
//			JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
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
	 * @return the und
	 */
	public int getUnd() {
		return und;
	}

	/**
	 * @param und the und to set
	 */
	public void setUnd(int und) {
		this.und = und;
	}

	/**
	 * @return the preAlojamento
	 */
	public int getPreAlojamento() {
		return preAlojamento;
	}

	/**
	 * @param preAlojamento the preAlojamento to set
	 */
	public void setPreAlojamento(int preAlojamento) {
		this.preAlojamento = preAlojamento;
	}

	/**
	 * @return the alojamento
	 */
	public int getAlojamento() {
		return alojamento;
	}

	/**
	 * @param alojamento the alojamento to set
	 */
	public void setAlojamento(int alojamento) {
		this.alojamento = alojamento;
	}

	/**
	 * @return the complementoAlojamento
	 */
	public int getComplementoAlojamento() {
		return complementoAlojamento;
	}

	/**
	 * @param complementoAlojamento the complementoAlojamento to set
	 */
	public void setComplementoAlojamento(int complementoAlojamento) {
		this.complementoAlojamento = complementoAlojamento;
	}

	/**
	 * @return the vacina
	 */
	public int getVacina() {
		return vacina;
	}

	/**
	 * @param vacina the vacina to set
	 */
	public void setVacina(int vacina) {
		this.vacina = vacina;
	}

	/**
	 * @return the dataFabricacao
	 */
	public String getDataFabricacao() {
		return dataFabricacao;
	}

	/**
	 * @param dataFabricacao the dataFabricacao to set
	 */
	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	/**
	 * @return the dataVencimento
	 */
	public String getDataVencimento() {
		return dataVencimento;
	}

	/**
	 * @param dataVencimento the dataVencimento to set
	 */
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	/**
	 * @return the partida
	 */
	public String getPartida() {
		return partida;
	}

	/**
	 * @param partida the partida to set
	 */
	public void setPartida(String partida) {
		this.partida = partida;
	}

	/**
	 * @return the nomeLaboratório
	 */
	public String getNomeLaboratório() {
		return nomeLaboratório;
	}

	/**
	 * @param nomeLaboratório the nomeLaboratório to set
	 */
	public void setNomeLaboratório(String nomeLaboratório) {
		this.nomeLaboratório = nomeLaboratório;
	}

	/**
	 * @return the dataAplicacao
	 */
	public String getDataAplicacao() {
		return dataAplicacao;
	}

	/**
	 * @param dataAplicacao the dataAplicacao to set
	 */
	public void setDataAplicacao(String dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vacinas [id=" + id + ", und=" + und + ", preAlojamento=" + preAlojamento + ", alojamento=" + alojamento
				+ ", complementoAlojamento=" + complementoAlojamento + ", vacina=" + vacina + ", dosagem=" + dosagem
				+ ", dataFabricacao=" + dataFabricacao + ", dataVencimento=" + dataVencimento + ", partida=" + partida
				+ ", nomeLaboratório=" + nomeLaboratório + ", dataAplicacao=" + dataAplicacao + "]";
	}

	/**
	 * @return the dosagem
	 */
	public int getDosagem() {
		return dosagem;
	}

	/**
	 * @param dosagem the dosagem to set
	 */
	public void setDosagem(int dosagem) {
		this.dosagem = dosagem;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + alojamento;
		result = prime * result + complementoAlojamento;
		result = prime * result + ((dataAplicacao == null) ? 0 : dataAplicacao.hashCode());
		result = prime * result + ((dataFabricacao == null) ? 0 : dataFabricacao.hashCode());
		result = prime * result + ((dataVencimento == null) ? 0 : dataVencimento.hashCode());
		result = prime * result + dosagem;
		result = prime * result + id;
		result = prime * result + ((nomeLaboratório == null) ? 0 : nomeLaboratório.hashCode());
		result = prime * result + ((partida == null) ? 0 : partida.hashCode());
		result = prime * result + preAlojamento;
		result = prime * result + und;
		result = prime * result + vacina;
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
		Vacinas other = (Vacinas) obj;
		if (alojamento != other.alojamento)
			return false;
		if (complementoAlojamento != other.complementoAlojamento)
			return false;
		if (dataAplicacao == null) {
			if (other.dataAplicacao != null)
				return false;
		} else if (!dataAplicacao.equals(other.dataAplicacao))
			return false;
		if (dataFabricacao == null) {
			if (other.dataFabricacao != null)
				return false;
		} else if (!dataFabricacao.equals(other.dataFabricacao))
			return false;
		if (dataVencimento == null) {
			if (other.dataVencimento != null)
				return false;
		} else if (!dataVencimento.equals(other.dataVencimento))
			return false;
		if (dosagem != other.dosagem)
			return false;
		if (id != other.id)
			return false;
		if (nomeLaboratório == null) {
			if (other.nomeLaboratório != null)
				return false;
		} else if (!nomeLaboratório.equals(other.nomeLaboratório))
			return false;
		if (partida == null) {
			if (other.partida != null)
				return false;
		} else if (!partida.equals(other.partida))
			return false;
		if (preAlojamento != other.preAlojamento)
			return false;
		if (und != other.und)
			return false;
		if (vacina != other.vacina)
			return false;
		return true;
	}
	
	
}
