package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

public class SenhaTextoDecorator extends ValidadorDecorator {

	public SenhaTextoDecorator(Validador componente) {
		super(componente);
	}
	
	public void validar(String valor) throws ValorInvalidoException {
		ValidadorSenha vs = new ValidadorSenha();
		vs.validar(valor);
		
//verifica se tem mais que 3 numero
		int cont = 0;
		for (int i = 0; i < valor.length(); i++){
			if(Character.isDigit(valor.charAt(i)))
				cont += 1;
		}
		if(cont < 3)
			throw new ValorInvalidoException("O campo deve conter no minimo 3 nu´meros");
		System.out.println("> OK");
	}
}