package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestaoCliente;
import model.Cliente;

public class FormCliente {
	
	Scanner read=(new Scanner(System.in));
	
	public void menuCliente(ArrayList<Cliente> listaCli){
		int opc;
		
		do
		{
			System.out.println("1 - Inserir Cliente\n2 - Listar Clientes\n3 - Procurar Cliente por ID\n4 - Verificar Gastos em Vacinas"
					+ "\n5 - Listar Animais de Cliente\n0 - Voltar\nInsira a opção: "); //Menu Cliente
			opc=read.nextInt();
			
			switch(opc)
			{
			case 1: //Inserir Cliente
				String nome,morada,email,telefone;
				
				read.nextLine();
				
				System.out.println("Introduza o nome do cliente: ");
				nome=read.nextLine();
				System.out.println("Introduza a morada do cliente: ");
				morada=read.nextLine();
				System.out.println("Introduza o email do cliente: ");
				email=read.nextLine();
				System.out.println("Introduza o telefone do cliente: ");
				telefone=read.nextLine();
				
				new GestaoCliente().addCliente(listaCli,nome,morada,email,telefone);
				break;
				
			case 2: //Listar Clientes
				new GestaoCliente().listarClientes(listaCli);
				break;
				
			case 3: //Procurar Cliente por ID
				int id;
				System.out.println("Insira o ID: ");
				id = read.nextInt();
				Cliente cli;
				cli=new GestaoCliente().procurarClienteID(listaCli, id);
				System.out.println("ID: "+cli.getId()+"\nNome: "+cli.getNome()+"\nMorada: "+cli.getMorada()+"\nEMAIL: "+cli.getEmail()+"\nTelefone: "+cli.getTelefone());
				break;
				
			case 4: //Calcular Gastos de Cliente em Vacinas
				System.out.println("Insira o ID do cliente: ");
				id=read.nextInt();
				id--;
				System.out.println(new GestaoCliente().calcularGasto(listaCli, id));
				break;
				
			case 5:
				System.out.println("Insira o ID do cliente: ");
				id = read.nextInt();
				
				new GestaoCliente().listarAnimaisCliente(listaCli, id);
				break;
			}
		}while(opc!=0);
	}
		
}
