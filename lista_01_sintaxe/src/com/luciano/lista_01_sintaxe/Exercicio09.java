package com.luciano.lista_01_sintaxe;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner buf = new Scanner(System.in);
		int numero = buf.nextInt();
		int total = 0;
		for (int i = 0; i < numero; i++) {
			total = i+1 + total;
			System.out.print((i+1)+" + ");			
		}
		System.out.print(" = "+total);
		buf.close();
	}

}
