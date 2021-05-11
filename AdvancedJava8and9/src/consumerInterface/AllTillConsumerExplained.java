package consumerInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String emp_name;
	int salary;
	String gender;

	Employee(String name, int amount, String gender) {
		this.emp_name = name;
		this.salary = amount;
		this.gender = gender;

	}

}

public class AllTillConsumerExplained {

	public static void main(String[] args) {

		ArrayList<Employee> eList = new ArrayList<Employee>();
		eList.add(new Employee("Shailendra", 10000, "M"));
		eList.add(new Employee("Bharati", 8000, "F"));
		eList.add(new Employee("Advait", 25000,"M"));
		
		Function<Employee, Integer> f = emp-> emp.salary*(10/100); // Function interface, will perform operation and ret value
		
		Predicate<Integer> p = b->b>1800; // Prdicate Interface, decesion maker
		
		Consumer<Employee> ci = emp->{ // just consumes data
			System.out.println(emp.emp_name);
			System.out.println(emp.gender);
			System.out.println(emp.salary);
		};
		
		for (Employee emp:eList){
			
			int bonus = emp.salary*20/100;  // function, doing something
			// predicate testing something
			if (p.test(bonus)){
				
				ci.accept(emp); // just consumes
				System.out.println("Applicable Bonus is: "+ bonus);
				
			}
			
		}

	}
}
