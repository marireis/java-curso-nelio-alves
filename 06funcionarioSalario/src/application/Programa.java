package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salario salario = new Salario();
		
		System.out.println("Nome: ");
		salario.nome = sc.nextLine();
		
		System.out.println("Salario Bruto: ");
		salario.salarioBruto = sc.nextDouble();
		
		System.out.println("Imposto: ");
		salario.imposto = sc.nextDouble();
		
		System.out.println(salario);
		
		System.out.println("Digite uma porcentagem para aumentar o salário: ");
		double porcentagem = sc.nextDouble();
		salario.addSalario(porcentagem);

		System.out.println("Salario Adicionado: "+ salario);
		sc.close();
	}

}
