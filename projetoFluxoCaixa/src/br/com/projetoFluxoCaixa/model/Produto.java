package br.com.projetoFluxoCaixa.model;

import java.util.ArrayList;
import java.util.List;

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

	public void setEstoque(double estoqueAtual) {
		this.estoque = estoqueAtual;
	}

	public boolean isPromocao() {
		return isPromocao;
	}

	public void setPromocao(boolean isPromocao) {
		this.isPromocao = isPromocao;
	}

	// MÉTODOS

	public void adicionarNovoProduto(List<Produto> ListaProdutos, Produto produto, Lancamento lancamento, Caixa caixa) {
		boolean produtoJaExiste = false;
		for (Produto produtos : ListaProdutos) {
			if (produtos.getNome().equals(produto.getNome())) {
				produtoJaExiste = true;
				break;
			}
		}

		if (!produtoJaExiste) {
			ListaProdutos.add(produto);
			System.out.println("Produto adicionado a sua lista de produtos!");
			lancamento.setTipo("Saída");
			lancamento.setDescricao("Compra de produtos");
			lancamento.setQuantidade(produto.getEstoque());
			lancamento.setValorUnitario(produto.getPreco());
			lancamento.setValorTotal(produto.getPreco()*produto.getEstoque());
            caixa.realizarLancamento(lancamento);

		} else {
			System.out.println(
					"\nJá existe um produto com esse nome na lista.\nOu adicione esse produto ao estoque ou Altere o nome do produto.");
		}
	}

	public void realizarVenda(int qtde) {
		if (validarEstoque(qtde)) {
			double valorTotal = this.preco * qtde;
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

	public void reporEstoque(List<Produto> ListaProdutos, int qtde, Produto produto, Lancamento lancamento, Caixa caixa) {
	    boolean produtoJaExiste = false;
	    int indexProdutoSelecionado = 0;
	    for (Produto produtos : ListaProdutos) {
	        if (produtos.getNome().equals(produto.getNome())) {
	            produtoJaExiste = true;
	            indexProdutoSelecionado = ListaProdutos.indexOf(produtos);
	            //
	            lancamento.setTipo("Saída");
	            lancamento.setDescricao(produtos.getNome());
	            lancamento.setQuantidade(qtde);
	            lancamento.setValorUnitario(produtos.getPreco());
	            lancamento.setValorTotal(produtos.getPreco() * qtde);

	            produtos.setEstoque(produtos.getEstoque() + qtde);
	            caixa.realizarLancamento(lancamento);
	            System.out.println("Produtos adicionados ao estoque!");
	            break;
	        }
	    }
	    if (produtoJaExiste == false) {
	        System.out.println("Esse produto não pode ser reposto pois ele não está cadastrado no estoque.");
	    }
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
