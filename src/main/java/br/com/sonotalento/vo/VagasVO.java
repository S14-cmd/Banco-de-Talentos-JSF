package br.com.sonotalento.vo;

import java.util.Objects;

public class VagasVO {
	
	private String id;
	private String nome;
	private String empresa;
	private String descricao;
	
	
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
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	@Override
	public String toString() {
		return "Vagas [id=" + id + ", nome=" + nome + ", empresa=" + empresa + ", descricao=" + descricao +"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(descricao, empresa, id, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VagasVO other = (VagasVO) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(empresa, other.empresa) 
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}	
}