public class Largest_number {
    public static void main(String[] args)
    {
        //Declaring and Initialing the variables
        int num1=2,num2=4,num3=5;
        //Defining the if Condition
        if (num3 > num1) 
        {
            //Using the Nested if for further condition
            if (num3 > num2)
                System.out.println("The Greatest Number is:"+num3);
            else
                System.out.println("The Greatest Number is:"+num2);
        } 
        else 
        {
            //Using the Nested if for further condition
            if (num1 > num2)
                System.out.println("The Greatest Number is:"+num1);
            else
                System.out.println("The Greatest Number is:"+num2);
        }
    }
}
