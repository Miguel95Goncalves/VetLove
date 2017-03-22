package model;

public class Consulta {
	private String data;
	private String descricao;
	private Ficha ficha;
	
	public Consulta(String data, String descricao, Ficha ficha) {
		super();
		this.data = data;
		this.descricao = descricao;
		this.ficha = ficha;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Ficha getFicha() {
		return ficha;
	}
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}
	
}
