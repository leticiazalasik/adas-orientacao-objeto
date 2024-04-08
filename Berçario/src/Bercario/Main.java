package Bercario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//COLCOAR TUDO QUE ESTÁ FALTANDO AINDA DE ATRIBUTOS 
		//Criando médicos 
		Medico medico1 = new Medico(); 
		
		Medico medico2 = new Medico(); 
		
		
		//Criando Mães 
		Mae mae1 = new Mae(); 
		
		Mae mae2 = new Mae(); 
		
		
		//criando bebês 
		Bebe bebe1 = new Bebe(mae1, medico1); 
		
		Bebe bebe2 = new Bebe(mae1, medico1); 

		Bebe bebe3 = new Bebe(mae2,medico2); 
		
		//Criando medicamentos 
		Medicamento medicamento1 = new Medicamento("Paracetamol", 10, "A cada 4 horas, máx. 2 dias" ); 
		
		Medicamento medicamento2 = new Medicamento("Amoxilina", 8, "A cada 8 horas, tratamento de 6 dias." ); 

		Medicamento medicamento3 = new Medicamento("Dipirona", 15, "A cada 4 horas, máx. 2 dias."); 

		Medicamento medicamento4 = new Medicamento("Ibuprofeno", 12, "A cada 6 horas, 4 dias de tartamento."); 

		Medicamento medicamento5 = new Medicamento("Buscopan", 20, "A cada 4 horas, máx. 3 dias"); 


		


		
	}

}
