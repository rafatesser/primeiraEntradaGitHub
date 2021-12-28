package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitiesEnum.OrderStatusA;

public class OrderA {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatusA status;
	
	private ClientA client;
	
	List<OrderItemA> items = new ArrayList<OrderItemA>();
	
	public OrderA() {
	}
	
	public OrderA(Date moment, OrderStatusA status, ClientA client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public Date getMoment() {
		return this.moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatusA getStatus() {
		return this.status;
	}
	
	public void setStatus(OrderStatusA stats) {
		this.status = stats;
	}
	
	public ClientA getClient() {
		return this.client;
	}
	
	public void addItem(OrderItemA item) {
		this.items.add(item);
	}
	
	public void removeItem(OrderItemA item) {
		this.items.remove(item);
	}
	
	public Double getTotal() {
		Double total = 0.0;
		for(OrderItemA i : items)
		{
			total += i.getPrice();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(getMoment()));
		sb.append("\nOrder statyus: ");
		sb.append(getStatus());
		sb.append("\nClient: ");
		sb.append(client.getName());
		sb.append(" (" + sdf.format(client.getBirthDate()) + ") - " + client.getEmail());
		sb.append("\nOrder items: ");
		for(OrderItemA a : items)
		{
			sb.append("\n   -" + a.getProduct().getName());
			sb.append(", " + a.getProduct().getPrice());
			sb.append(", Quantity: " + a.getQuatity());
			a.setPrice();
			sb.append(", SubTotal: " + a.getTotalPriceItem());
		}
		sb.append("\nTotal Price: " + String.format("%.2f",getTotal()));
		return sb.toString();
	}
	
	
}
