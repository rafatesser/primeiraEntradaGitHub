package entitie;

public class BusinessAccount extends Account {
	
	protected Double loanLimit;
	
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		
		System.out.println("\n****************************\n");
		System.out.println("Loan Trying: $" + amount);
		if(amount <= getLoanLimit()) {
			this.balance += amount;
			System.out.println("Loan authorized!");
		}else
			System.out.println("Loan not authorized!");
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("\n-Loan Limit: ");
		sb.append(getLoanLimit());
		return sb.toString();
	}
}
