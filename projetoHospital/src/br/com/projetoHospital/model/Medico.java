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

	public void imprimirRelatorioPacientes (int tipoRelatorio) {
		
if (this.pacientes.size()==0) {
	System.out.println("Sem pacientes cadastrados");
} else { 
	
	System.out.println("Opções de Relatório: ");
	System.out.println("1- Todos");
	System.out.println("2- Internados");
	System.out.println("3- Não internados");
	
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
		List <Pacientes> internados =getPacientesInternados(); 
		
		if (internados.size() ==0) {
			System.out.println("Não existem pacientes internados");
		} else { 
			System.out.println("\n\n- Relatório de pacientes: dr(a) " + this.nome+ " INTERNADOS -");
			for (Paciente paciente : this.internados) {
			
			}

		}
		
			break; 
				
				//Os NÃO internados 
		case 3: 
				for (Paciente paciente : this.pacientes) {
					if (paciente.isInternado()==false) {
						System.out.println("\n\n- Relatório de pacientes: dr(a) " + this.nome+ " NÃO INTERNADOS -");
						paciente.exibirDadosPaciente(); 
					}
				}
				} else { 
					System.out.println("Não há nenhum paciente cadstarado.");
			
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

//	public void realizarAlta (int idEcluir) {
//		for (Paciente paci : pacientes) {
//			if (paci.id==idExcluir) {
//				this.pacientes.remove(idExcluir)
//			} else { 
//				System.out.println("Paciente não encontrado na lista.");
//			}
//		}
//	}
//	
//	
//	
//	}

}
