package Einfuehrung;

public class _20_Printf {

	public static void main(String[] args) {
		
		final int a = 4 ,b = 3,c = 2,d = 1;
		final double ad = 1.23, bd = 9.87;
		
		System.out.printf("Hallo Welt!\n");			// 'printf' steht für "print formated" bzw. "ausgeben formatiert"
													// mit 'printf' kann man Ausgaben also vorher formatieren
		
		System.out.println("Zahl a: " + a + "  Zahl b: " + b + "  Zahl c: " + c + "  Zahl d: " + d + "  Zahl ad: " + ad + "  Zahl bd: " + bd);
		//In standartmäßigen Println müssen mehrere Strings jeweils mit einem '+' verbunden werden.
		//Außerdem werden nur so viele Stellen ausgegeben, wie die Zahl besitzt
		
		System.out.printf("Zahl a: %d  Zahl b: %d  Zahl c: %d  Zahl d: %d  Zahl ad: %f  Zahl bd: %f",a,b,c,d,ad,bd);
		// Mit "printf" wird die Ausgabe "vorgeschrieben" und die Variablen als Parameter übergeben.
		// Dort wo die Parameter eingefügt werden sollen werden im String Platzhalter platziert.
		// Jeder primitive Datentyp hat dabei seinen eigenen Platzhalter, damit dem Programm klar ist, was es ausgeben soll 
		// %d - Integer, %s - Strings, %c - Charakters, %b - Booleans, %f - Floats und Doubles , %p - Speicheraddressen
		System.out.println();
		
		System.out.printf("\t \" \' \n"); 			// \t springt an die nächste Tabulatorposition, \" gibt Anführungszeichen aus ohne den String zu beenden
										  			// \' gibt einen Abostroph aus ohne den Charakter zu beenden, \n springt in eine neue Zeile
		
		System.out.printf("\\ %% \n");		 		// \\ gibt den Gegenschrägstrich (Backslash) aus, %% gibt das Prozentzeichen aus
		
		System.out.print("a + b = " + a+b); System.out.printf("  vs  a + b = %d\n", a+b);
		// Durch die Übergabe als Parameter und nicht als String sind auch Berechnungen möglich
		
		System.out.printf(" %.2f - %d - %10d - %010d - %.2f", ad, a, a, a, (double) a); // Casting kommt späater noch ;)
		// Man kann auch Zahlen formatieren: .2 - 2 Nachkommastellen (nur float oder double), 10 - für diesen Parameter 10 Stellen reservieren
		// (nicht gebrauchte werden mit Leerzeichen aufgefüllt), 010 für diesen Parameter 10 Stellen reservieren (nicht gebrauchte werden mit '0' aufgefüllt)
		
		System.out.printf("\nUnicode: \u0040");		// Mit \ u und einer 4-stelligen Hexadezimal Zahl könnt ihr des Zeichen der Zeichentabelle (einfach mal
													// in der Suchleiste des Computer suchen) darstellen
		
		// Für weitere Details schaut euch die Wikipedia-Seite zu "printf" an.
		
	}

}
