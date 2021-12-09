package application;

import javax.swing.JOptionPane;

import entities.Product;

public class Program02 {
	
	public static void main(String args[])
	{
		Product p1 = new Product();
		p1.setName(JOptionPane.showInputDialog(String.format("Enter product data: %n -Name:")));
		p1.setPrice(Double.parseDouble(JOptionPane.showInputDialog(String.format("Enter product data: %n -Price:"))));
		p1.addProduct(Integer.parseInt(JOptionPane.showInputDialog(String.format("Enter product data: %n -Quantity:"))));
		
		JOptionPane.showMessageDialog(null, String.format("Product data%n -Name: %s%n -Price: $%.2f%n -Quantity: %d%n ***Total: %.2f", 
				p1.getName(), 
				p1.getPrice(),
				p1.getQuantity(),
				p1.totalValueStock()));
		
		p1.addProduct(Integer.parseInt(JOptionPane.showInputDialog("Enter the number of products to be added in stock: ")));
		JOptionPane.showMessageDialog(null, String.format("Updated data%n -Name: %s%n -Price: $%.2f%n -Quantity: %d%n ***Total: %.2f", 
				p1.getName(), 
				p1.getPrice(),
				p1.getQuantity(),
				p1.totalValueStock()));
		
		p1.removeProduct(Integer.parseInt(JOptionPane.showInputDialog("Enter the number of products to be removed in stock: ")));
		JOptionPane.showMessageDialog(null, String.format("Updated data%n -Name: %s%n -Price: $%.2f%n -Quantity: %d%n ***Total: %.2f", 
				p1.getName(), 
				p1.getPrice(),
				p1.getQuantity(),
				p1.totalValueStock()));
	}

}
