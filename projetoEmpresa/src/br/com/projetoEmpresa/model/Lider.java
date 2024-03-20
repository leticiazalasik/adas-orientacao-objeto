package br.com.projetoEmpresa.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lider {

	private int id; 
	private String nome; 
	private String setor;
	private List<Funcionario>funcionarios;
	
	
	public Lider () {
		this.funcionarios=new ArrayList<Funcionario>(); 
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

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios; 
	}
	
	public void setFuncionarios (List<Funcionario>funcionarios) {
		this.funcionarios=funcionarios; 
	}
	
	//MÉTODOS 
	
	//Adicionar funcionário a equipe 
	public void cadastrarFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		System.out.println("\nFuncionário cadastrado com sucesso!");
	}
	
	//Conceder bônus ao funcionário 
	public void concederBonus (Funcionario funcionario) {
		if (!funcionario.getRecebeBonus()) {
			funcionario.setRecebeBonus(true);		
			System.out.println("\n"+ funcionario.getNome() + " recebeu bônus do mês!");
		} else { 
			System.out.println("\n"+ funcionario.getNome() + " já recebeu bônus este mês.");

		}
}
	
	//Separar funcionarios que recebem bonus 
	
	public List <Funcionario> getComBonus (){
	List <Funcionario> lista = new ArrayList<Funcionario>();
	for (Funcionario funcionario : this.funcionarios) { 
		if (funcionario.getRecebeBonus()) {
			lista.add(funcionario); 
		}
	}
	return lista;
	}
	
	public List <Funcionario> getSemBonus (){
	List <Funcionario> lista = new ArrayList<Funcionario>();
	for (Funcionario funcionario : this.funcionarios) { 
		if (!funcionario.getRecebeBonus()) {
			lista.add(funcionario); 
		}
	}
	return lista; 
	}

public void imprimirRelatorioFuncionarios () {
	if (funcionarios.size()>0) {
	Scanner scan = new Scanner (System.in); 
	System.out.println("\n Relatórios:\n 1- Todos\n 2- Recem bônus\n 3- Não recebem bônus");
	System.out.println("Qual relaório você quer imprimir? ");

	int tipoRelatorio = scan.nextInt(); 

switch (tipoRelatorio) {

case 1: 
	System.out.println("*** Relatório de todos os funcionários setor " + this.setor + " líder " + this.nome + " ***");
for (Funcionario funcionario : funcionarios) { 
	funcionario.exibirDadosFuncionario();
}
System.out.println("----- Fim do relatório -----");
break; 

case 2: 
	List <Funcionario> comBonus = getComBonus();
	if ( comBonus.size()==0) {
		System.out.println("Nenhum funcionário da equipe " + this.setor + " irá receber bônus. ");
	} else { 
		System.out.println("\n*** Relatório dos funcionários setor " + this.setor + " líder " + this.nome + " ***\n");
		for (Funcionario funcionario : comBonus) { 
			funcionario.exibirDadosFuncionario();
	}
}
	System.out.println("----- Fim do relatório -----");
	break; 
case 3: 
	List <Funcionario> semBonus = getSemBonus();
	if ( semBonus.size()==0) {
		System.out.println("Nenhum funcionário da equipe " + this.setor + " ficará sem bônus este mês. ");
	} else { 
		System.out.println("\n*** Relatório dos funcionários setor " + this.setor + " líder " + this.nome + " ***\n");
		for (Funcionario funcionario : semBonus) { 
			funcionario.exibirDadosFuncionario();
	}
}
	System.out.println("----- Fim do relatório -----");
	break; 
	
	default: 
		System.out.println("Opcão de relatório inexistente!");
}
}
}	
	
//Demitir
public void demitirFuncionario(Funcionario funcionario) {
	this.funcionarios.remove(funcionario);
	System.out.println("\nFuncioário(a) " + funcionario.getNome() + " foi desligado da empresa.");
}
}
