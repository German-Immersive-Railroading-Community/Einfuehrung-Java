package Einführung;

public class _6_Schleifen {
	public static void main(String[] args) {
		
		int zahl1 = 5;
		boolean bedingung = true;
																// mit schleifen werden gleiche Code-Blocks wiederholt
		while (zahl1 >= 0) {									// bei while-Schleifen steht nach dem Schlüsselwort die Bedingung in runden Klammern
			System.out.println("Zahl1: " + zahl1--);			// der zu wiederholende Code steht in geschweiften Klammern
		}
		
		System.out.println();
		zahl1 = 5;
		
		while (zahl1 > 0 && bedingung) {						// man kann auch Bedingungen in Schleifen mit logischen Operatoren verknüpfen
			System.out.print("Zahl1: " + zahl1--);
			System.out.println(", bedingung: " + bedingung);
		}
		
		System.out.println();
		
		// ACHTUNG! Man kann aber auch endlos Schleifen erzeugen: 
/*	
		while (true) {											// die Bedingung wird niemals flase -> endlos-Schleife
			System.out.println("true-Schleife läuft noch");
		}
		
		while (bedingung) {										// die Bedingung wird niemals flase -> endlos-Schleife (siehe Deklaration)
			System.out.println("Bedingung noch wahr");
		}
		
		while (zahl1 > 0) {										// die Bedingung wird niemals flase -> endlos-Schleife, da in der Schleife zahl1 nur erhöht wird
			System.out.println("Zahl1: " + zahl1);				// und so nie kleiner gleich 0 wird
			zahl1++;
		}
		
		while (zahl1 > 0 || bedingung) {						// die Gesamt-Bedingung wird niemals flase -> endlos-Schleife, da zahl1 zwar 0 erreicht, aber
			System.out.print("Zahl1: " + zahl1--);				// 'bedingung' niemals false wird
			System.out.println(", bedingung: " + bedingung);
		}
*/
		do {
			System.out.println("do-while-Schleife");
		} while (true);
	}
}
