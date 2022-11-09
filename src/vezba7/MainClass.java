package vezba7;

public class MainClass {

	public static void main(String[] args) {

		Triagolnik triagolnik= new Triagolnik();
		System.out.println("Plostinata na triagolnikot e: " +triagolnik.Plostina(3,4)+" cm^2");
		System.out.println(",a perimetarot: "+ triagolnik.Perimetar(3,4,5)+" cm");
	}

}
