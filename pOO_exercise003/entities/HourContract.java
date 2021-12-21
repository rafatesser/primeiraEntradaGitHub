package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double valuePerHour;
	private Integer hour;
	
	public HourContract() {
		
	}
	
	public HourContract(Date date, Double valuePerHour, Integer hour) {
		setDate(date);
		setValuePerHour(valuePerHour);
		setHour(hour);
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double getValuePerHour() {
		return this.valuePerHour;
	}
	
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	
	public Integer getHour() {
		return this.hour;
	}
	
	public Double totalValue() {
		Double total = getValuePerHour() * getHour();
		return total;
	}
	
}
