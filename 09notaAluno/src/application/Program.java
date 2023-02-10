package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		estudante.nome = sc.nextLine();
		estudante.n1 = sc.nextDouble();
		estudante.n2 = sc.nextDouble();
		estudante.n3= sc.nextDouble();
		
		System.out.printf("RESULTADO FINAL: %.2f%n ", estudante.notaFinal());
		
		if (estudante.notaFinal() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("FALTAM %.2f PONTOS%n", estudante.quantPontos());
		}
		else {
			System.out.println("APROVADO");
		}
			sc.close();
		
	}

}
