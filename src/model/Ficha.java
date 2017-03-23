package model;

import java.util.ArrayList;

public class Ficha {
	private ArrayList<Consulta> consultas = new ArrayList<Consulta>();
	private ArrayList<Vacina> vacinas = new ArrayList<Vacina>();
	
	public Ficha() {
		super();
		this.consultas = new ArrayList<Consulta>();
		this.vacinas = new ArrayList<Vacina>();
	}
	
	public Ficha(ArrayList<Consulta> consultas, ArrayList<Vacina> vacinas) {
		super();
		this.consultas = consultas;
		this.vacinas = vacinas;
	}
	
	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}
	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	}
	public ArrayList<Vacina> getVacinas() {
		return vacinas;
	}
	public void setVacinas(ArrayList<Vacina> vacinas) {
		this.vacinas = vacinas;
	}
	
}
