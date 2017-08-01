package testing;

public class VarArgsTest {
	
	public static void main(String[] args) {
		System.out.println("Average is: " + average(2.0,3.5,5.6));
	}
	
	public static double average(double...values) {
		double total = 0;
		
		for(double d: values) {
			total += d;
		}
		
		return total / values.length;
	}
}
