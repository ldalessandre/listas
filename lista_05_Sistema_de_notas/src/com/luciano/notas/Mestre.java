package com.luciano.notas;


public class Mestre extends Professor{
	private String tituloDissertacao;

	public Mestre (String tituloDissertacao, long cpf, String nome, double salario ){
		super(cpf, nome, salario);
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
