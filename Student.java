
public class Student {
	String Name;
	int ID;
	public Student(String name, int iD) {
		super();
		Name = name;
		ID = iD;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return Name + ", " + ID;
	}
	
}
