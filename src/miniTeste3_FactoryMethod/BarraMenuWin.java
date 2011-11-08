package miniTeste3_FactoryMethod;

import java.util.LinkedList;
import java.util.List;

public class BarraMenuWin implements BarraMenu {
	private List<ItemMenu> itens;
	
	public BarraMenuWin(){
		this.itens = new LinkedList<ItemMenu>();
	}
	
	@Override
	public void add(ItemMenu i) {
		itens.add(i);
	}
	
		
// gets e sets
	public List<ItemMenu> getItens() {
		return itens;
	}
	public void setItens(List<ItemMenu> itens) {
		this.itens = itens;
	}
}