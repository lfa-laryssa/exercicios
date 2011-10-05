package br.ufpb.aps.laryssa.exercicio3.decorator.custoProduto;

public class CustoAquisicao implements CalculadorCusto {
	
	private Double valor;
	
	public CustoAquisicao(Double valor){
		this.setValor(valor);
	}
	
	public Double calcularCusto() {
		return this.valor;
	}

	
	
// gets e sets
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
