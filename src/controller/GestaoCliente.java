package controller;

import model.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class GestaoCliente {
	Scanner read=(new Scanner(System.in));
	
	public void addCliente(ArrayList<Cliente> listaCli){
		String nome,morada,email,telefone;
		Cliente cli;
		
		System.out.println("Introduza o nome do cliente: ");
		nome=read.nextLine();
		System.out.println("Introduza a morada do cliente: ");
		morada=read.nextLine();
		System.out.println("Introduza o email do cliente: ");
		email=read.nextLine();
		System.out.println("Introduza o telefone do cliente: ");
		telefone=read.nextLine();
		
		listaCli.add(cli=new Cliente(listaCli.size()+1,nome,morada,email,telefone));
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
	
}
