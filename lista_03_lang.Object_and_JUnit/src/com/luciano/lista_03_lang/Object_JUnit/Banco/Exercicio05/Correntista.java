package com.luciano.lista_03_lang.Object_JUnit.Banco.Exercicio05;

public class Correntista {
	public long cpf;
	public String nome;
	
	public Correntista(long x, String n) {
		cpf = x;
		nome = n;
	}
	
	public long getCPF() {
		return this.cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		nome = n;
	}
	
}
