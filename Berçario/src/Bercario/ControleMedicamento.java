package Bercario;

import java.util.Date;

public class ControleMedicamento {

	private Date dataHora; 
	private Medicamento medicamento; 
	private Bebe bebe;
	
	public ControleMedicamento(Date dataHora, Medicamento medicamento, Bebe bebe) {
		super();
		this.dataHora = dataHora;
		this.medicamento = medicamento;
		this.bebe = bebe;
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

	public Bebe getBebe() {
		return bebe;
	}

	public void setBebe(Bebe bebe) {
		this.bebe = bebe;
	} 
	
	
	
	
}

