package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	
	
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return this.name;
	}
	
	public void setPrice (Double price) {
		this.price = price;
	}
	
	public Double getPrice () {
		return this.price;
	}

	public int getQuantity () {
		return this.quantity;
	}
	
	public double totalValueInStock () {
		return price*quantity;
	}
	
	public void addProducts (int qtd) {
		quantity += qtd;
	}
	
	public void removeProducts (int qtd) {
		quantity -= qtd;
	}
	
	public String toString() {
		return name 
			+ ", $ " 
			+ String.format("%.2f", price) 
			+ ", " 
			+ quantity 
			+ " units Total: $" 
			+ String.format("%.2f", totalValueInStock()) ;
	}
		
	
}
