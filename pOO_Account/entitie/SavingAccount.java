package entitie;

public class SavingAccount extends Account{
	
	Double interestRate;
	
	public SavingAccount() {
		super();
	}
	
	public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
		super( number,  holder,  balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public void withdraw(Double amount) {
		//Withdraw money of Saving Account doesn't have tax; 
		this.balance -= (amount);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("\n-InterestRate: ");
		sb.append(getInterestRate());
		return sb.toString();
	}
	
	
}
