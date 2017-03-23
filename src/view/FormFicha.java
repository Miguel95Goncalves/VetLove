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
		
		do
		{
			System.out.println("1 - Inserir Consulta\n2 - Inserir Vacina\n0 - Voltar\nInsira a opção: ");
			opc = read.nextInt();
			
			switch(opc)
			{
			case 1:
				
				read.nextLine();
				
				System.out.println("Insira a data: ");
				data=read.next();
				
				System.out.println("Insira a descricao: ");
				descricao=read.next();
				
				Consulta con = new Consulta(data, descricao);
				
				read.nextLine();
				
				System.out.println("Insira o ID do cliente: ");
				idCli=read.nextInt();
				
				System.out.println("Insira o ID do animal: ");
				idAnim=read.nextInt();
				
				idCli--;
				idAnim--;
				
				new GestaoFicha().addConsulta(listaCli, idCli, idAnim,con);
				
				break;
				
			case 2:
				float preco;
				
				read.nextLine();
				
				System.out.println("Insira a data: ");
				data=read.nextLine();
				
				System.out.println("Insira o nome: ");
				nome=read.nextLine();
				
				System.out.println("Insira o preço: ");
				preco=read.nextFloat();
				
				Vacina vac = new Vacina(data, nome,preco);
				
				read.nextLine();
				
				System.out.println("Insira o ID do cliente: ");
				idCli=read.nextInt();
				
				System.out.println("Insira o ID do animal: ");
				idAnim=read.nextInt();
				
				idCli--;
				idAnim--;
				
				new GestaoFicha().addVacina(listaCli, idCli, idAnim,vac);
				
				break;
			}
			
		}while(opc!=0);
	}
}
