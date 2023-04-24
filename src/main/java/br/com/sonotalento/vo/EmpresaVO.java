package br.com.sonotalento.vo;

import java.util.Objects;

public class EmpresaVO {
	
	private String id;
	private String nome;
	private String descricao;

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	@Override
	public String toString() {
		return "Empresa [descricao=" + descricao + ", id=" + id + ", nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpresaVO other = (EmpresaVO) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
}