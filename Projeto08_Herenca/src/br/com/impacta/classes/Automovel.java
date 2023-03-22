package br.com.impacta.classes;

public class Automovel {
	
	//atributos.
	private String  marca;
	private String modelo;
	private int		 ano;
	private String  placa;
	private final int chassi;
	

	public final static String paisOrigem = "Brasil";
	
	
	
	public int getChassi() {
		return chassi;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		if (ano < 1970) {
			throw new NumberFormatException("O ano não pode ser menor que 1970");
		}
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String mostrar() {
		
		String titulo = "DADOS DO AUTOMÓVEL";
		
		
		String resposta = titulo +  "\n\nMarca: " + this.getMarca() + 
						  "\nModelo: " + this.getModelo() +
						  "Chassi" + this.getChassi();
						 
						  if(this.getAno() > 0 ) {
							  resposta += "\nAno: " + this.getAno();
							  
						  }
		if (this.getPlaca() != null) {
			resposta +=  "\nPlaca: " + this.getPlaca();
		}
		
		
		resposta += "\nPais Origem" + paisOrigem;
		return resposta;
	}
	public void lerDados(String marca, String modelo, int ano, String placa)
	{
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setPlaca(placa);
	}

 //construtores
	
	
	public Automovel(String marca, String modelo) {
	this.chassi = (int) (Math.random() * 1000);
	 this.setMarca(marca);
	 this.setModelo(modelo);
	 
	}
	public Automovel(String marca, String modelo, int ano) {
		this(marca, modelo);
		 this.setAno(ano);
}

	public Automovel(String marca, String modelo, int ano, String placa) {
		this(marca, modelo, ano);
		 this.setPlaca(placa);
		 
	
	
	}




}
