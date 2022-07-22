package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		//System.out.print("Quantity: ");
		//int quantity = sc.nextInt();
		
		Product product = new Product(name, price);
				
		// System.out.println(product.name + " , " + product.price + " , " + product.quantity );
		// System.out.println(product);
		System.out.println(product.toString());
		System.out.println();
		
		System.out.print("Enter the number of products to be added to the Stock: ");
		int qtd = sc.nextInt();
		product.addProducts(qtd);
		System.out.println();
		System.out.println(product.toString());
		
		System.out.print("Enter the number of products to be removed from the Stock: ");
		qtd = sc.nextInt();
		product.removeProducts(qtd);
		System.out.println();
		System.out.println(product.toString());
		
		sc.close();
	}

}

