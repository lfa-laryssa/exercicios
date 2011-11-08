package miniTeste3_FactoryMethod;

public class BarraDeTituloLinux implements BarraDeTitulo {
	
	private String nome;
	
	@Override
	public String getNome() {
		return nome;
	}

	public void setNome(String n){
		this.nome = n;
	}
}
