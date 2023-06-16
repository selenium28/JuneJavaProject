package basic;

public class StringConcat {
	// + --> Concat operator

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		String str = "Java";
		String ptr = "Selenium";
		
		System.out.println(a+b);  // 300
		System.out.println(a+str); // 100Java
		System.out.println(a+b+ptr);  // 300Selenium
		System.out.println(a+ptr+a+b); // 100Selenium100200
		System.out.println(a+b+str+a);  // 300Java100
		System.out.println(b+a+str+b+(a+b));  // 300Java200300

	}

}
