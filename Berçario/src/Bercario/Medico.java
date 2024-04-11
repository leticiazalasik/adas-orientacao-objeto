package Bercario;

import java.util.Date;

public class Medico extends Pessoa{

	private Integer crm;  
	
	public Medico(Integer crm) {
		this.crm = crm;	
	}
	

	public Medico() {
		super();
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
	}

	public Integer getCrm() {
		return crm;
	}
	

}
