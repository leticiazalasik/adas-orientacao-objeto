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

		int opcaoLancamento =0;  

		Produto p1 = new Produto (); 
		p1.setId(1);
		p1.setNome("Note");
		p1.setDescricao("Dell, inspiron 16, tela Full HD");
		p1.setPreco(2850);
		p1.setEstoque(4);
		p1.setPromocao(false);
		
		Produto p2 = new Produto (); 
		p2.setId(1);
		p2.setNome("Note");
		p2.setDescricao("Dell, inspiron 16, tela Full HD");
		p2.setPreco(2850);
		p2.setEstoque(4);
		p2.setPromocao(false);
		
		ArrayList<Produto> ListaProdutos = new ArrayList<>();

		p1.adicionarNovoProduto(ListaProdutos, p1);
		p2.adicionarNovoProduto(ListaProdutos,p2);
		
//		Produto p2 = new Produto (); 
//		p2.setId(2);
//		p2.setNome("Smartphone");
//		p2.setDescricao("Sansug galaxy X, 64gb de memória, internet 5g");
//		p2.setPreco(1700);
//		p2.setEstoque(2);
//		p2.setPromocao(true);
//		
		Caixa c1 = new Caixa(); 
		c1.setId(1);
		c1.setValor(0.0); 
		c1.setTotalEntrada(0.0);
		c1.setTotalSaida(0.0);
		c1.setStatus(true);
		
//		Lancamento lancamento1 = new Lancamento (); 
//		
//		
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
//		
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
//
//
//		c1.realizarLancamento(lancamento2);
//		c1.exibirHistorico();
//		c1.exibirRelatorioEntradas();
//		c1.exibirRelatorioSaidas();
//		c1.exibirSituacaoCaixa();
////		c1.encerrarCaixa();
		
		//teste adicionar novos produtos sem repetir 
		
		
		
//		produto repor tem que existir na lista de produtos e aumentar a qtd, e aumentar as saidas  lancamento 
//		realizar venda verifica estoque e adiciona ao lancamento aumentando as entradas mas aqui pelo nome tem que ver o valor 
//		agora se for um produto que ainda nao existe na loja ele tem que ser adicionado ao array
//		depois colocar tudo isso dentro de um menu de switch e do while enquanto for diferente de 0 0 fecha o caixa e encerra o while nao permitindo mais acoes 
		
		
	}

}
