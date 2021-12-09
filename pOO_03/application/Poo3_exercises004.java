package application;

import javax.swing.JOptionPane;


public class Poo3_exercises004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de linhas matriz: "));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de colunas matriz: "));
		
		int matriz[][] = new int[n][m];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição ( " + i + ", " + j + ") :"));
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor da matriz a ser buscado: "));
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == a) {
					System.out.println("Position (" + i + ", " + j + ")");
					if ((j-1) >= 0)
						System.out.println("Esquerda temos: " 	+ matriz[i][j-1]);
					if ((i-1) >= 0)
						System.out.println("Acima temos: " 		+ matriz[i-1][j]);
					if ((j+1) <= matriz[i].length)
						System.out.println("Direita temos: " 	+ matriz[i][j+1]);
					if ((i+1) <= matriz[i].length)
						System.out.println("Abaixo temos: " 	+ matriz[i+1][j]);
				}
			}
		System.out.println("");
		}
	}

}
