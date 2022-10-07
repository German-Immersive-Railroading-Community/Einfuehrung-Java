package Einfuehrung;

public class _7_Methoden {
	public static void main(String[] args) {
		
		briefkopf();																		// Methoden werden mit ihrem Namen und () gerufen
																							// durch die Klammern sind Methoden von Variablen unterscheidbar
		// Anschauungstext
		System.out.println("Sehr geehrtes GIR-Team,");
		System.out.print("Mein Name ist Max und ich möchte mich");
		System.out.println(" bei Ihnen als Softwareentwickler bewerben.");
		System.out.println("Über mich: Ich lerne aktuell Java in einem Onlinekurs.");
		System.out.println();
		
		int meineZahl = 13;																	// Variablen, welche in einer Methode erstellt wurden, sind auch nur in dieser sichtbar
		int meineAndereZahl = 5;
		double quotient = 0;
		
		addieren(meineZahl, meineAndereZahl);												// in den runden Klammern können Werte (Variablen) an andere Methoden übergeben werden
																							// Auf korrekten Datentypen (aus Methodendeklaration) achten
	
		quotient = dividieren(meineZahl, meineAndereZahl);									// Variablen können einen Datentypen zurückgeben - auf korrekten Datentypen achten!
		System.out.println(quotient);
		
		multiplizieren(meineZahl, meineAndereZahl);
		
	}
	
	public static void briefkopf() {														// Deklaration einer Methode: Zugriffsrechte, static/nicht-static, Rückgabewert, Bezeichner, ( ... ) {
		System.out.println("Herr");															// Der Inhalt einer Methode wird sequentiell (von oben nach unten, von links nach rechts) abgearbeitet
		System.out.println("Max Honk");
		System.out.println("Musterstraße ");
		System.out.println("07111 Musterhausen");
		System.out.println();
	}																						// '}' Markiert das Ende der Methode (auf korrekte Einrückung achten)
	
	public static void addieren(int zahl1, int zahl2) {										// in der Deklaration muss der Rückgabetyp stehen, sollte die Methode nichts zurückgeben steht 'void'
																							// in den runden Klammern werden Datentypen und Bezeichner übergebener Variablen festgelegt, Trennung mit ','
																							// -> mit Variablen bei Methodenruf abgleichen
		System.out.println(zahl1 + zahl2);													
		System.out.println();
	}
	
	public static double dividieren(double zahl1, double zahl2) {							// der Rückgabewert (hier double)
		double ergebnis = zahl1 / zahl2;
		return ergebnis;																	// gibt die Methode einen Wert zurück, so wird die Rückgabe mit dem Wort 'return' eingeleitet
																							// es folgt der Datentyp der zurückgegeben werden soll - korrekten Datentypen beachten!
	}
	
	public static void multiplizieren(int zahl1, int zahl2) {
		System.out.print("erste Ausgabe ");
		System.out.println(zahl1 * zahl2);
		return;																				// eine Methode kann jederzeit mit 'return;' abgebrochen werden
																							// ACHTUNG Eclipse wirft für den Nachfolgenden Code einen Fehler - Programm möglicherweise beeinträchtigt
		/*
 		System.out.print("zweite Ausgabe");													// schaut euch zur Verdeutlichung den Unterschied an, wenn ihr Zeile 55 und 58 löscht
		System.out.println(zahl1 * zahl2);
		 */
	}
}
