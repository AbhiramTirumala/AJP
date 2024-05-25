
//Parent Class
class Graduation {
	String university_name;
	//Declaring Parent Class Variables
	int graduation_year;
	//Declaring Parent CLass Method
	void graduationdetails() {
	System.out.println("Graduation Details:"+university_name+" , "+graduation_year);

}
}

//Child Class
public class BTech extends Graduation {
	//Declaring Child Class Variables
	String major_degree;
	String minor_degree;
	double CGPA;
	//Declaring Child Class Method
	void BTechdetails() {
		System.out.println("BTech Details:"+major_degree+" , "+minor_degree+" , "+CGPA);
	}
	public static void main(String[] args) {
		//Initializing Parent Class Object
		BTech g=new BTech();
		//Initializing Parent Class Variables
		g.university_name="Avanthi Institute";
		g.graduation_year=2024;
		//Parent Class Method
		g.graduationdetails();
		//Initializing Child Class Object
		BTech b=new BTech();
		//Initializing Child CLass Variables
		b.major_degree="ComputerScience";
		b.minor_degree="NA";
		b.CGPA=7.3d;
		//Child Class Method
		b.BTechdetails();
	}
}