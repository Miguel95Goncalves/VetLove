package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestaoAnimal;
import model.Animal;
import model.Cliente;

public class FormAnimal {
	
	Scanner read=(new Scanner(System.in));
	
	public void menuAnimal(ArrayList<Cliente> listaCli){
		int opc;
		
		if(listaCli.size()==0) //Se não existir clientes volta ao menu anterior
		{
			System.out.println("Precisa Inserir Clientes Primeiro!");
			opc=0;
		}
		else //Se houver clientes
		{
			do
			{
				System.out.println("1 - Inserir animal\n0 - Voltar\nInsira a opcao: ");
				opc = read.nextInt();
				
				switch(opc)
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
					
					do
					{
						System.out.println("Insira o ID do cliente a que pertence o animal: ");
						id = read.nextInt();
					}while(id<1 || id>listaCli.size());
					
					
					new GestaoAnimal().addAnimal(listaCli, id, classificacao, raca, data_nasc);
					break;
				}
				
			}while(opc!=0);
		}
		
	}
}
