package com.luciano.lista_01_sintaxe;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner buf = new Scanner(System.in);
		int x = buf.nextInt();
		double y = 5;
		if (x == y){
			System.out.print("Igual");
		} else
			System.out.print("Não igual");
		buf.close();
	}

}
