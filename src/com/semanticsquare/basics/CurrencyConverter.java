class CurrencyConverter {
	int rupee = 63;
	int dirham = 3;
	int _yen = 107;
	int $australian = 2;  // australian dollar
	int dollar;
	int Rupee = 63;
	
	void printCurrencies () {
		System.out.println ("rupee = " + rupee);
		System.out.println ("dirham = " + dirham);
		System.out.println ("_yen = " + _yen);
		System.out.println ("$australian = " + $australian);
		System.out.println ("dollar = " + dollar);
		System.out.println ("Rupee = " + Rupee);
	}
	
	public static void main (String args[]) {
		CurrencyConverter cc = new CurrencyConverter();
		cc.printCurrencies();
	}
	
}
