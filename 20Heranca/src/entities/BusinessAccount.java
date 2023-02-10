package entities;

public class BusinessAccount extends Account{//herança- tem todos os dados de comportamento da account; herança é uma associaçao entre classes

	private Double loanLimit;

	public BusinessAccount() {

	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {//construtor com os argumentos da account
		super(number, holder, balance);//chama o construtor da account - super serve para exceutar a lógica do construtor
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10;
		}
		
	}
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	
}
