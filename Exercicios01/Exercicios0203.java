import java.util.Scanner;

public class Exercicios0203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double pi = Math.PI;
		double x = sc.nextDouble();
		
		double calc = Math.pow(x, 2) * pi;
		System.out.printf("valor resultante: %.4f", calc );
	}

}
