
public class RotateArray {

	public static void main(String[] args) {
		
		int arr[]= {23,98,65,34,90,18};
		
		int temp=0;
		
		for(int i=(arr.length)-1;i>=0;i--)
			
		{
			if(i==((arr.length)-1))
				temp=arr[i];
			
			if(i==0)
				arr[i]=temp;
			else
				arr[i]=arr[i-1];
			
		}
		
		for(int i=0;i<arr.length;i++)
			
			System.out.print(arr[i]+" ");

	}

}
