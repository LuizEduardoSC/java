package aula_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exe01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<>();
		
		System.out.println("Digite 5 cores: ");
		for (int i = 0; i < 5; i++) {
			String cor = leia.nextLine();
			cores.add(cor);
		}
		
		System.out.println("Listar todas as cores: ");
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		Collections.sort(cores);
		
		System.out.println("Ordenar as cores: " + cores.toString());
		Collections.sort(cores,Collections.reverseOrder());
	}
}
