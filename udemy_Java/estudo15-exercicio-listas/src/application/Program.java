package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List <Employee> list = new ArrayList<>();
		
		System.out.print("How many employee will be registered: ");
		int n = sc.nextInt();
				
		for (int inc = 1; inc<=n; inc++) {
			
			System.out.println("Employee #"+inc);
			System.out.print("Id: ");
			int id = sc.nextInt(); 
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.println("");
		System.out.println("------------");
		System.out.println("size: "+list.size());
		
		for (Employee aux: list) {
			System.out.println(aux.toString());
		}
		
		System.out.println("");
		System.out.println("------------");
		System.out.println("");
		
		System.out.print("Enter the employee id which will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		System.out.println(emp.toString());
		if (emp==null) {
			System.out.println("This ID does not exists");
		} else {
			System.out.print("What is the percentual salary increase [%]: ");
			double percentual = sc.nextDouble();
			emp.increaseSalary(percentual);
		}
		
		System.out.println("");
		System.out.println("------------");
		System.out.println("size: "+list.size());
		
		for (Employee aux: list) {
			System.out.println(aux.toString());
		}
		
		System.out.println("");
		System.out.println("------------");
		System.out.println("");
		
		
		
		
		
		
		sc.close();
		
		
		}

	
	public static boolean hasId(List<Employee> list, int id) {
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		return emp != null;
	
	}
	
}
