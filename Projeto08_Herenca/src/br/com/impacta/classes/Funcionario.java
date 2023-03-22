package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Funcionario extends Pessoa {

	
	public Funcionario() {
		super();
		
	}
	
	public Funcionario(String nome, int idade, Sexo sexo, String cargo, double salario) {
		super(nome, idade, sexo);
		this.setCargo(cargo);
		this.setSalario(salario);
		
	}
	
	private String cargo;
	private double salario;
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String mostrar() {
		return super.mostrar() + 
				"\nSalário: " + this.getCargo() +
				"\nCargo: " + this.getSalario();
	
	
	}
	
	
}
