package aula_04;

import java.util.Scanner;

public class Pesquisa {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int idade, esporte, futebol = 0, voleibolM18 = 0, basquetebolM18 = 0, outros = 0;
		String continua = "S"; /*Foi usada como condição para o laço continuar ou não*/
		
		while(continua.equalsIgnoreCase("S")) { /*Sempre verifica a condição antes de executar*/
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {/*Sempre executa tudo até o while*/
				System.out.println("Digite o seu esporte favorito (1-Fut / 2-Vol / 3-Basq / 4-Outros: ");
				esporte = leia.nextInt();
				
				if(esporte < 1 || esporte > 4)
					System.out.println("Digite um valor entre 1 e 4");
				
			}while(esporte < 1 || esporte > 4);
			
			
			//Quantas pessoas gostam de futebol?
			if(esporte == 1)
				futebol ++;
			
			//Quantas pessoas gostam de Voleibol e são maiores de 18?
			if(esporte == 2 && idade > 18)
				voleibolM18 ++;
			
			//Quantas pessoas gostam de Basquetebol e são menores de 18?
			if(esporte == 3 && idade < 18)
				basquetebolM18 ++;
			
			//Quantas pessoas gostam de Outros Esportes?
			if(esporte == 4)
				futebol ++;
			
			System.out.println("Deseja continuar (S/N)? ");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
		}
		
		System.out.println("Total de pessoas que gostam de futebol: " + futebol);
		System.out.println("Total de pessoas que gostam de voleibol e são maiores de 18 anos: " + voleibolM18);
		System.out.println("Total de pessoas que gostam de basquetebol e são menores de 18 anos: " + basquetebolM18);
		System.out.println("Total de pessoas que gostam de outros esportes: " + outros);

	}

}
