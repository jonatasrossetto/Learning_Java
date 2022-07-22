package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Number of data points: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];

		int i;
		for (i = 0; i < n; i++) {
			System.out.print("Enter data point [" + (i+1) + "]: ");
			vetor[i] = sc.nextDouble();
		}

		double sum=0.0;
		for (i=0;i<n;i++) {
			sum += vetor[i];
		}
		
		System.out.println("Vector length: " + vetor.length);
		System.out.println("Sum of data points: "+sum);
		System.out.println("Average of data points: "+(sum/n));
		
		sc.close();
	}

}
