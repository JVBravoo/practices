package school.cesar.q3.domain;

import java.util.Scanner;
import java.util.ArrayList;

public class SomaDupla {
	
	static ArrayList<Integer> lista = new ArrayList<Integer>();

	public static String pump(ArrayList<Integer> valores, int alvo) {
		
		for(int i = 0; i < valores.size(); i++) {
			for(int j = i + 1; j < valores.size(); j++) {				
				if(alvo == (valores.get(i)) + (valores.get(j))) {
					return (" funfou " + i + " and " + j);
				}
			}
		}
		return "Indices indeterminados";
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		String interrupt = "0";
		int alvo;
		
		Scanner scan = new Scanner(System.in);
		
		while(!interrupt.equalsIgnoreCase("parar")) {
			System.out.println("Insira números e quando não quiser mais digite 'parar': ");
			
			interrupt = scan.next();
			if(!interrupt.equalsIgnoreCase("parar")) {
				valores.add(Integer.parseInt(interrupt));
			}
		}
		
		System.out.println("Digite o valor do alvo: ");
		alvo = scan.nextInt();
		scan.close();
		System.out.println(SomaDupla.pump(valores, alvo));
	}

}
