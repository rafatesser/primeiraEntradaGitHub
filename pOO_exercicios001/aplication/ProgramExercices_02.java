package aplication;

import javax.swing.JOptionPane;

import entities.Employee;

public class ProgramExercices_02 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setName(JOptionPane.showInputDialog(null, "Insert name of Employee: ", "NAME", JOptionPane.QUESTION_MESSAGE));
		employee.setGrossSalary(Double.parseDouble(JOptionPane.showInputDialog(null, "Insert the Gross Salary of Employee: ", "SALARY", JOptionPane.QUESTION_MESSAGE)));
		employee.setTax(Double.parseDouble(JOptionPane.showInputDialog(null,"Insert the tax Salary: ", "TAX", JOptionPane.QUESTION_MESSAGE)));
		
		JOptionPane.showMessageDialog(null, 
				"Empoyee" + employee.toString(), 
				"INFORMATIONS", 
				JOptionPane.PLAIN_MESSAGE);
		
		employee.increaseSalary(Double.parseDouble(
				JOptionPane.showInputDialog(null, 
				"Which percentage to increased salary?",
				"INCREASE SALARY",
				JOptionPane.QUESTION_MESSAGE)));
		
		JOptionPane.showMessageDialog(null, 
				"Updated Empoyee" + employee.toString(), 
				"INFORMATIONS", 
				JOptionPane.PLAIN_MESSAGE);
		
	}

}
