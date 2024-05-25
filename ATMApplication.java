//Program to Demonstrate Custom Exception For an ATM Application
import java.util.Scanner;

public class ATMApplication {
	
	Integer AccountBalance;
	
	Integer  WithdrawAmt;
	
	void Withdraw(int amt) throws WithdrawLimitException,InsufficientFundsException
	{
		
		if(AccountBalance<=1000)
			
			throw new InsufficientFundsException("Insufficient Balance");
		
		else if(AccountBalance<amt)
			
			throw new InsufficientFundsException("Insufficient Balance");
		
		else
		{
			WithdrawAmt+=amt;
			
			if(WithdrawAmt>50000)
				
				throw new WithdrawLimitException("Withdraw Limit Reached,Please Try After 24 Hours.");
			
			AccountBalance-=amt;
			
			System.out.println(amt+" Amount Withdrawn Successfully");
		}
	}
	
	void CheckBalance()
	{
		System.out.println("Account Balance =" +AccountBalance);
	}
	

	public static void main(String[] args) {
		
		ATMApplication AA = new ATMApplication();
		
		AA.AccountBalance=100000;
		
		AA.WithdrawAmt=0;
		
		boolean l=true;
		
		while(l==true)
		{
			System.out.println("1.Withdraw \n2.Check Balance \n3.Exit");
			
			System.out.println("Enter your Choice:");
			
			Scanner sc= new Scanner(System.in);
			
			int n=sc.nextInt();
		
			switch(n)
			{
				case 1:{
						
						System.out.println("Enter Amount to be Withdrawn:");
						
						int amt=sc.nextInt();
						
						try
						{
							AA.Withdraw(amt);
							
						}
						
						catch(WithdrawLimitException WLE)
						{
							System.out.println(WLE);
						}
						
						catch(InsufficientFundsException IFE)
						{
							System.out.println(IFE);
						}
						
				 	  }
							break;
			case 2:
						AA.CheckBalance();
							break;
			}
			
			if(n==3)
				
				l=false;
		}
	}

}
