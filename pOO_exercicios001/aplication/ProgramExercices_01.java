package aplication;

import javax.swing.JOptionPane;

import entities.Rectangle;

public class ProgramExercices_01 {
	public static void main (String args[]) {
		
		Rectangle rect = new Rectangle();
		rect.setLenght(Double.parseDouble(JOptionPane.showInputDialog("Input the Lenght of Rectangle: ")));
		rect.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Input the Height of Rectangle: ")));
		
		JOptionPane.showMessageDialog(null, rect.toString(), "RESULT", JOptionPane.WARNING_MESSAGE);
	}
}
