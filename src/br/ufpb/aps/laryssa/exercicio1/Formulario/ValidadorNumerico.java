package br.ufpb.aps.laryssa.exercicio1.Formulario;

public class ValidadorNumerico implements Validador{
	private int tamMax;
	private int tamMin;
	
	public ValidadorNumerico(int max, int min){
		this.tamMax = max;
		this.tamMin = min;
	}
	
	public void validar(String valor) throws ValorInvalidoException {
		char caracter = 0;
		for(int i = 0; i < valor.length(); i++)
			caracter = valor.charAt(i);
			if (Character.isLetter(caracter) && Character.isLowerCase(caracter)) //verifica se esta dentro do intervalo de a..z  
				throw new ValorInvalidoException("Idade deve conter apenas nu´meros");
		int v = Integer.parseInt(valor);
		if(v < tamMin)
			throw new ValorInvalidoException("Valor Invalido");
		if(v > tamMax)
			throw new ValorInvalidoException("O valor ma´ximo de Idade e´ "+tamMax);
		System.out.println("Ok");
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
