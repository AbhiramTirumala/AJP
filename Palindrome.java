import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//Declaring variables
		int num,revnum=0,orgnum;
		//Creating Object for Scanner class and Reading Input from Console
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to check Whether it is a Palindrome or not:");
		//Initializing num and orgnum variables
		num=orgnum=sc.nextInt();
		//for Loop defined to perform reverse of a given Number
		for(;num!=0;num/=10) 
		{
			revnum=revnum*10+(num % 10);
		}
		//If Condition to compare orgnum and revnum
		if(orgnum==revnum)
			System.out.println("The Given Number is  a Palindrome");
		else
			System.out.println("The Given Number is not a Palindrome");
		sc.close();
	}
}
