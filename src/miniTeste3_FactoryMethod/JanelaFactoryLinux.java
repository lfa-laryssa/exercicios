package miniTeste3_FactoryMethod;

public class JanelaFactoryLinux implements JanelaFactory {

	public Janela criaJanela() {
		Janela j = new JanelaLinux();
		System.out.println("JanelaLinux criada com sucesso");
		return j;
	}

	public BarraMenu criaBarraMenu() {
		BarraMenu bm = new BarraMenuLinux();
		System.out.println("BarraMenuLinux criado com sucesso");
		return bm;
	}

	public ItemMenu criaItemMenu(String nome) {
		ItemMenu im = new ItemMenuLinux(nome);
		System.out.println("ItemMenuLinux: "+im.getNome()+" criado com sucesso");
		return im;
	}
	
	public BarraDeTitulo criaBarraDeTitulo(){
		BarraDeTitulo bt = new BarraDeTituloLinux();
		System.out.println("BarraDeTituloLinux criado com sucesso");
		return bt;
	}
}