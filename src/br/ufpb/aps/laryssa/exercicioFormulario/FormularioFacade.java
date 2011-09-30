package br.ufpb.aps.laryssa.exercicioFormulario;

import java.util.LinkedList;
import java.util.List;

public class FormularioFacade {
	private List<Formulario> listFormulario;
	private List<String> listValorCampo;
	private Formulario formulario;
	private Campo campo;

	public FormularioFacade(){
		this.listFormulario = new LinkedList<Formulario>();
		this.listValorCampo = new LinkedList<String>();
	}
	
	public void criarFormulario(){
		this.formulario = new Formulario();
		formulario.addCampo(new Campo("Nome", "nome", new ValidadorTexto(30)));
		this.listFormulario.add(formulario);
		formulario.addCampo(new Campo("Email", "email", new ValidadorEmail(30)));
		this.listFormulario.add(formulario);
		formulario.addCampo(new Campo("Idade", "idade", new ValidadorNumerico(150, 1)));
		this.listFormulario.add(formulario);
	}
	
	public void listarCadastro() {
		for(int i = 0; i < listFormulario.size(); i++){
			System.out.println(listValorCampo.get(i));
		}
	}

	public void addValorCampo(String valor){
		listValorCampo.add(valor);
	}
	

	
// gets e sets
	public Formulario getFormulario() {
		return formulario;
	}

	public void setFormulario(Formulario formulario) {
		this.formulario = formulario;
	}

	public List<String> getListValorCampo() {
		return listValorCampo;
	}

	public void setListValorCampo(List<String> listValorCampo) {
		this.listValorCampo = listValorCampo;
	}

	public Campo getCampo() {
		return campo;
	}

	public void setCampo(Campo campo) {
		this.campo = campo;
	}
}
