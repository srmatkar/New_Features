package lambda;

public class HelloWorld {
	
	
	interface Greetable {		
		public void sayHello();
		
	}
	
	interface Growable{
		
		public int giveDouble(int a);
	}
	
public static void main (String[] args) {
	
	Greetable g =()->System.out.println("Hellow World");
	g.sayHello();
	
	Growable gr = a-> a*2;
	System.out.println(gr.giveDouble(4));
	
	
	
}


	
}
