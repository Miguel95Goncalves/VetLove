package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Consulta;
import model.Ficha;
import model.Vacina;

public class GestaoFicha {
	public void addConsulta(ArrayList<Cliente> listaCli,int idCli,int idAnim,Consulta con){
		
		if(listaCli.get(idCli).getAnimais().get(idAnim).getFicha() == null) //Se o animal ainda não tiver ficha
		{
			Ficha f = new Ficha();
			listaCli.get(idCli).getAnimais().get(idAnim).setFicha(f);
		}
		
		listaCli.get(idCli).getAnimais().get(idAnim).getFicha().getConsultas().add(con);
	}
	
	public void addVacina(ArrayList<Cliente> listaCli,int idCli,int idAnim,Vacina vac){
		
		if(listaCli.get(idCli).getAnimais().get(idAnim).getFicha() == null) //Se o animal ainda não tiver ficha
		{
			Ficha f = new Ficha();
			listaCli.get(idCli).getAnimais().get(idAnim).setFicha(f);
		}
		
		listaCli.get(idCli).getAnimais().get(idAnim).getFicha().getVacinas().add(vac);
	}
}
