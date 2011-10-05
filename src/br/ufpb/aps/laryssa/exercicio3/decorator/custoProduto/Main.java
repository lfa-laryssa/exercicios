package br.ufpb.aps.laryssa.exercicio3.decorator.custoProduto;

import br.ufpb.aps.laryssa.exercicio3.decorator.custoProduto.Produto;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Produto file = new Produto("File");
		
		CustoAquisicao custoBase = new CustoAquisicao(15.0);
		
		CustoFuncionarioDecorator func = new CustoFuncionarioDecorator(custoBase);
		
		CustoIngredienteDecorator sal = new CustoIngredienteDecorator(func);
		sal.setPreco(0.30);
		
		CustoIngredienteDecorator oleo = new CustoIngredienteDecorator(sal);
		oleo.setPreco(5.0);
		
		CustoIngredienteDecorator cebola = new CustoIngredienteDecorator(oleo);
		cebola.setPreco(0.75);
		
		file.setCalculadorCusto(cebola);
		
		// essas duas linhas tambem são para implementar?
		//Produto feijao = new Produto("Televisao");
		//feijao.setCalculadorCusto(new ProdutoEletronicoCalculadorCusto());
		
		System.out.println(file.calcularCusto());

	}

}
