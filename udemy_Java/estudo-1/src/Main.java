import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=0;
		System.out.print("Quantas repeti��es? ");
		N = sc.nextInt();
		int valor=0;
		int soma=0;
		for (int inc=0; inc<N; inc++) {
			System.out.print("Digite o valor #"+inc+" : ");
			valor = sc.nextInt();
			soma += valor;			
		}
		System.out.println("A soma dos valores � igual a: "+soma);
		System.out.println("Fim");
		sc.close();

	}

}
