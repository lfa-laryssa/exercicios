package miniTeste5_Singleton;

public class Documento {

	private String nome;
	
	public Documento(String nome){
		this.setNome(nome);
	}

	
// gets sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
}