
public class FizzBuzz {

	public static void main(String[] args) {
		//using for loop to iterate numbers from 1 to 50
		for(int i = 1 ; i <= 50 ; i++)
		{
			//using if condition for checking for both multiples of 4 and 5
			if(( i % 4 == 0 ) && ( i % 5 == 0))
				System.out.println("FizzBuzz");
			//using if else to check for multiples of 4
			else if( i % 4 == 0 )
				System.out.println("Fizz");
			//using if else to check for multiples of 5
			else if( i % 5 == 0 )
				System.out.println("Buzz");
			//printing all the other numbers other than multiples of 4 and 5
			else
				System.out.println(i);
				
		}

	}

}
