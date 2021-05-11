package functionalInterfaces;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String emp_name;
	int salary;

	Employee(String emp_name, int salary) {
		this.emp_name = emp_name;
		this.salary = salary;

	}

}

public class Demo2 {

	public static void main(String[] args) {


		ArrayList<Employee> eList = new ArrayList<Employee>();
		eList.add(new Employee("Shailendra", 10000));
		eList.add(new Employee("Bharati", 8000));
		eList.add(new Employee("Advait", 25000));

		Function<Employee, Integer> fp = e -> {

			int sal = e.salary;
			if (sal <= 8000) {
				return sal * 5 / 100;
			} else if (sal > 8000 && sal <= 5000) {
				return sal * 10 / 100;
			} else if (sal > 15000 && sal <= 20000) {
				return sal * 20 / 100;
			} else
				return sal * 30 / 100;
		};

		// Lets have fun by using Predicate to test bonus
		Predicate<Integer> p = b -> b > 2000;

		for (Employee e : eList) {

			int bonus = fp.apply(e);
			if (p.test(bonus)) {
				System.out.println(e.emp_name + " is eligible for performance bonus of INR: " + bonus);
			}
		}
	}
}
