package curso_programacao;

import java.util.Scanner;

public class Exercicios0208 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		double calculo = 0.00;
		
		if(salario >= 0.00 && salario <= 2000.00)
		{
			calculo = 0.00;
			System.out.println("Funcionario é isento de imposto;");
			
		}else if (salario > 2000.00 && salario <= 3000.01)
		{
			calculo = (salario - 2000.00) * (0.08);
			System.out.printf("Funcionário deve pagar imposto de %.2f", calculo);
		}else if (salario > 3000.00 && salario <= 4500.00)
		{
			calculo = ((salario - 2000.00) * (0.18));
			System.out.printf("Funcionário deve pagar imposto de %.2f", calculo);
		}else if (salario > 4500.00)
		{
			calculo = ((salario - 2000.00) * (0.28));
			System.out.printf("Funcionário deve pagar imposto de %.2f", calculo);
		}else System.out.println("Valor inválido");
		sc.close();
	}
}
