package functionalInterfaces;

import java.util.function.Function;

public class FunctionaInt1 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = n -> n*n;
		System.out.println(f.apply(10));
		System.out.println(f.apply(4));
		System.out.println(f.apply(8));
		
		Function<String, Integer> f1 = n->n.length();
		System.out.println(f1.apply("Shailendra"));
		System.out.println(f1.apply("Shailendra Matkar"));
	}

}
