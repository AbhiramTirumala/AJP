//Super Class
class Transport
{
	//Declaring Variables
	String Name;
	String Model;
	int Year;
	//Declaring Method Transport Details
	void TransportDetails() 
	{
		System.out.print("Transport Details: Name:"+Name+", Model:"+Model+", Year:"+Year);
	}
}
//Child Class Road Transport Extending Transport
class RoadTransport extends Transport
{
	//Declaring Variables
	int Passenger_Capacity;
	String Engine_Type;
	//Declaring Method Road Transport Details
	void RoadTransportDetails() 
	{
		System.out.print(", Passenger Capacity:"+Passenger_Capacity+", Engine Type:"+Engine_Type);
	}
}
//Child Class Four Wheeler Extending Road Transport
public class FourWheeler extends RoadTransport
{
	//Declaring Variables
	int No_of_Seats;
	String Fuel_Type;
	String Gear_Transmission;
	int Gears;
	//Declaring Method Four Wheeler Details
	void FourWheelerDetails() 
	{
		System.out.print(", No.of Seats:"+No_of_Seats+", Fuel Type:"+Fuel_Type+", Gear Transmission:"+Gear_Transmission);
	}
	public static void main(String[] args) 
	{
		//Initializing Object for the Four Wheeler Class
		FourWheeler obj=new FourWheeler();
		//Initializing Variables
		obj.Name="Bugati";
		obj.Model="Chiron Profilée";
		obj.Year=2023;
		obj.Passenger_Capacity=2;
		obj.Engine_Type="W16 Quad-Turbo";
		obj.No_of_Seats=2;
		obj.Fuel_Type="Petrol";
		obj.Gear_Transmission="Automatic";
		obj.Gears=7;
		//Calling all the Methods Present in Parent Classes
		obj.TransportDetails();
		obj.RoadTransportDetails();		
		obj.FourWheelerDetails();

	}

}
