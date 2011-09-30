package br.ufpb.aps.laryssa.exercicioFormulario;

import java.util.Scanner;

public class FormularioGui {
	private FormularioFacade formFacade;
	private Scanner num;
	private int cont;
	
	public FormularioGui(){
		this.formFacade = new FormularioFacade();
		this.num = new Scanner(System.in);
	}
	
	public void telaPrincipal(){
		this.sistemaCadastro();
		String temp;
		
		while(cont != 0){ 
			switch (cont) {
				case 1:
					formFacade.criarFormulario();
					this.cadastroUsuario();
					System.out.println("[C]ontinua ou [F]inaliza?");
					temp = num.next();
					if((temp == "c") || (temp == "C")){
						cont = 1; //não sei porque não esta funcionando?
						break;
					}else cont = 4;
				break;
				
				case 2:
					System.out.println("---- Listar cadastros ----");
					formFacade.listarCadastro();
					System.out.println("Fim");
					System.out.println("[C]ontinua ou [F]inaliza?");
					temp = num.next();
					if((temp == "c") || (temp == "C")){
						cont = 2; //não sei porque não esta funcionando?
						break;
					}else cont = 4;
				break;
			}
			this.sistemaCadastro();
		}
		System.out.println("Ate´ Logo!");
	}
	
	public void sistemaCadastro(){
		System.out.println("---- Sistema de cadastro ----");
		System.out.println(" [1] Cadastrar");
		System.out.println(" [2] Listar itens cadastrados");
		System.out.println(" [0] Sair");
		cont = num.nextInt();
	}
	
	public void cadastroUsuario(){
		System.out.println("---- Cadastro de Usuario ----");
		System.out.println("Nome: ");
		String valor = num.next();
		formFacade.addValorCampo(valor); //como e pra onde mando esse valor para ser validado?
		System.out.println("E-mail: ");
		valor = num.next();
		formFacade.addValorCampo(valor); //como e pra onde mando esse valor para ser validado?
		System.out.println("Idade: ");
		valor = num.next();
		formFacade.addValorCampo(valor); //como e pra onde mando esse valor para ser validado?
		System.out.println("Cadastro Finalizado");
	}
}