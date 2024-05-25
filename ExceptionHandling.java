//Program to Demonstrate Try,Catch and Finally
public class ExceptionHandling {

	public static void main(String[] args) {
		//Defining Try Block
		try
		{
			int a[]= {1,23,67,93};
			
			System.out.println(a[4]);
		}
		//Defining Catch Block to Handle The Exception 
		catch(ArrayIndexOutOfBoundsException A)
		{
			System.out.println("Array Index Out Of Bounds Exception");
		}
		try
		{
			String s="Qwerty";
			
			System.out.println(s.charAt(10));
		}
		catch(StringIndexOutOfBoundsException S)
		{
			System.out.println("String Index Out Of Bounds Exception");
		}
		//Defining Finally Block Which are Necessary To be Printed
		finally
		{
			System.out.println("Finally Block");
		}
	}

}
