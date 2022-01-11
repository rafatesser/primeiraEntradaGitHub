package application;

import javax.swing.JOptionPane;

import entitie.Producto;

public class example_002 {
	public static void main(String args[])
	{
		int n = Integer.parseInt(JOptionPane
				.showInputDialog("Entre com a quantidade de produtos a ser inserido: "));
		Producto product[] = new Producto[n];
		
		double priceTotal = 0.0;
		
		
		for(int i = 0; i < product.length ; i++ ) {
			String name = JOptionPane.showInputDialog("Digite o nome do Produto: ");
			double price = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: "));
			product[i] = new Producto(name, price);
			System.out.println(product[i].toString());
			priceTotal += product[i].getPrice();
		}
		
		double average = priceTotal / n;
		System.out.println("A média de valor desses produtos é de: " + String.format("%.2f", average));
		
	}
}
