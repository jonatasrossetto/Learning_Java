package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private LocalDate moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> orderItens = new ArrayList<>();
		
	public Order() {
		
	}

	public Order(LocalDate moment, OrderStatus status) {
		super();
		this.moment = moment;
		this.status = status;
	}

	public LocalDate getMoment() {
		return moment;
	}

	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		orderItens.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItens.remove(item);
	}
	
	public List<OrderItem> getOrderItens() {
		return orderItens;
	}

	public Double total() {
		Double total = 0.0;
		for (OrderItem item : orderItens) {
			total += item.subTotal();
		}
		return total;
	}
	
	public void Sumary() {
		System.out.println("\n\n ORDER SUMARY");
		System.out.println("Order date: "+this.moment);
		System.out.println("Order status: "+this.status);
		System.out.println("Client name: "+this.client.getName());
		System.out.println("Client email: "+this.client.getEmail());
		System.out.println("Client birthdate: "+this.client.getBirthdate());
		System.out.println("Order Itens:");
		for (OrderItem item : orderItens) {
			System.out.println(item.toString());	
		}
		System.out.println("Order total value: "+total());
		
	}
}
