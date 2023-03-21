package br.com.impacta.exercicios;

public class Ex03_SenhaAlfanumerica {
	public static void main(String[] args) {
		
		String senha = "";
		for (int i = 0; i < 6 ; i++) {
			senha += (int)(Math.random() * 10);
		}
		 
		System.out.println(senha);
		
	}

}
