package br.com.projetoFluxoCaixa;

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
		p1.setNome("Notebook");
		p1.setDescricao("Dell, inspiron 16, tela Full HD");
		p1.setPreco(2850);
		p1.setEstoque(4);
		p1.setPromocao(false);
		
		Produto p2 = new Produto (); 
		p2.setId(2);
		p2.setNome("Smartphone");
		p2.setDescricao("Sansug galaxy X, 64gb de memória, internet 5g");
		p2.setPreco(1700);
		p2.setEstoque(2);
		p2.setPromocao(true);
		
		Lancamento lancamento1 = new Lancamento (); 
		
		
		System.out.println("Qual o tipo de lançamento desejado?");
		System.out.println("1- Entrada");
		System.out.println("2- Saída");
		lancamento1.setTipo(scan.next());
		System.out.print("Nome do produto:");
		lancamento1.setDescricao(scan.next());
		System.out.print("Quantidade:");
		lancamento1.setQuantidade(scan.nextInt());
		System.out.print("Valor da unidade:");
		lancamento1.setValorUnitario(scan.nextDouble());
		System.out.print("Valor total do lançamento:");
		int quantidade = lancamento1.getQuantidade(); 
		Double valor = lancamento1.getValorUnitario();
		lancamento1.setValorTotal(quantidade*valor);

		Caixa c1 = new Caixa(); 
		c1.setId(1);
		c1.setValor(0.0); 
		c1.setTotalEntrada(0.0);
		c1.setTotalSaida(0.0);
		c1.setStatus(true);

		c1.realizarLancamento(lancamento1);
		c1.exibirRelatorioEntradas();
		c1.exibirRelatorioSaidas();
		c1.exibirSituacaoCaixa();
		c1.exibirSituacaoCaixa();
		c1.encerrarCaixa();
		
		
		
		
	}

}
