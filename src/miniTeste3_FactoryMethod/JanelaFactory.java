package miniTeste3_FactoryMethod;

public interface JanelaFactory {  // guarda todos os factorys responsaveis por criar instancias	
	
	public Janela criaJanela();
	public BarraMenu criaBarraMenu();
	public ItemMenu criaItemMenu(String nome);
	public BarraDeTitulo criaBarraDeTitulo();

}
