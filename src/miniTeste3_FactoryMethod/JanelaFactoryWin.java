package miniTeste3_FactoryMethod;

public class JanelaFactoryWin implements JanelaFactory {

	public Janela criaJanela() {
		Janela j = new JanelaWin();
		System.out.println("JanelaWin criada com sucesso");
		return j;
	}

	public BarraMenu criaBarraMenu() {
		BarraMenu bm = new BarraMenuWin();
		System.out.println("BarraMenuWin criado com sucesso");
		return bm;
	}

	public ItemMenu criaItemMenu(String nome) {
		ItemMenu im = new ItemMenuWin(nome);
		System.out.println("ItemMenuWin: "+im.getNome()+" criado com sucesso");
		return im;
	}
	
	public BarraDeTitulo criaBarraDeTitulo(){
		BarraDeTitulo bt = new BarraDeTituloWin();
		System.out.println("BarraDeTituloWin criado com sucesso");
		return bt;
	}
}
