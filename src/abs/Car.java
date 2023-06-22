package abs;

public abstract class Car {
//	Partial Abstraction
//	0 to 100% Abstraction 
//	Abstraction - Hiding the implementation details from the user & showing the essential things.
	public void diesel() {
		System.out.println("Car - diesel");
	}
	
//	No method body
	public abstract void pertrol();
	public abstract void cng();
	
//	Non - abstract method
	public void mrfTyres() {
		System.out.println("Car - mrfTyres");
	}
	
	public void door() {
		System.out.println("Car - door");
	}

}
