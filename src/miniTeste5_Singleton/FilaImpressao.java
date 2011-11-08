package miniTeste5_Singleton;

public class FilaImpressao {

	private static FilaImpressao singleton;
	
	private FilaImpressao(){ }
	
	public static FilaImpressao getInstance(){
		if(singleton == null)
			singleton = new FilaImpressao();
		return singleton;
	}
	
	public void imprimir(Documento d){
		System.out.println(d.getNome());
	}

	
// gets e sets
	public static FilaImpressao getSingleton() {
		return singleton;
	}
	public static void setSingleton(FilaImpressao singleton) {
		FilaImpressao.singleton = singleton;
	}
}