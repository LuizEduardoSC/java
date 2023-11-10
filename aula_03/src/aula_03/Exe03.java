package aula_03;

import java.util.Scanner;

public class Exe03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int idade;
		String nomeDoador, permitido;
		boolean primeiraDoacao;
		
		System.out.println("Digite o nome do doador: ");
		nomeDoador = leia.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		primeiraDoacao = leia.nextBoolean();

		permitido = "está apto";
		
		if(idade < 18 || idade > 69) {
			permitido = "não está apto";
		} 
		else if((idade >= 60 && idade <= 69) && (primeiraDoacao == true)) {
			permitido = "não está apto";
		}
		
		System.out.printf("%s %s para doar sangue!", nomeDoador, permitido);

	}

}
