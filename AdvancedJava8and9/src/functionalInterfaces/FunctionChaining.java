package functionalInterfaces;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args){
		
		Function<Integer,Integer> f1= n->n*2;
		Function<Integer, Integer> f2 = n -> n*n;
		
		// two chaining operators, andThen()   and compose()
		// andThen() evaluate first condition and then second
		// compose() evaluates second and then first
		
		System.out.println(f1.andThen(f2).apply(5)); // so, it will give f1= 5*2 = 10 and then 10*10 =100
		
		System.out.println(f1.compose(f2).apply(5)); // 5*5 = 25 and then 25*2 = 50
	}

}
