package com.luciano.lista_03_lang.Object_JUnit.Bhaskara.Exercicio04;


import static org.junit.Assert.*;

import org.junit.Test;

public class BhaskaraTest {

	@Test
	public void getATest() {
		Bhaskara test1 = new Bhaskara(2, 3, 4);
		assertEquals(2, test1.getA(), 0);
	}
	
	@Test
	public void getBTest() {
		Bhaskara test2 = new Bhaskara(2, 3, 4);
		assertEquals(3, test2.getB(), 0);
	}
	
	@Test
	public void getCTest() {
		Bhaskara test3 = new Bhaskara(2, 3, 4);
		assertEquals(4, test3.getC(), 0);
	}
	
	@Test
	public void getDeltaTest() {
		Bhaskara test4 = new Bhaskara(2, 3, 4);
		assertEquals(-23, test4.getDelta(), 0);
	}
	
	@Test
	public void RaizesTest() {
		Bhaskara test5 = new Bhaskara(1, -5, 6);
		double[] esperado = new double[2];
		esperado[0] = 3;
		esperado[1] = 2;
		assertArrayEquals(esperado, test5.retornRaizes(), 0);
	}
	

}
