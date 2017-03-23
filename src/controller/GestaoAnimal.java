package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Animal;

public class GestaoAnimal {
	public void addAnimal(ArrayList<Cliente> listaCli,int id,String classificacao,String raca,String data_nasc){
		id--;
		
		listaCli.get(id).getAnimais().add(new Animal(classificacao,raca,data_nasc));
	}
}
