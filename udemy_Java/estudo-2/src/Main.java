import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		int valor = 0;

		System.out.print("Digite o valor A: ");
		a = sc.nextInt();
		System.out.print("Digite o valor B: ");
		b = sc.nextInt();
		System.out.print("Digite o valor C: ");
		c = sc.nextInt();

		valor = max(a, b, c);
		System.out.println("O maior valor é igual à: " + valor);
		sc.close();

	}

	public static int max(int x, int y, int z) {
		int aux = 0;
		if (x > y && x > z) {
			aux = x;
		} else {
			if (y > x && y > z) {
				aux = y;
			} else {
				aux = z;
			}
		}
		return aux;
	}

}
