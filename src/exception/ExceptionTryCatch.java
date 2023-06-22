package exception;

public class ExceptionTryCatch {

	public static void main(String[] args) {
	
		// Can we use single try & multiple catch block   -> Yes
		// Can we use single catch & multiple catch try   -> No
		// We can use try block with finally block without catch block 
		try {
			int a[] = new int[4];
			a[5] = 100/5;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Rest of code");

		try {
			int a = 10/0;
			System.out.println(a);
		} finally {
			System.out.println("Finally block");
		}
	}

}
