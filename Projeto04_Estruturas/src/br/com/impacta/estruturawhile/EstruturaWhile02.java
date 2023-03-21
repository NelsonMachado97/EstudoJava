package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile02 {
	public static void main(String[] args) {
		
		
		int soma = 0;
		int quantidade = 0;
		
		while(true) {
			int numero = Integer.parseInt
					(JOptionPane.showInputDialog("Informe um número."));
			if(numero == 0)
				break;
			
			soma += numero;
			quantidade ++;
			
		}
		
		
		System.out.println("Soma dos números informados; " + soma);
		System.out.println("Quantidade dos números informados; " + soma);
		
	}

}
