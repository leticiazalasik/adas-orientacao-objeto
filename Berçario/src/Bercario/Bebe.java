package Bercario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.xml.crypto.Data;

public class Bebe extends Pessoa implements repositorioBebe{
	
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

//source hash code 
// a comparação está sendo feita entre os atributos mae e medico dos objetos do tipo Bebe, não entre os próprios bebês. 
// Esses atributos vao determinar se dois objetos do tipo Bebe são considerados iguais ou não, de acordo com a lógica de igualdade que está sendo implementada nessa classe.
//Se eu deixasse só o hash ele comparar apenas a referencia de memoria de cada objeto 
		@Override
		public int hashCode() { //Nese caso o hascode vai ser criado com base nessas dois atributos, se forem iguais, mesmo hashcode 
			return Objects.hash(mae, medico);
		}



		@Override
		//Aqui no caso a ideia vais er passar nesse parametro um objeto da classe bebe, ele só está object para nao obrigar que seja 
		//chama o método equals() em um objeto, você está comparando esse objeto com outro que é passado como parâmetro. 
		
		public boolean equals(Object obj) {
			if (this == obj) //o que ele compara aqui é a referencia de memória 
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Bebe other = (Bebe) obj; //Aqui estou convertendo o objeto obj generico para um objeto do tipo bebe
			return Objects.equals(mae, other.mae) && Objects.equals(medico, other.medico); // poderia colocar aqui um && this.hashcode()==obj.hashcode; Aì compararia o o codigo de memoria 
		}
		
		//método equals() que você mencionou, a comparação é feita com base nos atributos mae e medico dos objetos do tipo Bebe.
		//a geração de códigos hash cria um valor numérico que representa unicamente um objeto. Dois objetos iguais de acordo com o método equals() devem ter o 
		//mesmo código hash, mas dois objetos com o mesmo código hash não necessariamente são iguais.

		
}
