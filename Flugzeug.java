import java.util.Scanner;


public class Flugzeug {
	String modell;
	String farbe;
	int hoechsgeschwindigkeit;
	int beschleunigung;
	public Flugzeug(String modell, String farbe, int hoechstgeschwindigkeit, int beschleunigung) {
		this.modell = modell;
		this.farbe = farbe;
		this.hoechsgeschwindigkeit = hoechstgeschwindigkeit;
		this.beschleunigung = beschleunigung;
	}
	public Flugzeug ( int hoechstgeschwindigkeit, int beschleunigung ) {
		this("A380", "weiß", hoechstgeschwindigkeit, beschleunigung);
	}
	public double aktuellegeschwindigkeit(int zeit) {
		return zeit * beschleunigung;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Flugzeug a340 = new Flugzeug("A340", "weiß", 850, 40);
		Flugzeug a380 = new Flugzeug(950,50);
		Flugzeug a300 = new Flugzeug("A300", "schwarz", 750, 35);
		System.out.println("Geben sie an wie lang der A340 schon im flug ist");
		int zeit = s.nextInt();
		if(a340.aktuellegeschwindigkeit(zeit)>a340.hoechsgeschwindigkeit) {
			System.out.println(a340.hoechsgeschwindigkeit);
		}
		else {
			System.out.println(a340.aktuellegeschwindigkeit(zeit));
		}
	}
}
