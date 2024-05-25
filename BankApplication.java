
public class BankApplication {
	
	Integer AccountBalance;
	
	void Withdraw(int amt) throws InsufficientFundsException 
	{
		if(AccountBalance<1000)
			
			throw new InsufficientFundsException("Insufficient Balance");
		
		else
		{
			
			AccountBalance-=amt;
			
			System.out.println(amt+" Amount Withdrawn Successfully");
		}
	}
	
	void CheckBalance()
	{
		System.out.println("Account Balance ="+AccountBalance);
	}
	
	void Deposit(int amt)
	{
		
		AccountBalance+=amt; 
		
		System.out.println(amt+" Deposited Successfully");
	}
	public static void main(String[] args) {
		
		BankApplication BA= new BankApplication();
		
		BA.AccountBalance=100000;
		
		BA.Deposit(3000);
		
		try
		{
			BA.Withdraw(103000);
			BA.Withdraw(100);
		}
		
		catch(InsufficientFundsException IFE)
		{
			System.out.println(IFE);
		}
		
		BA.CheckBalance();
		
	}

}
