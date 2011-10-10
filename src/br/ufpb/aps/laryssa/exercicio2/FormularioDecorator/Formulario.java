package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

import java.util.LinkedList;
import java.util.List;


public class Formulario {
	private List<Campo> listCampos;
	private String nome;
	
	public Formulario(String nome){
		this.listCampos = new LinkedList<Campo>();
		this.nome = nome;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}