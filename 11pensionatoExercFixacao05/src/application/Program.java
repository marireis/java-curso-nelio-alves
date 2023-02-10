package application;

import java.util.Scanner;

import entities.Pensao;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Pensao[] vect = new Pensao[10];
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		for(int i = 1; i<= n; i++) {
			System.out.println();
			System.out.println("Quarto "+ i + ": ");
			System.out.println("nome: ");
			String nome = sc.next();
			System.out.println("email: ");
			String email = sc.next();
			System.out.println("quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Pensao(nome, email);
		}
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}

}
