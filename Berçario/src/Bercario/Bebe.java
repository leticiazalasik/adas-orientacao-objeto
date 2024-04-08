package Bercario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

public class Bebe {
	
		private String nome; 
		private Date dataNacsimento; 
		private Mae nomeMae; 
		private Medico nomeMedico; 
		private List<Medicamento>listaDeMedicamentos; 
		
		public Bebe() { 
			this.listaDeMedicamentos=new ArrayList<Medicamento>();
	}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Date getDataNacsimento() {
			return dataNacsimento;
		}

		public void setDataNacsimento(Date dataNacsimento) {
			this.dataNacsimento = dataNacsimento;
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
