package Einfuehrung;

public class _2_Variablen {
	public static void main(String[] args) {
		
		int ganzZahlVariable;				// Deklaration einer Ganzzahlvariable (Speicherplatz wird für diese reserviert)
		ganzZahlVariable = 42;				// Initialisierung der Variablen (der Variable wird ein Wert zugewiesen)
		int ganzZahl2 = 23;					// Deklaration und Initialisierung können gemeinsam geschehen
		int zahl1 = 0, zahl2 = 1;			// es können auch mehrere Variablen desselben Typs gleichzeitig erstellt werden
		
		byte kleinsteZahl;					// byte: Ganzzahl (-128 -> 127 ; 8 bit bzw 1 byte)
		short kleineZahl;					// short: Ganzzahl (-32.768 -> 32.767 ; 16 bit bzw 2 byte)
		int normaleZahl;					// int: Ganzzahl (-2.147.483.648 -> 2.147.483.647 ; 32 bit bzw 4 byte)
		long grosseZahl;					// long: Ganzzahl (-9.223.372.036.854.775.808 -> 9.223.372.036.854.775.807 ; 64 bit bzw 8 byte)
		grosseZahl = 15348L;				// long-Zahlen müssen mit einem "L" hinter der Zahl initialisiert werden
		
		double ersteKommaZahl;				// double: Kommazahl (ca. 15 Nachkommastellen ; 32 bit bzw 4 byte)
		float zweiteKommaZahl;				// float: Kommazahl (ca. 7 Nachkommastellen ; 64 bit bzw 8 byte)
		zweiteKommaZahl = 1.5684f;			// float-Zahlen müssen mit einem "f" hinter der Zahl initialisiert werden
		
		char charakter;						// char: Charakter-Wert (speichert einen Charakter gemäss der Ascii-Tabelle)
		charakter = 'a';					// Initialisierung mit '' (shift + #) oder
		charakter = 97;						// mit dem Zahlenwert gemäss der Ascii Tabelle (in beiden Fällen würde "a" ausgegeben)
		
		boolean wharheitswert;				// boolean: Wahrheitswert (true oder false)
		
		String zeichenKette;				// String: Zeichenkette (bspw für Texte)
		zeichenKette = "Hallo zusammen";	// Initialisierung mit "" (shift + 2)
		
	}
}
