package model;

import java.util.ArrayList;

public class Cliente {
	private int id;
	private String nome;
	private String morada;
	private String email;
	private String telefone;
	
	private ArrayList<Animal> animais = new ArrayList<Animal>();

	public Cliente(int id, String nome, String morada, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.morada = morada;
		this.email = email;
		this.telefone = telefone;
		animais = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}
	
}
