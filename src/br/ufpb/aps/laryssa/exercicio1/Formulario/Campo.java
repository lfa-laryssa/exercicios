package br.ufpb.aps.laryssa.exercicio1.Formulario;

import java.util.LinkedList;
import java.util.List;

public class Campo {
	private Validador validador;
	private String label;
	private String id;
	private String valor;
	private String erro;
	private List<String> listValor;
	
	public Campo(String label, String id, Validador validador){
		this.label = label;
		this.id = id;
		this.validador = validador;
		this.listValor = new LinkedList<String>();
	}
	
	public boolean validar(){
		try{
			validador.validar(this.valor);
			return true;
		}catch(ValorInvalidoException e){
			this.setErro(e.getMessage());
			return false;
		}
	}

	
	
// gets e sets	
	public Validador getValidador() {
		return validador;
	}
	public void setValidador(Validador validador) {
		this.validador = validador;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		listValor.add(valor);
		this.valor = valor;
	}

	public List<String> getListValor() {
		return listValor;
	}

	public void setListValor(List<String> listValor) {
		this.listValor = listValor;
	}
}