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
public class DadosAlojamentoPorGalpao {
	private int id, 
				idAlojamento, 
				idPreAlojamento, 
				galpao, 
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
				qtdMistosSacrificados;
	private double pesoMedio,
					pesoMinimo, 
					pesoMaximo,  
					consumoMedio, 
					conversaoAlimentar, 
					viabilidade, 
					IEP, 
					fatorProducao;
	
	public DadosAlojamentoPorGalpao() {
		
	}
	
	public DadosAlojamentoPorGalpao(ResultSet rs) {
		try {
			this.id = rs.getInt("ID");
			this.idAlojamento = rs.getInt("IDALOJAMENTO");
			this.idPreAlojamento = rs.getInt("IDPREALOJAMENTO");
			this.galpao = rs.getInt("GALPAO");
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
			this.consumoMedio = rs.getDouble("CONSUMOMEDIO");
			this.conversaoAlimentar = rs.getDouble("CONVERSAOALIMENTAR");
			this.viabilidade = rs.getDouble("VIABILIDADE");
			this.fatorProducao = rs.getDouble("FATORPRODUCAO");
			this.IEP = rs.getDouble("IEP");
		} catch (SQLException erro) {
//			GravarLogs.gravarLogsDeErros(erro);
//			JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void setValues(ResultSet rs) {
		try {
			this.id = rs.getInt("ID");
			this.idAlojamento = rs.getInt("IDALOJAMENTO");
			this.idPreAlojamento = rs.getInt("IDPREALOJAMENTO");
			this.galpao = rs.getInt("GALPAO");
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
			this.consumoMedio = rs.getDouble("CONSUMOMEDIO");
			this.conversaoAlimentar = rs.getDouble("CONVERSAOALIMENTAR");
			this.viabilidade = rs.getDouble("VIABILIDADE");
			this.fatorProducao = rs.getDouble("FATORPRODUCAO");
			this.IEP = rs.getDouble("IEP");
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
	 * @return the idAlojamento
	 */
	public int getIdAlojamento() {
		return idAlojamento;
	}

	/**
	 * @param idAlojamento the idAlojamento to set
	 */
	public void setIdAlojamento(int idAlojamento) {
		this.idAlojamento = idAlojamento;
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
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(IEP);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(consumoMedio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(conversaoAlimentar);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + faltas;
		result = prime * result + faltasFemea;
		result = prime * result + faltasMacho;
		result = prime * result + faltasMisto;
		temp = Double.doubleToLongBits(fatorProducao);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + galpao;
		result = prime * result + id;
		result = prime * result + idAlojamento;
		result = prime * result + idPreAlojamento;
		result = prime * result + mortalidade;
		result = prime * result + mortalidadeFemea;
		result = prime * result + mortalidadeMacho;
		result = prime * result + mortalidadeMisto;
		result = prime * result + perdas;
		result = prime * result + perdasFemea;
		result = prime * result + perdasMacho;
		result = prime * result + perdasMisto;
		temp = Double.doubleToLongBits(pesoMaximo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pesoMedio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pesoMinimo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + qtdAvesAlojadas;
		result = prime * result + qtdAvesFemea;
		result = prime * result + qtdAvesMacho;
		result = prime * result + qtdAvesMisto;
		result = prime * result + qtdFemeasSacrificadas;
		result = prime * result + qtdMachoSacrificados;
		result = prime * result + qtdMistosSacrificados;
		result = prime * result + sacrificadas;
		result = prime * result + saldoAvesAlojadas;
		result = prime * result + saldoAvesFemea;
		result = prime * result + saldoAvesMacho;
		result = prime * result + saldoAvesMisto;
		temp = Double.doubleToLongBits(viabilidade);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		DadosAlojamentoPorGalpao other = (DadosAlojamentoPorGalpao) obj;
		if (Double.doubleToLongBits(IEP) != Double.doubleToLongBits(other.IEP))
			return false;
		if (Double.doubleToLongBits(consumoMedio) != Double.doubleToLongBits(other.consumoMedio))
			return false;
		if (Double.doubleToLongBits(conversaoAlimentar) != Double.doubleToLongBits(other.conversaoAlimentar))
			return false;
		if (faltas != other.faltas)
			return false;
		if (faltasFemea != other.faltasFemea)
			return false;
		if (faltasMacho != other.faltasMacho)
			return false;
		if (faltasMisto != other.faltasMisto)
			return false;
		if (Double.doubleToLongBits(fatorProducao) != Double.doubleToLongBits(other.fatorProducao))
			return false;
		if (galpao != other.galpao)
			return false;
		if (id != other.id)
			return false;
		if (idAlojamento != other.idAlojamento)
			return false;
		if (idPreAlojamento != other.idPreAlojamento)
			return false;
		if (mortalidade != other.mortalidade)
			return false;
		if (mortalidadeFemea != other.mortalidadeFemea)
			return false;
		if (mortalidadeMacho != other.mortalidadeMacho)
			return false;
		if (mortalidadeMisto != other.mortalidadeMisto)
			return false;
		if (perdas != other.perdas)
			return false;
		if (perdasFemea != other.perdasFemea)
			return false;
		if (perdasMacho != other.perdasMacho)
			return false;
		if (perdasMisto != other.perdasMisto)
			return false;
		if (Double.doubleToLongBits(pesoMaximo) != Double.doubleToLongBits(other.pesoMaximo))
			return false;
		if (Double.doubleToLongBits(pesoMedio) != Double.doubleToLongBits(other.pesoMedio))
			return false;
		if (Double.doubleToLongBits(pesoMinimo) != Double.doubleToLongBits(other.pesoMinimo))
			return false;
		if (qtdAvesAlojadas != other.qtdAvesAlojadas)
			return false;
		if (qtdAvesFemea != other.qtdAvesFemea)
			return false;
		if (qtdAvesMacho != other.qtdAvesMacho)
			return false;
		if (qtdAvesMisto != other.qtdAvesMisto)
			return false;
		if (qtdFemeasSacrificadas != other.qtdFemeasSacrificadas)
			return false;
		if (qtdMachoSacrificados != other.qtdMachoSacrificados)
			return false;
		if (qtdMistosSacrificados != other.qtdMistosSacrificados)
			return false;
		if (sacrificadas != other.sacrificadas)
			return false;
		if (saldoAvesAlojadas != other.saldoAvesAlojadas)
			return false;
		if (saldoAvesFemea != other.saldoAvesFemea)
			return false;
		if (saldoAvesMacho != other.saldoAvesMacho)
			return false;
		if (saldoAvesMisto != other.saldoAvesMisto)
			return false;
		if (Double.doubleToLongBits(viabilidade) != Double.doubleToLongBits(other.viabilidade))
			return false;
		return true;
	}

	/**
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public String toString() {
		return "DadosAlojamentoPorGalpao [id=" + id + ", idAlojamento=" + idAlojamento + ", idPreAlojamento="
				+ idPreAlojamento + ", galpao=" + galpao + ", qtdAvesAlojadas=" + qtdAvesAlojadas + ", qtdAvesMacho="
				+ qtdAvesMacho + ", qtdAvesFemea=" + qtdAvesFemea + ", qtdAvesMisto=" + qtdAvesMisto
				+ ", saldoAvesAlojadas=" + saldoAvesAlojadas + ", mortalidade=" + mortalidade + ", perdas=" + perdas
				+ ", faltas=" + faltas + ", sacrificadas=" + sacrificadas + ", saldoAvesMacho=" + saldoAvesMacho
				+ ", mortalidadeMacho=" + mortalidadeMacho + ", perdasMacho=" + perdasMacho + ", faltasMacho="
				+ faltasMacho + ", qtdMachoSacrificados=" + qtdMachoSacrificados + ", saldoAvesFemea=" + saldoAvesFemea
				+ ", mortalidadeFemea=" + mortalidadeFemea + ", perdasFemea=" + perdasFemea + ", faltasFemea="
				+ faltasFemea + ", qtdFemeasSacrificadas=" + qtdFemeasSacrificadas + ", saldoAvesMisto="
				+ saldoAvesMisto + ", mortalidadeMisto=" + mortalidadeMisto + ", perdasMisto=" + perdasMisto
				+ ", faltasMisto=" + faltasMisto + ", qtdMistosSacrificados=" + qtdMistosSacrificados + ", pesoMedio="
				+ pesoMedio + ", pesoMinimo=" + pesoMinimo + ", pesoMaximo=" + pesoMaximo + ", consumoMedio="
				+ consumoMedio + ", conversaoAlimentar=" + conversaoAlimentar + ", viabilidade=" + viabilidade
				+ ", IEP=" + IEP + ", fatorProducao=" + fatorProducao + "]";
	}
	
	
}
