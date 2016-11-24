/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.feljess.agroind.model;

//import Auditoria.Logs.GravarLogs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Felipe Augusto
 */
@XmlRootElement
public class Pessoa {

    private int Id;
    private String nome;
    private String apelido;
    private String razaoSocial;
    private String dataNascimento;
    private String sexo;
    private String cpf_cnpj;
    private String ie;
    private String im;
    private String rg;
    private String estadoCivil;
    private List<Endereco> endereco;
    private List<Contato> contatos;
    private boolean isCliente;
    private boolean isClientePF;
    private boolean isClientePJ;
    private boolean isCandidato;
    private boolean isColaborador;
    private boolean isFornecedor;
    private boolean isFabricante;
    private boolean isDistribuidor;
    private boolean isContador;
    private boolean isFiscal;
    private boolean isIntegrado;
    private boolean isMotorista;
    private boolean isPrestadorServico;
    private boolean isCorretor;
    private boolean isBloqueado;

    public Pessoa() {
        endereco = new ArrayList<Endereco>();
        contatos = new ArrayList<Contato>();
    }

    public Pessoa(int Id, String nome, String apelido, String razaoSocial, String dataNascimento, String sexo, String cpf_cnpj, String ie, String im, String rg, String estadoCivil, List<Endereco> endereco, List<Contato> contatos, boolean isCliente, boolean isClientePF, boolean isClientePJ, boolean isCandidato, boolean isColaborador, boolean isFornecedor, boolean isFabricante, boolean isDistribuidor, boolean isContador, boolean isFiscal, boolean isIntegrado, boolean isMotorista, boolean isBloqueado) {
        this.Id = Id;
        this.nome = nome;
        this.apelido = apelido;
        this.razaoSocial = razaoSocial;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cpf_cnpj = cpf_cnpj;
        this.ie = ie;
        this.im = im;
        this.rg = rg;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
        this.contatos = contatos;
        this.isCliente = isCliente;
        this.isClientePF = isClientePF;
        this.isClientePJ = isClientePJ;
        this.isCandidato = isCandidato;
        this.isColaborador = isColaborador;
        this.isFornecedor = isFornecedor;
        this.isFabricante = isFabricante;
        this.isDistribuidor = isDistribuidor;
        this.isContador = isContador;
        this.isFiscal = isFiscal;
        this.isIntegrado = isIntegrado;
        this.isMotorista = isMotorista;
        this.isBloqueado = isBloqueado;
    }

    public Pessoa(ResultSet rs) {
        endereco = new ArrayList<Endereco>();
        contatos = new ArrayList<Contato>();
        try {
            this.Id = rs.getInt("ID");
            this.nome = rs.getString("NOME");
            this.apelido = rs.getString("APELIDO");
            this.razaoSocial = rs.getString("RAZAOSOCIAL");
            this.dataNascimento = rs.getString("DATANASCIMENTO");
            this.sexo = rs.getString("SEXO");
            this.cpf_cnpj = rs.getString("CPF_CNPJ");
            this.ie = rs.getString("IE");
            this.im = rs.getString("IM");
            this.rg = rs.getString("RG");
            this.estadoCivil = rs.getString("ESTADOCIVIL");
            this.isCliente = rs.getBoolean("ISCLIENTE");
            this.isClientePF = rs.getBoolean("ISCLIENTEPF");
            this.isClientePJ = rs.getBoolean("ISCLIENTEPJ");
            this.isCandidato = rs.getBoolean("ISCANDIDATO");
            this.isColaborador = rs.getBoolean("ISCOLABORADOR");
            this.isFornecedor = rs.getBoolean("ISFORNECEDOR");
            this.isFabricante = rs.getBoolean("ISFABRICANTE");
            this.isDistribuidor = rs.getBoolean("ISDISTRIBUIDOR");
            this.isContador = rs.getBoolean("ISCONTADOR");
            this.isFiscal = rs.getBoolean("ISFISCAL");
            this.isIntegrado = rs.getBoolean("ISINTEGRADO");
            this.isMotorista = rs.getBoolean("ISMOTORISTA");
            this.isPrestadorServico = rs.getBoolean("ISPRESTADORSERVICO");
            this.isCorretor = rs.getBoolean("ISCORRETOR");
            this.isBloqueado = rs.getBoolean("ISBLOQUEADO");
        } catch (SQLException erro) {
       //     GravarLogs.gravarLogsDeErros(erro);
            JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Pessoa(ResultSet rs, List<Endereco> endereco, List<Contato> contatos) {
        try {
            this.Id = rs.getInt("ID");
            this.nome = rs.getString("NOME");
            this.apelido = rs.getString("APELIDO");
            this.razaoSocial = rs.getString("RAZAOSOCIAL");
            this.dataNascimento = rs.getString("DATANASCIMENTO");
            this.sexo = rs.getString("SEXO");
            this.cpf_cnpj = rs.getString("CPF_CNPJ");
            this.ie = rs.getString("IE");
            this.im = rs.getString("IM");
            this.rg = rs.getString("RG");
            this.estadoCivil = rs.getString("ESTADOCIVIL");
            this.isCliente = rs.getBoolean("ISCLIENTE");
            this.isClientePF = rs.getBoolean("ISCLIENTEPF");
            this.isClientePJ = rs.getBoolean("ISCLIENTEPJ");
            this.isCandidato = rs.getBoolean("ISCANDIDATO");
            this.isColaborador = rs.getBoolean("ISCOLABORADOR");
            this.isFornecedor = rs.getBoolean("ISFORNECEDOR");
            this.isFabricante = rs.getBoolean("ISFABRICANTE");
            this.isDistribuidor = rs.getBoolean("ISDISTRIBUIDOR");
            this.isContador = rs.getBoolean("ISCONTADOR");
            this.isFiscal = rs.getBoolean("ISFISCAL");
            this.isIntegrado = rs.getBoolean("ISINTEGRADO");
            this.isMotorista = rs.getBoolean("ISMOTORISTA");
            this.isPrestadorServico = rs.getBoolean("ISPRESTADORSERVICO");
            this.isCorretor = rs.getBoolean("ISCORRETOR");
            this.isBloqueado = rs.getBoolean("ISBLOQUEADO");
            this.endereco = endereco;
            this.contatos = contatos;
        } catch (SQLException erro) {
           // GravarLogs.gravarLogsDeErros(erro);
            JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setPessoa(ResultSet rs, List<Endereco> endereco, List<Contato> contatos) {
        try {
            this.Id = rs.getInt("ID");
            this.nome = rs.getString("NOME");
            this.apelido = rs.getString("APELIDO");
            this.razaoSocial = rs.getString("RAZAOSOCIAL");
            this.dataNascimento = rs.getString("DATANASCIMENTO");
            this.sexo = rs.getString("SEXO");
            this.cpf_cnpj = rs.getString("CPF_CNPJ");
            this.ie = rs.getString("IE");
            this.im = rs.getString("IM");
            this.rg = rs.getString("RG");
            this.estadoCivil = rs.getString("ESTADOCIVIL");
            this.isCliente = rs.getBoolean("ISCLIENTE");
            this.isClientePF = rs.getBoolean("ISCLIENTEPF");
            this.isClientePJ = rs.getBoolean("ISCLIENTEPJ");
            this.isCandidato = rs.getBoolean("ISCANDIDATO");
            this.isColaborador = rs.getBoolean("ISCOLABORADOR");
            this.isFornecedor = rs.getBoolean("ISFORNECEDOR");
            this.isFabricante = rs.getBoolean("ISFABRICANTE");
            this.isDistribuidor = rs.getBoolean("ISDISTRIBUIDOR");
            this.isContador = rs.getBoolean("ISCONTADOR");
            this.isFiscal = rs.getBoolean("ISFISCAL");
            this.isIntegrado = rs.getBoolean("ISINTEGRADO");
            this.isMotorista = rs.getBoolean("ISMOTORISTA");
            this.isPrestadorServico = rs.getBoolean("ISPRESTADORSERVICO");
            this.isCorretor = rs.getBoolean("ISCORRETOR");
            this.isBloqueado = rs.getBoolean("ISBLOQUEADO");
            this.endereco = endereco;
            this.contatos = contatos;
        } catch (SQLException erro) {
        //    GravarLogs.gravarLogsDeErros(erro);
            JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setPessoa(ResultSet rs) {
        try {
            this.Id = rs.getInt("ID");
            this.nome = rs.getString("NOME");
            this.apelido = rs.getString("APELIDO");
            this.razaoSocial = rs.getString("RAZAOSOCIAL");
            this.dataNascimento = rs.getString("DATANASCIMENTO");
            this.sexo = rs.getString("SEXO");
            this.cpf_cnpj = rs.getString("CPF_CNPJ");
            this.ie = rs.getString("IE");
            this.im = rs.getString("IM");
            this.rg = rs.getString("RG");
            this.estadoCivil = rs.getString("ESTADOCIVIL");
            this.isCliente = rs.getBoolean("ISCLIENTE");
            this.isClientePF = rs.getBoolean("ISCLIENTEPF");
            this.isClientePJ = rs.getBoolean("ISCLIENTEPJ");
            this.isCandidato = rs.getBoolean("ISCANDIDATO");
            this.isColaborador = rs.getBoolean("ISCOLABORADOR");
            this.isFornecedor = rs.getBoolean("ISFORNECEDOR");
            this.isFabricante = rs.getBoolean("ISFABRICANTE");
            this.isDistribuidor = rs.getBoolean("ISDISTRIBUIDOR");
            this.isContador = rs.getBoolean("ISCONTADOR");
            this.isFiscal = rs.getBoolean("ISFISCAL");
            this.isIntegrado = rs.getBoolean("ISINTEGRADO");
            this.isMotorista = rs.getBoolean("ISMOTORISTA");
            this.isPrestadorServico = rs.getBoolean("ISPRESTADORSERVICO");
            this.isCorretor = rs.getBoolean("ISCORRETOR");
            this.isBloqueado = rs.getBoolean("ISBLOQUEADO");
        } catch (SQLException erro) {
//            GravarLogs.gravarLogsDeErros(erro);
            JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
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
	 * @return the apelido
	 */
	public String getApelido() {
		return apelido;
	}

	/**
	 * @param apelido the apelido to set
	 */
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	/**
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * @param razaoSocial the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	/**
	 * @return the dataNascimento
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the cpf_cnpj
	 */
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	/**
	 * @param cpf_cnpj the cpf_cnpj to set
	 */
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	/**
	 * @return the ie
	 */
	public String getIe() {
		return ie;
	}

	/**
	 * @param ie the ie to set
	 */
	public void setIe(String ie) {
		this.ie = ie;
	}

	/**
	 * @return the im
	 */
	public String getIm() {
		return im;
	}

	/**
	 * @param im the im to set
	 */
	public void setIm(String im) {
		this.im = im;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * @return the estadoCivil
	 */
	public String getEstadoCivil() {
		return estadoCivil;
	}

	/**
	 * @param estadoCivil the estadoCivil to set
	 */
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	/**
	 * @return the isCliente
	 */
	public boolean isCliente() {
		return isCliente;
	}

	/**
	 * @param isCliente the isCliente to set
	 */
	public void setCliente(boolean isCliente) {
		this.isCliente = isCliente;
	}

	/**
	 * @return the endereco
	 */
	public List<Endereco> getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the contatos
	 */
	public List<Contato> getContatos() {
		return contatos;
	}

	/**
	 * @param contatos the contatos to set
	 */
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	/**
	 * @return the isClientePF
	 */
	public boolean isClientePF() {
		return isClientePF;
	}

	/**
	 * @param isClientePF the isClientePF to set
	 */
	public void setClientePF(boolean isClientePF) {
		this.isClientePF = isClientePF;
	}

	/**
	 * @return the isClientePJ
	 */
	public boolean isClientePJ() {
		return isClientePJ;
	}

	/**
	 * @param isClientePJ the isClientePJ to set
	 */
	public void setClientePJ(boolean isClientePJ) {
		this.isClientePJ = isClientePJ;
	}

	/**
	 * @return the isCandidato
	 */
	public boolean isCandidato() {
		return isCandidato;
	}

	/**
	 * @param isCandidato the isCandidato to set
	 */
	public void setCandidato(boolean isCandidato) {
		this.isCandidato = isCandidato;
	}

	/**
	 * @return the isColaborador
	 */
	public boolean isColaborador() {
		return isColaborador;
	}

	/**
	 * @param isColaborador the isColaborador to set
	 */
	public void setColaborador(boolean isColaborador) {
		this.isColaborador = isColaborador;
	}

	/**
	 * @return the isFornecedor
	 */
	public boolean isFornecedor() {
		return isFornecedor;
	}

	/**
	 * @param isFornecedor the isFornecedor to set
	 */
	public void setFornecedor(boolean isFornecedor) {
		this.isFornecedor = isFornecedor;
	}

	/**
	 * @return the isFabricante
	 */
	public boolean isFabricante() {
		return isFabricante;
	}

	/**
	 * @param isFabricante the isFabricante to set
	 */
	public void setFabricante(boolean isFabricante) {
		this.isFabricante = isFabricante;
	}

	/**
	 * @return the isDistribuidor
	 */
	public boolean isDistribuidor() {
		return isDistribuidor;
	}

	/**
	 * @param isDistribuidor the isDistribuidor to set
	 */
	public void setDistribuidor(boolean isDistribuidor) {
		this.isDistribuidor = isDistribuidor;
	}

	/**
	 * @return the isIntegrado
	 */
	public boolean isIntegrado() {
		return isIntegrado;
	}

	/**
	 * @param isIntegrado the isIntegrado to set
	 */
	public void setIntegrado(boolean isIntegrado) {
		this.isIntegrado = isIntegrado;
	}

	/**
	 * @return the isContador
	 */
	public boolean isContador() {
		return isContador;
	}

	/**
	 * @param isContador the isContador to set
	 */
	public void setContador(boolean isContador) {
		this.isContador = isContador;
	}

	/**
	 * @return the isFiscal
	 */
	public boolean isFiscal() {
		return isFiscal;
	}

	/**
	 * @param isFiscal the isFiscal to set
	 */
	public void setFiscal(boolean isFiscal) {
		this.isFiscal = isFiscal;
	}

	/**
	 * @return the isMotorista
	 */
	public boolean isMotorista() {
		return isMotorista;
	}

	/**
	 * @param isMotorista the isMotorista to set
	 */
	public void setMotorista(boolean isMotorista) {
		this.isMotorista = isMotorista;
	}

	/**
	 * @return the isPrestadorServico
	 */
	public boolean isPrestadorServico() {
		return isPrestadorServico;
	}

	/**
	 * @param isPrestadorServico the isPrestadorServico to set
	 */
	public void setPrestadorServico(boolean isPrestadorServico) {
		this.isPrestadorServico = isPrestadorServico;
	}

	/**
	 * @return the isCorretor
	 */
	public boolean isCorretor() {
		return isCorretor;
	}

	/**
	 * @param isCorretor the isCorretor to set
	 */
	public void setCorretor(boolean isCorretor) {
		this.isCorretor = isCorretor;
	}

	/**
	 * @return the isBloqueado
	 */
	public boolean isBloqueado() {
		return isBloqueado;
	}

	/**
	 * @param isBloqueado the isBloqueado to set
	 */
	public void setBloqueado(boolean isBloqueado) {
		this.isBloqueado = isBloqueado;
	}
}
