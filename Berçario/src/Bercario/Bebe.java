package Bercario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

public class Bebe extends Pessoa{
	
		private Mae mae; 
		private Medico medico; 
		private ArrayList<ControleMedicamento> controleMedicamento; 
		// Se eu quissse começar já com uma lista criada, se todos os bebes vao tomar medicacáo faria assim 
		//private ArrayList<ControleMedicamento> controleMedicamentos = new ArrayList<E>(); 
		
public Bebe(String nome, String endereco, Date dataNascimento, Integer telefone, Mae mae, Medico medico, ArrayList <ControleMedicamento> controle1) {
			super (nome, endereco, dataNascimento, telefone); 
			this.mae = mae;
			this.medico = medico;
			this.controleMedicamento = controle1;
		}



public Mae getMae() {
	return mae;
}



public void setMae(Mae mae) {
	this.mae = mae;
}



public Medico getMedico() {
	return medico;
}



public void setMedico(Medico medico) {
	this.medico = medico;
}



public ControleMedicamento getControleMedicamentos() {
	return getControleMedicamentos();
}



public ArrayList<ControleMedicamento> getListaDeMedicamentos() {
	return controleMedicamento;
}
//		public void setListaDeMedicamentos(ControleMedicamento controleMedicamento) {
//			this.controleMedicamentos.add(controleMedicamento); 
//		}
// Essa aqui seria a implementacao do set se tivéssemos feito aquele outro arrayList comentado 
	
		public void setControleMedicamentos(ArrayList<ControleMedicamento> controleMedicamentos) {
			this.controleMedicamento = controleMedicamentos;
		}
		
		public String exibirInformacoes () {
			return String.format("%s \n Mãe: %s Contato da mãe: %s \n Médico: %s", 
					super.toString(), mae.getNome(), mae.getTelefone(), medico.getNome());

		}
		
		public String relatorioMedicamentos () {
			String text = " "; 
			for (ControleMedicamento controle : controleMedicamento) {
				text += controle.toString();
			}
			return text; 
		}
		
		
}
