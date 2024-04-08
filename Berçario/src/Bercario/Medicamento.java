package Bercario;

public class Medicamento {

	private String descricao;  
	private Integer estoqueQtd;
	private String unidadeMedida;
	
	public Medicamento(String descricao, Integer estoqueQtd, String unidadeMedida) {
		super();
		this.descricao = descricao;
		this.estoqueQtd = estoqueQtd;
		this.unidadeMedida = unidadeMedida;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getEstoqueQtd() {
		return estoqueQtd;
	}

	public void setEstoqueQtd(Integer estoqueQtd) {
		this.estoqueQtd = estoqueQtd;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	} 
	
	
}
