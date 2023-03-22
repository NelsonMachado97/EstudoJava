package br.com.impacta.aplicacao;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Nelson Machado");
		pessoa.setIdade(25);
		pessoa.setSexo(Sexo.MASCULINO);
		
		
		System.out.println(pessoa.mostrar());
		
		
	}

}
