package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

public class ValidadorNumerico implements Validador{
	
	public ValidadorNumerico(){	}
	
	public void validar(String valor) throws ValorInvalidoException {
//verifica se tem letras
		for (int i = 0; i < valor.length(); i++){
			if(Character.isLetter(valor.charAt(i)))
				throw new ValorInvalidoException("O campo deve conter apenas nu´meros");
		}
	}
}
