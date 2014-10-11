package luciano.arranjos;

import java.util.Scanner;

public class Exercicio02 {

	private static Scanner buf;

	private static int calculaDeterminante(int[][] matriz, int opc) {
		int deter;
		if (opc == 1)
			deter = matriz[0][0];
		else if (opc == 2)
			deter = matriz[0][0] * matriz[1][1] - matriz[1][0] * matriz[0][1];
		else
			deter = matriz[0][0] * matriz[1][1] * matriz[2][2] + matriz[1][0]
					* matriz[2][1] * matriz[0][2] + matriz[0][1] * matriz[1][2]
					* matriz[2][0] - matriz[2][0] * matriz[1][1] * matriz[0][2]
					- matriz[2][1] * matriz[1][2] * matriz[0][0] - matriz[1][0]
					* matriz[0][1] * matriz[2][2];
		return deter;
	}

	public static int[][] preencheMatriz(int[][] matriz_ab) {

		for (int i = 0; i < matriz_ab.length; i++) {
			for (int j = 0; j < matriz_ab[0].length; j++) {
				System.out.println("Linha: " + i + " - Coluna: " + j);
				matriz_ab[i][j] = new Scanner(System.in).nextInt();
			}
		}

		return matriz_ab;
	}

	public static void main(String[] args) {
		// ->Inicia Variveis e buf de teclado
		int opc;
		do {
			System.out.println("Escolha o caso base");
			System.out.println("1 = 1x1");
			System.out.println("2 = 2x2");
			System.out.println("3 = 3x3");

			buf = new Scanner(System.in);
			opc = buf.nextInt();
			if ((opc < 1) && (opc > 3)) {
				System.err.println("Opção invalida");
			}
		} while ((opc < 1) && (opc > 3));

		System.out.println("Preencha a matriz");
		int[][] matriz_a = new int[opc][opc];
		matriz_a = preencheMatriz(matriz_a);
		int determinante = calculaDeterminante(matriz_a, opc);
		System.out.println("Determinante da matriz: " + determinante);
	}

}
