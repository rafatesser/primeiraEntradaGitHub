import java.util.Scanner;

public class Exercicios0601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double triangRet = (a * c) / 2;
		System.out.printf("Triangulo Retangulo: %.3f%n", triangRet);

		double circulo = Math.PI * Math.pow(c, 2);
		System.out.printf("Circulo: %.3f%n", circulo);
		
		double trap = ((a+b) * c)/2;
		System.out.printf("Trapezio: %.3f%n", trap);
		
		double square = Math.pow(b, 2);
		System.out.printf("Quadrado: %.3f%n", square);
		
		double retang = a * b;
		System.out.printf("Retangulo: %.3f%n", retang);
	}

}
