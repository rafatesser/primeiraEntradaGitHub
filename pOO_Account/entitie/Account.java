package entitie;

public class Account {
	
	Integer number;
	String holder;
	Double balance;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void withdraw(Double amount) {
		//withdraw tax = 2.0
		this.balance -= (amount + 2.0);
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n****************************\n");
		sb.append("Current Account ");
		sb.append(getNumber());
		sb.append("\n-Holder: ");
		sb.append(getHolder());
		sb.append("\n-Balance: ");
		sb.append(getBalance());
		return sb.toString();
	}
}
