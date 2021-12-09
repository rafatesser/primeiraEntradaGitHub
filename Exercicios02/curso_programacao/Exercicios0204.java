package curso_programacao;

import java.util.Scanner;

public class Exercicios0204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int total = 0;
		
		if(x >= y) {
			total = y - x; 
			total += 24;
		}else
			total = (x - y) * (-1);
			
		
		System.out.println("Total de horas: " + total + "hrs");
		sc.close();
			
	}

}
