package com.luciano.lista_01_sintaxe;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner buf = new Scanner(System.in);
		float raio = buf.nextFloat();
		double perimetro = (2* 3.14 *raio);
		double area = ( 3.14 * Math.pow(raio, 2));
		System.out.print("Perimetro: "+perimetro+" - Área: "+area );
		buf.close();
	}

}
