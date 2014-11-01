package com.luciano.lista_03_lang.Object_JUnit.Banco.Exercicio05;

public class Banco {
	private Correntista correntista;
	private static int incremento = 1;
	private int numero;
	private double saldo;	

	//Construtor
	public Banco(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
		
	}


	public void Conta(Correntista correntista, double saldo){
		// ?
	}

	public int getNumero() {
		return this.numero;
	}

	
	public double getSaldo() {
		return saldo;
	}


	public Correntista getCorrentista() {
		return correntista;
	}


	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}


	public static int getIncremento() {
		return incremento;
	}


	public static void setIncremento(int incremento) {
		Banco.incremento = incremento;
	}
}
