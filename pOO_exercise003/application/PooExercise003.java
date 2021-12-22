package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities_enum.WorkerLevel;

public class PooExercise003 {
	public static void main (String args[]) throws ParseException {
		
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		
		String departmentName = JOptionPane.showInputDialog("Department", "Enter departament's name");
		String name = JOptionPane.showInputDialog("Name", "Input the name of worker");
		String level = JOptionPane.showInputDialog("Level", String.format("Input the level worker %n"
				+ "JUNIOR%n"
				+ "MID_LEVEL%n"
				+ "SENIOR"));
		Double salary = Double.parseDouble(JOptionPane.showInputDialog("Base Salary", "Input the base Salary: "));
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(departmentName));
		System.out.println(worker.toString());
		
		Integer numContract = Integer.parseInt(JOptionPane.showInputDialog("Number Contracts", "How many contracts to this worker: "));
		
		for(int i = 0; i < numContract; i++) {
			String data = JOptionPane.showInputDialog(String.format("Enter contract #%d date (dd/MM/yyyy): ", i));
			Date contractDate = date.parse(data);
			Double valuePerHour = Double.parseDouble(JOptionPane.showInputDialog("Enter the value contract: $"));
			Integer hour = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity hour of contract: "));
			worker.addContract(new HourContract(contractDate, valuePerHour, hour));
		}
		
		String selectDate = JOptionPane.showInputDialog("Enter month and year to calcule income (MM/yyyy): ");
		String monthDate = selectDate.substring(0, 2);
		String yearDate = selectDate.substring(3, 7);
		
		Calendar cal = Calendar.getInstance();
		
		
		
		System.out.println(String.format(""));
		
		
	}
}
