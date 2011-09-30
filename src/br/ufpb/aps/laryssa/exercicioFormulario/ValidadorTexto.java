package br.ufpb.aps.laryssa.exercicioFormulario;

public class ValidadorTexto implements Validador{
	private int tamMax;
	
	public ValidadorTexto(int max){
		this.setTamMax(max);
	}
	
	public void validar(String valor) throws ValorInvalidoException {
		if(valor.length() > tamMax)
			throw new ValorInvalidoException("ERRO: Nome deve ter no máximo "+ tamMax +" caracteres");
		//fazer o teste de comparacao se tem numero no campo
			//throw new ValorInvalidoException("ERRO: O Nome é um campo texto");
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
