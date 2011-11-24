package br.ufpb.aps.laryssa.exercicio4.Iterator;

import org.w3c.dom.Node;

public class ListaEncadeadaConcreta implements ListaEncadeada {
	private Node cabeca;
	private Node calda;
	
	public void add(Object o) {
		Node novo = (Node) o;    // Node é uma interface
		if(cabeca == null){
			cabeca = novo;
			calda = cabeca;
		}else{
			calda.setUserData(null, novo, null);  //calda.setProximo(novo);
			calda = calda.getNextSibling();  // calda = calda.getProximo();
		}
	}

	public Iterator getIterador() {
		return new ListaEncadeadaIterator(cabeca);
	}
}