import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		double x = 3.1416;
		// Locale.setDefault(Locale.US); 
		System.out.println("Olá mundo");
		System.out.print("bom dia   ");
		System.out.println("teste");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.3f%n",x);
		System.out.println("Resultado = " + x + " em metros");
		System.out.printf("Resultado = %.3f em metros %n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

		System.out.printf("%n %n");
		
		String product1 = "computer";
		String product2 = "office desk";
		
		int age = 32;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products");
		System.out.printf("%s, which price is $ %.2f %n", product1, price1);
		System.out.printf("%s, which price is $ %.2f %n %n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f %n", measure);
		System.out.printf("Rounded (three decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US); 
		System.out.printf("Rounded (three decimal places): %.3f %n", measure);
		
		
	}

}
