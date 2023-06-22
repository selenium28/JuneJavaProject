package inteface;

public interface Bank {
// No method body - method declaration
//	We can achieve 100% abs.
//	Always define abs methods in interface
//	Only default method is allowed in interface
//	Can we create object of Interface?
//	No - We can't create object of Interface 
	
	public void atmCard();
	public void ccCard();
	public void roi();
	
	default void savingAc() {
		System.out.println("Bank -- default SavingAc");
	}
}
