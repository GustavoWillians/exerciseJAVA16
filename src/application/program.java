package application;

import java.util.Locale;
import java.util.Scanner;

import entities.infos;

public class program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		infos infos = new infos();
		
		System.out.println("Insira seu nome: ");
		infos.name = sc.nextLine();
		
		System.out.println("Insira seu salario bruto");
		infos.grossSalary = sc.nextDouble();
		
		System.out.println("Insira o valor de imposto: ");
		infos.tax = sc.nextDouble();
		
		System.out.println("Insira a porcentagem de aumento: ");
		double percentage = sc.nextDouble();
		infos.increasseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + infos);
		sc.close();
		
		
		
		
	}

}
