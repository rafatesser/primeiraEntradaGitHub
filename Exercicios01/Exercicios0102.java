import java.util.Scanner;

public class Exercicios0102 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = x + y;
		
		System.out.printf("A soma de %d + %d é igual a %d", x, y, z);
	}
}
