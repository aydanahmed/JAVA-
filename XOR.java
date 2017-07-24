package exercise;

public class XOR {
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,3,4,4,5,5};
		int ret = 0;
		
		for ( int i = 0 ; i < arr.length;i++) {
			ret = ret ^ arr[i];
			
			System.out.println(ret);
		}
		System.out.println(ret);
		
		
		
		
	}
}
