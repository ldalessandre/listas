package com.luciano.notas;

public class Disciplina {
	private final int codigo;
	private String nome;
	private int cargaHoraria;
	private Professor professor;
	
	public Disciplina(final int codigo, String nome, int cargaHoraria, Professor professor) {
		this.codigo = codigo;
		this.setNome(nome);
		this.setCargaHoraria(cargaHoraria);
		this.setProfessor(professor);
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public String toString(){
		String retorno = "Codigo: "+this.getCodigo()+" - Nome: "+this.getNome()+" - Carga Horaria: "+this.getCargaHoraria()+" - Professor: "+this.professor.toString();
		return retorno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cargaHoraria;
		result = prime * result + codigo;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((professor == null) ? 0 : professor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (cargaHoraria != other.cargaHoraria)
			return false;
		if (codigo != other.codigo)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		return true;
	}	
	
	
		
}
