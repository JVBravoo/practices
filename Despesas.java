package exe7_3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Despesas {

	static ArrayList<Double> lista = new ArrayList<Double>();
	
	public static int maior() {
		double maior = Collections.max(lista);
		return (int) maior;
	}
	
	public static int menor() {
		double menor = Collections.min(lista);
		return (int) menor;
	}
	
	public static int media() {
		if(lista.size() > 0) {
			double soma = 0;
			for(double numero : lista) {
				soma = numero + soma;
			}
			return (int) soma/lista.size();
		}
		return 0;
	}
	
	public void adiciona(double numero) {
		Despesas.lista.add(numero);
	}

	@Override
	public String toString() {
		return "Média de despesas = [" + Despesas.media() + ", Maior despesa = " + Despesas.maior() + ", Menor despesa = " + Despesas.menor()
				+ "]";
	}
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		Despesas despesas = new Despesas();
		
		boolean stop = false;
		String line;
		double numero;
		
		do {
			System.out.println("Digite um número para parar o programa: ");
			line = input.nextLine();
			
			if(!line.equals("Parar")) {
				numero = Double.parseDouble(line);
				despesas.adiciona(numero);
			}
			else {
				stop = true;
			}
		}while(!stop);
		
		input.close();
		System.out.println(despesas);
	}
	
	
}
