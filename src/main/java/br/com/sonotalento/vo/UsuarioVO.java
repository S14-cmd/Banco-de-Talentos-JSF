package br.com.sonotalento.vo;

import java.util.Objects;

public class UsuarioVO {
	
	private String id;
	private String nome;
	private String email;
	private String perfil;
	private String senha;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String setor) {
		this.email = setor;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", perfil=" + perfil + ", senha=" + senha + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(email, id, nome, perfil, senha);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioVO other = (UsuarioVO) obj;
		return  Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome) 
				&& Objects.equals(perfil, other.perfil) && Objects.equals(senha, other.senha);
	}	
}