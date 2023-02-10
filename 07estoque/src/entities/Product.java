package entities;

public class Product {//OBJETO
	private String name;
	private double preco;
	private int quantidade;
	
	
	public Product(String name, double preco) {
		//super();
		this.name = name;
		this.preco = preco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	
	public double totalValorEstoque() {
		return preco * quantidade;
	}
	
	public void addProduto(int quantidade) {
		this.quantidade += quantidade; //this referencia o atributo quantidade e não o parâmetro quantidade
	}
	
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		
		return name + ", $"
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " unidades, Total: $ "
				+ String.format("%.2f", totalValorEstoque());
	}
}
