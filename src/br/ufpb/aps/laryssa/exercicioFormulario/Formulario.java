package br.ufpb.aps.laryssa.exercicioFormulario;

import java.util.LinkedList;
import java.util.List;

public class Formulario {
	private List<Campo> campos;
	
	public Formulario(){
		this.campos = new LinkedList<Campo>();
	}

	public void addCampo(Campo campo){
		this.campos.add(campo);
		System.out.println("Ok");
	}
}