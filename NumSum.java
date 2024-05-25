import java.util.Scanner;

public class NumSum {
	
	int Sum(int num) {
		
		int sum=0;
		for(;num!=0;num/=10)
		{
			sum = sum + num % 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();int sum=0;
		NumSum ns=new NumSum();
		System.out.println(ns.Sum(sum));
		
	}

}
