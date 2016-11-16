package br.com.feljess.agroind.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Modificado by Felipe Oliveira on 07/11/16.
 */
@XmlRootElement
/**
 *
 * @author Felipe Augusto
 */
public class Usuarios {

    private int id;
    private int idFuncionario;
    private String login;
    private int idGrupoAcesso;
    private String nomeGrupoAcesso;
    private int idGrupoAcessoUnidade;
    private String nomeGrupoAcessoUnidade;
    private String senha;
    private boolean bloqueado;
    private boolean redefinirSenha;
    private boolean aprovadorChamados;
    private boolean alterarModoPesagem;
    private boolean alterarPesosPesagem;
    private boolean liberarDataRetroativaSolicitacaoVenda;
    private boolean liberarClienteComBloqueioDeCompraPorEstouroDeLimite;
    private boolean cancelarVenda;
    private boolean permitirProgramacaoVendaSemIntegrado;
    private boolean permitirModificarDistanciasClienteIntegrado;

    public Usuarios() {
    }

    public Usuarios(ResultSet rs) {
        try {
            this.id = rs.getInt("ID");
            this.idFuncionario = rs.getInt("IDFUNCIONARIO");
            this.login = rs.getString("LOGIN");
            this.idGrupoAcesso = rs.getInt("IDGRUPOACESSO");
            this.nomeGrupoAcesso = rs.getString("NOMEGRUPOACESSO");
            this.senha = rs.getString("SENHA");
            this.bloqueado = rs.getBoolean("BLOQUEADO");
            this.redefinirSenha = rs.getBoolean("REDEFINIRSENHA");
            this.aprovadorChamados = rs.getBoolean("APROVADORCHAMADOS");
            this.alterarModoPesagem = rs.getBoolean("ALTERARMODOPESAGEM");
            this.alterarPesosPesagem = rs.getBoolean("ISALTERARPESAGEM");
            this.liberarDataRetroativaSolicitacaoVenda = rs.getBoolean("ISLIBERARDATARETROATIVASOLICITACAOVENDA");
            this.liberarClienteComBloqueioDeCompraPorEstouroDeLimite = rs.getBoolean("ISLIBERARCLIENTECOMBLOQUEIODECOMPRAPORESTOURODELIMITE");
            this.cancelarVenda = rs.getBoolean("ISCANCELARVENDA");
            this.permitirProgramacaoVendaSemIntegrado = rs.getBoolean("ISPERMITIRPROGRAMACAOVENDASEMINTEGRADO");
            this.permitirModificarDistanciasClienteIntegrado = rs.getBoolean("ISPERMITIRMODIFICARDISTANCIASCLIENTEINTEGRADO");
        } catch (SQLException erro) {
//            GravarLogs.gravarLogsDeErros(erro);
//            JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        	erro.printStackTrace();
        }
    }

    public void setValues(ResultSet rs) {
        try {
            this.id = rs.getInt("ID");
            this.idFuncionario = rs.getInt("IDFUNCIONARIO");
            this.login = rs.getString("LOGIN");
            this.idGrupoAcesso = rs.getInt("IDGRUPOACESSO");
            this.nomeGrupoAcesso = rs.getString("NOMEGRUPOACESSO");
            this.senha = rs.getString("SENHA");
            this.bloqueado = rs.getBoolean("BLOQUEADO");
            this.redefinirSenha = rs.getBoolean("REDEFINIRSENHA");
            this.aprovadorChamados = rs.getBoolean("APROVADORCHAMADOS");
            this.alterarModoPesagem = rs.getBoolean("ALTERARMODOPESAGEM");
            this.alterarPesosPesagem = rs.getBoolean("ISALTERARPESAGEM");
            this.liberarDataRetroativaSolicitacaoVenda = rs.getBoolean("ISLIBERARDATARETROATIVASOLICITACAOVENDA");
            this.liberarClienteComBloqueioDeCompraPorEstouroDeLimite = rs.getBoolean("ISLIBERARCLIENTECOMBLOQUEIODECOMPRAPORESTOURODELIMITE");
            this.cancelarVenda = rs.getBoolean("ISCANCELARVENDA");
            this.permitirProgramacaoVendaSemIntegrado = rs.getBoolean("ISPERMITIRPROGRAMACAOVENDASEMINTEGRADO");
            this.permitirModificarDistanciasClienteIntegrado = rs.getBoolean("ISPERMITIRMODIFICARDISTANCIASCLIENTEINTEGRADO");
        } catch (SQLException erro) {
//            GravarLogs.gravarLogsDeErros(erro);
//            JOptionPane.showMessageDialog(null, erro, "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        	erro.printStackTrace();

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

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the idGrupoAcesso
     */
    public int getIdGrupoAcesso() {
        return idGrupoAcesso;
    }

    /**
     * @param idGrupoAcesso the idGrupoAcesso to set
     */
    public void setIdGrupoAcesso(int idGrupoAcesso) {
        this.idGrupoAcesso = idGrupoAcesso;
    }

    /**
     * @return the nomeGrupoAcesso
     */
    public String getNomeGrupoAcesso() {
        return nomeGrupoAcesso;
    }

    /**
     * @param nomeGrupoAcesso the nomeGrupoAcesso to set
     */
    public void setNomeGrupoAcesso(String nomeGrupoAcesso) {
        this.nomeGrupoAcesso = nomeGrupoAcesso;
    }

    public int getIdGrupoAcessoUnidade() {
        return idGrupoAcessoUnidade;
    }

    public void setIdGrupoAcessoUnidade(int idGrupoAcessoUnidade) {
        this.idGrupoAcessoUnidade = idGrupoAcessoUnidade;
    }

    public String getNomeGrupoAcessoUnidade() {
        return nomeGrupoAcessoUnidade;
    }

    public void setNomeGrupoAcessoUnidade(String nomeGrupoAcessoUnidade) {
        this.nomeGrupoAcessoUnidade = nomeGrupoAcessoUnidade;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
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
     * @return the redefinirSenha
     */
    public boolean isRedefinirSenha() {
        return redefinirSenha;
    }

    /**
     * @param redefinirSenha the redefinirSenha to set
     */
    public void setRedefinirSenha(boolean redefinirSenha) {
        this.redefinirSenha = redefinirSenha;
    }

    /**
     * @return the aprovadorChamados
     */
    public boolean isAprovadorChamados() {
        return aprovadorChamados;
    }

    /**
     * @param aprovadorChamados the aprovadorChamados to set
     */
    public void setAprovadorChamados(boolean aprovadorChamados) {
        this.aprovadorChamados = aprovadorChamados;
    }

    /**
     * @return the alterarModoPesagem
     */
    public boolean isAlterarModoPesagem() {
        return alterarModoPesagem;
    }

    /**
     * @param alterarModoPesagem the alterarModoPesagem to set
     */
    public void setAlterarModoPesagem(boolean alterarModoPesagem) {
        this.alterarModoPesagem = alterarModoPesagem;
    }

    /**
     * @return the alterarPesosPesagem
     */
    public boolean isAlterarPesosPesagem() {
        return alterarPesosPesagem;
    }

    /**
     * @param alterarPesosPesagem the alterarPesosPesagem to set
     */
    public void setAlterarPesosPesagem(boolean alterarPesosPesagem) {
        this.alterarPesosPesagem = alterarPesosPesagem;
    }

    /**
     * @return the liberarDataRetroativaSolicitacaoVenda
     */
    public boolean isLiberarDataRetroativaSolicitacaoVenda() {
        return liberarDataRetroativaSolicitacaoVenda;
    }

    /**
     * @param liberarDataRetroativaSolicitacaoVenda the liberarDataRetroativaSolicitacaoVenda to set
     */
    public void setLiberarDataRetroativaSolicitacaoVenda(
            boolean liberarDataRetroativaSolicitacaoVenda) {
        this.liberarDataRetroativaSolicitacaoVenda = liberarDataRetroativaSolicitacaoVenda;
    }

    /**
     * @return the liberarClienteComBloqueioDeCompraPorEstouroDeLimite
     */
    public boolean isLiberarClienteComBloqueioDeCompraPorEstouroDeLimite() {
        return liberarClienteComBloqueioDeCompraPorEstouroDeLimite;
    }

    /**
     * @param liberarClienteComBloqueioDeCompraPorEstouroDeLimite the liberarClienteComBloqueioDeCompraPorEstouroDeLimite to set
     */
    public void setLiberarClienteComBloqueioDeCompraPorEstouroDeLimite(
            boolean liberarClienteComBloqueioDeCompraPorEstouroDeLimite) {
        this.liberarClienteComBloqueioDeCompraPorEstouroDeLimite = liberarClienteComBloqueioDeCompraPorEstouroDeLimite;
    }

    /**
     * @return the cancelarVenda
     */
    public boolean isCancelarVenda() {
        return cancelarVenda;
    }

    /**
     * @param cancelarVenda the cancelarVenda to set
     */
    public void setCancelarVenda(boolean cancelarVenda) {
        this.cancelarVenda = cancelarVenda;
    }

    /**
     * @return the permitirProgramacaoVendaSemIntegrado
     */
    public boolean isPermitirProgramacaoVendaSemIntegrado() {
        return permitirProgramacaoVendaSemIntegrado;
    }

    /**
     * @param permitirProgramacaoVendaSemIntegrado the permitirProgramacaoVendaSemIntegrado to set
     */
    public void setPermitirProgramacaoVendaSemIntegrado(
            boolean permitirProgramacaoVendaSemIntegrado) {
        this.permitirProgramacaoVendaSemIntegrado = permitirProgramacaoVendaSemIntegrado;
    }

    /**
     * @return the permitirModificarDistanciasClienteIntegrado
     */
    public boolean isPermitirModificarDistanciasClienteIntegrado() {
        return permitirModificarDistanciasClienteIntegrado;
    }

    /**
     * @param permitirModificarDistanciasClienteIntegrado the permitirModificarDistanciasClienteIntegrado to set
     */
    public void setPermitirModificarDistanciasClienteIntegrado(
            boolean permitirModificarDistanciasClienteIntegrado) {
        this.permitirModificarDistanciasClienteIntegrado = permitirModificarDistanciasClienteIntegrado;
    }

	/**
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", idFuncionario=" + idFuncionario + ", login=" + login + ", idGrupoAcesso="
				+ idGrupoAcesso + ", nomeGrupoAcesso=" + nomeGrupoAcesso + ", idGrupoAcessoUnidade="
				+ idGrupoAcessoUnidade + ", nomeGrupoAcessoUnidade=" + nomeGrupoAcessoUnidade + ", senha=" + senha
				+ ", bloqueado=" + bloqueado + ", redefinirSenha=" + redefinirSenha + ", aprovadorChamados="
				+ aprovadorChamados + ", alterarModoPesagem=" + alterarModoPesagem + ", alterarPesosPesagem="
				+ alterarPesosPesagem + ", liberarDataRetroativaSolicitacaoVenda="
				+ liberarDataRetroativaSolicitacaoVenda + ", liberarClienteComBloqueioDeCompraPorEstouroDeLimite="
				+ liberarClienteComBloqueioDeCompraPorEstouroDeLimite + ", cancelarVenda=" + cancelarVenda
				+ ", permitirProgramacaoVendaSemIntegrado=" + permitirProgramacaoVendaSemIntegrado
				+ ", permitirModificarDistanciasClienteIntegrado=" + permitirModificarDistanciasClienteIntegrado + "]";
	}

	/**
	 * Criado por Felipe Oliveira 15/11/2016
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (alterarModoPesagem ? 1231 : 1237);
		result = prime * result + (alterarPesosPesagem ? 1231 : 1237);
		result = prime * result + (aprovadorChamados ? 1231 : 1237);
		result = prime * result + (bloqueado ? 1231 : 1237);
		result = prime * result + (cancelarVenda ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + idFuncionario;
		result = prime * result + idGrupoAcesso;
		result = prime * result + idGrupoAcessoUnidade;
		result = prime * result + (liberarClienteComBloqueioDeCompraPorEstouroDeLimite ? 1231 : 1237);
		result = prime * result + (liberarDataRetroativaSolicitacaoVenda ? 1231 : 1237);
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nomeGrupoAcesso == null) ? 0 : nomeGrupoAcesso.hashCode());
		result = prime * result + ((nomeGrupoAcessoUnidade == null) ? 0 : nomeGrupoAcessoUnidade.hashCode());
		result = prime * result + (permitirModificarDistanciasClienteIntegrado ? 1231 : 1237);
		result = prime * result + (permitirProgramacaoVendaSemIntegrado ? 1231 : 1237);
		result = prime * result + (redefinirSenha ? 1231 : 1237);
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
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
		Usuarios other = (Usuarios) obj;
		if (alterarModoPesagem != other.alterarModoPesagem)
			return false;
		if (alterarPesosPesagem != other.alterarPesosPesagem)
			return false;
		if (aprovadorChamados != other.aprovadorChamados)
			return false;
		if (bloqueado != other.bloqueado)
			return false;
		if (cancelarVenda != other.cancelarVenda)
			return false;
		if (id != other.id)
			return false;
		if (idFuncionario != other.idFuncionario)
			return false;
		if (idGrupoAcesso != other.idGrupoAcesso)
			return false;
		if (idGrupoAcessoUnidade != other.idGrupoAcessoUnidade)
			return false;
		if (liberarClienteComBloqueioDeCompraPorEstouroDeLimite != other.liberarClienteComBloqueioDeCompraPorEstouroDeLimite)
			return false;
		if (liberarDataRetroativaSolicitacaoVenda != other.liberarDataRetroativaSolicitacaoVenda)
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (nomeGrupoAcesso == null) {
			if (other.nomeGrupoAcesso != null)
				return false;
		} else if (!nomeGrupoAcesso.equals(other.nomeGrupoAcesso))
			return false;
		if (nomeGrupoAcessoUnidade == null) {
			if (other.nomeGrupoAcessoUnidade != null)
				return false;
		} else if (!nomeGrupoAcessoUnidade.equals(other.nomeGrupoAcessoUnidade))
			return false;
		if (permitirModificarDistanciasClienteIntegrado != other.permitirModificarDistanciasClienteIntegrado)
			return false;
		if (permitirProgramacaoVendaSemIntegrado != other.permitirProgramacaoVendaSemIntegrado)
			return false;
		if (redefinirSenha != other.redefinirSenha)
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
    
    
}