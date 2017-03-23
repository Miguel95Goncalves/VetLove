package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestaoFicha;
import model.Cliente;
import model.Consulta;
import model.Vacina;

public class FormFicha {
	
	Scanner read=(new Scanner(System.in));
	
	public void menuFicha(ArrayList<Cliente> listaCli){
		int idCli,idAnim,opc;
		String data,descricao,nome;
		
		if(listaCli.size()==0) //Se não existir clientes volta ao menu anterior
		{
			System.out.println("Precisa Inserir Clientes Primeiro!");
			opc=0;
		}
		else //Se houver clientes
		{
			do
			{
				System.out.println("1 - Inserir Consulta\n2 - Inserir Vacina\n0 - Voltar\nInsira a opção: ");
				opc = read.nextInt();
				
				switch(opc)
				{
				case 1: //Inserir Consulta
					
					read.nextLine();
					
					System.out.println("Insira a data: ");
					data=read.next();
					
					System.out.println("Insira a descricao: ");
					descricao=read.next();
					
					read.nextLine();
					
					do
					{
						System.out.println("Insira o ID do cliente: ");
						idCli=read.nextInt();
					}while(idCli<1 || idCli>listaCli.size());
					
					do
					{
						System.out.println("Insira o ID do animal: ");
						idAnim=read.nextInt();
					}while(idAnim<1 || idAnim>listaCli.get(idCli).getAnimais().size());
					
					new GestaoFicha().addConsulta(listaCli, idCli, idAnim,data,descricao);
					
					break;
					
				case 2: //Inserir Vacina
					float preco;
					
					read.nextLine();
					
					System.out.println("Insira a data: ");
					data=read.nextLine();
					
					System.out.println("Insira o nome: ");
					nome=read.nextLine();
					
					System.out.println("Insira o preço: ");
					preco=read.nextFloat();
					
					read.nextLine();
					
					System.out.println("Insira o ID do cliente: ");
					idCli=read.nextInt();
					
					System.out.println("Insira o ID do animal: ");
					idAnim=read.nextInt();
					
					new GestaoFicha().addVacina(listaCli, idCli, idAnim,data,nome,preco);
					
					break;
				}
				
			}while(opc!=0);
		}

	}
}
