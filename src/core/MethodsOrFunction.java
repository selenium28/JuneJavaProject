package core;

public class MethodsOrFunction {

	public static void main(String[] args) {
		MethodsOrFunction obj = new MethodsOrFunction();
		obj.display();
		obj.demo();
//		int m = obj.add(50, 100);
//		System.out.println(m);
		System.out.println(obj.add(50, 100));
	}
	
	public void display() {  // no input no output
		System.out.println("Display");
	}
	
	public void demo() {  // no input some output
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	
	public int add(int x, int y) { // int x, int y --> int parameters --> some input some output
		return x+y;
		
	}

}
