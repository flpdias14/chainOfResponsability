package br.com.feljess.agroind.model;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * Modificado by felipe on 07/11/16.
 */

/**
 *
 * @author Felipe Augusto
 */
@XmlRootElement
public class DadosPreAlojamentoPorGalpao {
	private int id;
	private int idPreAlojamento;
	private boolean incubatorioTerceirizado;
	private int incubatorio;
	private boolean fornecedorTerceirizado;
	private String dataAlojamento;
	private int linhagem;
	private int fornecedorOvos;
	private int qtdAvesMacho;
	private int qtdAvesFemea;
	private int qtdAvesMisto;
	private int galpao;
	private boolean recebido;
	private boolean complemento;
	
	public DadosPreAlojamentoPorGalpao() {
		
	}
	
	public DadosPreAlojamentoPorGalpao(ResultSet rs) {
		try {
			this.id = rs.getInt("ID");
			this.idPreAlojamento = rs.getInt("IDPREALOJAMENTO");
			this.incubatorioTerceirizado = rs.getBoolean("ISINCUBATORIOTERCEIRIZADO");
			this.incubatorio = rs.getInt("INCUBATORIO");
			this.fornecedorTerceirizado = rs.getBoolean("ISFORNECEDOROVOSTERCEIRIZADO");
			this.fornecedorOvos = rs.getInt("FORNECEDOROVOS");
			this.linhagem = rs.getInt("LINHAGEM");
			this.dataAlojamento = rs.getString("DATAALOJAMENTO");
			this.galpao = rs.getInt("GALPAO");
			this.qtdAvesMacho = rs.getInt("QTDAVESMACHO");
			this.qtdAvesFemea = rs.getInt("QTDAVESFEMEA");
			this.qtdAvesMisto = rs.getInt("QTDAVESMISTO");
			this.recebido = rs.getBoolean("ISRECEBIDO");
			this.complemento = rs.getBoolean("ISCOMPLEMENTO");
		} catch (SQLException erro) {
//			GravarLogs.gravarLogsDeErros(erro);
//			JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void setValues(ResultSet rs) {
		try {
			this.id = rs.getInt("ID");
			this.idPreAlojamento = rs.getInt("IDPREALOJAMENTO");
			this.incubatorioTerceirizado = rs.getBoolean("ISINCUBATORIOTERCEIRIZADO");
			this.incubatorio = rs.getInt("INCUBATORIO");
			this.fornecedorTerceirizado = rs.getBoolean("ISFORNECEDOROVOSTERCEIRIZADO");
			this.fornecedorOvos = rs.getInt("FORNECEDOROVOS");
			this.galpao = rs.getInt("GALPAO");
			this.linhagem = rs.getInt("LINHAGEM");
			this.dataAlojamento = rs.getString("DATAALOJAMENTO");
			this.qtdAvesMacho = rs.getInt("QTDAVESMACHO");
			this.qtdAvesFemea = rs.getInt("QTDAVESFEMEA");
			this.qtdAvesMisto = rs.getInt("QTDAVESMISTO");
			this.recebido = rs.getBoolean("ISRECEBIDO");
			this.complemento = rs.getBoolean("ISCOMPLEMENTO");
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
	 * @return the idPreAlojamento
	 */
	public int getIdPreAlojamento() {
		return idPreAlojamento;
	}

	/**
	 * @param idPreAlojamento the idPreAlojamento to set
	 */
	public void setIdPreAlojamento(int idPreAlojamento) {
		this.idPreAlojamento = idPreAlojamento;
	}
	
	/**
	 * @return the incubatorioTerceirizado
	 */
	public boolean isIncubatorioTerceirizado() {
		return incubatorioTerceirizado;
	}

	/**
	 * @param incubatorioTerceirizado the incubatorioTerceirizado to set
	 */
	public void setIncubatorioTerceirizado(boolean incubatorioTerceirizado) {
		this.incubatorioTerceirizado = incubatorioTerceirizado;
	}

	/**
	 * @return the incubatorio
	 */
	public int getIncubatorio() {
		return incubatorio;
	}

	/**
	 * @param incubatorio the incubatorio to set
	 */
	public void setIncubatorio(int incubatorio) {
		this.incubatorio = incubatorio;
	}

	/**
	 * @return the fornecedorTerceirizado
	 */
	public boolean isFornecedorTerceirizado() {
		return fornecedorTerceirizado;
	}

	/**
	 * @param fornecedorTerceirizado the fornecedorTerceirizado to set
	 */
	public void setFornecedorTerceirizado(boolean fornecedorTerceirizado) {
		this.fornecedorTerceirizado = fornecedorTerceirizado;
	}

	/**
	 * @return the fornecedorOvos
	 */
	public int getFornecedorOvos() {
		return fornecedorOvos;
	}

	/**
	 * @param fornecedorOvos the fornecedorOvos to set
	 */
	public void setFornecedorOvos(int fornecedorOvos) {
		this.fornecedorOvos = fornecedorOvos;
	}

	/**
	 * @return the dataAlojamento
	 */
	public String getDataAlojamento() {
		return dataAlojamento;
	}

	/**
	 * @param dataAlojamento the dataAlojamento to set
	 */
	public void setDataAlojamento(String dataAlojamento) {
		this.dataAlojamento = dataAlojamento;
	}

	/**
	 * @return the linhagem
	 */
	public int getLinhagem() {
		return linhagem;
	}

	/**
	 * @param linhagem the linhagem to set
	 */
	public void setLinhagem(int linhagem) {
		this.linhagem = linhagem;
	}

	/**
	 * @return the qtdAvesMacho
	 */
	public int getQtdAvesMacho() {
		return qtdAvesMacho;
	}

	/**
	 * @param qtdAvesMacho the qtdAvesMacho to set
	 */
	public void setQtdAvesMacho(int qtdAvesMacho) {
		this.qtdAvesMacho = qtdAvesMacho;
	}

	/**
	 * @return the qtdAvesFemea
	 */
	public int getQtdAvesFemea() {
		return qtdAvesFemea;
	}

	/**
	 * @param qtdAvesFemea the qtdAvesFemea to set
	 */
	public void setQtdAvesFemea(int qtdAvesFemea) {
		this.qtdAvesFemea = qtdAvesFemea;
	}

	/**
	 * @return the qtdAvesMisto
	 */
	public int getQtdAvesMisto() {
		return qtdAvesMisto;
	}

	/**
	 * @param qtdAvesMisto the qtdAvesMisto to set
	 */
	public void setQtdAvesMisto(int qtdAvesMisto) {
		this.qtdAvesMisto = qtdAvesMisto;
	}

	/**
	 * @return the galpao
	 */
	public int getGalpao() {
		return galpao;
	}

	/**
	 * @param galpao the galpao to set
	 */
	public void setGalpao(int galpao) {
		this.galpao = galpao;
	}

	/**
	 * @return the recebido
	 */
	public boolean isRecebido() {
		return recebido;
	}

	/**
	 * @param recebido the recebido to set
	 */
	public void setRecebido(boolean recebido) {
		this.recebido = recebido;
	}

	/**
	 * @return the complemento
	 */
	public boolean isComplemento() {
		return complemento;
	}

	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(boolean complemento) {
		this.complemento = complemento;
	}

	/**
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public String toString() {
		return "DadosPreAlojamentoPorGalpao [id=" + id + ", idPreAlojamento=" + idPreAlojamento
				+ ", incubatorioTerceirizado=" + incubatorioTerceirizado + ", incubatorio=" + incubatorio
				+ ", fornecedorTerceirizado=" + fornecedorTerceirizado + ", dataAlojamento=" + dataAlojamento
				+ ", linhagem=" + linhagem + ", fornecedorOvos=" + fornecedorOvos + ", qtdAvesMacho=" + qtdAvesMacho
				+ ", qtdAvesFemea=" + qtdAvesFemea + ", qtdAvesMisto=" + qtdAvesMisto + ", galpao=" + galpao
				+ ", recebido=" + recebido + ", complemento=" + complemento + "]";
	}

	/**
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (complemento ? 1231 : 1237);
		result = prime * result + ((dataAlojamento == null) ? 0 : dataAlojamento.hashCode());
		result = prime * result + fornecedorOvos;
		result = prime * result + (fornecedorTerceirizado ? 1231 : 1237);
		result = prime * result + galpao;
		result = prime * result + id;
		result = prime * result + idPreAlojamento;
		result = prime * result + incubatorio;
		result = prime * result + (incubatorioTerceirizado ? 1231 : 1237);
		result = prime * result + linhagem;
		result = prime * result + qtdAvesFemea;
		result = prime * result + qtdAvesMacho;
		result = prime * result + qtdAvesMisto;
		result = prime * result + (recebido ? 1231 : 1237);
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
		DadosPreAlojamentoPorGalpao other = (DadosPreAlojamentoPorGalpao) obj;
		if (complemento != other.complemento)
			return false;
		if (dataAlojamento == null) {
			if (other.dataAlojamento != null)
				return false;
		} else if (!dataAlojamento.equals(other.dataAlojamento))
			return false;
		if (fornecedorOvos != other.fornecedorOvos)
			return false;
		if (fornecedorTerceirizado != other.fornecedorTerceirizado)
			return false;
		if (galpao != other.galpao)
			return false;
		if (id != other.id)
			return false;
		if (idPreAlojamento != other.idPreAlojamento)
			return false;
		if (incubatorio != other.incubatorio)
			return false;
		if (incubatorioTerceirizado != other.incubatorioTerceirizado)
			return false;
		if (linhagem != other.linhagem)
			return false;
		if (qtdAvesFemea != other.qtdAvesFemea)
			return false;
		if (qtdAvesMacho != other.qtdAvesMacho)
			return false;
		if (qtdAvesMisto != other.qtdAvesMisto)
			return false;
		if (recebido != other.recebido)
			return false;
		return true;
	}
	
	
}
