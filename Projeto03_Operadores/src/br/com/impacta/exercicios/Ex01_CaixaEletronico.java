package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex01_CaixaEletronico {
	public static void main(String[] args) {
		
		int valor = Integer.parseInt
				(JOptionPane.showInputDialog("Qual o valor do saque"));
		
		int qtde50, qtde20, qtde10, qtde5 = 0;
		
		int resto;
		
		qtde50 = valor/ 50;
		resto = valor % 50;
		
		qtde20 = resto / 20;
		resto = resto % 20;
		
		qtde10 = resto / 10;
		resto = resto% 10;
		
		qtde5 = resto / 5;
		resto = resto % 5;
		 
		String resposta = "Valor do saque: " + valor +
				"\nNotas de 50: " + qtde50 +  
				"\nNotas de 20: " + qtde20 +
				"\nNotas de 10: " + qtde10 +
				"\nNotas de 5: " + qtde5 ;
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}
	
	
	
	
}
