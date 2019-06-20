package school.cesar.q1;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class TresLetras {
	
	    
//	    public static void tresletras(ArrayList<String> inputstring){
//	        
//	    	//char[] charArray = new char[5];
//	    		    	
//	    	if(inputstring.size() != 5) {
//	    		throw new InvalidParameterException("Error! Palavra nao tem 5 letras.");
//	    	}
//	    	System.out.println(inputstring.size());
//	    		    	
//	    	for(int i = 0; i < 3; i++) {
//	    		 i = ((CharSequence) inputstring).charAt(2); 
//	    		 System.out.println(i);
//	    			}
//	    	
//			@SuppressWarnings("rawtypes")
//			ArrayList permutada = permuta(inputstring);
//	    	for(int i = 0; i < permutada.size(); i++) {
//	    		String[] input = (String[])permutada.get(i);
//	    		for(int k = 0; k < input.length; k++) {
//	    			System.out.println(input[k] + ", ");
//	    		}
//	    	}
//	    	
//	   }
//    	
//
//	    
//	    
//	    @SuppressWarnings("rawtypes")
//		private static ArrayList permuta(ArrayList<String> inputstring) {
//			return null;
//		}

		@SuppressWarnings("resource")
		public static void main (String args[]) {
	    	
	    	System.out.println("Digite uma palavra que contem 5 letras: ");
	    	
	    	Scanner inputstring = new Scanner(System.in);
	    	
	    	@SuppressWarnings("unused")
			String word = inputstring.next();
	    	
	    	ArrayList<String> input = new ArrayList<String>();
	    	
	    	if(input.size() != 4) {
	    		throw new InvalidParameterException("Error! Palavra nao tem 5 letras."); //ERRO NESTA LINHA DE CÓDIGO
	    	}
	    	
	    	System.out.println(input.size());
	    	
	    	for(int i = 0; i < 3; i++) {
	    		i = ((CharSequence) input).charAt(2);
	    		System.out.println(i);
	    		System.out.println();
	    		String empty = "";
	    		
	    		empty = empty + ((CharSequence) input).charAt(0);
	    		empty = empty + ((CharSequence) input).charAt(1);
	    		empty = empty + ((CharSequence) input).charAt(2);
	    		input.add(empty);
	    	}
	    	
	    	HashSet<String> sure = new HashSet<String>();
	    	for(String one:input) {
	    		sure.add(one);
	    	}
	    	System.out.print(sure);
	    	
	    	
	    	inputstring.close();
	    }
	    
}	
