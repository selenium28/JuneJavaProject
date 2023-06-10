package basic;

public class ArrayConcept {
	
	// Index will start from 0 (zero)
//	 Array --> To store similar data type in array variable
	
	public static void main(String[] args) {
		
//		1.  Array of int
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
//		arr[5] = 60;    ArrayIndexOutOfBoundsException:
		
		System.out.println(arr[4]);
		System.out.println(arr[1]);
//		System.out.println(arr[5]);
		
//		2. Array of double
		
		double[] d = new double[4];
		
		Object[] object = new Object[5];
		object[1] = "Dev";
		object[2] = 10;
		
		System.out.println(object[1]);
		

	}

}
