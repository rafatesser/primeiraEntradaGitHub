package util;

public class Tax {
	
	private static double taxWithDraw = 5.0;
	
	public Tax() {
	}
	
	public static double getTaxWithDraw(){
		return taxWithDraw;
	}
	
	public static void setTaxWithDraw(double newTax) {
		taxWithDraw = newTax;
	}
}
