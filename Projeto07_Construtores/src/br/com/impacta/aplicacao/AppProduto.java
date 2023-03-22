package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {

	public static void main(String[] args) {
		
		
		
		while (true) {
			String cat = JOptionPane.showInputDialog("Informe a categoria");
			String desc = JOptionPane.showInputDialog("Informe a descrição");
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço"));
			Produto leite = new Produto(cat, desc, preco);
			System.out.println(leite.mostrar());
			JOptionPane.showMessageDialog(null, leite.mostrar());
		
		int opcao = JOptionPane.showConfirmDialog(null, 
				"Deseja continuar?","Confirmação", JOptionPane.YES_NO_OPTION);
		
		if(opcao == JOptionPane.NO_OPTION) {
			break;
		}
		}

		
		
	}
}