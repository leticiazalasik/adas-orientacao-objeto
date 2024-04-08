package Bercario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

public class Bebe extends Pessoa{
	
		private Mae nomeMae; 
		private Medico nomeMedico; 
		private List<Medicamento>listaDeMedicamentos; 
		//no bebe estou pensando em faxer uma list aqui historico e aí aqui ele receberia como parametro o medicamento 
		
		public Bebe(Mae nomeMae, Medico nomeMedico) { 
			this.listaDeMedicamentos = new ArrayList <Medicamento> ();  
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
		public List<Medicamento> getListaDeMedicamentos() {
			return listaDeMedicamentos;
		}
		public void setListaDeMedicamentos(List<Medicamento> listaDeMedicamentos) {
			this.listaDeMedicamentos = listaDeMedicamentos;
		}
		
		
		
}
