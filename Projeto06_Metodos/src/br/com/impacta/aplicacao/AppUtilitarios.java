package br.com.impacta.aplicacao;

import br.com.impacta.utilitarios.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
	
	double soma = Utilitarios.somar(2545, 15.8);
	
	System.out.println(soma);
	
	
	System.out.println(Utilitarios.removerEspacos("Removedor de espaços"));
	
	System.out.println(Utilitarios.geraremail("nels on", "mac hado"));

	}
}
