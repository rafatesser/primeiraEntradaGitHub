package application;

import javax.swing.JOptionPane;

import entitie.Room;

public class Poo3_exercises001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room rooms[] = new Room[10];
		int students = Integer.parseInt(JOptionPane
				.showInputDialog("Digite a quantidade de estudantes entrantes na pensão: "));
		
		for(int i = 0; i < students; i++){
			
			int numbeRoom = Integer.parseInt(JOptionPane
					.showInputDialog("Entre com o número do quarto que deseja locar: "));
			
			
			if(rooms[numbeRoom] != null) {
				JOptionPane.showMessageDialog(null, 
				String.format("Quarto número %d, já esta ocupado! %nEscolha outro, por gentileza!", numbeRoom));
				i -= 1;
			}else {
				String name = JOptionPane.showInputDialog("Digite seu nome: ");
				String email = JOptionPane.showInputDialog("Digite seu email: ");
				rooms[numbeRoom] = new Room(name, email);
			}
			
		}
		
		System.out.println("Relatório Final");
		for(int i = 0; i < rooms.length; i++){
			if(rooms[i] != null) {	
				System.out.println( 
						String.format("Quarto: %d%n%s", i, rooms[i].toString()));
			}
		}
		
		
		
	}

}
