package vezba7;

public class Triagolnik {
	
	int a, b, c; //strani na pravoagolen triagolnik
	//kateti a,b hipotenuza c
	float p; //plostina
	int l; //perimetar
	
	public Triagolnik() {
	};
	
	public float Plostina (int a, int b) {
		p=(a*b)/2;
		return p;
	}
	public int Perimetar(int a, int b, int c) {
		l=a+b+c;
		return l;
	}
}
