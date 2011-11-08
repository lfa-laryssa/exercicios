package miniTeste3_FactoryMethod;

public class ItemMenuWin implements ItemMenu {
	
	private String nome;
	
	public ItemMenuWin(String nome){
		this.nome = nome;
	}
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void funcao() {
		System.out.println("O item "+ getNome() +" serve para o Windows");
	}
}