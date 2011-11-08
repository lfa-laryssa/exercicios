package miniTeste3_FactoryMethod;

import java.util.LinkedList;
import java.util.List;

public class JanelaWin implements Janela {
	private List<Object> componente;
	
	public JanelaWin(){
		this.componente = new LinkedList<Object>();
	}
	
	@Override
	public void add(Object obj){
		componente.add(obj);
	}
	
	
// gets e sets
	public List<Object> getComponente() {
		return componente;
	}
	public void setComponente(List<Object> objetos) {
		this.componente = objetos;
	}
}