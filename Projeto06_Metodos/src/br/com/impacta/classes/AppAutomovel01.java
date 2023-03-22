package br.com.impacta.classes;

import javax.swing.JOptionPane;

public class AppAutomovel01 {

	public static void main(String[] args) {
		//declarar variavel
		
		Automovel auto = new Automovel();
		auto.lerDados("honda", "civic", 2010, "EUE4045");
		
		String texto = auto.mostrar();
		
		
		System.out.println(texto);
		JOptionPane.showMessageDialog(null, texto);
		
		
		/*Automovel auto2 = new Automovel();
		auto2.lerDados("Chevrolet", "Onix", 2023, "GHJ5298");
		
		String texto2 = auto2.mostrar();
		JOptionPane.showMessageDialog(null, texto2);*/
		
	}

	
}
