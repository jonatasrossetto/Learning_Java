import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int zero = 0;
		int acumulador = 0;
		int entrada;
		while (zero == 0) {
			System.out.print("Digite um número: ");
			entrada = sc.nextInt();
			acumulador += entrada;
			if (entrada == 0) {
				zero = 1;
			}
		}
		System.out.println("o total é: "+acumulador);
		sc.close();

	}

}
