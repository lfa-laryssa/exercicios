package br.ufpb.aps.laryssa.exercicioFormulario;

public interface Validador {
	
	public void validar(String valor) throws ValorInvalidoException;
}
