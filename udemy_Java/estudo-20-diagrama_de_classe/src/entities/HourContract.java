package entities;

import java.time.LocalDate;

public class HourContract {
	public LocalDate date;
	public Double valuePerHour;
	public Integer Hours;


	public HourContract() {
	
	}

	public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		Hours = hours;
	}
	
	public Double totalValue() {
		return this.Hours*this.valuePerHour;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return Hours;
	}

	public void setHours(Integer hours) {
		Hours = hours;
	}
	
	
	
}
