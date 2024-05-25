//program to Multiply two Multidimensional Arrays
public class MulArrays {

	public static void main(String[] args) {
		//Declaring Arrays
		int arr_a[][]= {{13,27,22},{11,21,10},{43,37,28}};
		int arr_b[][]= {{21,32,43},{10,19,12},{32,41,20}};
		int arr_c[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				//Multiplying elements of Arrays using their Indexes
				arr_c[i][j] += arr_a[i][k] * arr_b[k][j];
			}
		}
		//Printing Out the Elements of Arrays
		System.out.println("The Elemnts of the Resultant Array are:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(arr_c[i][j]+" ");
				System.out.print("  ");
		}

	}

}
