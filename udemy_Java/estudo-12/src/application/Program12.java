package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PersonalData;

public class Program12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Number of persons data: ");
		int n = sc.nextInt(); sc.nextLine();
				
		PersonalData[] pd = new PersonalData[n];
		//String name;
		
		
		for (int inc=0 ; inc<n ; inc++  ) {
			
			System.out.println("Enter data for person ["+(inc+1) + "]");
			System.out.print("Name ["+(inc+1)+"]: ");
			String name = sc.nextLine();
			System.out.print("Height ["+(inc+1)+"]: ");
			Double Height = sc.nextDouble();
			sc.nextLine();
			
			pd[inc] = new PersonalData(name,Height);
			
		}
		
		for (int inc=0;inc<pd.length;inc++) {
			System.out.println("dados " + inc + "  " + pd[inc].getName() + "  " + pd[inc].getHeight());
		}
		
		
		sc.close();

	}

}
