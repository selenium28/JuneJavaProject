package core;

public class ConstructorClass {
	
//	Sequence of execution --> Static Block  --> Main method Prints(args) --> blank block -->
//	Constructor(once object is created) --> methods calling
//	Constructor  --> Constructor is a block, Once we created an object Constructor will automatically calls.
//	Constructor name should be same as class name
//	Constructor does not have return type

	{  // block
		System.out.println("Blank Block");
	}
	
	{  // block
		System.out.println("Blank Block");
	}
	
	static
	{
		System.out.println("Static Block");
	}
	
	static
	{
		System.out.println("2nd Static  Block");
	}
	
	public void display() {
		System.out.println("display method");
	}
	
	ConstructorClass(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		System.out.println("Main method -- 2nd");

		ConstructorClass obj = new ConstructorClass();
		obj.display();
		
	}

}
