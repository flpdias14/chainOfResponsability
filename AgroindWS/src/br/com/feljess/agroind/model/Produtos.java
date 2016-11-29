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
public class Produtos {
	private int id;
	private String nome;
	private int principioAtivo;
	private String descricao;;
	private String codEan;
	private String codNcm;
	private String undEstoque;
	private String undVenda;
	private double qtdEstoque;
	private double qtdVenda;
	private int idFabricante;
	private int idGrupoProduto;
	private int idTipoRacao;
	private boolean epi;
	private boolean protecaoAuditiva;
	private boolean protecaoVisualFacial;
	private boolean protecaoCabeca;
	private boolean protecaoMaosBracos;
	private boolean protecaoPernasPes;
	private boolean protecaoContraQuedas;
	private boolean protecaoDorsal;
	private int prazoMinUsoEPI;
	private int prazoMaxUsoEPI;
	private String rua;
	private String pratileira;
	private String andar;
	private double precoCompra;
	private double precoVenda;
	private boolean bloqueado;
	private boolean conferenciaAntesDeConfirmarEntradaDoItem;
	private boolean emitirOrdemCarregoNaVenda;
	private boolean produtoInsideQuebraNaVenda;
	private boolean exigirIntegradoDuranteProgramacaoVenda;
	
	
	public Produtos() {
	}
	
	public Produtos(ResultSet rs) {
		try {
			this.id = rs.getInt("ID");
			this.nome = rs.getString("NOME");
			this.principioAtivo = rs.getInt("PRINCIPIOATIVO");
			this.descricao = rs.getString("DESCRICAO");
			this.codEan = rs.getString("CODEAN");
			this.codNcm = rs.getString("CODNCM");
			this.undEstoque = rs.getString("UNDESTOQUE");
			this.undVenda = rs.getString("UNDVENDA");
			this.qtdEstoque = rs.getDouble("QTDESTOQUE");
			this.qtdVenda = rs.getDouble("QTDVENDA");
			this.idFabricante = rs.getInt("FABRICANTE");
			this.idGrupoProduto = rs.getInt("GRUPOPRODUTO");
			this.idTipoRacao = rs.getInt("TIPORACAO");
			this.epi = rs.getBoolean("ISEPI");
			this.protecaoAuditiva = rs.getBoolean("ISPROTECAOAUDITIVA");
			this.protecaoVisualFacial = rs.getBoolean("ISPROTECAOVISUALEFACE");
			this.protecaoCabeca = rs.getBoolean("ISPROTECAOCABECA");
			this.protecaoMaosBracos = rs.getBoolean("ISPROTECAOMAOSEMRACOS");
			this.protecaoPernasPes  = rs.getBoolean("ISPROTECAOPESEPERNAS");
			this.protecaoContraQuedas = rs.getBoolean("ISPROTECAOCONTRAQUEDAS");
			this.protecaoDorsal = rs.getBoolean("ISPROTECAODORSAL");
			this.prazoMinUsoEPI = rs.getInt("PRAZOMINUSOEPI");
			this.prazoMaxUsoEPI = rs.getInt("PRAZOMAXUSOEPI");
			this.rua = rs.getString("RUA");
			this.pratileira = rs.getString("PRATILEIRA");
			this.andar = rs.getString("ANDAR");
			this.precoCompra = rs.getDouble("PRECOCOMPRA");
			this.precoVenda = rs.getDouble("PRECOVENDA");
			this.bloqueado = rs.getBoolean("ISBLOQUEADO");
			this.conferenciaAntesDeConfirmarEntradaDoItem = rs.getBoolean("ISCONFERENCIAITEMANTESCONFIRMACAOENTRADA");
			this.emitirOrdemCarregoNaVenda = rs.getBoolean("ISEMITIRORDEMCARREGONAVENDA");
			this.produtoInsideQuebraNaVenda = rs.getBoolean("ISPRODUTOINSIDEQUEBRANAVENDA");
			this.exigirIntegradoDuranteProgramacaoVenda = rs.getBoolean("ISEXIGIRINTEGRADOPROGRAMACAOVENDA");
		} catch (SQLException erro) {
//			GravarLogs.gravarLogsDeErros(erro);
//			JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void setValues(ResultSet rs) {
		try {
			this.id = rs.getInt("ID");
			this.nome = rs.getString("NOME");
			this.principioAtivo = rs.getInt("PRINCIPIOATIVO");
			this.descricao = rs.getString("DESCRICAO");
			this.codEan = rs.getString("CODEAN");
			this.codNcm = rs.getString("CODNCM");
			this.undEstoque = rs.getString("UNDESTOQUE");
			this.undVenda = rs.getString("UNDVENDA");
			this.qtdEstoque = rs.getDouble("QTDESTOQUE");
			this.qtdVenda = rs.getDouble("QTDVENDA");
			this.idFabricante = rs.getInt("FABRICANTE");
			this.idGrupoProduto = rs.getInt("GRUPOPRODUTO");
			this.idTipoRacao = rs.getInt("TIPORACAO");
			this.epi = rs.getBoolean("ISEPI");
			this.protecaoAuditiva = rs.getBoolean("ISPROTECAOAUDITIVA");
			this.protecaoVisualFacial = rs.getBoolean("ISPROTECAOVISUALEFACE");
			this.protecaoCabeca = rs.getBoolean("ISPROTECAOCABECA");
			this.protecaoMaosBracos = rs.getBoolean("ISPROTECAOMAOSEMRACOS");
			this.protecaoPernasPes  = rs.getBoolean("ISPROTECAOPESEPERNAS");
			this.protecaoContraQuedas = rs.getBoolean("ISPROTECAOCONTRAQUEDAS");
			this.protecaoDorsal = rs.getBoolean("ISPROTECAODORSAL");
			this.prazoMinUsoEPI = rs.getInt("PRAZOMINUSOEPI");
			this.prazoMaxUsoEPI = rs.getInt("PRAZOMAXUSOEPI");
			this.rua = rs.getString("RUA");
			this.pratileira = rs.getString("PRATILEIRA");
			this.andar = rs.getString("ANDAR");
			this.precoCompra = rs.getDouble("PRECOCOMPRA");
			this.precoVenda = rs.getDouble("PRECOVENDA");
			this.bloqueado = rs.getBoolean("ISBLOQUEADO");
			this.conferenciaAntesDeConfirmarEntradaDoItem = rs.getBoolean("ISCONFERENCIAITEMANTESCONFIRMACAOENTRADA");
			this.emitirOrdemCarregoNaVenda = rs.getBoolean("ISEMITIRORDEMCARREGONAVENDA");
			this.produtoInsideQuebraNaVenda = rs.getBoolean("ISPRODUTOINSIDEQUEBRANAVENDA");
			this.exigirIntegradoDuranteProgramacaoVenda = rs.getBoolean("ISEXIGIRINTEGRADOPROGRAMACAOVENDA");
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
	 * @return the principioAtivo
	 */
	public int getPrincipioAtivo() {
		return principioAtivo;
	}

	/**
	 * @param principioAtivo the principioAtivo to set
	 */
	public void setPrincipioAtivo(int principioAtivo) {
		this.principioAtivo = principioAtivo;
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
	 * @return the codEan
	 */
	public String getCodEan() {
		return codEan;
	}

	/**
	 * @param codEan the codEan to set
	 */
	public void setCodEan(String codEan) {
		this.codEan = codEan;
	}

	/**
	 * @return the codNcm
	 */
	public String getCodNcm() {
		return codNcm;
	}

	/**
	 * @param codNcm the codNcm to set
	 */
	public void setCodNcm(String codNcm) {
		this.codNcm = codNcm;
	}

	/**
	 * @return the undEstoque
	 */
	public String getUndEstoque() {
		return undEstoque;
	}

	/**
	 * @param undEstoque the undEstoque to set
	 */
	public void setUndEstoque(String undEstoque) {
		this.undEstoque = undEstoque;
	}

	/**
	 * @return the undVenda
	 */
	public String getUndVenda() {
		return undVenda;
	}

	/**
	 * @param undVenda the undVenda to set
	 */
	public void setUndVenda(String undVenda) {
		this.undVenda = undVenda;
	}

	/**
	 * @return the qtdEstoque
	 */
	public double getQtdEstoque() {
		return qtdEstoque;
	}

	/**
	 * @param qtdEstoque the qtdEstoque to set
	 */
	public void setQtdEstoque(double qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	/**
	 * @return the qtdVenda
	 */
	public double getQtdVenda() {
		return qtdVenda;
	}

	/**
	 * @param qtdVenda the qtdVenda to set
	 */
	public void setQtdVenda(double qtdVenda) {
		this.qtdVenda = qtdVenda;
	}

	/**
	 * @return the idFabricante
	 */
	public int getIdFabricante() {
		return idFabricante;
	}

	/**
	 * @param idFabricante the idFabricante to set
	 */
	public void setIdFabricante(int idFabricante) {
		this.idFabricante = idFabricante;
	}

	/**
	 * @return the idGrupoProduto
	 */
	public int getIdGrupoProduto() {
		return idGrupoProduto;
	}

	/**
	 * @param idGrupoProduto the idGrupoProduto to set
	 */
	public void setIdGrupoProduto(int idGrupoProduto) {
		this.idGrupoProduto = idGrupoProduto;
	}

	/**
	 * @return the idTipoRacao
	 */
	public int getIdTipoRacao() {
		return idTipoRacao;
	}

	/**
	 * @param idTipoRacao the idTipoRacao to set
	 */
	public void setIdTipoRacao(int idTipoRacao) {
		this.idTipoRacao = idTipoRacao;
	}

	/**
	 * @return the epi
	 */
	public boolean isEpi() {
		return epi;
	}

	/**
	 * @param epi the epi to set
	 */
	public void setEpi(boolean epi) {
		this.epi = epi;
	}

	/**
	 * @return the protecaoAuditiva
	 */
	public boolean isProtecaoAuditiva() {
		return protecaoAuditiva;
	}

	/**
	 * @param protecaoAuditiva the protecaoAuditiva to set
	 */
	public void setProtecaoAuditiva(boolean protecaoAuditiva) {
		this.protecaoAuditiva = protecaoAuditiva;
	}

	/**
	 * @return the protecaoVisualFacial
	 */
	public boolean isProtecaoVisualFacial() {
		return protecaoVisualFacial;
	}

	/**
	 * @param protecaoVisualFacial the protecaoVisualFacial to set
	 */
	public void setProtecaoVisualFacial(boolean protecaoVisualFacial) {
		this.protecaoVisualFacial = protecaoVisualFacial;
	}

	/**
	 * @return the protecaoCabeca
	 */
	public boolean isProtecaoCabeca() {
		return protecaoCabeca;
	}

	/**
	 * @param protecaoCabeca the protecaoCabeca to set
	 */
	public void setProtecaoCabeca(boolean protecaoCabeca) {
		this.protecaoCabeca = protecaoCabeca;
	}

	/**
	 * @return the protecaoMaosBracos
	 */
	public boolean isProtecaoMaosBracos() {
		return protecaoMaosBracos;
	}

	/**
	 * @param protecaoMaosBracos the protecaoMaosBracos to set
	 */
	public void setProtecaoMaosBracos(boolean protecaoMaosBracos) {
		this.protecaoMaosBracos = protecaoMaosBracos;
	}

	/**
	 * @return the protecaoPernasPes
	 */
	public boolean isProtecaoPernasPes() {
		return protecaoPernasPes;
	}

	/**
	 * @param protecaoPernasPes the protecaoPernasPes to set
	 */
	public void setProtecaoPernasPes(boolean protecaoPernasPes) {
		this.protecaoPernasPes = protecaoPernasPes;
	}

	/**
	 * @return the protecaoContraQuedas
	 */
	public boolean isProtecaoContraQuedas() {
		return protecaoContraQuedas;
	}

	/**
	 * @param protecaoContraQuedas the protecaoContraQuedas to set
	 */
	public void setProtecaoContraQuedas(boolean protecaoContraQuedas) {
		this.protecaoContraQuedas = protecaoContraQuedas;
	}

	/**
	 * @return the protecaoDorsal
	 */
	public boolean isProtecaoDorsal() {
		return protecaoDorsal;
	}

	/**
	 * @param protecaoDorsal the protecaoDorsal to set
	 */
	public void setProtecaoDorsal(boolean protecaoDorsal) {
		this.protecaoDorsal = protecaoDorsal;
	}

	/**
	 * @return the prazoMinUsoEPI
	 */
	public int getPrazoMinUsoEPI() {
		return prazoMinUsoEPI;
	}

	/**
	 * @param prazoMinUsoEPI the prazoMinUsoEPI to set
	 */
	public void setPrazoMinUsoEPI(int prazoMinUsoEPI) {
		this.prazoMinUsoEPI = prazoMinUsoEPI;
	}

	/**
	 * @return the prazoMaxUsoEPI
	 */
	public int getPrazoMaxUsoEPI() {
		return prazoMaxUsoEPI;
	}

	/**
	 * @param prazoMaxUsoEPI the prazoMaxUsoEPI to set
	 */
	public void setPrazoMaxUsoEPI(int prazoMaxUsoEPI) {
		this.prazoMaxUsoEPI = prazoMaxUsoEPI;
	}

	/**
	 * @return the rua
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * @param rua the rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
	 * @return the pratileira
	 */
	public String getPratileira() {
		return pratileira;
	}

	/**
	 * @param pratileira the pratileira to set
	 */
	public void setPratileira(String pratileira) {
		this.pratileira = pratileira;
	}

	/**
	 * @return the andar
	 */
	public String getAndar() {
		return andar;
	}

	/**
	 * @param andar the andar to set
	 */
	public void setAndar(String andar) {
		this.andar = andar;
	}

	/**
	 * @return the precoCompra
	 */
	public double getPrecoCompra() {
		return precoCompra;
	}

	/**
	 * @param precoCompra the precoCompra to set
	 */
	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	/**
	 * @return the precoVenda
	 */
	public double getPrecoVenda() {
		return precoVenda;
	}

	/**
	 * @param precoVenda the precoVenda to set
	 */
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	/**
	 * @return the bloqueado
	 */
	public boolean isBloqueado() {
		return bloqueado;
	}

	/**
	 * @param bloqueado the bloqueado to set
	 */
	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	/**
	 * @return the conferenciaAntesDeConfirmarEntradaDoItem
	 */
	public boolean isConferenciaAntesDeConfirmarEntradaDoItem() {
		return conferenciaAntesDeConfirmarEntradaDoItem;
	}

	/**
	 * @param conferenciaAntesDeConfirmarEntradaDoItem the conferenciaAntesDeConfirmarEntradaDoItem to set
	 */
	public void setConferenciaAntesDeConfirmarEntradaDoItem(
			boolean conferenciaAntesDeConfirmarEntradaDoItem) {
		this.conferenciaAntesDeConfirmarEntradaDoItem = conferenciaAntesDeConfirmarEntradaDoItem;
	}

	/**
	 * @return the emitirOrdemCarregoNaVenda
	 */
	public boolean isEmitirOrdemCarregoNaVenda() {
		return emitirOrdemCarregoNaVenda;
	}

	/**
	 * @param emitirOrdemCarregoNaVenda the emitirOrdemCarregoNaVenda to set
	 */
	public void setEmitirOrdemCarregoNaVenda(boolean emitirOrdemCarregoNaVenda) {
		this.emitirOrdemCarregoNaVenda = emitirOrdemCarregoNaVenda;
	}

	/**
	 * @return the produtoInsideQuebraNaVenda
	 */
	public boolean isProdutoInsideQuebraNaVenda() {
		return produtoInsideQuebraNaVenda;
	}

	/**
	 * @param produtoInsideQuebraNaVenda the produtoInsideQuebraNaVenda to set
	 */
	public void setProdutoInsideQuebraNaVenda(boolean produtoInsideQuebraNaVenda) {
		this.produtoInsideQuebraNaVenda = produtoInsideQuebraNaVenda;
	}

	/**
	 * @return the exigirIntegradoDuranteProgramacaoVenda
	 */
	public boolean isExigirIntegradoDuranteProgramacaoVenda() {
		return exigirIntegradoDuranteProgramacaoVenda;
	}

	/**
	 * @param exigirIntegradoDuranteProgramacaoVenda the exigirIntegradoDuranteProgramacaoVenda to set
	 */
	public void setExigirIntegradoDuranteProgramacaoVenda(boolean exigirIntegradoDuranteProgramacaoVenda) {
		this.exigirIntegradoDuranteProgramacaoVenda = exigirIntegradoDuranteProgramacaoVenda;
	}

	/**
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public String toString() {
		return "Produtos [id=" + id + ", nome=" + nome + ", principioAtivo=" + principioAtivo + ", descricao="
				+ descricao + ", codEan=" + codEan + ", codNcm=" + codNcm + ", undEstoque=" + undEstoque + ", undVenda="
				+ undVenda + ", qtdEstoque=" + qtdEstoque + ", qtdVenda=" + qtdVenda + ", idFabricante=" + idFabricante
				+ ", idGrupoProduto=" + idGrupoProduto + ", idTipoRacao=" + idTipoRacao + ", epi=" + epi
				+ ", protecaoAuditiva=" + protecaoAuditiva + ", protecaoVisualFacial=" + protecaoVisualFacial
				+ ", protecaoCabeca=" + protecaoCabeca + ", protecaoMaosBracos=" + protecaoMaosBracos
				+ ", protecaoPernasPes=" + protecaoPernasPes + ", protecaoContraQuedas=" + protecaoContraQuedas
				+ ", protecaoDorsal=" + protecaoDorsal + ", prazoMinUsoEPI=" + prazoMinUsoEPI + ", prazoMaxUsoEPI="
				+ prazoMaxUsoEPI + ", rua=" + rua + ", pratileira=" + pratileira + ", andar=" + andar + ", precoCompra="
				+ precoCompra + ", precoVenda=" + precoVenda + ", bloqueado=" + bloqueado
				+ ", conferenciaAntesDeConfirmarEntradaDoItem=" + conferenciaAntesDeConfirmarEntradaDoItem
				+ ", emitirOrdemCarregoNaVenda=" + emitirOrdemCarregoNaVenda + ", produtoInsideQuebraNaVenda="
				+ produtoInsideQuebraNaVenda + ", exigirIntegradoDuranteProgramacaoVenda="
				+ exigirIntegradoDuranteProgramacaoVenda + "]";
	}

	/**
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((andar == null) ? 0 : andar.hashCode());
		result = prime * result + (bloqueado ? 1231 : 1237);
		result = prime * result + ((codEan == null) ? 0 : codEan.hashCode());
		result = prime * result + ((codNcm == null) ? 0 : codNcm.hashCode());
		result = prime * result + (conferenciaAntesDeConfirmarEntradaDoItem ? 1231 : 1237);
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + (emitirOrdemCarregoNaVenda ? 1231 : 1237);
		result = prime * result + (epi ? 1231 : 1237);
		result = prime * result + (exigirIntegradoDuranteProgramacaoVenda ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + idFabricante;
		result = prime * result + idGrupoProduto;
		result = prime * result + idTipoRacao;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((pratileira == null) ? 0 : pratileira.hashCode());
		result = prime * result + prazoMaxUsoEPI;
		result = prime * result + prazoMinUsoEPI;
		long temp;
		temp = Double.doubleToLongBits(precoCompra);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(precoVenda);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + principioAtivo;
		result = prime * result + (produtoInsideQuebraNaVenda ? 1231 : 1237);
		result = prime * result + (protecaoAuditiva ? 1231 : 1237);
		result = prime * result + (protecaoCabeca ? 1231 : 1237);
		result = prime * result + (protecaoContraQuedas ? 1231 : 1237);
		result = prime * result + (protecaoDorsal ? 1231 : 1237);
		result = prime * result + (protecaoMaosBracos ? 1231 : 1237);
		result = prime * result + (protecaoPernasPes ? 1231 : 1237);
		result = prime * result + (protecaoVisualFacial ? 1231 : 1237);
		temp = Double.doubleToLongBits(qtdEstoque);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(qtdVenda);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
		result = prime * result + ((undEstoque == null) ? 0 : undEstoque.hashCode());
		result = prime * result + ((undVenda == null) ? 0 : undVenda.hashCode());
		return result;
	}

	/**
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Produtos) && ((Produtos)obj).getId() == this.getId()) {
			return true;
		}

		return false;
	}
	
	
}