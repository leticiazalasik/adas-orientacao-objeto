package br.com.projetoFluxoCaixa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.projetoFluxoCaixa.model.Caixa;
import br.com.projetoFluxoCaixa.model.Lancamento;
import br.com.projetoFluxoCaixa.model.Produto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in); 
		ArrayList<Produto> ListaProdutos = new ArrayList<>();

		//Criando um caixa 
		Caixa c1 = new Caixa(); 
		c1.setId(1);
		c1.setValor(0.0); 
		c1.setTotalEntrada(0.0);
		c1.setTotalSaida(0.0);
		c1.setStatus(true);
		
	//Começa aqui o programa, se o caixa estiver aberto por de executar aqui dentro as funções 
		if (c1.isStatus()) { 

		//Criando um produto 
		Produto p1 = new Produto (); 
		p1.setId(1);
		p1.setNome("Note");
		p1.setDescricao("Dell, inspiron 16, tela Full HD");
		p1.setPreco(2850);
		p1.setEstoque(4);
		p1.setPromocao(false);
		
//		//Criando um produto igual para fazer o teste se ele deixa adicionar um novo produto igual 
//		Produto p2 = new Produto (); 
//		p2.setId(1);
//		p2.setNome("Note");
//		p2.setDescricao("Dell, inspiron 16, tela Full HD");
//		p2.setPreco(2850);
//		p2.setEstoque(4);
//		p2.setPromocao(false);
//		
//		//Método que adiciona o novo produto e deve dar erro. 
//		p1.adicionarNovoProduto(ListaProdutos, p1);
//		p2.adicionarNovoProduto(ListaProdutos,p2);
		
		//Criando um novo lançamento para testar se o repor estoque cria um lancamento 
		Lancamento lancamento1 = new Lancamento (); 

		p1.reporEstoque(ListaProdutos, 4, p1, lancamento1);
		c1.exibirSituacaoCaixa();
		
		
//		
//		Aqui eu criei um "lançamento a mão" e abaixo lancei isso como teste 
//		System.out.println("Qual o tipo de lançamento desejado?");
//		System.out.println("Entrada");
//		System.out.println("Saída");
//		lancamento1.setTipo(scan.next());
//		System.out.print("Nome do produto:");
//		lancamento1.setDescricao(scan.next());
//		System.out.print("Quantidade:");
//		lancamento1.setQuantidade(scan.nextInt());
//		System.out.print("Valor da unidade:");
//		lancamento1.setValorUnitario(scan.nextDouble());
//		int quantidade = lancamento1.getQuantidade(); 
//		Double valor = lancamento1.getValorUnitario();
//		lancamento1.setValorTotal(quantidade*valor);
//
//
//		c1.realizarLancamento(lancamento1);
//		
//		Lancamento lancamento2 = new Lancamento (); 
//
//		Outro tipo de lançamento para teste 
		
//		System.out.println("Qual o tipo de lançamento desejado?");
//		System.out.println("Entrada");
//		System.out.println("Saída");
//		lancamento2.setTipo(scan.next());
//		System.out.print("Nome do produto:");
//		lancamento2.setDescricao(scan.next());
//		System.out.print("Quantidade:");
//		lancamento2.setQuantidade(scan.nextInt());
//		System.out.print("Valor da unidade:");
//		lancamento2.setValorUnitario(scan.nextDouble());
//		quantidade = lancamento2.getQuantidade(); 
//		valor = lancamento2.getValorUnitario();
//		lancamento2.setValorTotal(quantidade*valor);


//		c1.realizarLancamento(lancamento2);
//		c1.exibirHistorico();
//		c1.exibirRelatorioEntradas();
//		c1.exibirRelatorioSaidas();
//		c1.exibirSituacaoCaixa();
////		c1.encerrarCaixa();		
		
		//método que encerra o caixa e testa se fecha o programa 
		c1.encerrarCaixa();
		
//		produto repor e aumentar as saidas  lancamento 
//		realizar venda adiciona ao lancamento aumentando as entradas
//		as opcoes eu tero como colocar em um switch e cada op chamar uma opcao? so que como cada metodo sabe qual objeto vou aplicar?  
		} else { 
		
		 System.out.println("A execução foi interrompida.");
		    // Encerrar o programa com status de saída 0 (indicando sucesso)
		    System.exit(0);
		}
		//test
	}

}
