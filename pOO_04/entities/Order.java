package entities;

import java.util.Date;

import entities_enum.OrderStatus;

public class Order {
	
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	public Order() {
		
	}
	
	public Order(Integer id, Date moment, OrderStatus status) {
		setId(id);
		setMoment(moment);
		setStatus(status);
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getMoment() {
		return this.moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return this.status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public String toString() {
		String literal = 
				String.format("Order number #%d%n"
				+ "Date selling: %s%n"
				+ "Status: %s", getId(), getMoment(), getStatus());
		return literal;
	}
	
}
