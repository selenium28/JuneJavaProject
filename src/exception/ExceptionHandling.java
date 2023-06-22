package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			int num = 100/0;
			System.out.println(num);
		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.toString());
			System.out.println(e.getMessage());
			
		}

		System.out.println("Rest of code");
		
	}
	


}
