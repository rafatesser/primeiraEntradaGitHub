package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import entitie.ImportedProducto;
import entitie.Producto;
import entitie.UsedProducto;

public class ProgramProducto {
	public static void main(String args[]) throws ParseException {
		
		List<Producto> listProducto = new ArrayList<>();
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		
		Integer qtdd = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of Productos: "));
		
		for(int i = 0; i < qtdd; i++) {
			String s = String.format("Producto #%d data", i+1);
			char c = JOptionPane.showInputDialog(null, 
					"Common, used or imported? (c/u/i)", s, 
					JOptionPane.QUESTION_MESSAGE).charAt(0);
			
			String name = JOptionPane.showInputDialog(null, "Name:", s, JOptionPane.QUESTION_MESSAGE);
			Double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Price:", s, JOptionPane.QUESTION_MESSAGE));
			
			if (c == 'c') {
				
				listProducto.add(new Producto(name, price));
				
			} else if (c == 'u')
			{
				String data = JOptionPane.showInputDialog(null,
						"Date (dd/MM/yyyy): ", 
						s, 
						JOptionPane.QUESTION_MESSAGE);
				Date dateManufacture = date.parse(data);
				listProducto.add(new UsedProducto(name, price, dateManufacture));
				
			} else 
			{
				Double customFee = Double.parseDouble(JOptionPane.showInputDialog(null, 
						"Customs Fee:", s, JOptionPane.QUESTION_MESSAGE));
				listProducto.add(new ImportedProducto(name, price, customFee));
			}
			
		}
		
		System.out.println("Price TAGS:");
		for(Producto p : listProducto) {
			System.out.println(p.toString());
		}
		
		
	}
}
