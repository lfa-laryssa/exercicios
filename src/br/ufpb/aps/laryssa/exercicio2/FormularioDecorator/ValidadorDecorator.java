package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

public class ValidadorDecorator implements Validador {
	protected Validador componente;
	
	public ValidadorDecorator(Validador componente){
		this.componente = componente;
	}
	
	public void validar(String valor) throws ValorInvalidoException {
		this.componente.validar(valor);
	}
	
	
	
// gets e sets
	public Validador getComponente() {
		return componente;
	}

	public void setComponente(Validador componente) {
		this.componente = componente;
	}
}