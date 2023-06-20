package encap;

public class Encapsulation {
	
//	private field -- it cannot be accessed from outside the class.
//	This is called data hiding
	private int age; 
	
//	Why Encapsulation?
//	Encapsulation helps to keep related fields & methods together, which makes 
//	our code clean & easy to read.
		
//	setter & setter public methods provide read-only & write-only access to our class fields.
//	getAge() - read-only
//	setAge() - write-only
	public int getAge() {  
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		
		Encapsulation objEncapsulation = new Encapsulation();
		objEncapsulation.setAge(24);
		int a = objEncapsulation.getAge();
		System.out.println(a);

	}

}
