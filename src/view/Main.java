package view;

import model.Cliente;
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
			System.out.println("1 - Cliente\n2 - Animal\n3 - Ficha\n4 - Consulta\n0 - Sair\nInsira a opção: ");
			opc=read.nextInt();
			
			switch(opc)
			{
			case 1:
				do
				{
					System.out.println("1 - Inserir Cliente\n2 - Listar Clientes\n3 - Voltar\nInsira a opção: ");
					opc2=read.nextInt();
					
					switch(opc2)
					{
					case 1:
						new GestaoCliente().addCliente(listaCli);
						break;
						
					case 2:
						new GestaoCliente().listarClientes(listaCli);
						break;
					}
				}while(opc2!=3);
				break;
				
			case 2:
				
				break;
			}
			
		}while(opc!=0);
		
	}

}
