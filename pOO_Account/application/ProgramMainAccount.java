package application;

import entitie.Account;
import entitie.BusinessAccount;
import entitie.SavingAccount;

public class ProgramMainAccount {
	public static void main(String args[]) {
		
		Account acct = new Account(1500, "Teste Itau", 15450.00);
		SavingAccount svAcct = new SavingAccount(7701, "Rafael Tesser", 78000.00, 0.0020);
		BusinessAccount bsAcct = new BusinessAccount(1908, "Tayna Triguero S.A.", 45000.50, 1500.00);
		
		Account acct1 = new SavingAccount(7700, "Jairo Paulino", 2500.00, 0.00287);
		Account acct2 = new BusinessAccount(8019, "Regina Celia LTDA", 98450.00, 1000.00);
		
		System.out.println(acct.toString());
		
		svAcct.deposit(1500.00);
		System.out.println(svAcct.toString());
		
		bsAcct.loan(1506.00);
		bsAcct.loan(1499.55);
		System.out.println(bsAcct.toString());
		
	}
}
