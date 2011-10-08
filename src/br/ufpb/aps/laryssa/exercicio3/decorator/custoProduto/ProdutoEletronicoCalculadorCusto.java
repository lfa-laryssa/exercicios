package br.ufpb.aps.laryssa.exercicio3.decorator.custoProduto;

public class ProdutoEletronicoCalculadorCusto implements CalculadorCusto {
	private Double imposto;
	
	public ProdutoEletronicoCalculadorCusto(){
		this.imposto = this.getImposto();
	}
	
	public Double calcularCusto() {
		return this.imposto;
	}

	
	
// gets e sets
	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}

}
