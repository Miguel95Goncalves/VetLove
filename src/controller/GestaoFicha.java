package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Consulta;
import model.Ficha;
import model.Vacina;

public class GestaoFicha {
	public void addConsulta(ArrayList<Cliente> listaCli,int idCli,int idAnim,String data,String descricao){ //Adicionar Consulta
		idCli--;
		idAnim--;
		
		if(listaCli.get(idCli).getAnimais().get(idAnim).getFicha() == null) //Se o animal ainda não tiver ficha, cria uma
		{
			Ficha f = new Ficha();
			listaCli.get(idCli).getAnimais().get(idAnim).setFicha(f);
		}
		
		listaCli.get(idCli).getAnimais().get(idAnim).getFicha().getConsultas().add(new Consulta(data, descricao));
	}
	
	public void addVacina(ArrayList<Cliente> listaCli,int idCli,int idAnim,String data,String nome,float preco){ //Adicionar Vacina
		idCli--;
		idAnim--;
		
		if(listaCli.get(idCli).getAnimais().get(idAnim).getFicha() == null) //Se o animal ainda não tiver ficha
		{
			Ficha f = new Ficha();
			listaCli.get(idCli).getAnimais().get(idAnim).setFicha(f);
		}
		
		listaCli.get(idCli).getAnimais().get(idAnim).getFicha().getVacinas().add(new Vacina(data, nome,preco));
	}
}
