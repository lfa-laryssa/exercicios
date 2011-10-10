package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

public class TamanhoDecorator extends ValidadorDecorator {
	private int tamMax;
	private int tamMin;
	
	public TamanhoDecorator(int min, int max, Validador componente) {
		super(componente);
		this.tamMax = max;
		this.tamMin = min;

	}

	public void validar(String valor) throws ValorInvalidoException {
		super.validar(valor);
		if(valor.length() > tamMax)
			throw new ValorInvalidoException("O ma´ximo de caracteres e´: "+ tamMax);
		if(valor.length() < tamMin)
			throw new ValorInvalidoException("O minimo de caracteres e´: "+ tamMin);
	}

	
	
	
//gets e sets
	public int getTamMax() {
		return tamMax;
	}

	public void setTamMax(int tamMax) {
		this.tamMax = tamMax;
	}

	public int getTamMin() {
		return tamMin;
	}

	public void setTamMin(int tamMin) {
		this.tamMin = tamMin;
	}
}