package br.com.impacta.utilitarios;

public class Utilitarios {
public static double somar(double x, double y){
	return x + y;
	}



public static String removerEspacos(String texto) {
	return texto.replace(" ", "");
	
}

public static String geraremail (String nome, String sobrenome) {
	
	return removerEspacos (nome.toLowerCase() + "." + sobrenome.toLowerCase() + "@impacta.com.br");
	
	
}

}

