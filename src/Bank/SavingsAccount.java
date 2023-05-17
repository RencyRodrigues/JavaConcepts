package Bank;
//Create 2 classes -  types of bank accounts - "SavingsAccount" and "CheckingAccount".
//"SavingsAccount" extends "AbstractBankAccount" and implements its "withdraw" method to ensure that the balance never goes negative.
//It also has a method to calculate the interest earned on the account. 
 
public class SavingsAccount extends AbstractBankAccount {
double annual_interest=0.1;
double savingsBalance;
double deposit;
	@Override
	public int withdraw(int withdraw) {
//		int withdraw=1000;
	//	System.out.println("===============================================");
		System.out.println("your withdraw amount is:"+withdraw+"$");
		if(savingsBalance>=0 && withdraw<=savingsBalance) {
			savingsBalance=savingsBalance-withdraw;
		System.out.println("remaning balance:"+savingsBalance);
	//	System.out.println("===============================================");
		}
		else {
			System.out.println("you dont have sufficient balance");
			System.out.println("===============================================");}
//		for(int i=0;i>=0;i++) {}
//		System.out.println(i+withdraw);
		 
		
		return 0;
	}
	public double getBalance(double getBalance) {
		savingsBalance=getBalance;
		//System.out.println("===============================================");
		System.out.println("Your balance is:"+savingsBalance+"$");
		//System.out.println("===============================================");
		return getBalance;
	}
	@Override
	public double deposit(double deposit) {
		//System.out.println("===============================================");
		
		System.out.println("you have deposited "+deposit+"$"+" in your saving Account");
		
		savingsBalance=deposit+savingsBalance;
		System.out.println("your current balance is:"+savingsBalance+"$");
		//System.out.println("===============================================");
//		
		return deposit;
	}


	


		public void calculateInterest(int enter_month){
			//System.out.println("===============================================");
			switch (enter_month) {
			case 1:
				savingsBalance += ((savingsBalance * annual_interest) / 12);
				System.out.println("one month interest is:"+savingsBalance);
				//System.out.println("===============================================");
				break;
			case 2:
				savingsBalance += ((savingsBalance * annual_interest) / 12)*2;
				System.out.println("two months interest is:" + savingsBalance);
			//	System.out.println("===============================================");
				break;
			case 3:
				savingsBalance += ((savingsBalance * annual_interest) / 12)*3;
				System.out.println("three months interest is:" + savingsBalance);
			//	System.out.println("===============================================");
				break;
				
			case 4:
				savingsBalance += ((savingsBalance * annual_interest) / 12)*4;
				System.out.println("four months interest is:" + savingsBalance);
				//System.out.println("===============================================");
				break;
			case 5:
				savingsBalance += ((savingsBalance * annual_interest) / 12)*5;
				System.out.println("five months interest is:" + savingsBalance);
				//System.out.println("===============================================");
				break;
			case 6:
				savingsBalance += ((savingsBalance * annual_interest) / 12)*6;
				System.out.println("six months interest is:" + savingsBalance);
				//System.out.println("===============================================");
				break;
			case 7:
				savingsBalance += ((savingsBalance * annual_interest) / 12)*7;
				System.out.println("seven months interest is:" + savingsBalance);
				//System.out.println("===============================================");
				break;
			case 8:
				savingsBalance += ((savingsBalance * annual_interest) / 12)*8;
				System.out.println("eight months interest is:" + savingsBalance);
				//System.out.println("===============================================");
				break;
			case 9:
				savingsBalance += ((savingsBalance * annual_interest) / 12)*9;
				System.out.println("nine months interest is:" + savingsBalance);
				//System.out.println("===============================================");
				break;
			case 10:
				savingsBalance += ((savingsBalance * annual_interest) / 12)*10;
				System.out.println("ten months interest is:" + savingsBalance);
				//System.out.println("===============================================");
				break;
			case 11:
				savingsBalance += ((savingsBalance * annual_interest) / 12)*11;
				System.out.println("eleven months interest is:" + savingsBalance);
				//System.out.println("===============================================");
				break;
			case 12:
				savingsBalance += ((savingsBalance * annual_interest) / 12)*12;
				System.out.println("one year interest is:" + savingsBalance);
				//System.out.println("===============================================");
			
			default :
				System.out.println("enter valid month");
				//System.out.println("===============================================");
			}}}
//			savingsBalance += ((savingsBalance * annual_interest) / 12);
//	        double monthly_interest=savingsBalance;
//	        System.out.println("monthly interest is:"+monthly_interest);
	        
	        
//	        savingsBalance += (savingsBalance * annual_interest);
//	        double yearly_interest=savingsBalance;
//	        System.out.println("yearly interest is:"+yearly_interest);
	        
	        

	
		
