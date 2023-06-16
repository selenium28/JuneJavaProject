package core;

public class ClassAndObject {
	
	static int a = 10;

	public static void main(String[] args) {
		System.out.println("Animal");
//		sleep();  // direct calling
		
//		ClassAndObject  --> Class name
//		obj ---> Reference variable
//		new --> keyword in java (memory allocation)
//		ClassAndObject()  --> constructor
//		new ClassAndObject();   --> Object
		
		ClassAndObject obj = new ClassAndObject();
		obj.eat();
		obj.running();
		ClassAndObject.sleep();
	}
	
	public void running() {
		System.out.println("Running");
	}
	
	public void eat() {
		System.out.println("Eat");
	}

	public static void sleep() {
		System.out.println("Sleep");
	}
	
}
