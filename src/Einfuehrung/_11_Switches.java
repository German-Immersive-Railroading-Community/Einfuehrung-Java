package Einfuehrung;

public class _11_Switches {

	public static void main(String[] args) {
		int zahl = 42;
		
		// Ein Switch ist eine Alternative zum If-Else-Statement
		// Ein Switch kann byte, short, int, char, enums und Strings vergleichen - keine long, float, double oder Objekte
		// Ein Switch kann nur auf Gleichheit prüfen!
		
		switch (zahl) {												// nach dem Schlüsselwort switch kommt die zu prüfende Variable in runde Klammern,
																	// die Cases stehen in geschweiften Klammern
			case 23: System.out.println("1"); break;				// nach dem Schlüsselwort case kommt der Vergleichswert, dahinter ein Doppelpunkt
			case 42: System.out.println("2"); break;				// trifft ein Case zu, so wird der Code dahinter ausgeführt bis zum "break"-statement
																	// fehlt das break, so wird der gesamte restliche Switch ausgeführt (testet das mal, dass ihr das break weg lasst)
			case 67: System.out.println("3"); break;				// jeder Case muss einen anderen Vergleichswert prüfen, es muss mind. 1 case vorhanden sein
			default: System.out.println("default");					// mit default kann ein alternativer Zweig angegeben werden, falls kein case zutrifft
																	// dieser ist optional - fehlt er, so passiert nichts
		}															// der Switch endet mit einer geschweifenten Klammer zu
	
		if(zahl == 23) {
			System.out.println(zahl);
		} else if (zahl == 42) {
			System.out.println(zahl);
		} else if (zahl == 67) {
			System.out.println(zahl);
		} else {
			System.out.println(zahl);
		}
		
		// Das If-Statement und der Switch sind semantisch identisch und tun dasselbe.
	}

}
