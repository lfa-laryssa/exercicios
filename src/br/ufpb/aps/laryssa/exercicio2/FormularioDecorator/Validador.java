package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

public interface Validador {
	
	public void validar(String valor) throws ValorInvalidoException;
}
