package br.com.projetoHospital.model;

import java.util.List;

public class Medico {

	private int id; 
	private String nome; 
	private String especialidade; 
	private boolean isPlantao; 
	private List<Paciente>pacientes; 
	
	public Medico () {
		
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
	
	public void imprimirRelatorioPacientes () {
		System.out.println("- Relatório de pacientes: dr(a) " + this.nome+ " -");
		for (Paciente paciente : this.pacientes) {
			paciente.exibirDadosPaciente(); 
		}
	}
	
	public void cadastrarPaciente (Paciente paciente) {
		this.pacientes.add(paciente); 
		System.out.println("\nPaciente cadastrado com sucesso!");
	}
	
	
}
