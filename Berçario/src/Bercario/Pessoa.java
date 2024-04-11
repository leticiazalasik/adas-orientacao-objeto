package Bercario;

import java.util.Date;

public abstract class Pessoa {
	private String nome; 
	private String endereco; 
	private Date dataNascimento; 
	private Integer telefone;
	
	public Pessoa () { 
		
	}

	

	public Pessoa(String nome, String endereco, Date dataNascimento, Integer telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}


	@Override
	public String toString() {
		return String.format("Nome: %s \nEndereço: %s \n Data de nascimento: %s", 
							nome, endereco, dataNascimento); 
	} 

	
}
