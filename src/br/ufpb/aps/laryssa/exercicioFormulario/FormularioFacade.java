package br.ufpb.aps.laryssa.exercicioFormulario;

import java.util.LinkedList;
import java.util.List;

public class FormularioFacade {
	private List<Formulario> listFormulario;
	private Formulario formulario;

	public FormularioFacade(){
		this.listFormulario = new LinkedList<Formulario>();
	}
	
	public void cadastrarFormulario(){
		this.formulario = new Formulario();
		formulario.addCampo(new Campo("Nome", "nome", new ValidadorTexto(30)));
		formulario.addCampo(new Campo("Email", "email", new ValidadorEmail(30)));
		formulario.addCampo(new Campo("Idade", "idade", new ValidadorNumerico(150, 1)));
		this.listFormulario.add(formulario);
	}
	
	public void listarCadastro() {
		for(int i = 0; i < listFormulario.size(); i++){
			System.out.println(listFormulario.get(i));
		}
	}
	
	
// gets e sets
	public Formulario getFormulario() {
		return formulario;
	}

	public void setFormulario(Formulario formulario) {
		this.formulario = formulario;
	}
}
