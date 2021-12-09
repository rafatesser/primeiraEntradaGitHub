package curso_programacao;

import java.util.Scanner;

public class Exercicios0205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o codigo do produto desejado: ");
		int x = sc.nextInt();
		System.out.println("Digite a quantidade do produto escolhido: ");
		int qtdd = sc.nextInt();
		double valor = 0.0;
		
		if(x == 1) {
			System.out.println("Cachorro Quente - R$4,00");
			valor = qtdd * 4.00;
		}else if(x == 2){
			System.out.println("X-Salda - R$4,50");
			valor = qtdd * 4.50;
		}else if(x == 3){
			System.out.println("X-Bacon - R$5,00");
			valor = qtdd * 5.00;
		}else if(x == 4){
			System.out.println("Torrada Simples - R$2,00");
			valor = qtdd * 2.00;
		}else if (x == 5){
			System.out.println("Refrigerante - R$1,50");
			valor = qtdd * 1.50;			
		}else System.out.println("Produto inexistente;");
			
		System.out.println("Valor total da compra: " + valor);		sc.close();
	}
	

}
