package Bank;
//"CheckingAccount" should implements the "BankAccount" interface and has its own implementation of the "withdraw" method.

public class CheckingAccount implements BankAccount{
double checkingBalance;
double deposit;
	@Override
	public double deposit(double deposit) {
//System.out.println("===============================================");
		
		System.out.println("you have deposited "+deposit+"$"+" in your saving Account");
		
		checkingBalance=deposit+checkingBalance;
		System.out.println("your current balance is:"+checkingBalance+"$");
	//	System.out.println("===============================================");
//		
		return deposit;
	}

	@Override
	public int withdraw(int withdraw) {
//		int withdraw=1000;
		//System.out.println("===============================================");
		System.out.println("your withdraw amount is:"+withdraw+"$");
		if(checkingBalance>=0 && withdraw<=checkingBalance) {
			checkingBalance=checkingBalance-withdraw;
		System.out.println("remaning balance:"+checkingBalance);
	//	System.out.println("===============================================");
		}
		else {
			System.out.println("you dont have sufficient balance");
		//	System.out.println("===============================================");
		}
		return 0;}
//		for(int i=0;i>=0;i++) {}
//		System.out.println(i+withdraw);
		 

	@Override
	public double getBalance(double getBalance) {
		checkingBalance=getBalance;
		//System.out.println("===============================================");
		System.out.println("Your balance is:"+checkingBalance+"$");
		//System.out.println("===============================================");
		return getBalance;
	}
	

}
