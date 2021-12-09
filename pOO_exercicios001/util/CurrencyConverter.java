package util;

public class CurrencyConverter {
	public final static double iof = 0.06;
	
	public static double calcDol(double dolar, double cotacao)
	{
		double calc = ((dolar * cotacao) * iof) + (dolar * cotacao);
		return calc;
	}
	
}
