package miniTeste3_FactoryMethod;

public class ItemMenuLinux implements ItemMenu {
	
	private String nome;
	
	public ItemMenuLinux(String nome){
		this.nome = nome;
	}
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void funcao() {
		System.out.println("O item "+ getNome() +" serve para o Linux");
	}
}