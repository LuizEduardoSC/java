package aula_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<String> cidades = Arrays.asList("São Paulo", "Campinas", "São José dos Campos", "Atibaia", "Pereira Barreto", "Mongaguá");
		
		List<String> cidades2 = Arrays.asList("São Paulo", "Campinas", "São Paulo", "São José dos Campos", "São Paulo", "Atibaia", "Pereira Barreto", "Mongaguá");
		
		//Pegar todos os elementos e multiplicar
		List<Integer> numerosAoCubo = numeros.stream() //Transforma em Stream
				.map(n -> n*n*n) //Pede para pegar cada elemento e multiplicar por ele mesmo (Função n*n*n)
				.collect(Collectors.toList()); // COnverter o resultado de uma collection do tipo List
		
		System.out.println(numerosAoCubo);
		
		List<Integer> numerosPares = numeros.stream()
				.filter(n -> n%2 == 0) // (Condição n%2 == 0)   Pegar apenas os números pares (.filter).
				.collect(Collectors.toList());
		
		System.out.println(numerosPares); //Imprimir os números pares
		
		long cidadesIniciandoP = cidades.stream()
				.filter(c -> c.toString().toUpperCase().startsWith("P")) // "c" Elemento que ele está lendo; "c.toString()" Converter para String; ".startsWith("P"))" Achar cidades que começam com P.
				.count();
		
		System.out.println("Quantas cidades começam com a letra P: " + cidadesIniciandoP);
		
		List<String> cidadesSemRepeticoes = cidades2.stream()
				.distinct() //Define exatamente quais itens você quer sem repitir
				.collect(Collectors.toList());
		
		System.out.println(cidadesSemRepeticoes);
	}
}
