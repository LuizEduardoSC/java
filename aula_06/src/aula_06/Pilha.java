package aula_06;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Aline");
		pilha.add("Pedro");
		pilha.add("Vinicius");
		pilha.add("Luiza");
		pilha.push("Maria");
		
		System.out.println(pilha); /*Listar o dados na tela*/
		
		pilha.pop(); /*Remove o ultimo elemento que foi adicionado(Diferente do que acontece com a "fila"*/
		
		System.out.println(pilha); /*Listar o dados na tela*/
		
		System.out.println("O elemento que está no topo da pilha: " + pilha.peek()); /*Retorna o elemento que está no topo da pilha*/
		
		System.out.println("A Aline está na pilha?: " + pilha.contains("Aline")); /*Retorna se o elemento está presente na pilha*/		
	}
}
