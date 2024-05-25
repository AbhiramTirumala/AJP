import java.util.Scanner;
public class Mergearrays {
	
	void mergearrays()
	{
		int a=0,b=0,i=0,j=0,k=0,l=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array 1 :");
		int m=sc.nextInt();
		int arr1[]=new int[m];
		System.out.println("Enter The Elements of Array 1 in Sorted Order(Ascending Order):");
		while(a<arr1.length)
		{
		    arr1[a]=sc.nextInt();
		    a++;
		}
		System.out.println("Enter Size of Array 2 :");
		int n=sc.nextInt();
		int arr2[]=new int[n];
		System.out.println("Enter The Elements of Array 2 in Sorted Order(Ascending Order):");
		while(b<arr2.length)
		{
		    arr1[b]=sc.nextInt();
		    b++;
		}
		int arr3[]=new int[arr1.length + arr2.length];
		
		while (i < arr1.length && j < arr2.length)
		{
	        if (arr1[i] <= arr2[j])
	        {
	            arr3[k++] = arr1[i++];
	        }
	        else
	        {
	            arr3[k++] = arr2[j++];
	        }
	    }
		i=0;
	    while (i < arr1.length)
	    {
	        arr3[k++] = arr1[i++];
	    }

	    while (j < arr2.length)
	    {
	        arr3[k++] = arr2[j++];
	    }

	   while(l<arr3.length)
	   {
		   System.out.println("The Merged Array is:"+arr3[l]);
		   l++;
	   }
	}
	public static void main(String[] args){
		
		Mergearrays ma=new Mergearrays();
		ma.mergearrays();

	}

}