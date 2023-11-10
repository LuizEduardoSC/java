package aula_04;

import java.util.Scanner;

public class Exe03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int pessoasMenores21 = 0, pessoasMaiores50 = 0, idade = 0;
		
		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
		}
			if(idade < 21) {
			pessoasMenores21 ++;	
		}
			if(idade > 50) {
			pessoasMaiores50 ++;
		}	
	System.out.println("Total de pessoas menores de 21 anos:" + pessoasMenores21);
	System.out.println("Total de pessoas maiores de 50 anos:" + pessoasMaiores50);
	System.out.println();
	}
}
