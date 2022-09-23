package Einführung;

public class _5_If_Else_Anweisungen {
	public static void main(String[] args) {
		
		int zahl1 = 1;
		int zahl2 = 1;
																					// if-Statements erlauben die Entscheidung, ob ein Code-Block ausgeführt werden soll
		if (zahl1 == zahl2) {														// nach dem Schlüsselwort steht die zu prüfende Bedingung in runden Klammern
			System.out.println("Die Zahlen sind gleich.");							// der evt. auszuführende Code kommt in geschweifte Klammern
		}
		
		zahl1++;
		
		if (zahl1 == zahl2) {														// Bedenke: Unterschied zwischen == (Vergleich) und = (Zuweisung) 
			System.out.println("Die Zahlen sind verschieden. (if-Zweig)");			// den Teil der ausgeführt wird, wenn die Bedingung wahr ist nennt man den if-Zweig
		} else {																	// mit dem Schlüsselwort else wird die alternative zum if-Zweig erstellt
			System.out.println("Die Zahlen sind gleich (else-Zweig)");				// den Teil der ausgeführt wird, wenn die Bedingung falsch ist nennt man den else-Zweig
		}
		
		if (zahl1 < zahl2) {
			System.out.println("Zahl 1 ist kleiner als Zahl 2 (if-Zweig)");
		} else if (zahl1 > zahl2) {													// man kann die Zweige auch weiter verschachteln, indem man nach else wieder eine Bedingung setzt
			System.out.println("Zahl 1 ist grösser als Zahl 2 (else-if-Zweig)");	// der Zweig wird ausgeführt, wenn zahl1 < zahl2 falsch und zahl1 > zahl2 wahr ist
		} else {
			System.out.println("Zahl 1 ist gleich Zahl 2 (else-Zweig)");
		}
		
		// ACHTUNG! Es darf kein 'else-if' nach einem 'else' stehen, da mit 'else' das if-Statement abgeschlossen wird.
		
		boolean bedingung = false;
		
		if (bedingung) {															// da Vergleiche zwischen Daten immer einen Wahrheitswert zurückgeben, kann auch direkt ein
			System.out.println("Bedingung ist wahr.");								// Wahrheitswert als Bedingung gesetzt werden
		} else {
			System.out.println("Bedingung ist falsch");
		}
		
		if (bedingung && zahl1 != zahl2) {											// mit den, im letzten Abschnitt kennengelernten, logischen Operatoren können wir nun mehrere
			System.out.println("Bedingung wahr und Zahlen verschieden");			// Bedingungen entprechend verknüpfen
		} else if (bedingung || zahl1 != zahl2) {
			System.out.println("Bedingung wahr oder Zahlen verschieden");	
		}

	}
}
