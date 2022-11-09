package vezba5;

public class MainClass {

	public static void main(String[] args) {
		//kreirame prv objekt so default konstruktor;
		Predmet p= new Predmet();
		p.predm="Objektno Orientirano Programiranje";
		p.prof="Iilija Jolevski";
		p.krediti=6;
		p.semestar=3;

		System.out.println("Predmet: "+p.predm);
		System.out.println("Profesor: "+p.prof);
		System.out.println(p.krediti+" krediti vo "+p.semestar+" semestar");
	
		Predmet predmet=new Predmet("Objektno orientirano programiranje");
		
		System.out.println(predmet.predm+": Sreda 23 Noemvri");
		
		Predmet pred= new Predmet("Algoritmi i strukturi na podatoci", "Violeta Manevska", 6, 3);
		
		System.out.println("Predmet: "+pred.predm);
		System.out.println("Profesor: "+pred.prof);
		System.out.println(pred.krediti+" krediti vo "+p.semestar+" semestar ");
		
		
		
	}

}
