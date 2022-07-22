package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Marco");
		list.add("Jonatas");
		list.add("Sheila");
		list.add("Olivia");
		list.add(2,"Jessica");
		list.add("Marco");
				
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		System.out.println(list.get(6));
		System.out.println("-------------------");
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------");
		list.remove("Marco");
				
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------");
		list.sort(Comparator.naturalOrder());						
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------");
		list.removeIf(x -> x.charAt(0)=='J');
		for (String x : list) {
			System.out.println(x);
		}
		
		
		
		
		System.out.println("Index of Olívia: " + list.indexOf("Olivia"));
		System.out.println("------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		//list.add("Jônatas");
		
		System.out.println("------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}
