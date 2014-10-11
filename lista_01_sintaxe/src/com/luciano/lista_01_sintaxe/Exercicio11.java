package com.luciano.lista_01_sintaxe;

import java.util.Scanner;

public class Exercicio11 {

		public static void main(String[] args) {
			Scanner buf = new Scanner(System.in);
			String texto = buf.nextLine();
			int cont = 0;
			for (int i = 0; i < texto.length(); i++) {
				if(texto.charAt(i) == 'a'){
					cont++;
				}
			}
			System.out.print("Numero de 'a's é: "+cont);
			buf.close();
		}	
}
