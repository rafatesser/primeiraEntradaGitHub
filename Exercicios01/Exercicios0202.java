import java.util.Locale;
import java.util.Scanner;

public class Exercicios0202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		System.out.println("Digite um valor: ");
		Scanner sc = new Scanner(System.in);
		double pi = Math.PI;
		double x;
		x = sc.nextDouble();
		double calc = Math.pow(x,2) * pi;
		System.out.printf("Valor da área: %.4f", calc);
	}

}
