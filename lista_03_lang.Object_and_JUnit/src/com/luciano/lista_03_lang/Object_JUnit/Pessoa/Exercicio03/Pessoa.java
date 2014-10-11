package com.luciano.lista_03_lang.Object_JUnit.Pessoa.Exercicio03;

import java.lang.Object;

public class Pessoa {
	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return this.nome + " tem " + this.idade + " anos";
	}

	@Override
	public void finalize() {
		System.out.println("Bye: " + this.nome);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (o != null && o instanceof Pessoa) {
			Pessoa p = (Pessoa) o;
			return p.nome.equals(this.nome) && p.idade == this.idade;
		}
		return false;
	}
}
