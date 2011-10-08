package br.ufpb.aps.laryssa.exercicio1.Formulario;

public class ValidadorEmail implements Validador{
	private int tamMax;
	
	public ValidadorEmail(int max){
		this.tamMax = max;
	}
	
	public void validar(String valor) throws ValorInvalidoException {
		if(valor.length() > tamMax)
			throw new ValorInvalidoException("O valor ma´ximo do E-mail e´: " + tamMax);
		if(valor.indexOf("@") < 0)
			throw new ValorInvalidoException("E-mail invalido");
		String nome = "0123456789";
		for(int x = 0; x < valor.length(); x++){	//verifica se tem numero
			for(int y = 0; y < nome.length(); y++){
				if((valor.charAt(x)) == (nome.charAt(y)))
					throw new ValorInvalidoException("E-mail invalido.");
			}
		}
		System.out.println("Ok");
	}

	
	
// gets e sets
	public int getTamMax() {
		return tamMax;
	}

	public void setTamMax(int tamMax) {
		this.tamMax = tamMax;
	}
}
