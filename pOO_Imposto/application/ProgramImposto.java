package application;

import entities.People;
import entities.SinglePeople;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.swing.JOptionPane;

import entities.JuridicPeople;

public class ProgramImposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// TODO Auto-generated method stub
		List<People> listPeople = new ArrayList<>();
		
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tax payers: "));
		
		for(int i = 0; i < n; i++) {
			
			System.out.println(String.format("Tax Payer #%d data: ", i+1));
			char ch = JOptionPane.showInputDialog("Single or Company(S or C): ").charAt(0);
			String name = JOptionPane.showInputDialog("Name: ");
			
			Double annualIncome = Double.parseDouble(JOptionPane.showInputDialog("Annual Income: "));
			
			if(ch == 'S' || ch == 's') {
				Double healthPlan = Double.parseDouble(JOptionPane.showInputDialog("Health Plan: "));
				listPeople.add(new SinglePeople(name, annualIncome, healthPlan));
				System.out.println(listPeople.get(i).toString());
			} else{
				Integer employee = Integer.parseInt(JOptionPane.showInputDialog("Employees: "));
				listPeople.add(new JuridicPeople(name, annualIncome, employee));
				System.out.println(listPeople.get(i).toString());
			}
			
		}
		
		Double totalTax = 0.0;
		System.out.println("\nTAXES PAID");
		for(People p : listPeople) {
			StringBuilder sb = new StringBuilder();
			sb.append(String.format("-%s : $%.2f", p.getName(), p.imposto()));
			System.out.println(sb.toString());
			totalTax += p.imposto();
		}
		
		System.out.println(String.format("\nTotal Tax: $%.2f", totalTax));
		
		
	}

}
