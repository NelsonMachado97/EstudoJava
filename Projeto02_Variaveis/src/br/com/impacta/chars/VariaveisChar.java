package br.com.impacta.chars;

import javax.swing.JOptionPane;

public class VariaveisChar {
	public static void main(String[] args) {
		
		char ch1 = 'X';
		char ch2 = 65;
		char ch3 = '\n';
		// '\n' == pula uma linha
		char ch4 = 27544;
		
		
		System.out.println("ch1: " + ch1);
		System.out.println("ch2: " + ch2);
		System.out.println("ch3: " + ch3);
		JOptionPane.showMessageDialog(null, "char4: " + ch4);
		System.out.println("ch4: " + ch4);
	}

}
