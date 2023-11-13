package aula_04;

import java.util.Scanner;

public class Exe04 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int idade, genero, tipoDev , back = 0, front = 0, mobile = 0, fullStack, total = 0, somaIdade = 0;
		float media = 0.0f;
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {/*Sempre executa tudo até o while*/
				System.out.println("Digite o Genero (1-MC / 2-HC / 3-NB / 4-MT / 5-HT / 6-Outros: ");
				genero = leia.nextInt();
				
				if(esporte < 1 || esporte > 4)
					System.out.println("Digite um valor entre 1 e 4");
				
			}while(esporte < 1 || esporte > 4);
		}

	}

}
