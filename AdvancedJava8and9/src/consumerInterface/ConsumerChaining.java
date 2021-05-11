package consumerInterface;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main (String[] args){
		
		Consumer<String> c1= s-> System.out.println(s + " is powerful");
		Consumer<String> c2= s-> System.out.println(s + " is spacious");
		Consumer<String> c3= s-> System.out.println(s + " has good road presence");
				
		// way 1
		c1.accept("KIA SELTOS");c2.accept("KIA SELTOS");c3.accept("KIA SELTOS");
		
		//way 2
		c1.andThen(c2).andThen(c3).accept("SELTOS");
		
		// way 3
		Consumer<String> c4 =c1.andThen(c2).andThen(c3);
		c4.accept("KIA");
	}

}
