package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		cc.dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollar will be bought? ");
		cc.dollarValue = sc.nextDouble();
		
		System.out.println("Amount to be paid in reals: " + cc.amountPaid());
		
		sc.close();
		
	}

}
