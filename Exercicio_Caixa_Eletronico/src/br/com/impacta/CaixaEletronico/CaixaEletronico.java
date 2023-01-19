package br.com.impacta.CaixaEletronico;

import javax.swing.JOptionPane;

public class CaixaEletronico {
	public static void main(String[] args) {
	

	
		int valor = (int) Integer.parseInt (JOptionPane.showInputDialog("Olá, quanto deseja sacar?" +
			"\n notas disponiveis: R$50,00 /R$ 20,00 /R$ 10,00 /R$5,00  "));
		
	//notas de 50
			int valorNota50 = valor / 50;
				int resto50 = valor % 50;
					int valorNota20 = resto50 / 20;
						int resto20 = resto50 % 20;
							int valorNota10 = resto20 / 10;
								int resto10 = resto20 % 10;
									int valorNota5 = resto10 / 5;
										
			
			
			
			JOptionPane.showMessageDialog(null, "Ok, retirando:" + "\n notas de R$ 50,00: "
			+ valorNota50 + "\n notas de R$ 20,00: "
					
				+ valorNota20 + "\n notas de R$ 10,00: "
					
					+ valorNota10 + "\n notas de R$ 5,00: " + valorNota5 );
			
				
	} 
}
