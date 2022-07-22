package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		double px=0, py=0;
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		double area_x=0.0, area_y=0.0;
		Scanner sc = new Scanner(System.in);
		
		// obten��o de dados //
		System.out.print("Digite xa: ");
		x.a = sc.nextDouble();
		System.out.print("Digite xb: ");
		x.b = sc.nextDouble();
		System.out.print("Digite xc: ");
		x.c = sc.nextDouble();
		System.out.println("-------------");
		System.out.print("Digite ya: ");
		y.a = sc.nextDouble();
		System.out.print("Digite yb: ");
		y.b = sc.nextDouble();
		System.out.print("Digite yc: ");
		y.c = sc.nextDouble();
		
			
		// Resultados //
		System.out.printf("A �rea do triangulo X �: %.4f%n",x.area());
		System.out.printf("A �rea do triangulo Y �: %.4f%n",y.area());
		
		if (x.area()>y.area()) {
			System.out.println("O tri�ngulo X possui a maior �rea");
		} else {
			System.out.println("O tri�ngulo Y possui a maior �rea");
		}
		
		sc.close();

	}

}
