package br.ufpb.aps.laryssa.exercicio3.decorator.custoProduto;

public class CalculadorCustoDecorator implements CalculadorCusto {

	protected CalculadorCusto componente;
	
	public CalculadorCustoDecorator(CalculadorCusto componente){
		this.componente = componente;
	}
	
	public Double calcularCusto() {	
		return null;
	}

	
	
// gest e sets
	public CalculadorCusto getComponente() {
		return componente;
	}

	public void setComponente(CalculadorCusto componente) {
		this.componente = componente;
	}
}
