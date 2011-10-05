package br.ufpb.aps.laryssa.exercicio3.decorator.custoProduto;

import br.ufpb.aps.laryssa.exercicio3.decorator.custoProduto.CalculadorCusto;


public class Produto {
	
	private String nome;
	private String descricao;
	private CalculadorCusto calculador;
	
	public Produto(String nome){
		this.nome = nome;
	}
	
	public void setCalculadorCusto(CalculadorCusto calculador){
		this.calculador = calculador;
	}

	public Double calcularCusto(){
		return this.calculador.calcularCusto();
	}


	public String getDescricao() {
		return this.getNome();
	}
	
	
	
// gets e sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}