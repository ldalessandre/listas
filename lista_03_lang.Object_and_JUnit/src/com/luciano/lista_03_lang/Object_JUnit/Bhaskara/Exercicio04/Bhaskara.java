package com.luciano.lista_03_lang.Object_JUnit.Bhaskara.Exercicio04;

import java.lang.Math;

public class Bhaskara {
	private double a;
	private double b;
	private double c;

	public Bhaskara(double x, double y, double z) {
		this.a = x;
		this.b = y;
		this.c = z;
	}

	public double getA() {
		return this.a;
	}

	public double getB() {
		return this.b;
	}

	public double getC() {
		return this.c;
	}

	public double getDelta() {
		return Math.pow(this.b, 2) - 4 * this.a * this.c;
	}

	public double[] retornRaizes() {
		double[] raizes = new double[2];
		raizes[0] = (-this.b + Math.sqrt(this.getDelta())) / 2 * this.a;
		raizes[1] = (-this.b - Math.sqrt(this.getDelta())) / 2 * this.a;
		return raizes;
	}

}
