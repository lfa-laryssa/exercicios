package br.ufpb.aps.laryssa.exercicioFormulario;

public class ValidadorNumerico implements Validador{
	private int tamMax;
	private int tamMin;
	
	public ValidadorNumerico(int max, int min){
		this.tamMax = max;
		this.tamMin = min;
	}
	
	public void validar(String valor) throws ValorInvalidoException {
		try{
			int v = Integer.parseInt(valor);
			if(v < tamMin)
				throw new ValorInvalidoException("ERRO: Valor Invalido");
			if(v > tamMax)
				throw new ValorInvalidoException("ERRO: O valor máximo de Idade e´ "+tamMax);

			//fazer o teste se contem letras
			//if(v == )
				throw new ValorInvalidoException("ERRO: Idade deve conter apenas números");
		
		}catch(NumberFormatException e){
			throw new ValorInvalidoException("ERRO: O valor nao e´ um inteiro!");
		}
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
