package aula_metodos;

import static aula_metodos.pacote01.Classe02.*;

public class TestaMetodos {

	public static void main(String[] args) {
		
		// Chamadas para os Métodos Locais
		
		metodoPublico();
		metodoFriendly();
		metodoProtegido();
		metodoPrivado();
		
		// Chamadas para os Métodos da Classe 01
		
		Classe01.metodoPublico01();
		Classe01.metodoFriendly01();
		Classe01.metodoProtegido01();
		// Classe01.metodoPrivado01(); "Private = Só pode ser criado dentro da própia classe onde foi criado"
		
		// Chamadas para os métodos da Classe 01 - Pacote 01
		
		metodoPublico02();
		//metodoFriendly02(); /*Não funciona se estiver em outro Pacote*/
		//metodoProtegido02();/*Só funciona se estiver no mesmo pacote ou a classe for uma herança*/
		//metodoPrivado02();

	}
	
	public static void metodoPublico() {
		System.out.println("Método Público");
	}

	static void metodoFriendly() {
		System.out.println("Método Friendly");
	}
	
	protected static void metodoProtegido() {
		System.out.println("Método Protegido");
	}
	
	private static void metodoPrivado() {
		System.out.println("Método Privado");
	}
}
