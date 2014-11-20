package zadacaCetvrtak;

public class zadtakDrugi {
	public static void main(String[] args) {
	int a,b;
	do {
		System.out.println(" Unesite prvi broj:");
		a = TextIO.getInt();
		System.out.println(" Unesite drugi broj:");
		b = TextIO.getInt();
		System.out.printf("%d,%d,%d",a+b,a-b,a*b);
		
	}
	while ((a!=0)||(b!=0));
	}

}
