package application;


import javax.swing.JOptionPane;

import entitie.Client;

public class Program {
	public static void main(String args[]) {
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao Tesser's Bank");
		
		Client clientZero; 
		
		int confirm = JOptionPane.showConfirmDialog(null, 
				"Gostaria de abrir uma conta conosco?", 
				"TessersBank", 
				JOptionPane.YES_NO_OPTION);
		
		if (confirm == 0) {
			
			int initialBalance = JOptionPane.showConfirmDialog(null, 
					"Gostaria de abrir a conta com um deposito inicial?", 
					"Deposito Inicial", 
					JOptionPane.YES_NO_OPTION);
			
			String name = JOptionPane.showInputDialog("Qual o nome do titular da conta: ");
			
			
			if(initialBalance == 0) {
				
				double deposit = Double.parseDouble(JOptionPane.showInputDialog("Quanto gostaria de depositar na nova conta?"));
				
				while(deposit <= 0.0)
				{	
					JOptionPane.showMessageDialog(null, "Valor a depositar inicialmente inválido");
					deposit = Double.parseDouble(JOptionPane.showInputDialog("Quanto gostaria de depositar na nova conta?"));
				}
				
				clientZero = new Client(name, deposit);

				
			}
			else
			{
				clientZero = new Client(name);
							
			}
					
			JOptionPane.showMessageDialog(null
					,String.format("Conta aberta com sucesso!!!%n"
							+ "Bem vindo %s%n"
							+ "Agencia: %d%n"
							+ "Conta: %d-%d%n"
							+ "Saldo: %.2f", 	clientZero.getName(), 
												clientZero.getAgency(), 
												clientZero.getAccount(), 
												clientZero.getDigit(), 
												clientZero.getBalance())
					,"ABERTURA DE CONTA" 
					,JOptionPane.PLAIN_MESSAGE); 
			
			double deposit = Double.parseDouble(
					JOptionPane.showInputDialog("Gostaria de depositar quanto na sua conta: "));
					
			System.out.printf("Valor depositado: %.2f%n "
					+ "Saldo anterior: %.2f%n", deposit, 
												clientZero.getBalance());
			
			clientZero.makeDeposit(deposit);
			
			System.out.printf("Saldo atual: %.2f%n", clientZero.getBalance());
			
			double withDraw = Double.parseDouble(
					JOptionPane.showInputDialog("Gostaria de sacar quanto da sua conta: "));
					
			System.out.printf("Valor saque: %.2f%n "
					+ "Saldo anterior: %.2f%n", withDraw, 
												clientZero.getBalance());
			
			clientZero.makeWithDraw(withDraw);
			System.out.printf("Saldo atual: %.2f%n", clientZero.getBalance());
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Até logo então...");
		}
	}
}
