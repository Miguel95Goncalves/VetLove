package view;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;
import controller.GestaoCliente;

public class Main {

	static Scanner read=(new Scanner(System.in));
	static ArrayList<Cliente> listaCli = new ArrayList<Cliente>();
	
	public static void main(String[] args) {
		int opc,opc2;
		
		do
		{
			System.out.println("1 - Cliente\n2 - Animal\n3 - Ficha\n4 - Consulta\n5 - Vacina\n0 - Sair\nInsira a opção: ");
			opc=read.nextInt();
			
			switch(opc)
			{
			case 1:
				do
				{
					System.out.println("1 - Inserir Cliente\n2 - Listar Clientes\n3 - Procurar Cliente por ID\n4 - Verificar Gastos em Vacinas\n0 - Voltar\nInsira a opção: ");
					opc2=read.nextInt();
					
					switch(opc2)
					{
					case 1:
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
						
					case 2:
						new GestaoCliente().listarClientes(listaCli);
						break;
						
					case 3:
						int id;
						System.out.println("Insira o ID: ");
						id = read.nextInt();
						Cliente cli;
						cli=new GestaoCliente().procurarClienteID(listaCli, id);
						System.out.println("ID: "+cli.getId()+"\nNome: "+cli.getNome()+"\nMorada: "+cli.getMorada()+"\nEMAIL: "+cli.getEmail()+"\nTelefone: "+cli.getTelefone());
						break;
						
					case 4:
						System.out.println("Insira o ID do cliente: ");
						id=read.nextInt();
						id--;
						System.out.println(new GestaoCliente().calcularGasto(listaCli, id));
						break;
					}
				}while(opc2!=0);
				break;
				
			case 2:
				
				do
				{
					System.out.println("1 - Inserir animal\n0 - Voltar\nInsira a opcao: ");
					opc2 = read.nextInt();
					
					switch(opc2)
					{
					case 1:
						String classificacao,raca,data_nasc;
						int id;
						
						read.nextLine();
						
						System.out.println("Insira a classificacao: ");
						classificacao = read.nextLine();
						System.out.println("Insira a raça: ");
						raca = read.nextLine();
						System.out.println("Insira a data de nascimento: ");
						data_nasc = read.nextLine();
						
						Animal an = new Animal(classificacao,raca,data_nasc);
						
						System.out.println("Insira o ID do cliente a que pertence o animal: ");
						id = read.nextInt();
						
						id--;
						
						listaCli.get(id).getAnimais().add(an);
						break;
					}
					
				}while(opc2!=0);
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				int idCli,idAnim;
				do
				{
					System.out.println("1 - Inserir Consulta\n0 - Voltar\nInsira a opção: ");
					opc2 = read.nextInt();
					
					switch(opc2)
					{
					case 1:
						String data,descricao;
						
						read.nextLine();
						
						System.out.println("Insira a data: ");
						data=read.nextLine();
						
						System.out.println("Insira a descricao: ");
						descricao=read.nextLine();
						
						Consulta con = new Consulta(data, descricao);
						
						System.out.println("Insira o ID do cliente: ");
						idCli=read.nextInt();
						
						System.out.println("Insira o ID do animal: ");
						idAnim=read.nextInt();
						
						idCli--;
						idAnim--;
						
						listaCli.get(idCli).getAnimais().get(idAnim).getFicha().getConsultas().add(con);
						
						break;
					}
					
				}while(opc2!=0);
				break;
				
			case 5:
				do
				{
					System.out.println("1 - Inserir Vacina\n0 - Voltar\nInsira a opção: ");
					opc2 = read.nextInt();
					
					switch(opc2)
					{
					case 1:
						String data,nome;
						float preco;
						
						read.nextLine();
						
						System.out.println("Insira a data: ");
						data=read.nextLine();
						
						System.out.println("Insira o nome: ");
						nome=read.nextLine();
						
						System.out.println("Insira o preço: ");
						preco=read.nextFloat();
						
						Vacina vac = new Vacina(data, nome,preco);
						
						System.out.println("Insira o ID do cliente: ");
						idCli=read.nextInt();
						
						System.out.println("Insira o ID do animal: ");
						idAnim=read.nextInt();
						
						idCli--;
						idAnim--;
						
						listaCli.get(idCli).getAnimais().get(idAnim).getFicha().getVacinas().add(vac);
						
						break;
					}
					
				}while(opc2!=0);
				break;
			}
			
		}while(opc!=0);
		
	}

}
