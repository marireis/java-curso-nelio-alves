package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o produto: ");
		
		System.out.println("Nome: ");
		String name = sc.nextLine();
		
		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		
		Product product = new Product(name, preco);
		
		product.setName("Computer");
		System.out.println("update name: " + product.getName());
		product.setPreco(1200.00);
		System.out.println("update preço: " + product.getPreco());
		
		
		System.out.println("Quantidade: ");
		int quantidade = sc.nextInt();
		
		System.out.println("Produto: " + product);
		
		System.out.println("Entre com o numero de produtos para adicionar ao estoque");
		quantidade = sc.nextInt();
		product.addProduto(quantidade);
		
		System.out.println("Adicionado: "+product);
		
		System.out.println("Entre com o numero de produtos para ser removido ao estoque");
		quantidade = sc.nextInt();
		product.removeProduto(quantidade);
		
		System.out.println("Removido: "+product);
		
		sc.close();	

	}

}
