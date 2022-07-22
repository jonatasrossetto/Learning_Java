package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exemplo de uso de objetos - conta corrente");
		
		System.out.print("Qual o nome do titular: ");
		String titular = sc.nextLine();
		
		System.out.print("Número da conta corrente: ");
		int numeroConta = sc.nextInt();
		
		sc.nextLine();
		
		ContaCorrente conta = new ContaCorrente(titular,numeroConta);
				
		System.out.print("Deseja fazer um depósito inicial (S/N)? ");
		char opcao = sc.nextLine().charAt(0);
		
		if (opcao=='S') {
			System.out.print("Valor do depósito de abertura: ");
			conta.addSaldo(sc.nextDouble());
					}
		
		System.out.println(conta.getNumeroConta() + "  " + conta.getTitular() + "  " + conta.getSaldo() );
		
		System.out.print("Valor do depósito: ");
		conta.addSaldo(sc.nextDouble());
		
		System.out.println(conta.getNumeroConta() + "  " + conta.getTitular() + "  " + conta.getSaldo() );
		
		System.out.print("Valor do saque: ");
		conta.removeSaldo(sc.nextDouble());
				
		System.out.println(conta.getNumeroConta() + "  " + conta.getTitular() + "  " + conta.getSaldo() );
			
		sc.close();
	}

}
