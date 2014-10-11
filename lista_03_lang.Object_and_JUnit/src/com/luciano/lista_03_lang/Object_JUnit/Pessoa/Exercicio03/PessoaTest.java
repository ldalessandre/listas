package com.luciano.lista_03_lang.Object_JUnit.Pessoa.Exercicio03;

import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {

	@Test
	public void ConstructorTest() {
		Pessoa pessoa1 = new Pessoa("raquel", 22);
		assertEquals("raquel", pessoa1.getNome());
		assertEquals(22, pessoa1.getIdade());
	}
	
	@Test
	public void ToStringTest(){
		Pessoa pessoa1 = new Pessoa("raquel", 22);
		assertEquals("raquel tem 22 anos", pessoa1.toString());		
	}	
	
	@Test
	public void HashCodeTest(){
		Pessoa pessoa1 = new Pessoa("", 22);
		assertEquals(1643, pessoa1.hashCode());
		//Pessoa pessoa2 = new Pessoa("raquel", 22);
		//assertEquals(1643, pessoa2.hashCode());
	}
	
	@Test
	public void EqualsTest(){
		Pessoa pessoa1 = new Pessoa("raquel", 22);
		assertEquals(true, pessoa1.equals(pessoa1));
	}
	
}
