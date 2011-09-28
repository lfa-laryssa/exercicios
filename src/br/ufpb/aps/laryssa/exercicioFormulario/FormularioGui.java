package br.ufpb.aps.laryssa.exercicioFormulario;

import java.util.Scanner;

public class FormularioGui {
	private FormularioFacade formFacade;
	private Scanner num;
	
	public FormularioGui(){
		this.formFacade = new FormularioFacade();
	}
	
	public void telaPrincipal(){
		System.out.println("---- Sistema de cadastro ----");
		System.out.println(" [1] Cadastrar");
		System.out.println(" [2] Listar itens cadastrados");
		System.out.println(" [0] Sair");
		int cont = num.nextInt();
		String temp;
		
		while(cont != 0){ 
			switch (cont) {
				case 1:
					System.out.println("---- Cadastro de Usuario ----");
					formFacade.cadastrarFormulario();
					System.out.println("Cadastro Finalizado");
					System.out.println("[C]ontinua ou [F]inaliza?");
					temp = num.next();
					if((temp == "c") || (temp == "C")){
						cont = 1;
					}else cont = 3;
				break;
				
				case 2:
					System.out.println("---- Listar cadastros ----");
					formFacade.listarCadastro();
					System.out.println("Fim");
					System.out.println("[C]ontinua ou [F]inaliza?");
					temp = num.next();
					if((temp == "c") || (temp == "C")){
						break;
					}else cont = 3;
				break;
				
				case 3:
					System.out.println("---- Sistema de cadastro ----");
					System.out.println(" [1] Cadastrar");
					System.out.println(" [2] Listar itens cadastrados");
					System.out.println(" [0] Sair");
					cont = num.nextInt();
				break;
			}
		}
		System.out.println("Ate´ Logo!");
	}
}