package vezba1;

public class MainClass {
		public static void main(String[] args) {
			Student object1= new Student();
			object1.firstName="Andrej";
			object1.lastName="Boshkovski";
			object1.index=134;
			
			System.out.println("Podatoci za prv objekt:");
			System.out.println(object1.firstName + " "+ object1.lastName+" "+ object1.index);
			
			Student object2= new Student ("Angela","Angeloska",345);
			
			System.out.println( "Podatoci za vtor objekt:");
			System.out.println (object2.firstName+" "+object2.lastName+" "+object2.index);
		
		}
	
	
}
