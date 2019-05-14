package exe6_1;

import java.util.Random;
import java.util.Scanner;

public class Verificador {
	
	public static boolean booleano(int[] array) {
		
		boolean x = false;
		
 		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i] == array[j]) {
					x = true;
				}
			}
		}
 		return true;
	}
	
	public static void main(String[]args) {
		
		
		Random generator = new Random();
		
		int[] array = new int[20];
		
		for(int i = 0; i < array.length - 1; i++) {
			array[i] = generator.nextInt(31);
		}
		System.out.println(Verificador.booleano(array));
	}
}