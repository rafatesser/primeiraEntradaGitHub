package application;

import javax.swing.JOptionPane;

public class example_001 {
	public static void main(String args[])
	{
		int i = Integer.parseInt(JOptionPane
				.showInputDialog("digite a quantidade de pessoal que serão avalidas: "));
		double altura[] = new double[i];
		double totalAcumulado = 0.0;
		
		for(int n = 0; n < i; n++)
		{
			altura[n] = Double.parseDouble(JOptionPane
				.showInputDialog("Entre com a idade do " + (n+1) + "o participante: "));
			System.out.println("Altura do " + (n+1) + "o particante é de " + altura[n]);
			totalAcumulado += altura[n];
		}
		
		System.out.println("ALtura média dos participantes é de :" 
		                   + String.format("%.2f", totalAcumulado/i));
	}
}
