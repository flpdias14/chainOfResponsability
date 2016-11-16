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
public class EstruturaIntegrado {
    private int idIntegrado;
    private int idEndereco;
    private String identificacao;
    private int capacidadeGalpao;
    private int qtdComedor;
    private int qtdBebedor;
    private String tipoAgua;
    private String tipoAquecimento;
    private double area;
    private double distanciaIda;
    private double distanciaVolta;
    private boolean bloqueado, galpaoPostura;

    public EstruturaIntegrado() {}

    public EstruturaIntegrado(ResultSet rs) {
        try {
            this.idIntegrado = rs.getInt("ID");
            this.idEndereco = rs.getInt("IDENDERECO");
            this.identificacao = rs.getString("IDENTIFICACAO");
            this.capacidadeGalpao = rs.getInt("CAPACIDADEGALPAO");
            this.qtdComedor = rs.getInt("QTDCOMEDOR");
            this.qtdBebedor = rs.getInt("QTDBEBEDOR");
            this.tipoAgua = rs.getString("TIPOAGUA");
            this.tipoAquecimento = rs.getString("TIPOAQUECIMENTO");
            this.area = rs.getDouble("AREA");
            this.bloqueado = rs.getBoolean("ISBLOQUEADO");
            this.galpaoPostura = rs.getBoolean("ISGALPAOPOSTURA");
        } catch (SQLException erro) {
          //  GravarLogs.gravarLogsDeErros(erro);
            //(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setValues(ResultSet rs) {
        try {
            this.idIntegrado = rs.getInt("ID");
            this.idEndereco = rs.getInt("IDENDERECO");
            this.identificacao = rs.getString("IDENTIFICACAO");
            this.capacidadeGalpao = rs.getInt("CAPACIDADEGALPAO");
            this.qtdComedor = rs.getInt("QTDCOMEDOR");
            this.qtdBebedor = rs.getInt("QTDBEBEDOR");
            this.tipoAgua = rs.getString("TIPOAGUA");
            this.tipoAquecimento = rs.getString("TIPOAQUECIMENTO");
            this.area = rs.getDouble("AREA");
            this.bloqueado = rs.getBoolean("ISBLOQUEADO");
            this.galpaoPostura = rs.getBoolean("ISGALPAOPOSTURA");
        } catch (SQLException erro) {
           // GravarLogs.gravarLogsDeErros(erro);
            //JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @return the idIntegrado
     */
    public int getIdIntegrado() {
        return idIntegrado;
    }

    /**
     * @param idIntegrado the idIntegrado to set
     */
    public void setIdIntegrado(int idIntegrado) {
        this.idIntegrado = idIntegrado;
    }

    /**
     * @return the idEndereco
     */
    public int getIdEndereco() {
        return idEndereco;
    }

    /**
     * @param idEndereco the idEndereco to set
     */
    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    /**
     * @return the identificacao
     */
    public String getIdentificacao() {
        return identificacao;
    }

    /**
     * @param identificacao the identificacao to set
     */
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    /**
     * @return the capacidadeGalpao
     */
    public int getCapacidadeGalpao() {
        return capacidadeGalpao;
    }

    /**
     * @param capacidadeGalpao the capacidadeGalpao to set
     */
    public void setCapacidadeGalpao(int capacidadeGalpao) {
        this.capacidadeGalpao = capacidadeGalpao;
    }

    /**
     * @return the qtdComedor
     */
    public int getQtdComedor() {
        return qtdComedor;
    }

    /**
     * @param qtdComedor the qtdComedor to set
     */
    public void setQtdComedor(int qtdComedor) {
        this.qtdComedor = qtdComedor;
    }

    /**
     * @return the qtdBebedor
     */
    public int getQtdBebedor() {
        return qtdBebedor;
    }

    /**
     * @param qtdBebedor the qtdBebedor to set
     */
    public void setQtdBebedor(int qtdBebedor) {
        this.qtdBebedor = qtdBebedor;
    }

    /**
     * @return the tipoAgua
     */
    public String getTipoAgua() {
        return tipoAgua;
    }

    /**
     * @param tipoAgua the tipoAgua to set
     */
    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    /**
     * @return the tipoAquecimento
     */
    public String getTipoAquecimento() {
        return tipoAquecimento;
    }

    /**
     * @param tipoAquecimento the tipoAquecimento to set
     */
    public void setTipoAquecimento(String tipoAquecimento) {
        this.tipoAquecimento = tipoAquecimento;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * @return the distanciaIda
     */
    public double getDistanciaIda() {
        return distanciaIda;
    }

    /**
     * @param distanciaIda the distanciaIda to set
     */
    public void setDistanciaIda(double distanciaIda) {
        this.distanciaIda = distanciaIda;
    }

    /**
     * @return the distanciaVolta
     */
    public double getDistanciaVolta() {
        return distanciaVolta;
    }

    /**
     * @param distanciaVolta the distanciaVolta to set
     */
    public void setDistanciaVolta(double distanciaVolta) {
        this.distanciaVolta = distanciaVolta;
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
     * @return the galpaoPostura
     */
    public boolean isGalpaoPostura() {
        return galpaoPostura;
    }

    /**
     * @param galpaoPostura the galpaoPostura to set
     */
    public void setGalpaoPostura(boolean galpaoPostura) {
        this.galpaoPostura = galpaoPostura;
    }

	/**
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (bloqueado ? 1231 : 1237);
		result = prime * result + capacidadeGalpao;
		temp = Double.doubleToLongBits(distanciaIda);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(distanciaVolta);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (galpaoPostura ? 1231 : 1237);
		result = prime * result + idEndereco;
		result = prime * result + idIntegrado;
		result = prime * result + ((identificacao == null) ? 0 : identificacao.hashCode());
		result = prime * result + qtdBebedor;
		result = prime * result + qtdComedor;
		result = prime * result + ((tipoAgua == null) ? 0 : tipoAgua.hashCode());
		result = prime * result + ((tipoAquecimento == null) ? 0 : tipoAquecimento.hashCode());
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
		EstruturaIntegrado other = (EstruturaIntegrado) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (bloqueado != other.bloqueado)
			return false;
		if (capacidadeGalpao != other.capacidadeGalpao)
			return false;
		if (Double.doubleToLongBits(distanciaIda) != Double.doubleToLongBits(other.distanciaIda))
			return false;
		if (Double.doubleToLongBits(distanciaVolta) != Double.doubleToLongBits(other.distanciaVolta))
			return false;
		if (galpaoPostura != other.galpaoPostura)
			return false;
		if (idEndereco != other.idEndereco)
			return false;
		if (idIntegrado != other.idIntegrado)
			return false;
		if (identificacao == null) {
			if (other.identificacao != null)
				return false;
		} else if (!identificacao.equals(other.identificacao))
			return false;
		if (qtdBebedor != other.qtdBebedor)
			return false;
		if (qtdComedor != other.qtdComedor)
			return false;
		if (tipoAgua == null) {
			if (other.tipoAgua != null)
				return false;
		} else if (!tipoAgua.equals(other.tipoAgua))
			return false;
		if (tipoAquecimento == null) {
			if (other.tipoAquecimento != null)
				return false;
		} else if (!tipoAquecimento.equals(other.tipoAquecimento))
			return false;
		return true;
	}
    
    
}