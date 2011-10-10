package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

import java.util.LinkedList;
import java.util.List;


public class FormularioFacade {
	private List<Formulario> listFormulario;
	private Formulario formulario;

	public FormularioFacade(){
		this.listFormulario = new LinkedList<Formulario>();
	}
	
	public void listarCadastro() {
		for(Campo c: formulario.getListCampos()){
			System.out.print(c.getLabel()+": ");
			for(int i = 0; i < c.getListValor().size(); i++)
				System.out.print(c.getListValor().get(i)+"\n");
		}
	}
	
	public List<Campo> getCampos() {
		return formulario.getListCampos();
	}
	
	

	
// gets e sets
	public Formulario getFormulario() {
		return formulario;
	} 

	public void setFormulario(Formulario formulario) {
		this.formulario = formulario;
		listFormulario.add(formulario);
	}

	public List<Formulario> getListFormulario() {
		return listFormulario;
	}

	public void setListFormulario(List<Formulario> listFormulario) {
		this.listFormulario = listFormulario;
	}
}