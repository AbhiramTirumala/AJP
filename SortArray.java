//Program to Sort an Array in Ascending Order
public class SortArray {

	public static void main(String[] args) {
		//Declaring and Initializing Array arr
		int arr[]= {23,56,34,44,9,1};
		//Defining Loop 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					//Interchanging elements in array
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
