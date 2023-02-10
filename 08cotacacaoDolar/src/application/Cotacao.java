package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Cotacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println("What is the dollar price? ");
		CurrencyConverter.dolar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		CurrencyConverter.dolar2 = sc.nextDouble();
		
		double reais = CurrencyConverter.convert();
		
		System.out.printf("Amount to be paid in reais = %.2f%n ",reais);
		
		sc.close();
	}

}
