package zadacaCetvrtak;

public class zadatakPrvi {
	public static void main(String[] args) {
	
	System.out.println("Unesite vasu platnu osnovicu:");
		int osnovica = TextIO.getInt();
	System.out.println("Unesite vasu satnicu:");
		int satnica = TextIO.getInt();
	System.out.println("Unesite vasu platnu osnovicu:");
		int brojSati = TextIO.getInt();
	int plata = osnovica + satnica + brojSati;
		System.out.printf("Vaša plata je:%d",plata);
	
}
}
