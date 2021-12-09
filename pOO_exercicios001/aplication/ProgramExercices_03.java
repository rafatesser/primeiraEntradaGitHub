package aplication;

import javax.swing.JOptionPane;

import entities.Student;

public class ProgramExercices_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setName(JOptionPane.showInputDialog("Input name of Student: "));
		
		for(int i = 1; i <= 3; i++)
		{
			student.validateNota(Double.parseDouble(JOptionPane.showInputDialog("Input nota " + i + " : ")), i);
		}
		
		JOptionPane.showMessageDialog(null, String.format("Final Grade: %.2f%n%s", 
				student.totalValueNota(), 
				student.verifyPassed()));
		
	}

}
