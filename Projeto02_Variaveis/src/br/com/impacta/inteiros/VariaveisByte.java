package br.com.impacta.inteiros;

public class VariaveisByte {
	
	// main ctrl + barra de espaço
	
	public static void main(String[] args) {
	
		byte idade1 = 80;
		byte idade2 = 48;
		
		System.out.println("Idade da primeira pessoa: " + idade1);
		System.out.println("Idade da primeira pessoa: " + idade2);
		
		byte soma =(byte) (idade1 + idade2); // typecast
	
		System.out.println("soma das idades " + soma);
	}

}
