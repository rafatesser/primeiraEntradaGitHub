package application;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import entities.ClientA;
import entities.OrderA;
import entities.OrderItemA;
import entities.ProductA;
import entitiesEnum.OrderStatusA;

public class ProgramExercise004 {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:MM:ss");
	
	public static void main (String args[]) throws HeadlessException, ParseException {
		
		System.out.println("Enter client data:");
		String name = JOptionPane.showInputDialog("Name: ");
		System.out.println("Name: " + name);
		
		String email = JOptionPane.showInputDialog("Email: ");
		System.out.println("Email: " + email);
		
		Date birthDate = sdf.parse(JOptionPane.showInputDialog("BirthDate (dd/MM/yyyy): "));
		
		System.out.println("BirthDate (dd/MM/yyyy): " + sdf.format(birthDate));
		
		ClientA client = new ClientA(name, email, birthDate);
		
		Date now = sdf2.parse("27/12/2021 22:21:15");
		String status = JOptionPane.showInputDialog("Status: ");
		
		OrderA order = new OrderA(now, OrderStatusA.valueOf(status), client);
		
		System.out.println("Enter Order data:");
		Integer quantity = Integer.parseInt(JOptionPane.showInputDialog("How many items to this order: "));
		
		for(int i = 0; i < quantity; i ++) {
			System.out.println("Enter #" + (i+1) + "item data: ");
			
			String pName = JOptionPane.showInputDialog("Product Name: ");
			Double pPrice = Double.parseDouble(JOptionPane.showInputDialog("Product price: "));
			Integer pQuantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity of " + pName + ": "));
			
			OrderItemA item = new OrderItemA(pQuantity ,new ProductA(pName, pPrice));
		
			order.addItem(item);
		}
		
		System.out.println("ORDER SUMMARY:");
		System.out.println(order.toString());
		
		
		
		
		
	}
}
