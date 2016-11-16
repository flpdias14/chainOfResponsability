package br.com.feljess.agroind.model;


import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.bind.annotation.XmlRootElement;


//import com.fincatto.nfe310.classes.NFRegimeTributario;

/**
 * Modificado by Felipe Oliveira on 07/11/16.
 */

@XmlRootElement

/**
 *
 * @author Felipe Augusto
 */
public class Unidades {
    private int id;
    private String dataCadastro;
    private int idRazaoSocial;
    private String nomeFantasia;
    private int unidade;
    private String cpf_cnpj;
    private String ie;
//    private NFRegimeTributario regimeTributario;
    private String im;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String numero;
    private String complemento;
    private String pontoDeReferencia;
    private String uf;
    private String idIBGECidade;
    private String idIBGEUF;
    private String telefone;
    private String celular;
    private String fax;
    private String email;
    private String site;
    private boolean Ativo;
    
    
    public Unidades(){}
    
    public Unidades(ResultSet rs) {
        try {
            this.id = rs.getInt("ID");
            this.dataCadastro = rs.getString("DATACADASTRO");
            this.idRazaoSocial = rs.getInt("IDRAZAOSOCIAL");
            this.nomeFantasia = rs.getString("NOMEFANTASIA");
            this.unidade = rs.getInt("UNIDADE");
            this.cpf_cnpj = rs.getString("CPF_CNPJ");
            this.ie = rs.getString("IE");
//            this.regimeTributario = NFRegimeTributario.valueOfDescricao(rs.getString("REGIMETRIBUTARIO"));
            this.im = rs.getString("IM");
            this.cep = rs.getString("CEP");
            this.logradouro = rs.getString("LOGRADOURO");
            this.bairro = rs.getString("BAIRRO");
            this.cidade = rs.getString("CIDADE");
            this.uf = rs.getString("UF");
            this.numero = rs.getString("NUMERO");
            this.complemento = rs.getString("COMPLEMENTO");
            this.pontoDeReferencia = rs.getString("PONTOREFERENCIA");
            this.idIBGECidade = rs.getString("CODIGO_IBGE_CIDADE");
            this.idIBGEUF = rs.getString("CODIGO_IBGE_UF");
            this.telefone = rs.getString("TELEFONE");
            this.celular = rs.getString("CELULAR");
            this.fax = rs.getString("FAX");
            this.email = rs.getString("EMAIL");
            this.site = rs.getString("SITE");
            this.Ativo = rs.getBoolean("ISATIVO");
        } catch (SQLException erro) {
//            GravarLogs.gravarLogsDeErros(null);
//            JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void setValues(ResultSet rs) {
        try {
            this.id = rs.getInt("ID");
            this.dataCadastro = rs.getString("DATACADASTRO");
            this.idRazaoSocial = rs.getInt("IDRAZAOSOCIAL");
            this.nomeFantasia = rs.getString("NOMEFANTASIA");
            this.unidade = rs.getInt("UNIDADE");
            this.cpf_cnpj = rs.getString("CPF_CNPJ");
            this.ie = rs.getString("IE");
//            this.regimeTributario = NFRegimeTributario.valueOfDescricao(rs.getString("REGIMETRIBUTARIO"));
            this.im = rs.getString("IM");
            this.cep = rs.getString("CEP");
            this.logradouro = rs.getString("LOGRADOURO");
            this.bairro = rs.getString("BAIRRO");
            this.cidade = rs.getString("CIDADE");
            this.uf = rs.getString("UF");
            this.numero = rs.getString("NUMERO");
            this.complemento = rs.getString("COMPLEMENTO");
            this.pontoDeReferencia = rs.getString("PONTOREFERENCIA");
            this.idIBGECidade = rs.getString("CODIGO_IBGE_CIDADE");
            this.idIBGEUF = rs.getString("CODIGO_IBGE_UF");
            this.telefone = rs.getString("TELEFONE");
            this.celular = rs.getString("CELULAR");
            this.fax = rs.getString("FAX");
            this.email = rs.getString("EMAIL");
            this.site = rs.getString("SITE");
            this.Ativo = rs.getBoolean("ISATIVO");
        } catch (SQLException erro) {
//            GravarLogs.gravarLogsDeErros(null);
//            JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getIdRazaoSocial() {
        return idRazaoSocial;
    }

    public void setIdRazaoSocial(int idRazaoSocial) {
        this.idRazaoSocial = idRazaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
//
//    /**
//	 * @return the regimeTributario
//	 */
//	public NFRegimeTributario getRegimeTributario() {
//		return regimeTributario;
//	}
//
//	/**
//	 * @param regimeTributario the regimeTributario to set
//	 */
//	public void setRegimeTributario(NFRegimeTributario regimeTributario) {
//		this.regimeTributario = regimeTributario;
//	}

	public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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

    public String getPontoDeReferencia() {
        return pontoDeReferencia;
    }

    public void setPontoDeReferencia(String pontoDeReferencia) {
        this.pontoDeReferencia = pontoDeReferencia;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIdIBGECidade() {
        return idIBGECidade;
    }

    public void setIdIBGECidade(String idIBGECidade) {
        this.idIBGECidade = idIBGECidade;
    }

    public String getIdIBGEUF() {
        return idIBGEUF;
    }

    public void setIdIBGEUF(String idIBGEUF) {
        this.idIBGEUF = idIBGEUF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public boolean isAtivo() {
        return Ativo;
    }

    public void setAtivo(boolean Ativo) {
        this.Ativo = Ativo;
    }

	/**
	 *  Adicionado por Felipe Oliveira 15/11/2016 
	 */
	@Override
	public String toString() {
		return "Unidades [id=" + id + ", dataCadastro=" + dataCadastro + ", idRazaoSocial=" + idRazaoSocial
				+ ", nomeFantasia=" + nomeFantasia + ", unidade=" + unidade + ", cpf_cnpj=" + cpf_cnpj + ", ie=" + ie
				+ ", im=" + im + ", cep=" + cep + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cidade="
				+ cidade + ", numero=" + numero + ", complemento=" + complemento + ", pontoDeReferencia="
				+ pontoDeReferencia + ", uf=" + uf + ", idIBGECidade=" + idIBGECidade + ", idIBGEUF=" + idIBGEUF
				+ ", telefone=" + telefone + ", celular=" + celular + ", fax=" + fax + ", email=" + email + ", site="
				+ site + ", Ativo=" + Ativo + "]";
	}

	/**
	 *  Adicionado por Felipe Oliveira 15/11/2016 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (Ativo ? 1231 : 1237);
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((cpf_cnpj == null) ? 0 : cpf_cnpj.hashCode());
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + id;
		result = prime * result + ((idIBGECidade == null) ? 0 : idIBGECidade.hashCode());
		result = prime * result + ((idIBGEUF == null) ? 0 : idIBGEUF.hashCode());
		result = prime * result + idRazaoSocial;
		result = prime * result + ((ie == null) ? 0 : ie.hashCode());
		result = prime * result + ((im == null) ? 0 : im.hashCode());
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((nomeFantasia == null) ? 0 : nomeFantasia.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((pontoDeReferencia == null) ? 0 : pontoDeReferencia.hashCode());
		result = prime * result + ((site == null) ? 0 : site.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
		result = prime * result + unidade;
		return result;
	}

	 /**
	  *   Adicionado por Felipe Oliveira 15/11/2016 
	  * 
	  */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unidades other = (Unidades) obj;
		if (Ativo != other.Ativo)
			return false;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (cpf_cnpj == null) {
			if (other.cpf_cnpj != null)
				return false;
		} else if (!cpf_cnpj.equals(other.cpf_cnpj))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (id != other.id)
			return false;
		if (idIBGECidade == null) {
			if (other.idIBGECidade != null)
				return false;
		} else if (!idIBGECidade.equals(other.idIBGECidade))
			return false;
		if (idIBGEUF == null) {
			if (other.idIBGEUF != null)
				return false;
		} else if (!idIBGEUF.equals(other.idIBGEUF))
			return false;
		if (idRazaoSocial != other.idRazaoSocial)
			return false;
		if (ie == null) {
			if (other.ie != null)
				return false;
		} else if (!ie.equals(other.ie))
			return false;
		if (im == null) {
			if (other.im != null)
				return false;
		} else if (!im.equals(other.im))
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (nomeFantasia == null) {
			if (other.nomeFantasia != null)
				return false;
		} else if (!nomeFantasia.equals(other.nomeFantasia))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (pontoDeReferencia == null) {
			if (other.pontoDeReferencia != null)
				return false;
		} else if (!pontoDeReferencia.equals(other.pontoDeReferencia))
			return false;
		if (site == null) {
			if (other.site != null)
				return false;
		} else if (!site.equals(other.site))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		if (unidade != other.unidade)
			return false;
		return true;
	}
    
	
    
}