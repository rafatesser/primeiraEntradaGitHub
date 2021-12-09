package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import util.CalculatorAdjustSalary;

import javax.swing.JOptionPane;

import entitie.Employee;

public class Poo3_exercises002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employee = new ArrayList<>();
		
		Integer numberEmp = Integer.parseInt(JOptionPane.showInputDialog("How many employees will be registered?"));
		Integer num = 0;
		
		for(int x = 0; x < numberEmp; x++) {
			Random random = new Random();
			Integer id = random.nextInt(999);
			String name = JOptionPane.showInputDialog("Input the name of employee: ");
			Double salary = Double.parseDouble(JOptionPane.showInputDialog("Input a salary to employee: "));
			employee.add(new Employee(id, name, salary));
		}
		
		for(Employee x : employee) {
			num += 1;
			System.out.println(x.toString(num));
		}
		
		
		int number = Integer.parseInt(JOptionPane
				.showInputDialog("Enter the employee #Id that will have salary increase: "));
		Double percent = 0.0;
		
		Employee premier = employee.stream().filter(x -> x.getId() == number).findFirst().orElse(null);
		if (premier == null) {
			JOptionPane.showMessageDialog(null, "This Id doesn't exist!");
		}else {
			percent = Double.parseDouble(JOptionPane.showInputDialog("Enter the percentage: "));
			premier.setSalary(CalculatorAdjustSalary.adjustSalary(premier.getSalary(), percent));
			System.out.println(premier.toString());
		}
		
		System.out.println("List Employee:");
		
	
		for(Employee e : employee) {
			System.out.println(e.toString());
		}
			
	}

}
