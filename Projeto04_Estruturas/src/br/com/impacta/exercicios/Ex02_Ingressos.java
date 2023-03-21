package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex02_Ingressos {
	public static void main(String[] args) {
		/*
		 * Em um clube, o valor do ingresso é cobrado de acordo com a
		 * idade do participante:
		 * 
		 * Se a idade for menor que 18: R$ 20,00
		 * entre 18 e 59 anos: R$ 30,00
		 * acima de 59 anos: R$ 15,00
		 * 
		 * Com base nestas informações, escrever o programa que
		 * solicite a ideade do usuario, e em seguida apresente:
		 * 
		 * A idade o calor do ingresso.
		 */
		
		int idade = Integer.parseInt( JOptionPane.showInputDialog("Informe sua idade: "));
		
		double ingresso = 0;
		
		if(idade < 18) {
			ingresso = 20;
		}
		
		else if (idade >= 18 && idade <= 59) {
			ingresso = 30;
		}
			else {
				ingresso = 15;
			}
		
	JOptionPane.showInternalMessageDialog(null,"Sua idade é: " + idade +
						"\nE o valor do ingresso é: " + ingresso);

	}
}

