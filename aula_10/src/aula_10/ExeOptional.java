package aula_10;

import java.util.Optional;

public class ExeOptional {

	public static void main(String[] args) {

		String[] palavras = new String[10];
		String palavra = "";
		String teste = null;

		for (var p : palavras) {
			System.out.println(p);
		}

		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);/* Se usa ofNullable quando não tenho certeza se vai ser nulo ou não */

		if (checaNulo.isPresent()) { /* Verifica se tem algum valor dentro da caixa */
			palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		} else
			System.out.println("A Palavra é nula!");

		Optional<String> opTeste = Optional
				.ofNullable(teste);/* Se usa ofNullable quando não tenho certeza se vai ser nulo ou não */

		if (opTeste.isEmpty())
			System.out.println("Vazio");

		if (opTeste.isPresent())
			System.out.println("Tem uma String");
	}
}