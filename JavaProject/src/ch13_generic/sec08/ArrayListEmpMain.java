package ch13_generic.sec08;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEmpMain {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1001, "이사원", 3000.55);
		Employee e2 = new Employee(1002, "김대리", 4000.75);
		Employee e3 = new Employee(1003, "박과장", 5000.77);

		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			/*
			 Employee emp = list.get(i);
			System.out.println(emp);
			*/
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		for(Employee e : list) {
			System.out.println(e);
		}
		System.out.println();
		
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
