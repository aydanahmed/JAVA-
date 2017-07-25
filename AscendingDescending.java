
public class AscendingDescending {

	public static void main(String[] args) {
		int[] arr = { 2,1 };
		
		printNumbers(arr, "Asc");
		
		System.out.println("=====================================================");

		printNumbers(arr, "Desc");
	}

	public static void printNumbers(int[] arr, String asdDesc) {
		int value = 0;
		int valueLength = 0;
		
		if (asdDesc.equals("Asc")) {			
			valueLength = arr.length;
			
		} else if (asdDesc.equals("Desc")) {
			value = -(arr.length-1);
			valueLength = 1;
		}
		
		for(int i = value; i < valueLength;i++) {
			System.out.println(arr[Math.abs(i)]);		
		}
	}

}
