package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

public class TextoPuroDecorator extends ValidadorDecorator {

	public TextoPuroDecorator(Validador componente) {
		super(componente);
	}
	
	public void validar(String valor) throws ValorInvalidoException {
		super.validar(valor);
//verifica se contem digito
		for (int i = 0; i < valor.length(); i++){
			if(Character.isDigit(valor.charAt(i)))
				throw new ValorInvalidoException("O campo nao deve conter nu´meros");
		}
	}

}
