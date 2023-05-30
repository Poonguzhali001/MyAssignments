package Bank;

public class Axisbank extends bankinfo{

	public void deposit() {
	System.out.println("Amount Deposited");
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Axisbank bank = new Axisbank();
 
  
  bank.fixed();
 bank.saving();
 bank.deposit();
	}
	}

