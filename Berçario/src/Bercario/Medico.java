package Bercario;

import java.util.Date;

public class Medico {

	private String nome;  
	private Date dataNascimento; 
	private Integer crm;  
	private String endereco; 
	private int telefone;
	
	public Medico(String nome, Date dataNascimento, Integer crm, String endereco, int telefone) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.crm = crm;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getCrm() {
		return crm;
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	} 
	
	
	
	
}
