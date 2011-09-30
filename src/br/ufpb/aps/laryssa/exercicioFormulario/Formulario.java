package br.ufpb.aps.laryssa.exercicioFormulario;

import java.util.LinkedList;
import java.util.List;

public class Formulario {
	private List<Campo> listCampos;
	private Campo campo;
	
	public Formulario(){
		this.listCampos = new LinkedList<Campo>();
	}

	public void addCampo(Campo campo){
		this.listCampos.add(campo);
	}

	
// gets e sets
	public Campo getCampo() {
		return campo;
	}

	public void setCampo(Campo campo) {
		this.campo = campo;
	}
}