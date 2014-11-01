package com.luciano.notas;

import java.util.ArrayList;

public class BD {

	private ArrayList<Aluno> alunos = new ArrayList<>();
	private ArrayList<Disciplina> disciplinas = new ArrayList<>();
	private ArrayList<Matricula> matriculas = new ArrayList<>();
	private ArrayList<Professor> professores = new ArrayList<>();

	/**
	 * @param alunos
	 * @param disciplinas
	 * @param matriculas
	 * @param professores
	 */
	public BD() {
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}

	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(Matricula matricula) {
		this.matriculas.add(matricula);
	}

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(Professor professor) {
		this.professores.add(professor);
	}

	public Object procuraNomeAluno(String nome) {
		ArrayList<Aluno> alunos = this.alunos;
		for (Aluno i : alunos) {
			if (i.getNome().equals(nome)) {
				return i;
			}

		}
		return null;
	}

	public boolean excluiAlunoNome(String nome) {
		ArrayList<Aluno> alunos = this.alunos;
		for (Aluno i : alunos) {
			if (i.getNome().equals(nome)) {
				this.alunos.remove(i);
				return true;
			}

		}
		return false;
	}
	
	public void imprimirListaAlunos(){
		ArrayList<Aluno> alunos = this.alunos;
		alunos = this.alunos;
		for (Aluno i : alunos) {
			System.out.println(i);
		}
	}
	
	
	
	@Override
	public String toString() {
		return "BD [alunos=" + alunos + ", disciplinas=" + disciplinas
				+ ", matriculas=" + matriculas + ", professores=" + professores
				+ "]";
	}

	public StringBuilder gerarBackup() {
		StringBuilder retorno = new StringBuilder();
		retorno.append(this.toString());
		return retorno;
	}

}
