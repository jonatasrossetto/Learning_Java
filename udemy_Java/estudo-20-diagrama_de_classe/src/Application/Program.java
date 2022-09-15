package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		Double workerBaseSalary = sc.nextDouble();
		sc.nextLine();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));
		System.out.print("How many contracts for this worker: ");
		Integer numberContracts = Integer.parseInt(sc.nextLine());
		
		
		for (int i=0;i<numberContracts;i++) {
			System.out.println("Enter data for the contract #"+i);
			System.out.print("Date (DD/MM/YYYY): ");
			String contractDate = sc.nextLine();
			System.out.print("Value per Hour: ");
			Double contractValueHour = sc.nextDouble();
			sc.nextLine();
			System.out.print("Duration: ");
			Integer contractDuration = Integer.valueOf(sc.nextLine());
			LocalDate tempDate = LocalDate.parse(contractDate, fmt1);
			HourContract tempContract = new HourContract(tempDate, contractValueHour, contractDuration); 
			worker.addContract(tempContract);
		}
		System.out.println("Enter month and year to calculate income (MM/YYYY):");
		String incomeMonthYear = sc.nextLine();
		int month = Integer.parseInt(incomeMonthYear.substring(0, 2));
		int year = Integer.parseInt(incomeMonthYear.substring(3));
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDepartment().getName());
		System.out.println("Income: "+worker.income(year, month));
				
	}

}

