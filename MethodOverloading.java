
public class MethodOverloading {
	void sum(int a,int b) {
	System.out.println("Sum of int:"+(a+b));}
	void sum(int a,int b,int c) {
		System.out.println("Sum of int:"+(a+b));}
	void sum(float a,float b) {
		System.out.println("Sum of float:"+(a+b));}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.sum(12, 13);

	}

}
