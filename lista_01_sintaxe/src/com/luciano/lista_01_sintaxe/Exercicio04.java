package com.luciano.lista_01_sintaxe;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner buf = new Scanner(System.in);
		float x = buf.nextFloat();
		float y = buf.nextFloat();
		System.out.print( Math.pow(x, 120) / Math.sqrt(y));
		buf.close();
	}

}
