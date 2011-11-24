package br.ufpb.aps.laryssa.exercicio4.Iterator;

import org.w3c.dom.Node;

public class ListaEncadeadaIterator implements Iterator {
	private Node cabeca;
	
	public ListaEncadeadaIterator(Object o){
		this.cabeca = (Node) o;
	}
	
	public boolean temProximo(){   //hasNext()
		return cabeca == null;
	}
	
	public Object proximo(){   //next()
		Object aux = cabeca;
		cabeca = cabeca.getNextSibling();
		return aux;
	}
}