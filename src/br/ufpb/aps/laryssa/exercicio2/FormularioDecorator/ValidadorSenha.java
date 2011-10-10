package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

public class ValidadorSenha implements Validador {
	private int tamMax;
	private int tamMin;
	
	public ValidadorSenha() {
		this.tamMax = 100;
		this.tamMin = 8;

	}

	public void validar(String valor) throws ValorInvalidoException {
		if(valor.length() > tamMax)
			throw new ValorInvalidoException("O ma´ximo de caracteres de senha e´: "+ tamMax);

		if(valor.length() < tamMin)
			throw new ValorInvalidoException("O minimo de caracteres de senha e´: "+ tamMin);
	}
}