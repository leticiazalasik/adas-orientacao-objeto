package br.com.projetoFluxoCaixa.model;

public class Produto {

	private int id;
	private String nome;
	private String descricao;
	private double preco;
	private double estoque;
	private boolean isPromocao;

	public Produto() {

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public boolean isPromocao() {
		return isPromocao;
	}

	public void setPromocao(boolean isPromocao) {
		this.isPromocao = isPromocao;
	}

	// MÉTODOS

	public void realizarVenda(int qtde) {
		if (validarEstoque(qtde)) {
			Double valorTotal = this.preco * qtde;
			this.estoque -= qtde;
		} else {
			System.out.println(
					"Estoque insuficiente para a venda solictada.\n Quantidade de produto disponível: " + this.estoque);
		}

	}

	public boolean validarEstoque(double qtde) {
		if (this.estoque > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void reporEstoque(double qtde) {
		this.estoque += qtde;
		System.out.println("Produtos adicionaados ao estoque!");
	}

	public void atualizarPromocao(boolean status) {
		if (!this.isPromocao) {
			this.isPromocao = true;
			System.out.println("Produto adicionado a promoçao.");
		} else {
			this.isPromocao = false;
			System.out.println("Produto retirado de promoção.");
		}
	}
	
	

}
