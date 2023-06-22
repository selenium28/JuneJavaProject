package inteface;

public class RunBank {

	public static void main(String[] args) {
		HDFCBank objHDFCBank = new HDFCBank();
		objHDFCBank.atmCard();
		objHDFCBank.ccCard();
		objHDFCBank.savingAc();
		objHDFCBank.roi();
		
//		Bank objBank =new Bank(); Cannot instantiate the type Bank

	}

}
