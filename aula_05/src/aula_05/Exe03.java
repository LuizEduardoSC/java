package aula_05;

import java.util.Scanner;

public class Exe03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[][] matriz = {{1,2,3}, 
				          {4,5,6}, 
				          {7,8,9}};
		
		int somaPri = 0, somaSec = 0;
		
		System.out.println();
		for(int i = 0; i < matriz.length; i++) {
			somaPri += matriz[i][i];
		}
		for(int i = 0; i < matriz.length; i++) {
			somaSec	+= matriz[i][2 - i];
				}
		
		
		System.out.println("Elementos da Diagonal Principal: ");
		for(int i = 0; i < matriz.length; i++) {
        	System.out.print(matriz[i][i] + " ");
			}
		System.out.println("\nElementos da Diagonal Secundária: ");
		for(int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][2 - i] + " ");
		}
		
System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaPri);
System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSec);
	}

}
