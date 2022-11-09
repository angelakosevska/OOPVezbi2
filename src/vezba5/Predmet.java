package vezba5;

public class Predmet {

	public String predm;
	public String prof;
	public int krediti;
	public int semestar;
	
	public Predmet() {} //Default konstr
	
	public Predmet(String predm) { //Dinamichen prima 1 vrednost
		this.predm=predm;
	}
	//Dinamichen i gi prima site vrednosti
	public Predmet (String predm, String prof, int krediti, int semestar) {
		this.predm=predm;
		this.prof=prof;
		this.krediti=krediti;
		this.semestar=semestar;
	}
	
	public static void main(String[] args) {
		

	}

}
