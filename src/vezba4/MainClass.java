package vezba4;

public class MainClass {

	public static void main(String[] args) {
		Avtomobil auto1 = new Avtomobil();
		auto1.marka="Opel";
		auto1.model="Astra";
		auto1.km=10400;
		
		Avtomobil auto2= new Avtomobil("Toyota","Corolla", 23000);
		
		System.out.println(auto1.marka +" "+auto1.model+" "+auto1.km);
		System.out.println(auto2.marka +" "+auto2.model+" "+auto2.km);
		
	}

}
