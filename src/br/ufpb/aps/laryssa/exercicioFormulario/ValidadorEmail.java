package br.ufpb.aps.laryssa.exercicioFormulario;

public class ValidadorEmail implements Validador{
	private int tamMax;
	
	public ValidadorEmail(int max){
		this.tamMax = max;
	}
	
	public void validar(String valor) throws ValorInvalidoException {
		if(valor.indexOf("@") < 0)
			throw new ValorInvalidoException("ERRO: E-mail invalido");
		
		//else
		//fazer a comparacao se tem numero
		//throw new ValorInvalidoException("ERRO: E-mail invalido");
	}

	
	
// gets e sets
	public int getTamMax() {
		return tamMax;
	}

	public void setTamMax(int tamMax) {
		this.tamMax = tamMax;
	}
}
