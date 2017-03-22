package model;

public class Ficha {
	private String data;
	private String nome_vacina;
	private float preco;
	private Animal animal;
	
	public Ficha(String data, String nome_vacina, float preco, Animal animal) {
		super();
		this.data = data;
		this.nome_vacina = nome_vacina;
		this.preco = preco;
		this.animal = animal;
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
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}
