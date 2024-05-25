//program demonstrating method overloading with the class shape
public class Shape {
	//Defining methods with various number of parameters and types
	void Area(int length,int breadth) {
		System.out.println("Area of Rectangle is:"+(length*breadth));
	}
	void Area(int side) {
		System.out.println("Area of Square:"+(side*side));
	}
	void Area(float radius) {
		System.out.format("Area of Circle:%.3f",(3.14*radius));//using format method to round off the digits to 3 positions after the decimal
	}
	public static void main(String[] args) {
		//Creating object and Initializing it
		Shape s=new Shape();
		//Passing values as Parameters into the arguments into the methods
		s.Area(12,24);//calls the method of area of rectangle
		s.Area(3);//calls the method of area of square
		s.Area(5.7f);//calls the method of area of circle
	}

}
