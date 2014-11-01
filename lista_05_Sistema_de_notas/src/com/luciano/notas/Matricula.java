	package com.luciano.notas;

public class Matricula {
	private Integer pontuacao;
	private Aluno aluno;
	private Disciplina disciplina;
	
	/**
	 * 
	 * @param aluno
	 * @param disciplina
	 * @param pontuacao
	 */
	public Matricula(Aluno aluno, Disciplina disciplina, Integer pontuacao) {
		this.setPontuacao(pontuacao);
		this.setAluno(aluno);
		this.setDisciplina(disciplina);
	}

	public Matricula(Aluno aluno, Disciplina disciplina) {
		this.pontuacao = null;
		this.setAluno(aluno);
		this.setDisciplina(disciplina);
	}	
	
	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Integer pontuacao) {
		if ((pontuacao < 0) || (pontuacao > 100 )){
			this.pontuacao = pontuacao;
		}
			this.pontuacao = null;						
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public String toString(){
		String retorno = "Pontuação: "+this.getPontuacao()+"\nAluno: "+this.aluno.toString()+"\nDisciplina: "+this.disciplina.toString();
		return retorno;
	}	
}