package br.com.impacta.classes;

public class Produto {

	private final int codigo;
	private String descricao;
	private String categoria;
	private double preco;
	
	private static int CONTADOR = 1;

	
	public Produto(String descricao, String categoria, double preco) {
		this.codigo = CONTADOR++; 
		this.setCategoria(categoria);
		this.setDescricao(descricao);
		this.setPreco(preco);

	}
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String mostrar() {
		
		return  "O código do produto é: " + this.getCodigo() +
				"\nDescrição: " + this.getDescricao() +
				"\nCategoria: " + this.getCategoria() +
				"\nO preço do produto é: " + this.getPreco();
		
		
		
	}
	
}
