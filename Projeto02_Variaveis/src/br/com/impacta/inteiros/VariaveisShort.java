package br.com.impacta.inteiros;

public class VariaveisShort {
 public static void main(String[] args) {
	 
	 	short idade1 = 32767;
		short idade2 = 1;
		
		System.out.println("Idade da primeira pessoa: " + idade1);
		System.out.println("Idade da primeira pessoa: " + idade2);
		
		short soma = (short) (idade1 + idade2); // typecast
	
		System.out.println("soma das idades " + soma);
 	}
}
