package br.ufpb.aps.laryssa.exercicio2.FormularioDecorator;

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
					this.criarFormulario();
					this.cadastroFormulario();
					System.out.println("\n[C]ontinua ou [F]inaliza?");
					temp = num.next();
					if((temp.equals("c")) || (temp.equals("C"))){
						cont = 1;
						break;
					}else cont = 3;
				break;
				
				case 2:
					System.out.println("---- Listar cadastros ----");
					formFacade.listarCadastro();
					System.out.println("Fim\n");
					System.out.println("[C]ontinua ou [F]inaliza?");
					temp = num.next();
					if((temp.equals("c")) || (temp.equals("C"))){
						cont = 2;
						break;
					}else cont = 3;
				break;
				
				case 3:
					this.sistemaCadastro();
				break;
			}
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
	
	public void cadastroFormulario(){
		System.out.println("---- Cadastro de Usuario ----");
		boolean valido;
		for(Campo c: formFacade.getCampos()){
			do{
				System.out.print(c.getLabel()+": ");
				c.setValor(new Scanner(System.in).next());
				valido = c.validar();
				if(!valido){
					System.out.println("> ERRO: "+c.getErro());
				}else
					System.out.println("> OK");
			}while(!valido);
		}
	}
		
	public void criarFormulario(){
		Formulario formulario = new Formulario("Cadastro de Usua´rios");
		formulario.addCampo(new Campo("Nome", "nome", new TamanhoDecorator(5, 300, new TextoPuroDecorator(new ValidadorTextoBruto()))));
		formulario.addCampo(new Campo("Email", "email", new TamanhoDecorator(3, 30, new ValidadorEmail())));
		formulario.addCampo(new Campo("Idade", "idade", new ValidadorIdade(0, 150)));
		formulario.addCampo(new Campo("Senha Texto", "senhaTxt", new TamanhoDecorator(8, 100, new SenhaTextoDecorator(new ValidadorTextoBruto()))));
		formulario.addCampo(new Campo("Senha Numerica", "senhaNum", new TamanhoDecorator(8, 100, new SenhaNumericaDecorator(new ValidadorNumerico()))));
		formFacade.setFormulario(formulario);
	}
}