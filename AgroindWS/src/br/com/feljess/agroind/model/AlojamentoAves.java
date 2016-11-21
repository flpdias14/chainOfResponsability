package br.com.feljess.agroind.model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/*
* Modificado por Felipe Oliveira 07/11/2016
* @autor Felipe Salvador
* */
@XmlRootElement
public class AlojamentoAves {
	private int id, 
				und, 
				integrado, 
				idPreAlojamento,
				numeroAlojamentoIntegrado, 
				qtdAvesAlojadas, 
				qtdAvesMacho, 
				qtdAvesFemea, 
				qtdAvesMisto, 
				saldoAvesAlojadas,
				mortalidade, 
				perdas, 
				faltas, 
				sacrificadas, 
				saldoAvesMacho,
				mortalidadeMacho,
				perdasMacho,
				faltasMacho, 
				qtdMachoSacrificados,
				saldoAvesFemea,
				mortalidadeFemea,
				perdasFemea, 
				faltasFemea, 
				qtdFemeasSacrificadas, 
				saldoAvesMisto, 
				mortalidadeMisto, 
				perdasMisto, 
				faltasMisto, 
				qtdMistosSacrificados,
				idade, 
				numeroVisitas;
	private String lote, dataAlojamento, horaAlojamento, idadeMatriz;
	private double pesoMedio,
					pesoMinimo, 
					pesoMaximo, 
					qtdRacaoEnviada, 
					qtdRacaoConsumida, 
					qtdRacaoDevolvida, 
					totalDespesasServico, 
					totalDespesasProdutos, 
					totalDespesasRacao, 
					consumoMedio, 
					conversaoAlimentar, 
					viabilidade, 
					IEP, 
					remuneracao, 
					bonificacao, 
					fatorProducao;
	private boolean fechado;
	private List<DadosAlojamentoPorGalpao> listaGalpoes;
	private List<Vacinas> listaVacinas;
	
	
	public AlojamentoAves() {
		listaGalpoes = new ArrayList<DadosAlojamentoPorGalpao>();
		listaVacinas = new ArrayList<Vacinas>();
	}
	
	public AlojamentoAves(ResultSet rs) {
		listaGalpoes = new ArrayList<DadosAlojamentoPorGalpao>();
		listaVacinas = new ArrayList<Vacinas>();
		try {
			this.id = rs.getInt("ID");
			this.idPreAlojamento = rs.getInt("IDPREALOJAMENTO");
			this.numeroAlojamentoIntegrado = rs.getInt("NUMEROALOJAMENTOINTEGRADO");
			this.und = rs.getInt("UND");
			this.dataAlojamento = rs.getString("DATAALOJAMENTO");
			this.horaAlojamento = rs.getString("HORAALOJAMENTO");
			this.integrado = rs.getInt("INTEGRADO");
			this.lote = rs.getString("LOTE");
			this.idade = rs.getInt("IDADE");
			this.idadeMatriz = rs.getString("IDADEMATRIZ");
			this.qtdAvesAlojadas = rs.getInt("QTDAVESALOJADAS");
			this.qtdAvesMacho = rs.getInt("QTDAVESMACHO");
			this.qtdAvesFemea = rs.getInt("QTDAVESFEMEA");
			this.qtdAvesMisto = rs.getInt("QTDAVESMISTO");
			this.saldoAvesAlojadas = rs.getInt("SALDOAVESALOJADAS");
			this.saldoAvesMacho = rs.getInt("SALDOAVESMACHO");
			this.saldoAvesFemea = rs.getInt("SALDOAVESFEMEA");
			this.saldoAvesMisto = rs.getInt("SALDOAVESMISTO");
			this.mortalidade = rs.getInt("MORTALIDADE");
			this.mortalidadeMacho = rs.getInt("MORTALIDADEMACHO");
			this.mortalidadeFemea = rs.getInt("MORTALIDADEFEMEA");
			this.mortalidadeMisto = rs.getInt("MORTALIDADEMISTO");
			this.perdas = rs.getInt("PERDAS");
			this.perdasMacho = rs.getInt("PERDASMACHO");
			this.perdasFemea = rs.getInt("PERDASFEMEA");
			this.perdasMisto = rs.getInt("PERDASMISTO");
			this.sacrificadas = rs.getInt("SACRIFICADAS");
			this.faltas = rs.getInt("FALTAS");
			this.faltasMacho = rs.getInt("FALTASMACHO");
			this.faltasFemea = rs.getInt("FALTASFEMEA");
			this.faltasMisto = rs.getInt("FALTASMISTO");
			this.sacrificadas = rs.getInt("SACRIFICADAS");
			this.qtdMachoSacrificados = rs.getInt("MACHOSSACRIFICADOS");
			this.qtdFemeasSacrificadas = rs.getInt("FEMEASSACRIFICADAS");
			this.qtdMistosSacrificados = rs.getInt("MISTOSSACRIFICADOS");
			this.pesoMedio = rs.getDouble("PESOMEDIO");
			this.pesoMaximo = rs.getDouble("PESOMAXIMO");
			this.pesoMinimo = rs.getDouble("PESOMINIMO");
			this.qtdRacaoEnviada = rs.getDouble("QTDRACAOENVIADA");
			this.qtdRacaoConsumida = rs.getDouble("QTDRACAOCONSUMIDA");
			this.qtdRacaoDevolvida = rs.getDouble("QTDRACAODEVOLVIDA");
			this.consumoMedio = rs.getDouble("CONSUMOMEDIO");
			this.conversaoAlimentar = rs.getDouble("CONVERSAOALIMENTAR");
			this.viabilidade = rs.getDouble("VIABILIDADE");
			this.fatorProducao = rs.getDouble("FATORPRODUCAO");
			this.IEP = rs.getDouble("IEP");
			this.totalDespesasProdutos = rs.getDouble("TOTALDESPESASPRODUTOS");
			this.totalDespesasServico = rs.getDouble("TOTALDESPESASSERVICOS");
			this.totalDespesasRacao = rs.getDouble("TOTALDESPESASRACAO");
			this.remuneracao = rs.getDouble("REMUNERACAO");
			this.bonificacao = rs.getDouble("BONIFICACAO");
			this.numeroVisitas = rs.getInt("NUMEROVISITAS");
			this.fechado = rs.getBoolean("ISFECHADO");
		} catch (SQLException erro) {
//			GravarLogs.gravarLogsDeErros(erro);
//			JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void setValues(ResultSet rs) {
		try {
			this.id = rs.getInt("ID");
			this.idPreAlojamento = rs.getInt("IDPREALOJAMENTO");
			this.numeroAlojamentoIntegrado = rs.getInt("NUMEROALOJAMENTOINTEGRADO");
			this.und = rs.getInt("UND");
			this.dataAlojamento = rs.getString("DATAALOJAMENTO");
			this.horaAlojamento = rs.getString("HORAALOJAMENTO");
			this.integrado = rs.getInt("INTEGRADO");
			this.lote = rs.getString("LOTE");
			this.idade = rs.getInt("IDADE");
			this.idadeMatriz = rs.getString("IDADEMATRIZ");
			this.qtdAvesAlojadas = rs.getInt("QTDAVESALOJADAS");
			this.qtdAvesMacho = rs.getInt("QTDAVESMACHO");
			this.qtdAvesFemea = rs.getInt("QTDAVESFEMEA");
			this.qtdAvesMisto = rs.getInt("QTDAVESMISTO");
			this.saldoAvesAlojadas = rs.getInt("SALDOAVESALOJADAS");
			this.saldoAvesMacho = rs.getInt("SALDOAVESMACHO");
			this.saldoAvesFemea = rs.getInt("SALDOAVESFEMEA");
			this.saldoAvesMisto = rs.getInt("SALDOAVESMISTO");
			this.mortalidade = rs.getInt("MORTALIDADE");
			this.mortalidadeMacho = rs.getInt("MORTALIDADEMACHO");
			this.mortalidadeFemea = rs.getInt("MORTALIDADEFEMEA");
			this.mortalidadeMisto = rs.getInt("MORTALIDADEMISTO");
			this.perdas = rs.getInt("PERDAS");
			this.perdasMacho = rs.getInt("PERDASMACHO");
			this.perdasFemea = rs.getInt("PERDASFEMEA");
			this.perdasMisto = rs.getInt("PERDASMISTO");
			this.sacrificadas = rs.getInt("SACRIFICADAS");
			this.faltas = rs.getInt("FALTAS");
			this.faltasMacho = rs.getInt("FALTASMACHO");
			this.faltasFemea = rs.getInt("FALTASFEMEA");
			this.faltasMisto = rs.getInt("FALTASMISTO");
			this.sacrificadas = rs.getInt("SACRIFICADAS");
			this.qtdMachoSacrificados = rs.getInt("MACHOSSACRIFICADOS");
			this.qtdFemeasSacrificadas = rs.getInt("FEMEASSACRIFICADAS");
			this.qtdMistosSacrificados = rs.getInt("MISTOSSACRIFICADOS");
			this.pesoMedio = rs.getDouble("PESOMEDIO");
			this.pesoMaximo = rs.getDouble("PESOMAXIMO");
			this.pesoMinimo = rs.getDouble("PESOMINIMO");
			this.qtdRacaoEnviada = rs.getDouble("QTDRACAOENVIADA");
			this.qtdRacaoConsumida = rs.getDouble("QTDRACAOCONSUMIDA");
			this.qtdRacaoDevolvida = rs.getDouble("QTDRACAODEVOLVIDA");
			this.consumoMedio = rs.getDouble("CONSUMOMEDIO");
			this.conversaoAlimentar = rs.getDouble("CONVERSAOALIMENTAR");
			this.viabilidade = rs.getDouble("VIABILIDADE");
			this.fatorProducao = rs.getDouble("FATORPRODUCAO");
			this.IEP = rs.getDouble("IEP");
			this.totalDespesasProdutos = rs.getDouble("TOTALDESPESASPRODUTOS");
			this.totalDespesasServico = rs.getDouble("TOTALDESPESASSERVICOS");
			this.totalDespesasRacao = rs.getDouble("TOTALDESPESASRACAO");
			this.remuneracao = rs.getDouble("REMUNERACAO");
			this.bonificacao = rs.getDouble("BONIFICACAO");
			this.numeroVisitas = rs.getInt("NUMEROVISITAS");
			this.fechado = rs.getBoolean("ISFECHADO");
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
	 * @return the numeroAlojamentoIntegrado
	 */
	public int getNumeroAlojamentoIntegrado() {
		return numeroAlojamentoIntegrado;
	}

	/**
	 * @param numeroAlojamentoIntegrado the numeroAlojamentoIntegrado to set
	 */
	public void setNumeroAlojamentoIntegrado(int numeroAlojamentoIntegrado) {
		this.numeroAlojamentoIntegrado = numeroAlojamentoIntegrado;
	}

	/**
	 * @return the qtdAvesAlojadas
	 */
	public int getQtdAvesAlojadas() {
		return qtdAvesAlojadas;
	}

	/**
	 * @param qtdAvesAlojadas the qtdAvesAlojadas to set
	 */
	public void setQtdAvesAlojadas(int qtdAvesAlojadas) {
		this.qtdAvesAlojadas = qtdAvesAlojadas;
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
	 * @return the saldoAvesAlojadas
	 */
	public int getSaldoAvesAlojadas() {
		return saldoAvesAlojadas;
	}

	/**
	 * @param saldoAvesAlojadas the saldoAvesAlojadas to set
	 */
	public void setSaldoAvesAlojadas(int saldoAvesAlojadas) {
		this.saldoAvesAlojadas = saldoAvesAlojadas;
	}

	/**
	 * @return the mortalidade
	 */
	public int getMortalidade() {
		return mortalidade;
	}

	/**
	 * @param mortalidade the mortalidade to set
	 */
	public void setMortalidade(int mortalidade) {
		this.mortalidade = mortalidade;
	}

	/**
	 * @return the perdas
	 */
	public int getPerdas() {
		return perdas;
	}

	/**
	 * @param perdas the perdas to set
	 */
	public void setPerdas(int perdas) {
		this.perdas = perdas;
	}

	/**
	 * @return the faltas
	 */
	public int getFaltas() {
		return faltas;
	}

	/**
	 * @param faltas the faltas to set
	 */
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	/**
	 * @return the sacrificadas
	 */
	public int getSacrificadas() {
		return sacrificadas;
	}

	/**
	 * @param sacrificadas the sacrificadas to set
	 */
	public void setSacrificadas(int sacrificadas) {
		this.sacrificadas = sacrificadas;
	}

	/**
	 * @return the saldoAvesMacho
	 */
	public int getSaldoAvesMacho() {
		return saldoAvesMacho;
	}

	/**
	 * @param saldoAvesMacho the saldoAvesMacho to set
	 */
	public void setSaldoAvesMacho(int saldoAvesMacho) {
		this.saldoAvesMacho = saldoAvesMacho;
	}

	/**
	 * @return the mortalidadeMacho
	 */
	public int getMortalidadeMacho() {
		return mortalidadeMacho;
	}

	/**
	 * @param mortalidadeMacho the mortalidadeMacho to set
	 */
	public void setMortalidadeMacho(int mortalidadeMacho) {
		this.mortalidadeMacho = mortalidadeMacho;
	}

	/**
	 * @return the perdasMacho
	 */
	public int getPerdasMacho() {
		return perdasMacho;
	}

	/**
	 * @param perdasMacho the perdasMacho to set
	 */
	public void setPerdasMacho(int perdasMacho) {
		this.perdasMacho = perdasMacho;
	}

	/**
	 * @return the faltasMacho
	 */
	public int getFaltasMacho() {
		return faltasMacho;
	}

	/**
	 * @param faltasMacho the faltasMacho to set
	 */
	public void setFaltasMacho(int faltasMacho) {
		this.faltasMacho = faltasMacho;
	}

	/**
	 * @return the qtdMachoSacrificados
	 */
	public int getQtdMachoSacrificados() {
		return qtdMachoSacrificados;
	}

	/**
	 * @param qtdMachoSacrificados the qtdMachoSacrificados to set
	 */
	public void setQtdMachoSacrificados(int qtdMachoSacrificados) {
		this.qtdMachoSacrificados = qtdMachoSacrificados;
	}

	/**
	 * @return the saldoAvesFemea
	 */
	public int getSaldoAvesFemea() {
		return saldoAvesFemea;
	}

	/**
	 * @param saldoAvesFemea the saldoAvesFemea to set
	 */
	public void setSaldoAvesFemea(int saldoAvesFemea) {
		this.saldoAvesFemea = saldoAvesFemea;
	}

	/**
	 * @return the mortalidadeFemea
	 */
	public int getMortalidadeFemea() {
		return mortalidadeFemea;
	}

	/**
	 * @param mortalidadeFemea the mortalidadeFemea to set
	 */
	public void setMortalidadeFemea(int mortalidadeFemea) {
		this.mortalidadeFemea = mortalidadeFemea;
	}

	/**
	 * @return the perdasFemea
	 */
	public int getPerdasFemea() {
		return perdasFemea;
	}

	/**
	 * @param perdasFemea the perdasFemea to set
	 */
	public void setPerdasFemea(int perdasFemea) {
		this.perdasFemea = perdasFemea;
	}

	/**
	 * @return the faltasFemea
	 */
	public int getFaltasFemea() {
		return faltasFemea;
	}

	/**
	 * @param faltasFemea the faltasFemea to set
	 */
	public void setFaltasFemea(int faltasFemea) {
		this.faltasFemea = faltasFemea;
	}

	/**
	 * @return the qtdFemeasSacrificadas
	 */
	public int getQtdFemeasSacrificadas() {
		return qtdFemeasSacrificadas;
	}

	/**
	 * @param qtdFemeasSacrificadas the qtdFemeasSacrificadas to set
	 */
	public void setQtdFemeasSacrificadas(int qtdFemeasSacrificadas) {
		this.qtdFemeasSacrificadas = qtdFemeasSacrificadas;
	}

	/**
	 * @return the saldoAvesMisto
	 */
	public int getSaldoAvesMisto() {
		return saldoAvesMisto;
	}

	/**
	 * @param saldoAvesMisto the saldoAvesMisto to set
	 */
	public void setSaldoAvesMisto(int saldoAvesMisto) {
		this.saldoAvesMisto = saldoAvesMisto;
	}

	/**
	 * @return the mortalidadeMisto
	 */
	public int getMortalidadeMisto() {
		return mortalidadeMisto;
	}

	/**
	 * @param mortalidadeMisto the mortalidadeMisto to set
	 */
	public void setMortalidadeMisto(int mortalidadeMisto) {
		this.mortalidadeMisto = mortalidadeMisto;
	}

	/**
	 * @return the perdasMisto
	 */
	public int getPerdasMisto() {
		return perdasMisto;
	}

	/**
	 * @param perdasMisto the perdasMisto to set
	 */
	public void setPerdasMisto(int perdasMisto) {
		this.perdasMisto = perdasMisto;
	}

	/**
	 * @return the faltasMisto
	 */
	public int getFaltasMisto() {
		return faltasMisto;
	}

	/**
	 * @param faltasMisto the faltasMisto to set
	 */
	public void setFaltasMisto(int faltasMisto) {
		this.faltasMisto = faltasMisto;
	}

	/**
	 * @return the qtdMistosSacrificados
	 */
	public int getQtdMistosSacrificados() {
		return qtdMistosSacrificados;
	}

	/**
	 * @param qtdMistosSacrificados the qtdMistosSacrificados to set
	 */
	public void setQtdMistosSacrificados(int qtdMistosSacrificados) {
		this.qtdMistosSacrificados = qtdMistosSacrificados;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the idadeMatriz
	 */
	public String getIdadeMatriz() {
		return idadeMatriz;
	}

	/**
	 * @param idadeMatriz the idadeMatriz to set
	 */
	public void setIdadeMatriz(String idadeMatriz) {
		this.idadeMatriz = idadeMatriz;
	}

	/**
	 * @return the numeroVisitas
	 */
	public int getNumeroVisitas() {
		return numeroVisitas;
	}

	/**
	 * @param numeroVisitas the numeroVisitas to set
	 */
	public void setNumeroVisitas(int numeroVisitas) {
		this.numeroVisitas = numeroVisitas;
	}

	/**
	 * @return the lote
	 */
	public String getLote() {
		return lote;
	}

	/**
	 * @param lote the lote to set
	 */
	public void setLote(String lote) {
		this.lote = lote;
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
	 * @return the horaAlojamento
	 */
	public String getHoraAlojamento() {
		return horaAlojamento;
	}

	/**
	 * @param horaAlojamento the horaAlojamento to set
	 */
	public void setHoraAlojamento(String horaAlojamento) {
		this.horaAlojamento = horaAlojamento;
	}

	/**
	 * @return the pesoMedio
	 */
	public double getPesoMedio() {
		return pesoMedio;
	}

	/**
	 * @param pesoMedio the pesoMedio to set
	 */
	public void setPesoMedio(double pesoMedio) {
		this.pesoMedio = pesoMedio;
	}

	/**
	 * @return the pesoMinimo
	 */
	public double getPesoMinimo() {
		return pesoMinimo;
	}

	/**
	 * @param pesoMinimo the pesoMinimo to set
	 */
	public void setPesoMinimo(double pesoMinimo) {
		this.pesoMinimo = pesoMinimo;
	}

	/**
	 * @return the pesoMaximo
	 */
	public double getPesoMaximo() {
		return pesoMaximo;
	}

	/**
	 * @param pesoMaximo the pesoMaximo to set
	 */
	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	/**
	 * @return the qtdRacaoEnviada
	 */
	public double getQtdRacaoEnviada() {
		return qtdRacaoEnviada;
	}

	/**
	 * @param qtdRacaoEnviada the qtdRacaoEnviada to set
	 */
	public void setQtdRacaoEnviada(double qtdRacaoEnviada) {
		this.qtdRacaoEnviada = qtdRacaoEnviada;
	}

	/**
	 * @return the qtdRacaoConsumida
	 */
	public double getQtdRacaoConsumida() {
		return qtdRacaoConsumida;
	}

	/**
	 * @param qtdRacaoConsumida the qtdRacaoConsumida to set
	 */
	public void setQtdRacaoConsumida(double qtdRacaoConsumida) {
		this.qtdRacaoConsumida = qtdRacaoConsumida;
	}

	/**
	 * @return the qtdRacaoDevolvida
	 */
	public double getQtdRacaoDevolvida() {
		return qtdRacaoDevolvida;
	}

	/**
	 * @param qtdRacaoDevolvida the qtdRacaoDevolvida to set
	 */
	public void setQtdRacaoDevolvida(double qtdRacaoDevolvida) {
		this.qtdRacaoDevolvida = qtdRacaoDevolvida;
	}

	/**
	 * @return the totalDespesasServico
	 */
	public double getTotalDespesasServico() {
		return totalDespesasServico;
	}

	/**
	 * @param totalDespesasServico the totalDespesasServico to set
	 */
	public void setTotalDespesasServico(double totalDespesasServico) {
		this.totalDespesasServico = totalDespesasServico;
	}

	/**
	 * @return the totalDespesasProdutos
	 */
	public double getTotalDespesasProdutos() {
		return totalDespesasProdutos;
	}

	/**
	 * @param totalDespesasProdutos the totalDespesasProdutos to set
	 */
	public void setTotalDespesasProdutos(double totalDespesasProdutos) {
		this.totalDespesasProdutos = totalDespesasProdutos;
	}

	/**
	 * @return the totalDespesasRacao
	 */
	public double getTotalDespesasRacao() {
		return totalDespesasRacao;
	}

	/**
	 * @param totalDespesasRacao the totalDespesasRacao to set
	 */
	public void setTotalDespesasRacao(double totalDespesasRacao) {
		this.totalDespesasRacao = totalDespesasRacao;
	}

	/**
	 * @return the consumoMedio
	 */
	public double getConsumoMedio() {
		return consumoMedio;
	}

	/**
	 * @param consumoMedio the consumoMedio to set
	 */
	public void setConsumoMedio(double consumoMedio) {
		this.consumoMedio = consumoMedio;
	}

	/**
	 * @return the conversaoAlimentar
	 */
	public double getConversaoAlimentar() {
		return conversaoAlimentar;
	}

	/**
	 * @param conversaoAlimentar the conversaoAlimentar to set
	 */
	public void setConversaoAlimentar(double conversaoAlimentar) {
		this.conversaoAlimentar = conversaoAlimentar;
	}

	/**
	 * @return the viabilidade
	 */
	public double getViabilidade() {
		return viabilidade;
	}

	/**
	 * @param viabilidade the viabilidade to set
	 */
	public void setViabilidade(double viabilidade) {
		this.viabilidade = viabilidade;
	}

	/**
	 * @return the iEP
	 */
	public double getIEP() {
		return IEP;
	}

	/**
	 * @param iEP the iEP to set
	 */
	public void setIEP(double iEP) {
		IEP = iEP;
	}

	/**
	 * @return the remuneracao
	 */
	public double getRemuneracao() {
		return remuneracao;
	}

	/**
	 * @param remuneracao the remuneracao to set
	 */
	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}

	/**
	 * @return the bonificacao
	 */
	public double getBonificacao() {
		return bonificacao;
	}

	/**
	 * @param bonificacao the bonificacao to set
	 */
	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	/**
	 * @return the fatorProducao
	 */
	public double getFatorProducao() {
		return fatorProducao;
	}

	/**
	 * @param fatorProducao the fatorProducao to set
	 */
	public void setFatorProducao(double fatorProducao) {
		this.fatorProducao = fatorProducao;
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
	 * @return the listaGalpoes
	 */
	public List<DadosAlojamentoPorGalpao> getListaGalpoes() {
		return listaGalpoes;
	}

	/**
	 * @param listaGalpoes the listaGalpoes to set
	 */
	public void setListaGalpoes(List<DadosAlojamentoPorGalpao> listaGalpoes) {
		this.listaGalpoes = listaGalpoes;
	}

	/**
	 * @return the listaVacinas
	 */
	public List<Vacinas> getListaVacinas() {
		return listaVacinas;
	}

	/**
	 * @param listaVacinas the listaVacinas to set
	 */
	public void setListaVacinas(List<Vacinas> listaVacinas) {
		this.listaVacinas = listaVacinas;
	}
}
