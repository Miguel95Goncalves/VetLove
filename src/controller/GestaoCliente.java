package controller;

import model.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class GestaoCliente {
	Scanner read=(new Scanner(System.in));
	
	public void addCliente(ArrayList<Cliente> listaCli,String nome,String morada,String email,String telefone){
		listaCli.add(new Cliente(listaCli.size()+1,nome,morada,email,telefone));
	}
	
	public void listarClientes(ArrayList<Cliente> listaCli){
		for(int i=0;i<listaCli.size();i++){
			System.out.println("ID: "+listaCli.get(i).getId());
			System.out.println("Nome: "+listaCli.get(i).getNome());
			System.out.println("Morada: "+listaCli.get(i).getMorada());
			System.out.println("EMAIL: "+listaCli.get(i).getEmail());
			System.out.println("Telefone: "+listaCli.get(i).getTelefone());
		}
	}
	
	public Cliente procurarClienteID(ArrayList<Cliente> listaCli,int id){
		for(Cliente c : listaCli)
		{
			if(c.getId() == id) return c;
		}
		return null;
	}
	
	public float calcularGasto(ArrayList<Cliente> listaCli,int id){
		float total=0;
		
		for(int i=0;i<listaCli.get(id).getAnimais().size();i++)
		{
			for(int j=0;j<listaCli.get(id).getAnimais().get(i).getFicha().getVacinas().size();j++)
			{
				total+=listaCli.get(id).getAnimais().get(i).getFicha().getVacinas().get(j).getPreco();
			}
		}
		return total;
	}
	
}
