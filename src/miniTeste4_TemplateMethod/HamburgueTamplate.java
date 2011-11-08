package miniTeste4_TemplateMethod;

import java.util.LinkedList;
import java.util.List;

public class HamburgueTamplate implements MontadorTemplate {
	private List<Ingrediente> ingredientes;
	private String hamburgue;
	
	public HamburgueTamplate(){
		this.setIngredientes(new LinkedList<Ingrediente>());
		this.hamburgue = "";
	}
	
	public void coletarIngredientes(){
		getIngredientes();
	}
	
	public void montarSanduiche(){
		for(Ingrediente i : ingredientes){
			hamburgue += i.getNome() + "; ";
		}
	}
	
	public void esquentar(){
		System.out.println("O hamburgue esta pronto e tem: " + hamburgue);
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
