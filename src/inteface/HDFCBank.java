package inteface;

public class HDFCBank implements Bank{

	@Override
	public void atmCard() {
		System.out.println("HDFCBank");
		
	}

	@Override
	public void ccCard() {
		System.out.println("ccCard");
		
	}

	@Override
	public void roi() {
		System.out.println("roi");
		
	}

}
