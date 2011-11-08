package miniTeste4;

import java.util.LinkedList;
import java.util.List;

public class MistoQuenteTemplate implements MontadorTemplate{
	private List<Ingrediente> ingredientes;
	private String misto;
	
	public MistoQuenteTemplate(){
		this.setIngredientes(new LinkedList<Ingrediente>());
		this.misto = "";
	}
	
	public void coletarIngredientes(){
		getIngredientes();
	}
	
	public void montarSanduiche(){
		for(Ingrediente i : ingredientes){
			misto += i.getNome() + "; ";
		}
	}
	
	public void esquentar(){
		System.out.println("O misto esta pronto e tem: " + misto);
	}
	
	public void addIngrediente(Ingrediente i){
		ingredientes.add(i);
	}

	
// gets e sets
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
}