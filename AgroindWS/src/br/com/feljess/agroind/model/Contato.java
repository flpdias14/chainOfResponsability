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
public class Contato {

    private int Id;
    private String cpf_cnpj;
    private String telefone;
    private String celular;
    private String contato;
    private String fax;
    private String telefoneTrabalho;
    private String ramal;
    private String celularTrabalho;
    private String emailPessoal;
    private String emailPessoal2;
    private String emailEmpresarial;
    private String site;
    private String blog;
    private String redesSocial;
    private boolean contatoPessoal;
    private boolean contatoEntrega;
    private boolean contatoPessoalPadrao;
    private boolean contatoEntregaPadrao;
    private boolean bloqueado;

    public Contato() {
    }

    public Contato(ResultSet rs) {
        try {
            this.Id = rs.getInt("ID");
            this.cpf_cnpj = rs.getString("CPF_CNPJ");
            this.telefone = rs.getString("TELEFONE");
            this.celular = rs.getString("CELULAR");
            this.contato = rs.getString("CONTATO");
            this.fax = rs.getString("FAX");
            this.telefoneTrabalho = rs.getString("TELEFONETRABALHO");
            this.ramal = rs.getString("RAMAL");
            this.celularTrabalho = rs.getString("CELULARTRABALHO");
            this.emailPessoal = rs.getString("EMAILPESSOAL");
            this.emailPessoal2 = rs.getString("EMAILPESSOAL2");
            this.emailEmpresarial = rs.getString("EMAILEMPRESARIAL");
            this.site = rs.getString("SITE");
            this.blog = rs.getString("BLOG");
            this.redesSocial = rs.getString("REDESOCIAL");
            this.contatoEntrega = rs.getBoolean("CONTATOENTREGA");
            this.contatoEntregaPadrao = rs.getBoolean("CONTATOENTREGAPADRAO");
            this.contatoPessoal = rs.getBoolean("CONTATOPESSOAL");
            this.contatoPessoalPadrao = rs.getBoolean("CONTATOPESSOALPADRAO");
            this.bloqueado = rs.getBoolean("ISBLOQUEADO");
        } catch (SQLException erro) {
            //GravarLogs.gravarLogsDeErros(erro);
//            JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Contato(int Id, String cpf_cnpj, String telefone, String celular, String contato, String fax, String telefoneTrabalho, String ramal, String celularTrabalho, String emailPessoal, String emailPessoal2, String emailEmpresarial, String site, String blog, String redesSocial) {
        this.Id = Id;
        this.cpf_cnpj = cpf_cnpj;
        this.telefone = telefone;
        this.celular = celular;
        this.contato = contato;
        this.fax = fax;
        this.telefoneTrabalho = telefoneTrabalho;
        this.ramal = ramal;
        this.celularTrabalho = celularTrabalho;
        this.emailPessoal = emailPessoal;
        this.emailPessoal2 = emailPessoal2;
        this.emailEmpresarial = emailEmpresarial;
        this.site = site;
        this.blog = blog;
        this.redesSocial = redesSocial;
    }

    public void setValues(ResultSet rs) {
        try {
            this.Id = rs.getInt("ID");
            this.cpf_cnpj = rs.getString("CPF_CNPJ");
            this.telefone = rs.getString("TELEFONE");
            this.celular = rs.getString("CELULAR");
            this.contato = rs.getString("CONTATO");
            this.fax = rs.getString("FAX");
            this.telefoneTrabalho = rs.getString("TELEFONETRABALHO");
            this.ramal = rs.getString("RAMAL");
            this.celularTrabalho = rs.getString("CELULARTRABALHO");
            this.emailPessoal = rs.getString("EMAILPESSOAL");
            this.emailPessoal2 = rs.getString("EMAILPESSOAL2");
            this.emailEmpresarial = rs.getString("EMAILEMPRESARIAL");
            this.site = rs.getString("SITE");
            this.blog = rs.getString("BLOG");
            this.redesSocial = rs.getString("REDESOCIAL");
            this.contatoEntrega = rs.getBoolean("CONTATOENTREGA");
            this.contatoEntregaPadrao = rs.getBoolean("CONTATOENTREGAPADRAO");
            this.contatoPessoal = rs.getBoolean("CONTATOPESSOAL");
            this.contatoPessoalPadrao = rs.getBoolean("CONTATOPESSOALPADRAO");
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

    /**
     * @return the contato
     */
    public String getContato() {
        return contato;
    }

    /**
     * @param contato the contato to set
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTelefoneTrabalho() {
        return telefoneTrabalho;
    }

    public void setTelefoneTrabalho(String telefoneTrabalho) {
        this.telefoneTrabalho = telefoneTrabalho;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public String getCelularTrabalho() {
        return celularTrabalho;
    }

    public void setCelularTrabalho(String celularTrabalho) {
        this.celularTrabalho = celularTrabalho;
    }

    public String getEmailPessoal() {
        return emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }

    public String getEmailPessoal2() {
        return emailPessoal2;
    }

    public void setEmailPessoal2(String emailPessoal2) {
        this.emailPessoal2 = emailPessoal2;
    }

    public String getEmailEmpresarial() {
        return emailEmpresarial;
    }

    public void setEmailEmpresarial(String emailEmpresarial) {
        this.emailEmpresarial = emailEmpresarial;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getRedesSocial() {
        return redesSocial;
    }

    public void setRedesSocial(String redesSocial) {
        this.redesSocial = redesSocial;
    }

    public boolean isContatoPessoal() {
        return contatoPessoal;
    }

    public void setContatoPessoal(boolean contatoPessoal) {
        this.contatoPessoal = contatoPessoal;
    }

    public boolean isContatoEntrega() {
        return contatoEntrega;
    }

    public void setContatoEntrega(boolean contatoEntrega) {
        this.contatoEntrega = contatoEntrega;
    }

    public boolean isContatoPessoalPadrao() {
        return contatoPessoalPadrao;
    }

    public void setContatoPessoalPadrao(boolean contatoPessoalPadrao) {
        this.contatoPessoalPadrao = contatoPessoalPadrao;
    }

    public boolean isContatoEntregaPadrao() {
        return contatoEntregaPadrao;
    }

    public void setContatoEntregaPadrao(boolean contatoEntregaPadrao) {
        this.contatoEntregaPadrao = contatoEntregaPadrao;
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
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		result = prime * result + ((blog == null) ? 0 : blog.hashCode());
		result = prime * result + (bloqueado ? 1231 : 1237);
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((celularTrabalho == null) ? 0 : celularTrabalho.hashCode());
		result = prime * result + ((contato == null) ? 0 : contato.hashCode());
		result = prime * result + (contatoEntrega ? 1231 : 1237);
		result = prime * result + (contatoEntregaPadrao ? 1231 : 1237);
		result = prime * result + (contatoPessoal ? 1231 : 1237);
		result = prime * result + (contatoPessoalPadrao ? 1231 : 1237);
		result = prime * result + ((cpf_cnpj == null) ? 0 : cpf_cnpj.hashCode());
		result = prime * result + ((emailEmpresarial == null) ? 0 : emailEmpresarial.hashCode());
		result = prime * result + ((emailPessoal == null) ? 0 : emailPessoal.hashCode());
		result = prime * result + ((emailPessoal2 == null) ? 0 : emailPessoal2.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((ramal == null) ? 0 : ramal.hashCode());
		result = prime * result + ((redesSocial == null) ? 0 : redesSocial.hashCode());
		result = prime * result + ((site == null) ? 0 : site.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + ((telefoneTrabalho == null) ? 0 : telefoneTrabalho.hashCode());
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
		Contato other = (Contato) obj;
		if (Id != other.Id)
			return false;
		if (blog == null) {
			if (other.blog != null)
				return false;
		} else if (!blog.equals(other.blog))
			return false;
		if (bloqueado != other.bloqueado)
			return false;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (celularTrabalho == null) {
			if (other.celularTrabalho != null)
				return false;
		} else if (!celularTrabalho.equals(other.celularTrabalho))
			return false;
		if (contato == null) {
			if (other.contato != null)
				return false;
		} else if (!contato.equals(other.contato))
			return false;
		if (contatoEntrega != other.contatoEntrega)
			return false;
		if (contatoEntregaPadrao != other.contatoEntregaPadrao)
			return false;
		if (contatoPessoal != other.contatoPessoal)
			return false;
		if (contatoPessoalPadrao != other.contatoPessoalPadrao)
			return false;
		if (cpf_cnpj == null) {
			if (other.cpf_cnpj != null)
				return false;
		} else if (!cpf_cnpj.equals(other.cpf_cnpj))
			return false;
		if (emailEmpresarial == null) {
			if (other.emailEmpresarial != null)
				return false;
		} else if (!emailEmpresarial.equals(other.emailEmpresarial))
			return false;
		if (emailPessoal == null) {
			if (other.emailPessoal != null)
				return false;
		} else if (!emailPessoal.equals(other.emailPessoal))
			return false;
		if (emailPessoal2 == null) {
			if (other.emailPessoal2 != null)
				return false;
		} else if (!emailPessoal2.equals(other.emailPessoal2))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (ramal == null) {
			if (other.ramal != null)
				return false;
		} else if (!ramal.equals(other.ramal))
			return false;
		if (redesSocial == null) {
			if (other.redesSocial != null)
				return false;
		} else if (!redesSocial.equals(other.redesSocial))
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
		if (telefoneTrabalho == null) {
			if (other.telefoneTrabalho != null)
				return false;
		} else if (!telefoneTrabalho.equals(other.telefoneTrabalho))
			return false;
		return true;
	}

	/**
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public String toString() {
		return "Contato [Id=" + Id + ", cpf_cnpj=" + cpf_cnpj + ", telefone=" + telefone + ", celular=" + celular
				+ ", contato=" + contato + ", fax=" + fax + ", telefoneTrabalho=" + telefoneTrabalho + ", ramal="
				+ ramal + ", celularTrabalho=" + celularTrabalho + ", emailPessoal=" + emailPessoal + ", emailPessoal2="
				+ emailPessoal2 + ", emailEmpresarial=" + emailEmpresarial + ", site=" + site + ", blog=" + blog
				+ ", redesSocial=" + redesSocial + ", contatoPessoal=" + contatoPessoal + ", contatoEntrega="
				+ contatoEntrega + ", contatoPessoalPadrao=" + contatoPessoalPadrao + ", contatoEntregaPadrao="
				+ contatoEntregaPadrao + ", bloqueado=" + bloqueado + "]";
	}
    
   
}