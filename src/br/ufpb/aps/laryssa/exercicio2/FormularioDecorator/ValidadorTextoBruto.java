package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

public class ValidadorTextoBruto implements Validador{

	public ValidadorTextoBruto(){

	}
	
	public void validar(String valor) throws ValorInvalidoException {
//verifica se é uma string
		if(!valor.matches(valor))
			System.out.println("O valor nao e´ um texto");
	}
}