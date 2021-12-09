import java.util.Scanner;

public class Exercicios0201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = Math.PI;
		int x = 0;
		
		double calc;
		
		System.out.println("Digite um valor: ");
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		
		calc = Math.pow(x, 2) * pi;
		System.out.printf("Valor resultante: %.4f", calc);
	}

}
