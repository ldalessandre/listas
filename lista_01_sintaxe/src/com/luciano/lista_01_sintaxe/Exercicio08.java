package com.luciano.lista_01_sintaxe;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner buf = new Scanner(System.in);
		int numero = buf.nextInt();
		if ((numero <= 100) && (numero >= 0)) {
			if ((numero <= 100) && (numero >= 90)) {
				System.out.print("Tirou A");
			} else if ((numero <= 89) && (numero >= 80)) {
				System.out.print("Tirou B");
			} else if ((numero <= 79) && (numero >= 70)) {
				System.out.print("Tirou B");
			} else
				System.out.print("Reprovou");
		} else
			System.out.print("Numero acima de 100");
		buf.close();
	}
	

}
