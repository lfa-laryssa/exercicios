package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

public class SenhaNumericaDecorator extends ValidadorDecorator {

	public SenhaNumericaDecorator(Validador componente) {
		super(componente);
	}
	

	public void validar(String valor) throws ValorInvalidoException {
		super.validar(valor);
		int cont = 0;
//verifica se tem numeros iguais
		for (int i = 0; i < valor.length(); i++){
			if((valor.charAt(0)) == (valor.charAt(i)))
				cont += 1;
		}
		if(cont >= 2){
			throw new ValorInvalidoException("Deve possuir nu�meros diferentes");
		}
	}
}