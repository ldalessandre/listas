package com.luciano.lista_01_sintaxe;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int[] arranjo = new int[5];		
		Scanner buf = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			arranjo[i] = buf.nextInt();			
		}
		buf.close();				
		for (int i = 0; i < 5; i++) {
			System.out.print(arranjo[i]);			
		}		

	}

}
