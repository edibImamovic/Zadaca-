package zadacaCetvrtak;

public class zadatakTreci {
	public static void main(String[] args) {
		System.out.println("Unesite broj:");
		int broj = TextIO.getInt();
		int brojac = 0;
		
		for ( int i =1; i <= broj; i++ ){
			if ( broj %1==0) {
				brojac++;
			}
			}
			
			if (brojac ==2){
			System.out.println("Broj je prost");}
			
			else { System.out.println("Broj nije prost");}
					
		}
	}

