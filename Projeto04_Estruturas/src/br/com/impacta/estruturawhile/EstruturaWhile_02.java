package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile_02 {

	public static void main(String[] args) {
      
		
		/*
		 * Neste programa, o usuario fornece uma  certa quantidade
		 * de números. A entrada de dados termina quando o usuario
		 * digitar o número 0 
		 * 
		 * No final, o programa deve mostrar a soma e a quantidade de 
		 * números informados.
		 * 
		 */
		
		
		
		int soma = 0;
		int quantidade = 0;
		
		while(true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("informe o numero."));
			
			if(numero == 0)
				break;
			
			soma += numero;
			quantidade += 1;
			
		}
		System.out.println("Soma dos números informados: " + soma);
		System.out.println("Quantidade dos números informados: " + quantidade);

	}

}
