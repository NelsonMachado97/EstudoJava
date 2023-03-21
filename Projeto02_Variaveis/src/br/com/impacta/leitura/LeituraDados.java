package br.com.impacta.leitura;

import javax.swing.JOptionPane;

public class LeituraDados {

	public static void main(String[] args) {
	
		String usuario = JOptionPane.showInputDialog("Qual é o seu nome?");
		
		
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade: "));
			
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua altura: "));
		
		String resposta = "Seu nome: " + usuario + 
				"\nSua idade é: " + idade + 
				"\nSua altura: " + altura;
		
		
			JOptionPane.showConfirmDialog(null, resposta);

	}
}
