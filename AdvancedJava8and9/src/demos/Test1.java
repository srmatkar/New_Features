package demos;

@FunctionalInterface
interface cab {

	void bookCab();

}

@FunctionalInterface
interface cab2 {

	void bookCab(String from, String to);
}

interface cab3 {

	String bookCab(String from, String to);

}

public class Test1 {

	public static void main(String[] args) {

		cab cabObj = () -> System.out.println("Booked Ola Prime");

		cabObj.bookCab();

		cab2 cab2Obj = (from, to) -> System.out.println("Booked Ola Share from " + from + " to " + to);

		cab2Obj.bookCab("Panvel", "MBP");

		cab3 cab3Obj = (from, to) -> {
			System.out.println("Booked Ola Share from " + from + " to " + to);
			return ("Price : 555 INR");
		};
		
		cab3Obj.bookCab("Vashi", "CSMT");

	}

}
