package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

public class ValidadorIdade implements Validador{
	private int idMax;
	private int idMin;
	
	public ValidadorIdade(int min, int max){
		this.idMax = max;
		this.idMin = min;
	}
	
	public void validar(String valor) throws ValorInvalidoException {
//verifica se tem letras
		for (int i = 0; i < valor.length(); i++){
			if(Character.isLetter(valor.charAt(i)))
				throw new ValorInvalidoException("O campo deve conter apenas nu´meros");
		}
		int v = Integer.parseInt(valor);
		if(v < idMin)
			throw new ValorInvalidoException("O valor minimo e´: " + idMin);
		
		if(v > idMax)
			throw new ValorInvalidoException("O valor ma´ximo e´: " + idMax);
	}
}
