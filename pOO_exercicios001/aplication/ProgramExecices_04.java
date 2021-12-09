package aplication;

import javax.swing.JOptionPane;

import util.CurrencyConverter;

public class ProgramExecices_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = Double.parseDouble(JOptionPane.showInputDialog("Input the price of dolar: "));
		double quantity = Double.parseDouble(JOptionPane.showInputDialog("Input the quantity dolars you want to buy: "));
		
		JOptionPane.showMessageDialog(null, 
				String.format("You need R$%.2f to buy the quantity of dolars.", 
						CurrencyConverter.calcDol(quantity, price)));
	}

}
