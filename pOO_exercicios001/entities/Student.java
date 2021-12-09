package entities;

public class Student {
	
	String name;
	double nota_1;
	double nota_2;
	double nota_3;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNota_1() {
		return nota_1;
	}
	public void setNota_1(double nota_1) {
		this.nota_1 = nota_1;
	}
	public double getNota_2() {
		return nota_2;
	}
	public void setNota_2(double nota_2) {
		this.nota_2 = nota_2;
	}
	public double getNota_3() {
		return nota_3;
	}
	public void setNota_3(double nota_3) {
		this.nota_3 = nota_3;
	}
	
	public boolean validateNota(double n, int a)
	{
		boolean x;
		if (((n >= 0 && n <= 35) && a > 1) || 
		    ((n >= 0 && n <= 30) && a == 1)) {
			switch (a)
			{	case 1:
					this.setNota_1(n);
					break;
				case 2:
					this.setNota_2(n);
					break;
				case 3:
					this.setNota_3(n);
					break;
				default:
					System.out.println("Variable 'a' is invalide!");
					break;
			}
			x = true;
		}
		else {
			System.out.println("Value of nota is invalide!");
			x = false;
		}
		return x;
	}
	
	public double totalValueNota() {
		return getNota_1() + getNota_2() + getNota_3();
	}
	
	public String verifyPassed() {
		if (totalValueNota() < 60.00)
		{
			double sobra = 60.00 - totalValueNota();
			return "FAILED\n" + "Missing: " + sobra;
		}
		else {
			return "PASSED";
		}
	}
	
}
