package br.ufpb.aps.laryssa.exercicio3.decorator.custoProduto;

public class CustoFuncionarioDecorator extends CalculadorCustoDecorator {

	private Double salario;
	
	public CustoFuncionarioDecorator(CalculadorCusto componente) {
		super(componente);
	}
	
	public Double calcularCusto() {	
		return super.componente.calcularCusto() + this.getSalario();
	}

	
	
// gets e sets
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double valor) {
		this.salario = valor;
	}
}
