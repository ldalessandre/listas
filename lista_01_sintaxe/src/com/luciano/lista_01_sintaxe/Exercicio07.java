package com.luciano.lista_01_sintaxe;

public class Exercicio07 {

	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 'b';
		String s1 = "Amo a Raquel";
		String s2 = "Amo o momo";
		float f1 = 1;
		float f2 = 2;
		
		if (c1 == c2){
			System.out.print("char iguais");
		}else
			System.out.print("Não char iguais");	

		if (f1 == f2){
			System.out.print("float iguais");
		}else
			System.out.print("Não float iguais");
		
		if (s1.equals(s2)){
			System.out.print("char iguais");
		}else
			System.out.print("Não char iguais");
	}

}
