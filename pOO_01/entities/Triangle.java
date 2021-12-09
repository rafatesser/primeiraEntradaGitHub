package entities;

import javax.swing.JOptionPane;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	
	public Triangle() {
		JOptionPane.showMessageDialog(null, "Vamos formatar os lados do Triangulo.");
		a = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do lado A: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do lado B: "));
		c = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do lado C: "));
	}
	
	public double area() {
		double p = (a + b + c) / 2;
		double result = Math.sqrt(p * (p -a) * (p - b) * (p - c));
		return result;
		
	}
}
