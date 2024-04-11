package Bercario;

import java.util.Date;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//COLCOAR TUDO QUE ESTÁ FALTANDO AINDA DE ATRIBUTOS 
		//Criando médicos 
		
		Mae mae1 = new Mae ();
		mae1.setNome("Maria de Souza");
		mae1.setTelefone(991668989); 
		
		Medico medico1 = new Medico(); 
		medico1.setNome("Marco Augusto");
		medico1.setTelefone(33340927); 
		
		//Criando medicamentos 
		Medicamento medicamento1 = new Medicamento("Paracetamol", 10, "A cada 4 horas, máx. 2 dias" ); 
		
		Medicamento medicamento2 = new Medicamento("Amoxilina", 8, "A cada 8 horas, tratamento de 6 dias." ); 

		Medicamento medicamento3 = new Medicamento("Dipirona", 15, "A cada 4 horas, máx. 2 dias."); 

		Medicamento medicamento4 = new Medicamento("Ibuprofeno", 12, "A cada 6 horas, 4 dias de tartamento."); 

		Medicamento medicamento5 = new Medicamento("Buscopan", 20, "A cada 4 horas, máx. 3 dias"); 


		ControleMedicamento controle1 = new ControleMedicamento (null, medicamento5); 
				
		Bebe bebe1 = new Bebe ("Maria", "Rua do infelizes", new Date(), 991556767, mae1, medico1, null); 
		
		//bebe1.setNome("Janaína Horta");
		//bebe1.setEndereco("Avenida movimentada 100");
		//bebe1.setControleMedicamentos(null);
		

		System.out.println(bebe1.exibirInformacoes());
		
		Bebe bebe2 = new Bebe ("Maria", "Rua do infelizes", new Date(), 991556767, mae1, medico1, null);
		
		//testabdo se os bebes sao iguais
		System.out.println(" ");
		System.out.println(bebe1.equals(bebe2));
		System.out.println(bebe2.hashCode() + "|" + bebe1.hashCode());



		
	}

}
