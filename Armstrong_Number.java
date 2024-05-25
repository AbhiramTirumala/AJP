import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		int num=0,revnum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number to be Reversed:");
		num=sc.nextInt();
		for(;num!=0;) 
		{
			revnum=revnum*10+(num % 10);
			num/=10;
		}
		System.out.println("Reversed Number:"+revnum);
	}

}
