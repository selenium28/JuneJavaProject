package polymor;

public class MethodOverloading {

	// Duplicate methods are not allowed in java
	// Method inside the method is not allowed
	// Can we overload main method?
	// Yes we can overload main method.
	// Method overloading --> Method overloading means same method name with different input 
	// parameters within the same class 

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add();

	}

//	public static void main() {
//		System.out.println("Second main method");
//	}

	public void add() { // zero input parameter
		System.out.println("Add method with zero input para");
	}

	public void add(int a) { // one input para
		System.out.println("Add method with one input para");
	}

	public void add(int a, int b) { // two input para
		System.out.println("Add method with two input para");
	}

	public void add(double d) { // one input para with datatype
		System.out.println("Add method with one input para with datatype");
	}

	public void add(double d, int m) { // one input para with datatype
		System.out.println("Add method with one input para with datatype");

	}

}
