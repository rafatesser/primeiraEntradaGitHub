package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Employeee;
import entities.OutSourcedEmployee;

public class ProgramEmployee {
	public static void main(String args[]) {

		List<Employeee> listEmployee = new ArrayList<Employeee>();
		
		Integer num = Integer.parseInt(JOptionPane.showInputDialog("Enter number of the Employeed: "));
		for(int i = 0; i < num; i++) {
			String name = JOptionPane.showInputDialog("Enter with Name: ");
			Integer hour = Integer.parseInt(JOptionPane.showInputDialog("Enter with worked hour: "));
			Double valuePerHour = Double.parseDouble(JOptionPane.showInputDialog("Enter value Per hour: $"));
			listEmployee.add(new Employeee(name, hour, valuePerHour));
		}
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Enter number of the OutSourced Employeed: "));
		for(int i = 0; i < num; i++) {
			String name = JOptionPane.showInputDialog("Enter with Name: ");
			Integer hour = Integer.parseInt(JOptionPane.showInputDialog("Enter with worked hour: "));
			Double valuePerHour = Double.parseDouble(JOptionPane.showInputDialog("Enter value Per hour: $"));
			Double additionCharge = Double.parseDouble(JOptionPane.showInputDialog("Enter the addional charge: $")); 
			listEmployee.add(new OutSourcedEmployee(name, hour, valuePerHour, additionCharge));
		}
		
		for(Employeee e : listEmployee) {
			System.out.println(e);
		}

	}
}
