package curso_programacao;

import java.util.Scanner;

public class Exercicios0201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();	
		
		if (x >= 0)
			System.out.println("Positivo");
		else
			System.out.println("Negativo");
		
		sc.close();
	}

}
