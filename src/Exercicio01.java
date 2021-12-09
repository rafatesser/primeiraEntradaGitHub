import java.util.Locale;

public class Exercicio01 {
	
	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = (price1 + price2) / 2;
		
		System.out.println("Products:");
		System.out.printf("%s, wich price is $%.2f%n", product1, price1);
		System.out.printf("%s, wich price is $%.2f%n%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (Three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.println("US decimal Point: " + measure);
		
	}
}
