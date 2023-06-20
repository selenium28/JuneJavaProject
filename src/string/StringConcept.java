package string;

public class StringConcept {

	public static void main(String[] args) {
		String str = new String("Java");
		String str2 = " Java ";
		
		String str3 = new String("Java");
		String str4 = "Selenium";
		String str5 = "Test";
		String str6 = "Test";
		String str7 = new String("Selenium");
		
//		== Operator : Address comparison / reference comparison 
//		equals -> Content comparison
		System.out.println(str==str2);  // false
		System.out.println(str==str3);  // false
		System.out.println(str5==str6); // true
		
		System.out.println(str.equals(str2));   // true
		System.out.println(str5.equals(str6));  // true
		System.out.println(str4.equals(str7));  // true
		
		String beforeTrim = " Java ";
		
		String afterTrim = str2.trim();
		System.out.println(beforeTrim);
		System.out.println(afterTrim);
		
	}

}
