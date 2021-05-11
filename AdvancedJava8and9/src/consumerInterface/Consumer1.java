package consumerInterface;

import java.util.function.Consumer;

public class Consumer1 {

	public static void main (String []args){
		
		Consumer<String> c1 = s-> System.out.println(s);
		Consumer<Integer>c2 = i -> System.out.println("My lucky number is: " + i);
		c1.accept("WelCome Shailendra");
		c2.accept(8);
		
	}

}
