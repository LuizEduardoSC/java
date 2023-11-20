package atividade02;

import java.util.Scanner;

import atividade02.Funcionario.*;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Funcionario f1 = new Funcionario ("Luiz Eduardo", "M", 30, "Desenvolvedor Back-End", 1.78);
		System.out.println("Informações do F1: ");
		f1.visualizar();
		
		Funcionario f2 = new Funcionario ("Vitória", "F", 22, "RH", 1.74);
		System.out.println("\nInformações do F2: ");
		f2.visualizar();
		
	}

}
