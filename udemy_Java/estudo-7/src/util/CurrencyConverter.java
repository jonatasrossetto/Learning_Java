package util;

public class CurrencyConverter {

	public double dollarPrice;
	public double dollarValue;

	public double amountPaid() {
		return dollarPrice * dollarValue * 1.06;
	}

}
