package application;


import javax.swing.JOptionPane;

import entities.Triangle;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();

		JOptionPane.showMessageDialog(null, String.format("The measure of Triangle X: %.2f", x.area()));
		JOptionPane.showMessageDialog(null, String.format("The measure of Triangle Y: %.2f", y.area()));
		
		if (x.area() > y.area())
			JOptionPane.showMessageDialog(null, "Larger Triangle is X");
		else if (x.area() < y.area())
			JOptionPane.showMessageDialog(null, "Larger Triangle is Y");
		else
			JOptionPane.showMessageDialog(null, "These triangles is equals");

		
	}

}
