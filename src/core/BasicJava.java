package core;

public class BasicJava {
	int a = 50; // Global variable  --> Scope of the GV is within the class
	String name = "Java"; 
	static int m = 100;  // static global variable

	public static void main(String[] args) {
		
		System.out.println("main method");
		BasicJava obj = new BasicJava();
		System.out.println(obj.name);
		obj.add();
		obj.sub();
		
	}
	
	public void add() {
		int b= 10; // Local Variable --> Scope of the local variable within the method
		int c=20;
		System.out.println(b+c);
	}
	
	public void sub() {
		int o = 50;
		System.out.println("20");
		System.out.println(m+o);
		
	}

}
