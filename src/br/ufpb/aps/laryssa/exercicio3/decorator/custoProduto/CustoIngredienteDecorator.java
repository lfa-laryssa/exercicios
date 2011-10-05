package br.ufpb.aps.laryssa.exercicio3.decorator.custoProduto;

public class CustoIngredienteDecorator extends CalculadorCustoDecorator {

	private Double preco;

	public CustoIngredienteDecorator(CalculadorCusto componente) {
		super(componente);
	}
	
	public Double calcularCusto() {	
		return super.componente.calcularCusto() + this.getPreco();
	}

	
	
// gets e sets
	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double valor) {
		this.preco = valor;
	}
}
