package application;

import java.util.Random;

import javax.swing.JOptionPane;

public class Poo3_exercises003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int x = Integer.parseInt(JOptionPane.showInputDialog("Entre com a dimensão da matriz: "));
		int matriz[][] = new int[x][x];
		int vect[] = new int[x];

		for (int a = 0; a < matriz.length; a++) {
			for (int b = 0; b < matriz[a].length; b++) {
				matriz[a][b] = random.nextInt(60);
				System.out.print(matriz[a][b] + " ");
				
				if (a == b) 
					vect[a] = matriz[a][b];
				
			}
			System.out.println("");
		}
		
		System.out.println("Processo final: ");
		
		for(int a : vect) 
		{
			System.out.print(a + " ");
		}
	}

}
