//Defining class Airways and Overriding the methods of the Inheritance Make My Trip
public class AirWays implements MakeMyTrip{

	@Override
	public void Departure(String Dep) {
		System.out.println("Departue City:"+Dep);
		
	}

	@Override
	public void Destination(String Des) {
		System.out.println("Destination City:"+Des);
		
	}

	@Override
	public void TicketPrice(int TP) {
		System.out.println("Ticket Price:"+TP);
		
	}
	public static void main(String[] args) {
		AirWays AW=new AirWays();
		//Passing Arguments into the methods
		AW.Departure("Hyderabad");
		AW.Destination("Banglore");
		AW.TicketPrice(4500);

	}

}
