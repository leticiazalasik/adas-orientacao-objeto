package Bercario;

import java.util.Date;

public class ControleMedicamento {

	private Date dataHora; 
	private Medicamento medicamento; 
	
	public ControleMedicamento(Date dataHora, Medicamento medicamento) {
		super();
		this.dataHora = dataHora;
		this.medicamento = medicamento;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	@Override
	public String toString() {
		return String.format("Data Hora: %s\n"
				+ "Medicamento: %s "
				+ "Unidade de medida %s\n", dataHora, medicamento.getDescricao(), medicamento.getUnidadeMedida()); 
	}
	
	
	
}

