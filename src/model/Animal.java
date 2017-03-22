package model;

public class Animal {
	private String classificacao;
	private String raca;
	private String data_nasc;
	private Cliente cliente;
	
	public Animal(String classificacao, String raca, String data_nasc, Cliente cliente) {
		super();
		this.classificacao = classificacao;
		this.raca = raca;
		this.data_nasc = data_nasc;
		this.cliente = cliente;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
