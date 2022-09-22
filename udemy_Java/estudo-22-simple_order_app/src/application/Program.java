package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Client client = new Client();
		Order order = new Order();
		
		Integer numberItens = 0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------");
		System.out.println("Enter Client Data: ");
		System.out.print("Name: ");
			client.setName(sc.nextLine()); 
		System.out.print("Email: ");
			client.setEmail(sc.nextLine());
		System.out.print("Birthdate: ");
			client.setBirthdate(LocalDate.parse(sc.nextLine(), fmt1));
		
		System.out.println("-----------");
		System.out.println("enter order info");
		System.out.print("How many items you want to add to this order: ");
		numberItens = sc.nextInt();
		sc.nextLine();
		System.out.print("Order Status: ");
			order.setStatus(OrderStatus.valueOf(sc.nextLine()));
		for (int i=0;i<numberItens;i++) {
			Product product = new Product();
			OrderItem orderItem = new OrderItem();
			System.out.println("Enter the data for item #"+(i+1));
			System.out.print("Product name: ");
				product.setName(sc.nextLine());
			System.out.print("Product price: ");
				product.setPrice(sc.nextDouble());
			System.out.print("Product quantity: ");
				orderItem.setQuantity(sc.nextInt());
				sc.nextLine();
			orderItem.setProduct(product);
			orderItem.setPrice(product.getPrice());
			order.addItem(orderItem);
			System.out.println(orderItem.toString());
		}
		order.setMoment(LocalDate.now());
		order.setClient(client);
		order.Sumary();
		
		
		
		
		
		
//		System.out.println(client.toString());

	}

}
