package miniTeste5_Singleton;

public class Main {

	public static void main(String[] args) {
	
		Documento doc = new Documento("Texto do Word");
		Documento doc2 = new Documento("Imagem");
		
		FilaImpressao f = FilaImpressao.getInstance();
		f.imprimir(doc);
		f.imprimir(doc2);
		

//Teste para mostrar que não importa o quando instancio a classe FilaImpressao,
// sempre vai ser a mesma instancia
		System.out.println(f.getSingleton());
		
		FilaImpressao f2 = FilaImpressao.getInstance();
		System.out.println(f2.getSingleton());
		
		f.setSingleton(f2);
		System.out.println(f.getSingleton());
	}
}