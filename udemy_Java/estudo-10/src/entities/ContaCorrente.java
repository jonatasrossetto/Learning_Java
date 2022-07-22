package entities;

public class ContaCorrente {
	private String titular;
	private int numeroConta;
	private double saldo = 0.0;

	public ContaCorrente(String titular, int numeroConta) {
		
		this.titular = titular;
		this.numeroConta = numeroConta;
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void addSaldo(double deposito) {
		this.saldo += deposito;
	}

	public void removeSaldo(double retirada) {
		this.saldo -= (retirada+5.0);
	}

}
