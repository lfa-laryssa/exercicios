package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

public class ValidadorTexto implements Validador{
	private int tamMax;
	private int tamMin;

	public ValidadorTexto(int min, int max){
		this.setTamMax(max);
		this.setTamMin(min);
	}
	
	public void validar(String valor) throws ValorInvalidoException {
		if(valor.length() > tamMax)
			throw new ValorInvalidoException("O ma´ximo de caracteres e´: "+ tamMax);

		if(valor.length() < tamMin)
			throw new ValorInvalidoException("O minimo de caracteres e´: "+ tamMin);

//verifica se tem numero
		for (int i = 0; i < valor.length(); i++){
			if(Character.isDigit(valor.charAt(i)))
				throw new ValorInvalidoException("O campo deve conter apenas texto");

		}
		System.out.println("> Ok");
	}

	
	
// gets e sets
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