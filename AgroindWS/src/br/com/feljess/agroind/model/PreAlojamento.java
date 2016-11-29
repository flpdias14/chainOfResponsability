package br.com.feljess.agroind.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * 
 * Classe PreAlojamento.java Modificada de Felipe Augusto
 * @autor Felipe Oliveira
 * @email flpdias14@gmail.com
 *  Modificada @sice 16:44:42 29 de nov de 2016
 * @version 1.0
 */
@XmlRootElement
public class PreAlojamento {
	private int id;
	private int und;
	private int integrado;
	private int endereco;
	private String dataAlojamento;
	private int tecnico;
	private String nomeTecnico;
	private int qtdAvesMacho;
	private int qtdAvesFemea;
	private int qtdAvesMisto;
	private int linhagem;
	private int tabelaConsumo;
	private int formulaRacao;
	private double qtdRacaoPreInicialNecessaria;
	private int ticketPesagemRacaoEnviada;
	private double qtdRacaoPreInicialEnviada;
	private boolean alojado;
	private boolean cancelado;
	private boolean fechado;
	private double adiantamentoPagamento;
	private String dataLancamento;
	private String horaLancamento;
	private String usuarioAgendamento;
	private List<DadosPreAlojamentoPorGalpao> listaGalpoes;
	
	public PreAlojamento() {
		listaGalpoes = new ArrayList<DadosPreAlojamentoPorGalpao>();
	}
	
	public PreAlojamento(ResultSet rs) {
		listaGalpoes = new ArrayList<DadosPreAlojamentoPorGalpao>();
		try {
			this.id = rs.getInt("ID");
			this.und = rs.getInt("UND");
			this.integrado = rs.getInt("INTEGRADO");
			this.endereco = rs.getInt("ENDERECO");
			this.dataAlojamento = rs.getString("DATAALOJAMENTO");
			this.tecnico = rs.getInt("TECNICO");
			this.nomeTecnico = rs.getString("NOMETECNICO");
			this.qtdAvesMacho = rs.getInt("QTDAVESMACHO");
			this.qtdAvesFemea = rs.getInt("QTDAVESFEMEA");
			this.qtdAvesMisto = rs.getInt("QTDAVESMISTO");
			this.linhagem = rs.getInt("LINHAGEM");
			this.tabelaConsumo = rs.getInt("TABELACONSUMO");
			this.formulaRacao = rs.getInt("FORMULABASE");
			this.qtdRacaoPreInicialNecessaria = rs.getDouble("QTDRACAOPREINICIALNECESSARIA");
			this.ticketPesagemRacaoEnviada = rs.getInt("TICKETPESAGEMRACAOENVIADA");
			this.qtdRacaoPreInicialEnviada = rs.getDouble("QTDRACAOPREINICIALENVIADA");
			this.alojado = rs.getBoolean("ISALOJADO");
			this.fechado = rs.getBoolean("ISFECHADO");
			this.cancelado = rs.getBoolean("ISCANCELADO");
			this.adiantamentoPagamento = rs.getDouble("ADIANTAMENTOPAGAMENTO");
			this.dataLancamento = rs.getString("DATALANCAMENTO");
			this.horaLancamento = rs.getString("HORALANCAMENTO");
			this.usuarioAgendamento = rs.getString("USUARIOAGENDAMENTO");
		} catch (SQLException erro) {
			erro.printStackTrace();
//			GravarLogs.gravarLogsDeErros(erro);
//			JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void setValues(ResultSet rs) {
		try {
			this.id = rs.getInt("ID");
			this.und = rs.getInt("UND");
			this.integrado = rs.getInt("INTEGRADO");
			this.endereco = rs.getInt("ENDERECO");
			this.dataAlojamento = rs.getString("DATAALOJAMENTO");
			this.tecnico = rs.getInt("TECNICO");
			this.nomeTecnico = rs.getString("NOMETECNICO");
			this.qtdAvesMacho = rs.getInt("QTDAVESMACHO");
			this.qtdAvesFemea = rs.getInt("QTDAVESFEMEA");
			this.qtdAvesMisto = rs.getInt("QTDAVESMISTO");
			this.linhagem = rs.getInt("LINHAGEM");
			this.tabelaConsumo = rs.getInt("TABELACONSUMO");
			this.formulaRacao = rs.getInt("FORMULABASE");
			this.qtdRacaoPreInicialNecessaria = rs.getDouble("QTDRACAOPREINICIALNECESSARIA");
			this.ticketPesagemRacaoEnviada = rs.getInt("TICKETPESAGEMRACAOENVIADA");
			this.qtdRacaoPreInicialEnviada = rs.getDouble("QTDRACAOPREINICIALENVIADA");
			this.alojado = rs.getBoolean("ISALOJADO");
			this.fechado = rs.getBoolean("ISFECHADO");
			this.cancelado = rs.getBoolean("ISCANCELADO");
			this.adiantamentoPagamento = rs.getDouble("ADIANTAMENTOPAGAMENTO");
			this.dataLancamento = rs.getString("DATALANCAMENTO");
			this.horaLancamento = rs.getString("HORALANCAMENTO");
			this.usuarioAgendamento = rs.getString("USUARIOAGENDAMENTO");
		} catch (SQLException erro) {
			erro.printStackTrace();
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
	 * @return the integrado
	 */
	public int getIntegrado() {
		return integrado;
	}

	/**
	 * @param integrado the integrado to set
	 */
	public void setIntegrado(int integrado) {
		this.integrado = integrado;
	}

	/**
	 * @return the endereco
	 */
	public int getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(int endereco) {
		this.endereco = endereco;
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
	 * @return the tecnico
	 */
	public int getTecnico() {
		return tecnico;
	}

	/**
	 * @param tecnico the tecnico to set
	 */
	public void setTecnico(int tecnico) {
		this.tecnico = tecnico;
	}

	/**
	 * @return the nomeTecnico
	 */
	public String getNomeTecnico() {
		return nomeTecnico;
	}

	/**
	 * @param nomeTecnico the nomeTecnico to set
	 */
	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
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
	 * @return the linhagem
	 */
	public int getLinhagem() {
		return linhagem;
	}

	/**
	 * @return the tabelaConsumo
	 */
	public int getTabelaConsumo() {
		return tabelaConsumo;
	}

	/**
	 * @param tabelaConsumo the tabelaConsumo to set
	 */
	public void setTabelaConsumo(int tabelaConsumo) {
		this.tabelaConsumo = tabelaConsumo;
	}

	/**
	 * @return the formulaRacao
	 */
	public int getFormulaRacao() {
		return formulaRacao;
	}

	/**
	 * @param formulaRacao the formulaRacao to set
	 */
	public void setFormulaRacao(int formulaRacao) {
		this.formulaRacao = formulaRacao;
	}

	/**
	 * @param linhagem the linhagem to set
	 */
	public void setLinhagem(int linhagem) {
		this.linhagem = linhagem;
	}

	/**
	 * @return the qtdRacaoPreInicialNecessaria
	 */
	public double getQtdRacaoPreInicialNecessaria() {
		return qtdRacaoPreInicialNecessaria;
	}

	/**
	 * @param qtdRacaoPreInicialNecessaria the qtdRacaoPreInicialNecessaria to set
	 */
	public void setQtdRacaoPreInicialNecessaria(double qtdRacaoPreInicialNecessaria) {
		this.qtdRacaoPreInicialNecessaria = qtdRacaoPreInicialNecessaria;
	}

	/**
	 * @return the ticketPesagemRacaoEnviada
	 */
	public int getTicketPesagemRacaoEnviada() {
		return ticketPesagemRacaoEnviada;
	}

	/**
	 * @param ticketPesagemRacaoEnviada the ticketPesagemRacaoEnviada to set
	 */
	public void setTicketPesagemRacaoEnviada(int ticketPesagemRacaoEnviada) {
		this.ticketPesagemRacaoEnviada = ticketPesagemRacaoEnviada;
	}

	/**
	 * @return the qtdRacaoPreInicialEnviada
	 */
	public double getQtdRacaoPreInicialEnviada() {
		return qtdRacaoPreInicialEnviada;
	}

	/**
	 * @param qtdRacaoPreInicialEnviada the qtdRacaoPreInicialEnviada to set
	 */
	public void setQtdRacaoPreInicialEnviada(double qtdRacaoPreInicialEnviada) {
		this.qtdRacaoPreInicialEnviada = qtdRacaoPreInicialEnviada;
	}

	/**
	 * @return the alojado
	 */
	public boolean isAlojado() {
		return alojado;
	}

	/**
	 * @param alojado the alojado to set
	 */
	public void setAlojado(boolean alojado) {
		this.alojado = alojado;
	}

	/**
	 * @return the fechado
	 */
	public boolean isFechado() {
		return fechado;
	}

	/**
	 * @param fechado the fechado to set
	 */
	public void setFechado(boolean fechado) {
		this.fechado = fechado;
	}

	/**
	 * @return the cancelado
	 */
	public boolean isCancelado() {
		return cancelado;
	}

	/**
	 * @param cancelado the cancelado to set
	 */
	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}

	/**
	 * @return the adiantamentoPagamento
	 */
	public double getAdiantamentoPagamento() {
		return adiantamentoPagamento;
	}

	/**
	 * @param adiantamentoPagamento the adiantamentoPagamento to set
	 */
	public void setAdiantamentoPagamento(double adiantamentoPagamento) {
		this.adiantamentoPagamento = adiantamentoPagamento;
	}

	/**
	 * @return the dataLancamento
	 */
	public String getDataLancamento() {
		return dataLancamento;
	}

	/**
	 * @param dataLancamento the dataLancamento to set
	 */
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	/**
	 * @return the horaLancamento
	 */
	public String getHoraLancamento() {
		return horaLancamento;
	}

	/**
	 * @param horaLancamento the horaLancamento to set
	 */
	public void setHoraLancamento(String horaLancamento) {
		this.horaLancamento = horaLancamento;
	}

	/**
	 * @return the usuarioAgendamento
	 */
	public String getUsuarioAgendamento() {
		return usuarioAgendamento;
	}

	/**
	 * @param usuarioAgendamento the usuarioAgendamento to set
	 */
	public void setUsuarioAgendamento(String usuarioAgendamento) {
		this.usuarioAgendamento = usuarioAgendamento;
	}

	/**
	 * @return the listaGalpoes
	 */
	public List<DadosPreAlojamentoPorGalpao> getListaGalpoes() {
		return listaGalpoes;
	}

	/**
	 * @param listaGalpoes the listaGalpoes to set
	 */
	public void setListaGalpoes(List<DadosPreAlojamentoPorGalpao> listaGalpoes) {
		this.listaGalpoes = listaGalpoes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PreAlojamento [id=" + id + ", und=" + und + ", integrado=" + integrado + ", endereco=" + endereco
				+ ", dataAlojamento=" + dataAlojamento + ", tecnico=" + tecnico + ", nomeTecnico=" + nomeTecnico
				+ ", qtdAvesMacho=" + qtdAvesMacho + ", qtdAvesFemea=" + qtdAvesFemea + ", qtdAvesMisto=" + qtdAvesMisto
				+ ", linhagem=" + linhagem + ", tabelaConsumo=" + tabelaConsumo + ", formulaRacao=" + formulaRacao
				+ ", qtdRacaoPreInicialNecessaria=" + qtdRacaoPreInicialNecessaria + ", ticketPesagemRacaoEnviada="
				+ ticketPesagemRacaoEnviada + ", qtdRacaoPreInicialEnviada=" + qtdRacaoPreInicialEnviada + ", alojado="
				+ alojado + ", cancelado=" + cancelado + ", fechado=" + fechado + ", adiantamentoPagamento="
				+ adiantamentoPagamento + ", dataLancamento=" + dataLancamento + ", horaLancamento=" + horaLancamento
				+ ", usuarioAgendamento=" + usuarioAgendamento + ", listaGalpoes=" + listaGalpoes + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(adiantamentoPagamento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (alojado ? 1231 : 1237);
		result = prime * result + (cancelado ? 1231 : 1237);
		result = prime * result + ((dataAlojamento == null) ? 0 : dataAlojamento.hashCode());
		result = prime * result + ((dataLancamento == null) ? 0 : dataLancamento.hashCode());
		result = prime * result + endereco;
		result = prime * result + (fechado ? 1231 : 1237);
		result = prime * result + formulaRacao;
		result = prime * result + ((horaLancamento == null) ? 0 : horaLancamento.hashCode());
		result = prime * result + id;
		result = prime * result + integrado;
		result = prime * result + linhagem;
		result = prime * result + ((listaGalpoes == null) ? 0 : listaGalpoes.hashCode());
		result = prime * result + ((nomeTecnico == null) ? 0 : nomeTecnico.hashCode());
		result = prime * result + qtdAvesFemea;
		result = prime * result + qtdAvesMacho;
		result = prime * result + qtdAvesMisto;
		temp = Double.doubleToLongBits(qtdRacaoPreInicialEnviada);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(qtdRacaoPreInicialNecessaria);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + tabelaConsumo;
		result = prime * result + tecnico;
		result = prime * result + ticketPesagemRacaoEnviada;
		result = prime * result + und;
		result = prime * result + ((usuarioAgendamento == null) ? 0 : usuarioAgendamento.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof PreAlojamento) && ((PreAlojamento)obj).getId() == this.getId()){
			return true;
		}
		return false;
	}
	
	
}
