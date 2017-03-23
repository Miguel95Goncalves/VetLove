package controller;

import model.Animal;
import model.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class GestaoCliente {
	Scanner read=(new Scanner(System.in));
	
	public void addCliente(ArrayList<Cliente> listaCli,String nome,String morada,String email,String telefone){ //Adicionar Cliente
		listaCli.add(new Cliente(listaCli.size()+1,nome,morada,email,telefone));
	}
	
	public void listarClientes(ArrayList<Cliente> listaCli){ //Listar Clientes
		for(int i=0;i<listaCli.size();i++){
			System.out.println("ID: "+listaCli.get(i).getId());
			System.out.println("Nome: "+listaCli.get(i).getNome());
			System.out.println("Morada: "+listaCli.get(i).getMorada());
			System.out.println("EMAIL: "+listaCli.get(i).getEmail());
			System.out.println("Telefone: "+listaCli.get(i).getTelefone());
		}
	}
	
	public Cliente procurarClienteID(ArrayList<Cliente> listaCli,int id){ //Procurar Cliente por ID
		id--;
		
		for(Cliente c : listaCli)
		{
			System.out.println("ID: "+c.getId());
			System.out.println("Nome: "+c.getNome());
			System.out.println("Morada: "+c.getMorada());
			System.out.println("Email: "+c.getEmail());
			System.out.println("Telefone: "+c.getTelefone());
		}
		return null;
	}
	
	public float calcularGasto(ArrayList<Cliente> listaCli,int id){ //Calcular Gasto em Vacinas
		float total=0;
		id--;
		
		for(int i=0;i<listaCli.get(id).getAnimais().size();i++)
		{
			for(int j=0;j<listaCli.get(id).getAnimais().get(i).getFicha().getVacinas().size();j++)
			{
				total+=listaCli.get(id).getAnimais().get(i).getFicha().getVacinas().get(j).getPreco();
			}
		}
		return total;
	}
	
	public void listarAnimaisCliente(ArrayList<Cliente> listaCli, int id){ //Listar Animais de Cliente
		id--;
		
		for(Animal anim : listaCli.get(id).getAnimais())
		{
			System.out.println("Classificação: "+anim.getClassificacao());
			System.out.println("Raça: "+anim.getRaca());
			System.out.println("Data Nascimento: "+anim.getData_nasc());
			if(anim.getFicha()!=null)
			{
				System.out.println("Número de Consultas: "+anim.getFicha().getConsultas().size());
				System.out.println("Número de Vacinas: "+anim.getFicha().getVacinas().size());
			}
		}
	}
	
}
