package br.com.projetoEmpresa.model;

public class Funcionario {

//Atributos
	
	private int id; 
	private String nome; 
	private boolean recebeBonus; 
	
	//Construtor Vazio 
	public Funcionario() { 
		
	}
	
	//Construtor cheio 
	
	public Funcionario (int id, String nome) {
		this.id=id;
		this.nome=nome; 
		this.recebeBonus=false; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean getRecebeBonus() { 
		return this.recebeBonus;
	}
	
	public void setRecebeBonus(boolean recebeBonus) { 
		this.recebeBonus=recebeBonus; 
	}
	
	public void exibirDadosFuncionario () { 
		System.out.println("Código: " + this.id);
		System.out.println("Nome: " + this.nome);
		if (this.recebeBonus==true) {
			System.out.println("Recebe bônus este mês.");
		} else { 
			System.out.println("Não receberá bônus este mês.");
		}
		System.out.println("********************\n");
	}
	
}
