package Bercario;

import java.util.Date;

public class Mae extends Pessoa{
	private String sobrenome; 
	
	
	public Mae(String sobrenome) {
		super();
		this.sobrenome = sobrenome;
	}


	public Mae() {
		super();
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
}