package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel02 {

	public static void main(String[] args) {
		
		
		Automovel auto1 = new Automovel();
		auto1.lerDados("honda", "civic", 2010, "EUE4045");
		
		Automovel auto2 = auto1;
		auto2.setAno(2023);
		
		auto1 = null;
		
		JOptionPane.showMessageDialog(null, auto2.mostrar());
	}

}
