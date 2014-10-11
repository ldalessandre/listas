package com.luciano.lista_02_arranjo.multiplicacaoMatrizes.Exercicio01;

import java.util.Scanner;

public class MultiplicarMatriz {

	private static Scanner buf;

	public static int[][] multMatriz(int[][] matriz_a, int[][] matriz_b) {
		
		int[][] matriz_final = new int[matriz_a.length][matriz_b[0].length];
		
		for (int i = 0; i < matriz_a.length; i++) {
			for (int j = 0; j < matriz_b[0].length; j++) {
				for (int k = 0; k < matriz_a[0].length; k++) {
					matriz_final[i][j] += matriz_a[i][k] * matriz_b[k][j];
				}				
			}
		}
		return matriz_final;
	}

	public static int[][] preencheMatriz(int[][] matriz_ab) {
		buf = new Scanner(System.in);
		for (int i = 0; i < matriz_ab.length; i++) {
			for (int j = 0; j < matriz_ab[0].length; j++) {
				System.out.println("Linha: " + i + " - Coluna: " + j);
				matriz_ab[i][j] = buf.nextInt();
			}
		}
		//buf.close();
		return matriz_ab;
	}

	public static void main(String[] args) {
		// ->Inicia Variveis e buf de teclado
		int xa;
		int ya;
		int xb;
		int yb;
		Scanner buf = new Scanner(System.in);

		// ->Inicia primeira matriz
		System.out.println("Digite x para a primeira matriz");
		xa = buf.nextInt();
		System.out.println("Digite y para a primeira matriz");
		ya = buf.nextInt();
		int[][] matriz_a = new int[xa][ya];

		// ->Inicia a segunda matriz
		System.out.println("Digite x para a segunda matriz");
		// Verifica se o numero de colunas da primeira matriz é igual ao numero
		// de linhas da segunda matriz
		do {
			xb = buf.nextInt();
		} while (xb != ya);
		System.out.println("Digite y para a segunda matriz");
		yb = buf.nextInt();
		int[][] matriz_b = new int[xb][yb];

		// ->Preenche as matrizes
		matriz_a = preencheMatriz(matriz_a);
		matriz_b = preencheMatriz(matriz_b);

		// Inica multiplicação de matrizes
		int[][] matriz_final = new int[xa][yb];
		matriz_final = multMatriz(matriz_a, matriz_b);

		for (int i = 0; i < matriz_final.length; i++) {
			for (int j = 0; j < matriz_final[0].length; j++) {
				System.out.println(matriz_final[i][j]);
			}
		}

		buf.close();
	}

}