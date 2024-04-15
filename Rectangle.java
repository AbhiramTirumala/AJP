public class Rectangle {
    int length,breadth;
    void area()
    {
        System.out.println("Area of Rectangle =" + (length*breadth));
    }
    void perimeter()
    {
        System.out.println("Perimeter of rectangle =" + (length+breadth)*2);
    }
    public static void main(String[] args)
    {
        Rectangle rec=new Rectangle();
        rec.length=10;
        rec.breadth=20;
        rec.area();
        rec.perimeter();
    }
    
}
