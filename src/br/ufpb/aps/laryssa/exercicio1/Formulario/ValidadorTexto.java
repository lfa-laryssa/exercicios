package br.ufpb.aps.laryssa.exercicio1.Formulario;

public class ValidadorTexto implements Validador{
	private int tamMax;
	
	public ValidadorTexto(int max){
		this.setTamMax(max);
	}
	
	public void validar(String valor) throws ValorInvalidoException {
		if(valor.length() > tamMax)
			throw new ValorInvalidoException("Nome deve ter no ma´ximo "+ tamMax +" caracteres");
		String nome = "0123456789";
		for(int x = 0; x < valor.length(); x++){	//verifica se tem numero
			for(int y = 0; y < nome.length(); y++){
				if((valor.charAt(x)) == (nome.charAt(y)))
					throw new ValorInvalidoException("O Nome e´ um campo texto");
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
