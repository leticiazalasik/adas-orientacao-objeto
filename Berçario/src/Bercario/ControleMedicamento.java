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
	
	
	
}

