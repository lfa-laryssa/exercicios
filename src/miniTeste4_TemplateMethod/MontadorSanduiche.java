package miniTeste4_TemplateMethod;

public class MontadorSanduiche {
	
	public void montarSanduiche(MontadorTemplate mt){
		mt.coletarIngredientes();
		mt.montarSanduiche();
		mt.esquentar();
	}
}
