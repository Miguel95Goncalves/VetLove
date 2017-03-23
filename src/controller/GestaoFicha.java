package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Consulta;
import model.Vacina;

public class GestaoFicha {
	public void addConsulta(ArrayList<Cliente> listaCli,int idCli,int idAnim,Consulta con){
		listaCli.get(idCli).getAnimais().get(idAnim).getFicha().getConsultas().add(con);
	}
	
	public void addVacina(ArrayList<Cliente> listaCli,int idCli,int idAnim,Vacina vac){
		listaCli.get(idCli).getAnimais().get(idAnim).getFicha().getVacinas().add(vac);
	}
}
