package Einfuehrung;

public class _6_Schleifen {
	public static void main(String[] args) {
		
		int zahl1 = 5;
		boolean bedingung = true;
																				// mit schleifen werden gleiche Code-Blocks wiederholt - Unterteilung in Schleifenkopf und -körper
		while (zahl1 > 0) {														// bei while-Schleifen steht nach dem Schlüsselwort die Bedingung in runden Klammern
			System.out.print("Zahl1: " + zahl1--);								// der zu wiederholende Code steht in geschweiften Klammern
			System.out.println(", while-Schleife");
		}
		
		System.out.println();
		zahl1 = 5;
		
		while (zahl1 > 0 && bedingung) {										// man kann auch Bedingungen in Schleifen mit logischen Operatoren verknüpfen
			System.out.print("Zahl1: " + zahl1--);
			System.out.println(", bedingung: " + bedingung);
		}
		
		System.out.println();
		zahl1 = 5;
		
		// ACHTUNG! Man kann aber auch endlos Schleifen erzeugen: 
/*	
		while (true) {															// die Bedingung wird niemals flase -> endlos-Schleife
			System.out.println("true-Schleife läuft noch");
		}
		
		while (bedingung) {														// die Bedingung wird niemals flase -> endlos-Schleife (siehe Deklaration)
			System.out.println("Bedingung noch wahr");
		}
		
		while (zahl1 > 0) {														// die Bedingung wird niemals flase -> endlos-Schleife, da in der Schleife zahl1 nur erhöht wird
			System.out.println("Zahl1: " + zahl1);								// und so nie kleiner gleich 0 wird
			zahl1++;
		}
		
		while (zahl1 > 0 || bedingung) {										// die Gesamt-Bedingung wird niemals flase -> endlos-Schleife, da zahl1 zwar 0 erreicht, aber
			System.out.print("Zahl1: " + zahl1--);								// 'bedingung' niemals false wird
			System.out.println(", bedingung: " + bedingung);
		}
*/
		do {																	// im Gegensatz zur while-Schleife, wird die do-while-Schleife mind. einmal durchlaufen
			System.out.println("Zahl1: " + zahl1 + ", do-while-Schleife");
			zahl1--;
		} while (zahl1>0);														// die Schleifenbedingung steht am Ende der Schleife und wird mit einem ';' abgeschlossen
																				// probiert den Unterschied mal aus, indem ihr die Abbruchbedingung durch 'false' ersetzt
		System.out.println();
		
		for (int i = 5; i>0; i--) {												// die for-Schleife enthält direkt im Kopf eine Starteinstellung, die Abbruchbedingung und
			System.out.println("i: " + i + ", for-Schleife");					// eine Variablenveränderung - Die Variable (hier i) ist nur innerhalb der Schleife existent!
		}
/*		int j = 5;																// die Zählvariable kann auch auserhalb der Schleife initialisiert werden
  		for (;j>0;) {															// im Schleifenkopf befindet sich dann nur die Abbruchbedingung, nicht genutzte Elemente werden
  			System.out.println("j: " + j + ", zweite for-Schleife");			// leer gelassen - Aber Vorsicht! Das Semikolen muss trotzdem sein!
  			j--;																// die Änderung der Zählvariabeln kann auch im Schleifenkörper passieren
  		}
*/		
		// jetzt kommt ADVANCED STUFF! wollte es der Vollständigkeit halber mit rein nehmen
		
		System.out.println();
		int[] meinArray = {5,4,3,2,1};
		
		for (int i : meinArray) {												// die for-each-Schleife durchläuft Datentypen vollständig, wie z.B. Arrays, Listen, etc.
			System.out.println("i: " + i + ", for-each-Schleife");				// sie ist daher für Aus- / Eingaben bzw. allg. bearbeitung dieser empfehlenswert
		}
		
	}
}
