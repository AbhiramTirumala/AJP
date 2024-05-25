//program to Add two Multi-Dimensional Arrays
public class AddArray {

	public static void main(String[] args) {
		
		int [][] arr_a = {{21,56,34},{98,32,13}};
		
		int arr_b[][] = {{54,67,78},{87,32,35}};
		
		int [][] arr_c = new int[2][3];
		
		for(int i=0 ; i<2 ; i++ )
		
		{
			for(int j=0 ; j<3 ; j++ )
				
				//Adding the Two Arrays
				
				arr_c[i][j] = arr_a[i][j] + arr_b[i][j] ;
		}
		
		System.out.println("The Resultant Array is:");
		
		for(int i=0 ; i<2 ; i++ )
			
		{
			
			System.out.print("{");
			
			for(int j=0 ; j<3 ; j++ )
				
				//Printing the Resultant Array
				
				System.out.print(arr_c[i][j]+" ");
			
			System.out.print("} ");
			
		}

	}

}
