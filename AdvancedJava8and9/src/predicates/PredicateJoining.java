package predicates;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		int[] myNumbers = { 3, 11, 19, 27, 34, 51, 56, 59, 62, 64, 67, 69, 78, 79, 84, 88, 91 };

		Predicate<Integer> pr1 = i -> (i % 2 == 0);
		Predicate<Integer> pr2 = i -> (i > 50);

		for (int number : myNumbers) {

			if (pr1.test(number) && pr2.test(number)) {
				System.out.println(number);
			}
		}
System.out.println("######################################################################################################");
		// Checking for either of a condition

		for (int myNumber : myNumbers) {
			if (pr1.or(pr2).test(myNumber)) {
				System.out.println(myNumber);

			}
		}

	}
}