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

	//
	// Métodos relacionados aos alunos
	//

	public Object procuraAlunoMatricula(int matricula) {
		ArrayList<Aluno> alunos = this.alunos;
		for (Aluno i : alunos) {
			if (i.getMatricula() == matricula) {
				return i;
			}

		}
		return null;
	}

	public boolean excluiAlunomatricula(int matricula) {
		ArrayList<Aluno> alunos = this.alunos;
		for (Aluno i : alunos) {
			if (i.getMatricula() == matricula) {
				this.alunos.remove(i);
				return true;
			}

		}
		return false;
	}

	public void imprimirListaAlunos() {
		ArrayList<Aluno> alunos = this.alunos;
		alunos = this.alunos;
		for (Aluno i : alunos) {
			System.out.println(i);
		}
	}

	//
	// Metodos relacionados aos professores
	//

	public Professor procuraProfessorCPF(long cpf) {
		ArrayList<Professor> professor = this.professores;
		for (Professor i : professor) {
			if (i.getCpf() == cpf) {
				return i;
			}

		}
		return null;
	}

	public boolean excluiProfessorCPF(long cpf) {
		ArrayList<Professor> professor = this.professores;
		for (Professor i : professor) {
			if (i.getCpf() == cpf) {
				this.professores.remove(i);
				return true;
			}

		}
		return false;
	}

	public void imprimirListaProfessores() {
		ArrayList<Professor> professor = this.professores;
		for (Professor i : professor) {
			System.out.println(i);
		}
	}

	//
	// Metodos relacionados aos disciplina
	//

	public Disciplina procuraDisciplinaCodigo(int codigo) {
		ArrayList<Disciplina> disciplina = this.disciplinas;
		for (Disciplina i : disciplina) {
			if (i.getCodigo() == codigo) {
				return i;
			}

		}
		return null;
	}

	public boolean excluiDisciplinaCPF(int codigo) {
		ArrayList<Disciplina> disciplina = this.disciplinas;
		for (Disciplina i : disciplina) {
			if (i.getCodigo() == codigo) {
				this.disciplinas.remove(i);
				return true;
			}

		}
		return false;
	}

	public void imprimirListaDisciplina() {
		ArrayList<Disciplina> disciplina = this.disciplinas;
		for (Disciplina i : disciplina) {
			System.out.println(i);
		}
	}

	//
	// Metodos gerais da classe
	//
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
