import java.util.Scanner;

public class Exercicios0401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID do funcion�rio: ");
		int a = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		int b = sc.nextInt();
		System.out.println("Digite o sal�rio/hora: ");
		double c = sc.nextDouble();
		
		double salario = (double) b * c;
		System.out.println("ID Funcionario: " + a);
		System.out.printf("Horas trabalhadas: %d%nSal�rio: U$ %.2f .", b, salario);
	}

}
