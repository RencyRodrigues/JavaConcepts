package Bank;
//Finally, create a test class called "BankTest" that creates instances of each type of bank account and 
//performs some basic operations on them.
public class BankTest {

	public static void main(String[] args) {
	
		SavingsAccount s=new SavingsAccount();
		s.getBalance(10000);
		System.out.println("===============================================");
    	s.deposit(100);
    	System.out.println("===============================================");
		s.withdraw(11111111);
		System.out.println("===============================================");
		s.withdraw(11);
		System.out.println("===============================================");
    	s.calculateInterest(1);
    	System.out.println("===============================================");
		s.calculateInterest(13);
		System.out.println("===============================================");
		

		CheckingAccount c=new CheckingAccount();
		c.getBalance(5000);
		System.out.println("===============================================");
		c.deposit(200);
		System.out.println("===============================================");
     	c.withdraw(100);
	}

}
