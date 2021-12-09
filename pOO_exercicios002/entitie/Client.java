package entitie;

import java.util.Random;

import util.Tax;

public class Client {
	
	private String name;
	Random gerador = new Random();
	private final int agency = gerador.nextInt(9999);;
	private final int account = gerador.nextInt(99999);;
	private final int digit = gerador.nextInt(9);;
	private double balance;
	
	public Client() {
		
	}
	
	public Client(String name){
		this.name = name;
	}
	
	public Client(String name, double balance) {
		this.name = name;
		this.makeDeposit(balance);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAgency() {
		return this.agency;
	}
	
	public int getAccount() {
		return this.account;
	}
	
	public int getDigit() {
		return this.digit;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void makeDeposit(double deposit) {
			this.balance += deposit;
			
	}
	
	public void makeWithDraw(double withdraw) {
		this.balance -= withdraw + Tax.getTaxWithDraw();
	}
	
}
