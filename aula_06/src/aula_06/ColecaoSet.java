package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class ColecaoSet {

	public static void main(String[] args) {
		
		HashSet<String> frutas = new HashSet<String>();
		
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Abacate");
		frutas.add("Morango");
		frutas.add("Jaboticaba");
		frutas.add("Kiwi");
		/*frutas.add(null); Aceita elelemntos nulos*/
		
		System.out.println(frutas);
		
		for(var fruta : frutas)
			System.out.println(fruta.hashCode());
		
		System.out.println("A fruta Morango existe?: " + frutas.contains("Morango"));
		
		frutas.remove("Morango");
		
		System.out.println(frutas);
		
		Iterator<String> iFrutas = frutas.iterator(); /*Serve para percorrer uma collection*/
		
		while(iFrutas.hasNext())
			System.out.println(iFrutas.next());
		
		//Criamos o ArrayList
		ArrayList<String> frutasList = new ArrayList<String>();
		
		//Adcionamos todos os elementos da coleção Hashset no ArrayList
		frutasList.addAll(frutas);
		
		//Ordenamos os elementos em ordem crescente
		frutasList.sort(null);
		
		System.out.println(frutasList);
		
		//Ordenamos os elementos em ordem Decrescente
		frutasList.sort(Comparator.reverseOrder()); /*Ordenar lista na ordem inversa*/
		
		System.out.println(frutasList);				
	}

}
