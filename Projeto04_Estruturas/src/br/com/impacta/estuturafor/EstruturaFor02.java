package br.com.impacta.estuturafor;

import javax.swing.JOptionPane;

public class EstruturaFor02 {
	public static void main(String[] args) {
		
		int maior = 0;
		int pessoa = 0;
		int alunos = Integer.parseInt( JOptionPane.showInputDialog
				("Quantos alunos tem na classe?"));
		
		
		for (int i = 1; i <= alunos; i++) {
			String pergunta = "Pessoa" + i + "\nQual a idade da Pessoa: " + i;
			int idade = Integer.parseInt(JOptionPane.showInputDialog(pergunta));
			
			if (idade > maior) {
				maior = idade;
				pessoa = i;
			}
				
			
		}
		JOptionPane.showMessageDialog(null, "Maior idade: " + maior +
			"\n Pessoa com a maior idade: " + pessoa);
	
	}
}
