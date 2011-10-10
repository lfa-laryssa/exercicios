package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

public class ValidadorEmail implements Validador{
	private int tamMax;
	
	public ValidadorEmail(int max){
		this.tamMax = max;
	}
	
	public void validar(String valor) throws ValorInvalidoException {
		if(valor.length() > tamMax)
			throw new ValorInvalidoException("O valor ma´ximo do E-mail e´: " + tamMax);
		
//verifica se tem "@"
		if((valor.indexOf("@") < 0))
			throw new ValorInvalidoException("E-mail Invalido, nao contem '@'");

//verifica se começa com "@"
		if((valor.indexOf("@") >= 0) && (valor.indexOf("@") < 1))
			throw new ValorInvalidoException("E-mail Invalido, nao pode comecar com '@'");
		
//verifica se termina com "@"
	    if('@' == (valor.charAt(valor.length()-1)))
	    	throw new ValorInvalidoException("E-mail Invalido, nao pode terminar com '@'");

		System.out.println("> Ok");
	}

	
	
// gets e sets
	public int getTamMax() {
		return tamMax;
	}

	public void setTamMax(int tamMax) {
		this.tamMax = tamMax;
	}
}
