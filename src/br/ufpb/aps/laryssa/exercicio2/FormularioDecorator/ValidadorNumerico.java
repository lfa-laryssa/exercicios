package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

public class ValidadorNumerico implements Validador{
	private int tamMax;
	private int tamMin;
	
	public ValidadorNumerico(int min, int max){
		this.tamMax = max;
		this.tamMin = min;
	}
	
	public void validar(String valor) throws ValorInvalidoException {
//verifica se tem letras
		for (int i = 0; i < valor.length(); i++){
			if(Character.isLetter(valor.charAt(i)))
				throw new ValorInvalidoException("O campo deve conter apenas nu´meros");
		}

		int v = Integer.parseInt(valor);
		if(v < tamMin)
			throw new ValorInvalidoException("O valor minimo e´: " + tamMin);
		
		if(v > tamMax)
			throw new ValorInvalidoException("O valor ma´ximo e´: " + tamMax);
		
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
