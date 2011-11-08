package miniTeste4_TemplateMethod;

public class MikeDonalds {
	
	public static void main(String[] args) {
		Ingrediente q1 = new Ingrediente("queijo");
		Ingrediente q2 = new Ingrediente("presunto");
		Ingrediente q3 = new Ingrediente("pao");
		
		MistoQuenteTemplate mqt = new MistoQuenteTemplate();
		mqt.addIngrediente(q1);
		mqt.addIngrediente(q2);
		mqt.addIngrediente(q3);
		
		MontadorSanduiche ms = new MontadorSanduiche();
		ms.montarSanduiche(mqt);
		
		Ingrediente q4 = new Ingrediente("carneHamburgue");
		Ingrediente q5 = new Ingrediente("salada");
		Ingrediente q6 = new Ingrediente("paoBola");
		
		HamburgueTamplate h = new HamburgueTamplate();
		h.addIngrediente(q1);
		h.addIngrediente(q5);
		h.addIngrediente(q4);
		h.addIngrediente(q6);
	
		ms.montarSanduiche(h);
	}

}
