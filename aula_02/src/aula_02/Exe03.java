package aula_02;

import java.util.Scanner;

public class Exe03 {
	
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		
    float salarioBruto, adicionalNoturno, horasExtras, descontos;
		
    System.out.println("Digite o salário bruto: ");	
    salarioBruto = Leia.nextFloat();
		
    System.out.println("Digite o adicional noturno: ");
    adicionalNoturno = Leia.nextFloat();
		
    System.out.println("Digite as horas extras: ");
    horasExtras = Leia.nextFloat();
    
    System.out.println("Digite os descontos:");
    descontos = Leia.nextFloat();
    

    float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
	System.out.printf("Salário líquido: %.2f " , salarioLiquido);
       

	}

}
