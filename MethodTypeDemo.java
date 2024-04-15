public class MethodTypeDemo {
    //simple method
    void fun()
    {
        System.out.println("simple Method");
    }
        //method with perameters
         void add(int a,int b)
        {
            System.out.println(a+b);
        }
        int product(int a,int b)
        {
            int product = a*b;
            return product;
        }

    public static void main(String[] args)
    {
        MethodTypeDemo mdemo = new MethodTypeDemo();

        mdemo.fun();
        mdemo.add(20,30);
        mdemo.product(2,20);
        System.out.println("pdrofuct"+mdemo.product(2,20));;
}
}