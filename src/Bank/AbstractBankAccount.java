package Bank;
//We then create an abstract class called "AbstractBankAccount" that implements "BankAccount" interface and provides some
//common functionality for bank accounts, like depositing and getting the balance, and also has an abstract "withdraw" method that
//each type of bank account can implement differently.

public abstract class AbstractBankAccount implements BankAccount {

	@Override
	public abstract int withdraw(int i);
	
	@Override
	public double deposit(double D_Amount) {
		System.out.println("you have deposited"+D_Amount+"$");
		return D_Amount;
	}


	public double getBalance(double Balance) {
		System.out.println("Your remaning bamance:"+Balance+"$");
		return Balance;
	}


}
