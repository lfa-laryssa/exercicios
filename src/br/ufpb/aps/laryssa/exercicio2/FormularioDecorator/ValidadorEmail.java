package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

public class ValidadorEmail implements Validador{
	
	public ValidadorEmail(){	}
	
	public void validar(String valor) throws ValorInvalidoException {
//verifica se tem "@"
		if((valor.indexOf("@") < 0))
			throw new ValorInvalidoException("E-mail Invalido, nao contem '@'");

//verifica se começa com "@"
		if((valor.indexOf("@") >= 0) && (valor.indexOf("@") < 1))
			throw new ValorInvalidoException("E-mail Invalido, nao pode comecar com '@'");
		
//verifica se termina com "@"
	    if('@' == (valor.charAt(valor.length()-1)))
	    	throw new ValorInvalidoException("E-mail Invalido, nao pode terminar com '@'");
	}
}
