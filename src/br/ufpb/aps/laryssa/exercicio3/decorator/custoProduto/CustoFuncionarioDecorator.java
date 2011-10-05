package br.ufpb.aps.laryssa.exercicio3.decorator.custoProduto;

public class CustoFuncionarioDecorator extends CalculadorCustoDecorator {

	private Double valor;
	
	public CustoFuncionarioDecorator(CalculadorCusto componente) {
		super(componente);
	}
	
	public Double calcularCusto() {	
		return super.componente.calcularCusto() + this.getValor();
	}

	
	
// gets e sets
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
