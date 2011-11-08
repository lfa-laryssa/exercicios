package miniTeste3_FactoryMethod;

public class GerenciadorJanela {

	private JanelaFactory jf;
	
	public void setJf(JanelaFactory jf) {
		this.jf = jf;
	}

	public Janela criarJanela(){
		Janela j = jf.criaJanela();
		j.add(jf.criaBarraDeTitulo());
		BarraMenu menu = jf.criaBarraMenu();
		menu.add(jf.criaItemMenu("Arquivo"));
		menu.add(jf.criaItemMenu("Editar"));
		j.add(menu);
		return j;
	}
}