public class Car {
    //Declaring Static Variables
    static int doors,wheels,windows,headlights;
    //Declaring Instance Variables
    int gears,seats;
    //Declaring Static Method
    static void car_externals(){
        System.out.println("Doors:"+doors+"\nWheels:"+wheels+"\nWindows"+windows+"\nHeadlights"+headlights);
    }
    //Declaring Regular Method
    void car_internals(){
        System.out.println("\nSeats"+seats+"\nGears"+gears);
    }
    public static void main(String[] args)
    {
        Car c=new Car();
        //Intialing Instance Variables
        c.gears=4;
        c.seats=5;
        //Intialing Static Variables
        Car.doors=4;
        Car.wheels=4;
        Car.windows=4;
        Car.headlights=2;
        //Calling Static Method
        Car.car_externals();
        //Calling Regular Method
        c.car_internals();

    }
}
