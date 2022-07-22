package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o número de linhas: ");
		int n = sc.nextInt();
		System.out.print("Entre com o número de colunas: ");
		int m = sc.nextInt();
		
		int[][] matriz = new int[n][m];
		
		System.out.println("-----------------");
		System.out.println("Entrada de valores");
		System.out.println("-----------------");
		for (int i=0; i<n; i++) {
			//System.out.print("i="+i+" ");
			for (int j=0; j<m; j++) {
				System.out.print("Elemento ["+i+","+j+"] :");
				matriz[i][j] = sc.nextInt();
				//System.out.print("j="+j+" ");
			}
			//System.out.println("----");
		}
		System.out.println("-----------------");
		
		System.out.println("Entre com o valor que deseja buscar na matriz: ");
		int valor = sc.nextInt();
		
		System.out.println("-----------------");
		System.out.println("Busca de valores");
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (matriz[i][j]==valor) {
					System.out.println("------------------");
					System.out.println("achei!!");
					System.out.println("Posição ["+i+","+j+"] :"+matriz[i][j]);
					if (i>0) {
						System.out.println("acima:"+matriz[i-1][j]);
					}
					if (i<n-1) {
						System.out.println("abaixo:"+matriz[i+1][j]);
					}
					if (j>0) {
						System.out.println("esquerda:"+matriz[i][j-1]);
					}
					if (j<m-1) {
						System.out.println("direita:"+matriz[i][j+1]);
					}
				}
			}
		}
		
		sc.close();

	}

}
