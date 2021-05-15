package predicates;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String []args) {
		
		Predicate<Integer> p = i->(i>10);
		System.out.println(p.test(20));
		System.out.println(p.test(10));
		
		// Length of String
		Predicate<String> pr = s->(s.length()>4);
		System.out.println(pr.test("August"));
		
		// print array element if length > 4
		
		String[] months = {"January","February","March","April","May","June","July","August"};
		
		for (String m:months) {
			
			if(pr.test(m)) {
				System.out.println(m);
				
			}
			
			
		}
	}

}
