package exe7_2;

import java.util.Scanner;
import java.math.*;

public class Calculadora {
	
	public static double getraiz(double num) {

		Math.sqrt(num);
		return num;
	}

	private static double lado;
	
	public Calculadora(double lado) {
		this.lado = lado;
	}
	
	public double getDiagonal() {
		return this.lado * getraiz(2);
	}
	
	public static void main(String[]args) {
		
		Calculadora calculadora = new Calculadora(10);
		System.out.println(calculadora.getraiz(lado));
	}
}
