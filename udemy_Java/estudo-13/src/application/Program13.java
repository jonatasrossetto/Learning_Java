package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RoomsData;

public class Program13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Number of rooms: ");
		int n = sc.nextInt(); sc.nextLine();
				
		RoomsData[] room = new RoomsData[10];
		
		for (int inc=0; inc<n ; inc++) {
			System.out.println("Enter de register number " + (inc+1));
			System.out.print("["+(inc+1)+"] Name: ");
			String name = sc.nextLine();
			System.out.print("["+(inc+1)+"] Room number: ");
			int roomNumber = sc.nextInt();
			sc.nextLine();
			System.out.print("["+(inc+1)+"] E-mail: ");
			String email = sc.nextLine();
			
			room[roomNumber] = new RoomsData(name, roomNumber, email);
			
		}
		
		for (int inc=0; inc<10 ; inc++) {
			if (room[inc]!=null) {
				System.out.println(room[inc].getRoom());
				System.out.println(room[inc].getName());
				System.out.println(room[inc].getEmail());
			}
		}
		
	}

}
