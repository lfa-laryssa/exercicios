package br.ufpb.aps.laryssa.exercicio1.Formulario;

import java.util.LinkedList;
import java.util.List;


public class FormularioFacade {
	private List<Formulario> listFormulario;
	private Formulario formulario;

	public FormularioFacade(){
		this.listFormulario = new LinkedList<Formulario>();
	}
	
	public void criarFormulario(){
		this.formulario = new Formulario();
		formulario.addCampo(new Campo("Nome", "nome", new ValidadorTexto(30)));
		formulario.addCampo(new Campo("Email", "email", new ValidadorEmail(30)));
		formulario.addCampo(new Campo("Idade", "idade", new ValidadorNumerico(150, 1)));
		this.listFormulario.add(formulario);
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
	}

	public List<Formulario> getListFormulario() {
		return listFormulario;
	}

	public void setListFormulario(List<Formulario> listFormulario) {
		this.listFormulario = listFormulario;
	}
}