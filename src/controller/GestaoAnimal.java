package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Animal;

public class GestaoAnimal {
	public void addAnimal(ArrayList<Cliente> listaCli,int id,Animal an){
		listaCli.get(id).getAnimais().add(an);
	}
}
