import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double xa=0.0, xb=0.0, xc=0.0, px=0.0;
		double ya=0.0, yb=0.0, yc=0.0, py=0.0;
		double area_x=0.0, area_y=0.0;
		Scanner sc = new Scanner(System.in);
		
		// obten��o de dados //
		System.out.print("Digite xa: ");
		xa = sc.nextDouble();
		System.out.print("Digite xb: ");
		xb = sc.nextDouble();
		System.out.print("Digite xc: ");
		xc = sc.nextDouble();
		System.out.println("-------------");
		System.out.print("Digite ya: ");
		ya = sc.nextDouble();
		System.out.print("Digite yb: ");
		yb = sc.nextDouble();
		System.out.print("Digite yc: ");
		yc = sc.nextDouble();
		
		// C�lculos //
		px = (xa+xb+xc)/2;
		System.out.println("px" + px);
		area_x=Math.sqrt(px*(px-xa)*(px-xb)*(px-xc));
		py = (ya+yb+yc)/2;
		area_y=Math.sqrt(py*(py-ya)*(py-yb)*(py-yc));
		
		// Resultados //
		System.out.printf("A �rea do triangulo X �: %.4f%n",area_x);
		System.out.printf("A �rea do triangulo Y �: %.4f%n",area_y);
		
		if (area_x>area_y) {
			System.out.println("O tri�ngulo X possui a maior �rea");
		} else {
			System.out.println("O tri�ngulo Y possui a maior �rea");
		}
		
		sc.close();
		
	}

}
