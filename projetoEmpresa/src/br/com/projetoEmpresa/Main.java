package br.com.projetoEmpresa;

import br.com.projetoEmpresa.model.Funcionario;
import br.com.projetoEmpresa.model.Lider;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario1 = new Funcionario(1, "Joarez");
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setId(2);
		funcionario2.setNome("Guilherme");
		
		Funcionario funcionario3 = new Funcionario(3, "Scarlet");
		
		Funcionario funcionario4 = new Funcionario();
		funcionario4.setId(4);
		funcionario4.setNome("Priscila");
		
		Funcionario funcionario5 = new Funcionario(5, "Letícia");
		
		funcionario1.exibirDadosFuncionario();
		funcionario2.exibirDadosFuncionario();
		
		Lider lider1= new Lider ();
		lider1.setId(1);
		lider1.setNome("Graziela");
		lider1.setSetor("Negociações");
		
		lider1.cadastrarFuncionario(funcionario5);
		lider1.cadastrarFuncionario(funcionario4);
		lider1.cadastrarFuncionario(funcionario3);
		lider1.cadastrarFuncionario(funcionario2);
		
		lider1.concederBonus(funcionario5);
		lider1.concederBonus(funcionario4);
		lider1.concederBonus(funcionario4);

		lider1.imprimirRelatorioFuncionarios();
		lider1.demitirFuncionario(funcionario3);
		lider1.imprimirRelatorioFuncionarios();
	}

}
