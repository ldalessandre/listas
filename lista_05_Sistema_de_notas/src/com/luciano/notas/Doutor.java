package com.luciano.notas;


public class Doutor extends Professor {
	private String tituloTese;	
	static private double bonusSalarial = 1.13;

	public Doutor(String tituloTese, long cpf, String nome, double salario ){		
		super(cpf, nome, salario);
		this.setTituloTese(tituloTese);
		this.setSalario(salario);
	}	

	public String getTituloTese() {
		return tituloTese;
	}

	public void setTituloTese(String tituloTese) {
		this.tituloTese = tituloTese;
	}

	public double getBonusSalarial() {
		return bonusSalarial;
	}	
	
	public double getSalarioDoutor(){
		return (this.getSalario() * this.getBonusSalarial()); 
	}
	
	public String toString(){
		String retorno = "Doutor\nCPF: "+this.getCpf()+" - Nome: "+this.getNome()+" - Salario: "+this.getSalarioDoutor()+" - Titulo Tese: "+this.getTituloTese();
		return retorno;
	}
	
}
