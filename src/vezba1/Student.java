package vezba1;

public class Student {
	public String firstName;
	public String lastName;
	public int index;
	//default konstruktor
	public Student () {
		
	}
	//konstruktor koj na vlez prima argumenti
	public Student (String firstName, String lastName, int index) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.index= index;	
	}
	}
