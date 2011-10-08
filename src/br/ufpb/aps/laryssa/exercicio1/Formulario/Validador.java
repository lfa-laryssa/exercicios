package br.ufpb.aps.laryssa.exercicio1.Formulario;

public interface Validador {
	
	public void validar(String valor) throws ValorInvalidoException;
}
