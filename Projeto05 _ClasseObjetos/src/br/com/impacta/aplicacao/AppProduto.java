package br.com.impacta.aplicacao;

import br.com.impacta.classes.Produtos;

public class AppProduto {
	public static void main(String[] args) {
		
		Produtos celular = new Produtos();
		
		celular.codigo = 12345;
		celular.categoria = "Telefonia";
		celular.descricao = "Iphone";
		celular.preco = 3500;
		
		
		
	}
}
