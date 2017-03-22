package model;

public class Vacina {
	private String data;
	private String nome_vacina;
	private float preco;
	
	public Vacina(String data, String nome_vacina, float preco) {
		super();
		this.data = data;
		this.nome_vacina = nome_vacina;
		this.preco = preco;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNome_vacina() {
		return nome_vacina;
	}

	public void setNome_vacina(String nome_vacina) {
		this.nome_vacina = nome_vacina;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
