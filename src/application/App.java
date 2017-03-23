package application;

import model.*;
import view.*;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	static Scanner read=(new Scanner(System.in));
	static ArrayList<Cliente> listaCli = new ArrayList<Cliente>();
	
	public static void main(String[] args) {
		int opc;
		
		do
		{
			System.out.println("1 - Cliente\n2 - Animal\n3 - Ficha\n0 - Sair\nInsira a opção: ");
			opc=read.nextInt();
			
			switch(opc)
			{
			case 1:
					new FormCliente().menuCliente(listaCli);
				break;
				
			case 2:
				new FormAnimal().menuAnimal(listaCli);
				break;
				
			case 3:
				new FormFicha().menuFicha(listaCli);
				break;
			}
		}while(opc!=0);
	}
}
