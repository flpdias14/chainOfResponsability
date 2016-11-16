package br.com.feljess.agroind.model;

/**
 * Created by felipe on 07/11/16.
 */


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Modificado by felipe on 07/11/16.
 */

/**
 *
 * @author Felipe Augusto
 */
@XmlRootElement
public class Endereco {

    private int Id;
    private String cpf_cnpj;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String codIBGECidade;
    private String uf;
    private String codIBGEUF;
    private String numero;
    private String complemento;
    private String pontoReferencia;
    private String granja;
    private boolean isCobranca;
    private boolean isEntrega;
    private boolean isPadraoCobranca;
    private boolean isPadraoEntrega;
    private boolean isResidencia;
    private boolean isTrabalho;
    private double distanciaIda;
    private double distanciaVolta;
    private boolean bloqueado;
    private List<EstruturaIntegrado> estrutura;

    public Endereco() {
        estrutura = new ArrayList<EstruturaIntegrado>();
    }

    public Endereco(ResultSet rs) {
        estrutura = new ArrayList<EstruturaIntegrado>();
        try {
            this.Id = rs.getInt("ID");
            this.cpf_cnpj = rs.getString("CPF_CNPJ");
            this.cep = rs.getString("CEP");
            this.logradouro = rs.getString("LOGRADOURO");
            this.bairro = rs.getString("BAIRRO");
            this.cidade = rs.getString("CIDADE");
            this.codIBGECidade = rs.getString("CODIGO_IBGE_CIDADE");
            this.uf = rs.getString("UF");
            this.codIBGEUF = rs.getString("CODIGO_IBGE_UF");
            this.numero = rs.getString("NUMERO");
            this.complemento = rs.getString("COMPLEMENTO");
            this.pontoReferencia = rs.getString("PONTOREFERENCIA");
            this.granja = rs.getString("GRANJA");
            this.isCobranca = rs.getBoolean("ISCOBRANCA");
            this.isEntrega = rs.getBoolean("ISENTREGA");
            this.isPadraoCobranca = rs.getBoolean("ISPADRAOCOBRANCA");
            this.isPadraoEntrega = rs.getBoolean("ISPADRAOENTREGA");
            this.isResidencia = rs.getBoolean("ISRESIDENCIA");
            this.isTrabalho = rs.getBoolean("ISTRABALHO");
            this.bloqueado = rs.getBoolean("ISBLOQUEADO");
        } catch (SQLException erro) {
            //GravarLogs.gravarLogsDeErros(erro);
//            JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setValues(ResultSet rs) {
        try {
            this.Id = rs.getInt("ID");
            this.cpf_cnpj = rs.getString("CPF_CNPJ");
            this.cep = rs.getString("CEP");
            this.logradouro = rs.getString("LOGRADOURO");
            this.bairro = rs.getString("BAIRRO");
            this.cidade = rs.getString("CIDADE");
            this.codIBGECidade = rs.getString("CODIGO_IBGE_CIDADE");
            this.uf = rs.getString("UF");
            this.codIBGEUF = rs.getString("CODIGO_IBGE_UF");
            this.numero = rs.getString("NUMERO");
            this.complemento = rs.getString("COMPLEMENTO");
            this.pontoReferencia = rs.getString("PONTOREFERENCIA");
            this.granja = rs.getString("GRANJA");
            this.isCobranca = rs.getBoolean("ISCOBRANCA");
            this.isEntrega = rs.getBoolean("ISENTREGA");
            this.isPadraoCobranca = rs.getBoolean("ISPADRAOCOBRANCA");
            this.isPadraoEntrega = rs.getBoolean("ISPADRAOENTREGA");
            this.isResidencia = rs.getBoolean("ISRESIDENCIA");
            this.isTrabalho = rs.getBoolean("ISTRABALHO");
            this.bloqueado = rs.getBoolean("ISBLOQUEADO");
        } catch (SQLException erro) {
//            GravarLogs.gravarLogsDeErros(erro);
//            JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int getId() {
        return Id;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the codIBGECidade
     */
    public String getCodIBGECidade() {
        return codIBGECidade;
    }

    /**
     * @param codIBGECidade the codIBGECidade to set
     */
    public void setCodIBGECidade(String codIBGECidade) {
        this.codIBGECidade = codIBGECidade;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return the codIBGEUF
     */
    public String getCodIBGEUF() {
        return codIBGEUF;
    }

    /**
     * @param codIBGEUF the codIBGEUF to set
     */
    public void setCodIBGEUF(String codIBGEUF) {
        this.codIBGEUF = codIBGEUF;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    /**
     * @return the granja
     */
    public String getGranja() {
        return granja;
    }

    /**
     * @param granja the granja to set
     */
    public void setGranja(String granja) {
        this.granja = granja;
    }

    /**
     * @return the isCobranca
     */
    public boolean isCobranca() {
        return isCobranca;
    }

    /**
     * @param isCobranca the isCobranca to set
     */
    public void setCobranca(boolean isCobranca) {
        this.isCobranca = isCobranca;
    }

    /**
     * @return the isEntrega
     */
    public boolean isEntrega() {
        return isEntrega;
    }

    /**
     * @param isEntrega the isEntrega to set
     */
    public void setEntrega(boolean isEntrega) {
        this.isEntrega = isEntrega;
    }

    /**
     * @return the isPadraoCobranca
     */
    public boolean isPadraoCobranca() {
        return isPadraoCobranca;
    }

    /**
     * @param isPadraoCobranca the isPadraoCobranca to set
     */
    public void setPadraoCobranca(boolean isPadraoCobranca) {
        this.isPadraoCobranca = isPadraoCobranca;
    }

    /**
     * @return the isPadraoEntrega
     */
    public boolean isPadraoEntrega() {
        return isPadraoEntrega;
    }

    /**
     * @param isPadraoEntrega the isPadraoEntrega to set
     */
    public void setPadraoEntrega(boolean isPadraoEntrega) {
        this.isPadraoEntrega = isPadraoEntrega;
    }

    /**
     * @return the isResidencia
     */
    public boolean isResidencia() {
        return isResidencia;
    }

    /**
     * @param isResidencia the isResidencia to set
     */
    public void setResidencia(boolean isResidencia) {
        this.isResidencia = isResidencia;
    }

    /**
     * @return the isTrabalho
     */
    public boolean isTrabalho() {
        return isTrabalho;
    }

    /**
     * @param isTrabalho the isTrabalho to set
     */
    public void setTrabalho(boolean isTrabalho) {
        this.isTrabalho = isTrabalho;
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
     * @return the estrutura
     */
    public List<EstruturaIntegrado> getEstrutura() {
        return estrutura;
    }

    /**
     * @param estrutura the estrutura to set
     */
    public void setEstrutura(List<EstruturaIntegrado> estrutura) {
        this.estrutura = estrutura;
    }
}