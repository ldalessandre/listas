package com.luciano.lista_03_lang.Object_JUnit.Banco.Exercicio05;

import java.util.Collection;

public class Banco {
	private Collection<Correntista> correntista;
	private static int incremento = 1;
	private int numero;
	private double saldo;	

	//Construtor
	public Banco(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
		
	}
	
	public void Conta(Exercicio05_Correntista correntista){
		this.correntista = Collection<correntista>;
	}

	public void Conta(Exercicio05_Correntista correntista, double saldo){
		// ?
	}

	public int getNumero() {
		return this.numero;
	}

	public Exercicio05_Correntista getCorrentis(){
			
	}
	
	public double getSaldo() {
		return saldo;
	}
}
