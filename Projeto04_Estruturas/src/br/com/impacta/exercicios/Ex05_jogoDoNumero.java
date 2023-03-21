package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex05_jogoDoNumero {

	public static void main(String[] args) {
/*
 * O programa produz um número entre 0 e 100.
O programa pede para usuário digitar um número.

Enquanto o usuário não acertar o numero, o programa registra a tentativa.

No final, o programa deve apresentar a mensagem:
"Você acertou em ? tentativas"

Exemplo:

O programa gerou o número 59.

1 - "Forneça um numero entre 0 e 100"
    40

2 - "Forneça um numero entre 41 e 100"
     65

3 - "Forneça um numero entre 41 e 64"
    59

4 - "Você acertou em 3 tentativas"
 */
		
		int numero = (int) (Math.random() * 100) +1;
		
		int min = 0;
		int max = 100;
		int tentativas = 0;
		
		
		
		while (true) {
			
			
			
			int resposta = Integer.parseInt(JOptionPane.
					showInputDialog("Advinhe o numero"));
			
			if(resposta < min || resposta > max)
			continue;
			
			++tentativas;
			
			if (numero == resposta) {
				break;
			}
				
				else if (resposta < numero) {
				
				min = ++resposta;
				
				
				}
				else {
					max = --resposta;
				
					
					
			}
			
			
				
				
				JOptionPane.showMessageDialog(null, ("Errou!! \nO numero está entre "
				+ min + " e " + max));
				
			
		}

		String resultado = ("você acertou em " + tentativas);
		JOptionPane.showMessageDialog(null, resultado);
	}

}
