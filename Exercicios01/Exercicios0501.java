import java.util.Scanner;

public class Exercicios0501 {
	public static void main(String args[])
	{
		double total = 0.0;
		Scanner sc = new Scanner(System.in);
		for(int x = 0; x < 2; x++)
		{	System.out.println("Id: ");
			int id = sc.nextInt();
			System.out.println("Qtdd: ");
			int qtdd = sc.nextInt();
			System.out.println("Valor Unitário: ");
			double valor = sc.nextDouble();
			
			double calc = qtdd * valor;
			System.out.printf("Produto: %d Valor total: %.2f%n", id, calc);
			
			total += calc;
		}
		
		System.out.printf("Valor a pagar: %.2f", total);
		
	}
}
