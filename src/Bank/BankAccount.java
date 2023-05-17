package Bank;
//7.  Create an interface called "BankAccount" that defines the basic methods that a bank account 
//should have - "deposit", "withdraw", and "getBalance". 
//We then create an abstract class called "AbstractBankAccount" that implements "BankAccount" interface and provides some
//common functionality for bank accounts, like depositing and getting the balance, and also has an abstract "withdraw" method that
//each type of bank account can implement differently.
public interface BankAccount {
	
	
public double deposit(double D_Amount);
public int withdraw(int withdraw);
public double getBalance(double Balance);


}
