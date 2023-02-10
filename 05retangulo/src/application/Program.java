package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a largura e altura: ");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n",retangulo.areaRetangulo());
		System.out.printf("PERIMENTRO: %.2f%n",retangulo.perimetroRetangulo());
		System.out.printf("DIAGONAL: %.2f%n",retangulo.diagonalRetangulo());
		
		sc.close();
		
		
		
				
	}

}
