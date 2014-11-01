package com.luciano.notas;

import java.util.ArrayList;


public class Mestre extends Professor{
	private String tituloDissertacao;

	public Mestre (String tituloDissertacao, long cpf, String nome, double salario, ArrayList<Disciplina> disciplinas ){
		super(cpf, nome, salario, disciplinas);
		this.setTituloDissertacao(tituloDissertacao);	
	}
	
	public String getTituloDissertacao() {
		return tituloDissertacao;
	}

	public void setTituloDissertacao(String tituloDissertacao) {
		this.tituloDissertacao = tituloDissertacao;
	}
	
	public String toString(){
		String retorno = "Mestre\nCPF: "+this.getCpf()+" - Nome: "+this.getNome()+" - Salario: "+this.getSalario()+" - Titulo Dissertacao: "+getTituloDissertacao();
		return retorno;
	}		
}
