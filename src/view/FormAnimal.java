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
				
				Animal an = new Animal(classificacao,raca,data_nasc);
				
				System.out.println("Insira o ID do cliente a que pertence o animal: ");
				id = read.nextInt();
				
				id--;
				
				new GestaoAnimal().addAnimal(listaCli, id, an);
				break;
			}
			
		}while(opc!=0);
	}
}
