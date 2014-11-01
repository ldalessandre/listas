package com.luciano.notas;

import java.util.ArrayList;


public class Professor {
	protected final long cpf;
	protected String nome;
	protected double salario;
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Professor(final long cpf, String nome, double salario, ArrayList<Disciplina> disciplinas) {
		this.cpf = cpf;
		this.setNome(nome);
		this.setSalario(salario);
		this.setDisciplinas(disciplinas);
	}

	public long getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public String toString(){
		String retorno = "CPF: "+this.getCpf()+" - Nome: "+this.getNome()+" - Salario: "+this.getSalario();
		return retorno;
	}	
}
