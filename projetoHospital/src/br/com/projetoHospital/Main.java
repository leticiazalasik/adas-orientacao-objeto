package br.com.projetoHospital;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import br.com.projetoHospital.model.Medico;
import br.com.projetoHospital.model.Paciente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		Paciente paciente1 = new Paciente();
		paciente1.setId(1);
		paciente1.setNome("Letícia");
		paciente1.setIdade(26);
		paciente1.setSexo("F");
		paciente1.setIsInternado(true);

		Paciente paciente2 = new Paciente(02, "John", 33, "M");
		paciente2.setIsInternado(true);

		Paciente paciente3 = new Paciente(03, "Luiza", 20, "F");
		paciente3.setIsInternado(true);

		Medico medico1 = new Medico();
		// tem que criar vazio
		medico1.setId(1);
		medico1.setNome("Mariana");
		medico1.setEspecialidade("Cardiologista");
		medico1.setPlantao(true);

		paciente1.exibirDadosPaciente();

		medico1.cadastrarPaciente(paciente1);
		medico1.cadastrarPaciente(paciente2);
		medico1.cadastrarPaciente(paciente3);


		medico1.imprimirRelatorioPacientes(3);
		medico1.realizarAlta();
		medico1.imprimirRelatorioPacientes(1);

	}

}
