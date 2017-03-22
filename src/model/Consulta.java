package model;

public class Consulta {
	private String data;
	private String descricao;
	
	public Consulta(String data, String descricao) {
		super();
		this.data = data;
		this.descricao = descricao;
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
	
}
