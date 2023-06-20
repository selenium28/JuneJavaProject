package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			int num = 100/5;
			System.out.println(num);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Rest of code");
		
	}
	


}
