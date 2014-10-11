package com.luciano.lista_01_sintaxe;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner buf = new Scanner(System.in);
		int num_arranjo = 0;
		System.out.print("Informe o tamanho do arranjo: ");
		num_arranjo = buf.nextInt();

		int[] arranjo = new int[num_arranjo];
		for (int i = 0; i < arranjo.length; i++) {
			arranjo[i] = buf.nextInt();
		}

		for (int i : arranjo) {
			System.out.print(i);
		}

		buf.close();
	}

}
