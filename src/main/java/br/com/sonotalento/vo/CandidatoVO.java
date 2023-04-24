package br.com.sonotalento.vo;

import java.util.Objects;

public class CandidatoVO {
	
	private String id;
	private String nome;
	private String email;
	private String telefone;
	private String descricao;
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	@Override
	public String toString() {
		return "CandidatoVO [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
				+ ", descricao=" + descricao + ", senha=" + senha + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(descricao, email, id, nome, senha, telefone);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CandidatoVO other = (CandidatoVO) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(senha, other.senha) && Objects.equals(telefone, other.telefone);
	}
}