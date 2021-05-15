package predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


class Employee{
	String eName;
	int salary;
	int experience;
	
	Employee(String eName, int salary, int experience){
		this.eName = eName;
		this.salary = salary;
		this.experience = experience;
		
	}
	
}

public class PredicateDemo2 {
	
	public static void main(String []args) {
		
		
		Employee emp = new Employee("Shailendra", 275000, 20);
		
		// For single employee object , lambda expression		
		Predicate<Employee> pr = e->(e.salary>15000 && e.experience>15);
		System.out.println(pr.test(emp));
			
		// Using Lambda over collections
		List<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Shailendra", 275000, 20));
		al.add(new Employee("Bharati", 100000, 16));
		al.add(new Employee("Advait", 14999, 1)) ;
		
		for (Employee e1: al) {
			if(pr.test(e1)) {
				System.out.println(e1.eName +  " : "+ e1.salary);
			}
			
		}
	}

}
