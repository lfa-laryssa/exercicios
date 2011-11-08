package miniTeste3_FactoryMethod;

public class Main {

	public static void main(String[] args) {
		
		GerenciadorJanela gerenciador = new GerenciadorJanela();
		
		gerenciador.setJf(new JanelaFactoryWin());
		gerenciador.criarJanela();
		
		gerenciador.setJf(new JanelaFactoryLinux());
		gerenciador.criarJanela();
		
	}
}
