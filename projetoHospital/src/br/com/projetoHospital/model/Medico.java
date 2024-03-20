package br.com.projetoHospital.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medico {

	private int id;
	private String nome;
	private String especialidade;
	private boolean isPlantao;
	private List<Paciente> pacientes;

	Scanner scan = new Scanner(System.in);

	public Medico() {
		this.pacientes = new ArrayList<Paciente>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public boolean isPlantao() {
		return isPlantao;
	}

	public void setPlantao(boolean isPlantao) {
		this.isPlantao = isPlantao;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	private List <Paciente> getPacientesInternados() { 
	List <Paciente> lista = new ArrayList<Paciente>(); 
	for (Paciente paciente : this.pacientes) {
		if (paciente.isInternado()) {
			lista.add(paciente);
		}
	}
	return lista;
	}
	
	private List <Paciente>  getPacientesNaoInternados () { 
		List <Paciente> lista = new ArrayList<Paciente>(); 
		for (Paciente paciente : this.pacientes) {
			if (!paciente.isInternado()) {
				lista.add(paciente);
			}
		}
		return lista;
	}

	public void imprimirRelatorioPacientes (int tipoRelatorio) {
		
if (this.pacientes.size()==0) {
	System.out.println("Sem pacientes cadastrados");
} else { 
	
	System.out.println("\n Opções de Relatório: ");
	System.out.println("1- Todos");
	System.out.println("2- Internados");
	System.out.println("3- Não internados \n");
	
		switch (tipoRelatorio) { 
		//Todos 
		case 1: 
		System.out.println("\n\n- Relatório de pacientes: dr(a) " + this.nome+ " TODOS -");
		for (Paciente paciente : this.pacientes) {
			paciente.exibirDadosPaciente(); 
		}
		break; 
		
		//Os internados 
		case 2: 
		List <Paciente> internados =getPacientesInternados(); 
		
		if (internados.size() ==0) {
			System.out.println("Não existem pacientes internados \n");
		} else { 
			System.out.println("\n\n- Relatório de pacientes: dr(a) " + this.nome+ " INTERNADOS -");
			for (Paciente paciente : internados) {
				paciente.exibirDadosPaciente(); 
			}

		}
		
			break; 
				
				//Os NÃO internados 
		case 3: 
				List <Paciente> naoInternados =getPacientesNaoInternados(); 
				
				if (naoInternados.size() ==0) {
					System.out.println("Não existem pacientes NÃO internados \n");
				} else { 
					System.out.println("\n\n- Relatório de pacientes: dr(a) " + this.nome+ " NÃO INTERNADOS -");
					for (Paciente paciente : naoInternados) {
						paciente.exibirDadosPaciente(); 
					}

				}
				
					break; 
			
			default: 
				System.out.println("Opção não existe!");
		}
	}
	}

	public void cadastrarPaciente(Paciente paciente) {
		this.pacientes.add(paciente);
		System.out.println("\nPaciente cadastrado com sucesso!");
	}

	public void realizarAlta (Paciente paciente) {
			if (paciente.isInternado()) {
				paciente.setIsInternado(false);		
				System.out.println("Alta dada com sucesso para paciente " + paciente.getNome());
			}
	}
}
