package entities;

public class Rectangle {

	double height;
	double lenght;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double h, double l)
	{
		this.height = h;
		this.lenght = l;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getLenght() {
		return lenght;
	}
	
	public void setHeight(double h) {
		this.height = h;
	}
	
	public void setLenght(double l) {
		this.lenght = l;
	}
	
	public double area()
	{
		double area = this.height * this.lenght;
		return area;
	}
	
	public double perimeter()
	{
		double perimeter = ( 2 * getHeight()) + (2 * getLenght());
		return perimeter;
	}
	
	public double diagonal()
	{
		double diagonal = Math.sqrt(Math.pow(lenght, 2) + Math.pow(height, 2));
		return diagonal;
	}
	
	public String toString()
	{
		return String.format("Area: %.3f%n"
				+ "Perimeter: %.3f%n"
				+ "Diagonal: %.3f", this.area(), this.perimeter(), this.diagonal());
	}

}
