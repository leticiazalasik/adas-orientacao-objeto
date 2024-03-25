package br.com.projetoFluxoCaixa.model;

import java.util.ArrayList;
import java.util.List;


public class Caixa {

	private int id;
	private Double valor;
	private Double totalEntrada;
	private Double totalSaida;
	private boolean status;
	private List<Lancamento> historico;

	public Caixa() {
		this.historico = new ArrayList<Lancamento>();

	}

	//MÉTODOS 

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public Double getTotalEntrada() {
		return totalEntrada;
	}


	public void setTotalEntrada(Double totalEntrada) {
		this.totalEntrada = totalEntrada;
	}


	public Double getTotalSaida() {
		return totalSaida;
	}


	public void setTotalSaida(Double totalSaida) {
		this.totalSaida = totalSaida;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public List<Lancamento> getHistorico() {
		return historico;
	}


	public void setHistorico(List<Lancamento> historico) {
		this.historico = historico;
	}

	public void exibirRelatorioSaidas() { 	
		System.out.println("Total Saídas: " + this.totalSaida);
	}

	public void exibirRelatorioEntradas(){ 
		System.out.println("Total Entradas: " + this.totalEntrada);

	}

	public void exibirHistorico(){ 
		System.out.println("\n** Histórico de Lançamentos ** \n");
		for (Lancamento lancamentos : this.historico) {
			System.out.println(lancamentos.getTipo());
			System.out.println(lancamentos.getDescricao());
			System.out.println(lancamentos.getQuantidade());
			System.out.println(lancamentos.getValorUnitario());
			System.out.println(lancamentos.getValorTotal());
			System.out.println("- - - - - - \n");
		}
	}

	public void exibirSituacaoCaixa(){ 
		
		if (this.isStatus()) {
			System.out.println("Caixa Aberto");
		} else { 
			System.out.println("Caixa encerrado.");
		}
		System.out.println("Total Entradas: " + this.totalEntrada);
		System.out.println("Total Saídas: " + this.totalSaida);
		this.valor=+(this.totalEntrada)-this.totalSaida; 
		System.out.println("Valor final do caixa: " + this.valor);
	}

	public void realizarLancamento( Lancamento lancamento){ 
		this.historico.add(lancamento);
		if (lancamento.getTipo().equals("Entrada")) {
			this.totalEntrada += lancamento.getValorTotal();
		} else if (lancamento.getTipo().equals("Saída")) {
				this.totalSaida+=lancamento.getValorTotal();
		} else { 
			System.out.println("Opção inexistente!");
		}
	
	}

	public void encerrarCaixa() { 
		this.status=false; 
		exibirSituacaoCaixa();
		System.out.println("\n----- CAIXA ENCERRADO -----");
	}
	
	
}
