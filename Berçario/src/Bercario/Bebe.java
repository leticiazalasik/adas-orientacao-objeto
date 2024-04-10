package Bercario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

public class Bebe extends Pessoa{
	
		private Mae nomeMae; 
		private Medico nomeMedico; 
		private ArrayList<ControleMedicamento>controleMedicamentos; 
		// Se eu quissse começar já com uma lista criada, se todos os bebes vao tomar medicacáo faria assim 
		//private ArrayList<ControleMedicamento> controleMedicamentos = new ArrayList<E>(); 
		
		public Bebe(Mae nomeMae, Medico nomeMedico) { 
			this.nomeMae = nomeMae;
			this.nomeMedico = nomeMedico;
		}
		public Bebe(String nome, String endereco, Date dataNascimento) {
			super();
			
		}
		public Mae getNomeMae() {
			return nomeMae;
		}
		public void setNomeMae(Mae nomeMae) {
			this.nomeMae = nomeMae;
		}
		public Medico getNomeMedico() {
			return nomeMedico;
		}
		public void setNomeMedico(Medico nomeMedico) {
			this.nomeMedico = nomeMedico;
		}
		public ArrayList<ControleMedicamento> getListaDeMedicamentos() {
			return controleMedicamentos;
		}
//		public void setListaDeMedicamentos(ControleMedicamento controleMedicamento) {
//			this.controleMedicamentos.add(controleMedicamento); 
//		}
// Essa aqui seria a implementacao do set se tivéssemos feito aquele outro arrayList comentado 
	
		public void setControleMedicamentos(ArrayList<ControleMedicamento> controleMedicamentos) {
			this.controleMedicamentos = controleMedicamentos;
		}
		
		
		
		
		
}
