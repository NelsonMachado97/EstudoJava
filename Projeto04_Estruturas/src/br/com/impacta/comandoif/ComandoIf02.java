package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf02 {
	public static void main(String[] args) {
		/*
		 * Um funvionario tera um valor de 10% de desconto 
		 * SE o salario bruto foir superior a 5000 reais.
		 * O desconto será calculado sobre a diferença entre 2 
		 * valor do salario e o valor base 5000.
		 */
		
		
		double salario = Double.parseDouble (JOptionPane.showInputDialog("informe o salario: "));
		
		double desconto = 0;
				
		if (salario > 5000) {
			desconto = (salario - 5000) * 10 / 100;
		}	
			
		String resposta = "Salario Bruto: " + salario +
							"\nDesconto: " + desconto +
							"\nSalario Líquido: " + (salario - desconto);
		JOptionPane.showMessageDialog(null, resposta);
		
		
	}
}
