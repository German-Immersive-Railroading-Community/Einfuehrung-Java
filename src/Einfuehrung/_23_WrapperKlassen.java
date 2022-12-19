package Einfuehrung;

public class _23_WrapperKlassen {

	public static void main(String[] args) {
		
		//jeder primitive Datentyp (int, char, boolean, ...) hat eine zugehörige Wrapper-Klasse mit gleichem Namen.
		Integer a = new Integer(2);	// Objekte einer Wrapper-Klasse wurden früher mit dem Konstruktor "normal" initialisiert, genannt: Boxing
		Integer b = 2;				// Dieses Verfahren ist seit Version 9 überholt und es genügt nun einfach einen Wert zuzuweisen, genannt: Autoboxing
									// Man sollte das alte Verfahren auch nicht mehr anwenden (sieht man schon daran, dass Eclipse das durchstreicht)
		int c = a.intValue();		// Zum Auslesen eines Integer-Objektes wurde die intValue()-Methode genutzt, genannt: Unboxing
		int d = a;					// Auch das ist seit Version 9 überholt und es reicht wieder eine einfache Zuweisung, genannt: Autounboxing
									// Auch hier sollte stets Autounboxing genutzt werden
		
		// der Vorteil von komplexen Datentypen: man kann eine Bandbreite nützlicher Methoden auf sie anwenden
		// der Nachteil von komplexen Datentypen: sie brauchen wesentlich mehr Laufzeit und Speicherplatz
		// Also immer mit Bedacht einsetzen!
		
		// nützliche Methoden:
		
		b.doubleValue();					// Gibt den Wert des Integers als primitives double zurück
		b.getClass();						// Gibt die Klasse des Objektes zurück (Integer, Character, Boolean, ...)
		b.equals(a);						// Prüft ob b == a und gibt ein boolean zurück
		b.toString();						// Gibt den Integer als String zurück
		int f = Integer.parseInt("10");		// Schreibt eine Integerzahl in einen richtigen Integer
											// ACHTUNG: Der String darf wirklich nur einen Integer und nichts anderes enthalten
		
		Character e = 'a';
		Character.isAlphabetic(e);			// Prüft ob der Parameter bestandteils des Standart-Alphabets ist, gibt ein boolean zurück
		Character.isDigit(e);				// Prüft ob der Parameter eine Zahl ist, gibt ein boolean zurück
		Character.isLowerCase(e);			// Prüft ob der Parameter ein Kleinbuchstabe ist, gibt ein boolean zurück
		Character.isUpperCase(e);			// Prüft ob der Parameter ein Großbuchstabe ist, gibt ein boolean zurück
		
		Boolean.logicalAnd(false, true);	// Gibt ein boolean-true zurück, wenn beide Eingaben true sind
		Boolean.logicalOr(false, true);		// Gibt ein boolean-true zurück, wenn mindestens eine Eingabe true ist
		Boolean.logicalXor(false, true);	// Gibt ein boolean-true zurück, wenn genau eine Eingabe true ist
		
	}

}
