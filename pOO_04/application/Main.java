package application;

import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

import entities.Order;
import entities.OrderA;
import entities_enum.OrderStatus;

public class Main {
	public static void main(String args[]) {
	
		Random id = new Random();
		Integer idOrder = id.nextInt(9999);
		
		String status = JOptionPane.showInputDialog("Input the status: ");
		
		Order order = new Order(idOrder, new Date(), OrderStatus.valueOf(status));
		
		JOptionPane.showMessageDialog(null, order.toString());
			
	}
}
