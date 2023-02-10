package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calcular;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calcular calc = new Calcular();
		
		System.out.print("Enter radius: ");
		
		double raio = sc.nextDouble();
		double c = Calcular.circunferencia(raio);
		double v = Calcular.volume(raio);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calcular.PI);
		
		sc.close();
		
	}

}
