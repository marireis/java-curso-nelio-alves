package entities;

public class Account {
	
	private int number;//numero da conta
	private String holder;//titular da conta
	private double balance;//valor deposito inicial
	


	public Account(int number, String holder) {//construtor 1 obrigando a declarar número da conta e nome do titular
		this.number = number;
		this.holder = holder;
	}
		
	public Account(int number, String holder, double initialDeposit) {//construtor 2 com os 3 argumentos quando tem saldo de entrada
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);//deposito inicial para somar ao valor da conta - ENCAPSULAMENTO
	}
		
	public int getNumber() {//somente get porque nao pode alterar, so altera com saque e deposito
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {//nao altera por isso so tem o get
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
			
	}
	public void withdraw(double amount) {
		balance -= amount + 5.0;
		
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
