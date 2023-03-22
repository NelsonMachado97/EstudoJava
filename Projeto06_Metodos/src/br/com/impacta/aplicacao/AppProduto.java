package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {

	public static void main(String[] args) {
		
		
		
		
		Produto leite = new Produto();
		
		int cod = Integer.parseInt(JOptionPane.showInputDialog("informe o código"));
		String cat = JOptionPane.showInputDialog("Informe a categoria");
		String desc = JOptionPane.showInputDialog("Informe a descrição");
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço"));
		
		
		leite.setCodigo(cod);
		leite.setCategoria(cat);
		leite.setDescricao(desc);
		leite.setPreco(preco);
		
		
		System.out.println(leite.mostrar());
		JOptionPane.showMessageDialog(null, leite.mostrar());

	}
}
