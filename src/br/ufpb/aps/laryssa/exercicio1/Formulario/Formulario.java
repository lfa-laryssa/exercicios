package br.ufpb.aps.laryssa.exercicio1.Formulario;

import java.util.LinkedList;
import java.util.List;


public class Formulario {
	private List<Campo> listCampos;
	
	public Formulario(){
		this.listCampos = new LinkedList<Campo>();
	}

	public void addCampo(Campo campo){
		this.listCampos.add(campo);
	}




// gets e sets
	public List<Campo> getListCampos() {
		return listCampos;
	}

	public void setListCampos(List<Campo> listCampos) {
		this.listCampos = listCampos;
	}
}