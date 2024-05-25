
public class Largestarr {

	public static void main(String[] args) {
		int a[]= {23,24,78,54,98,17,3};
		int large=a[0];int small=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(large<a[i])
				large=a[i];
			if(small>a[i])
				small=a[i];
		}
		System.out.println("Largest Number"+large);
		System.out.println("Smallest Number"+small);
	}

}
