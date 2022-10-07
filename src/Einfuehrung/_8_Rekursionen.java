package Einfuehrung;

public class _8_Rekursionen {

	public static void main(String[] args) {
/* 
		Rekursionen zeichnen sich dadurch aus, dass sich eine (direkte Rekursion) oder zwei oder mehr Methoden (indirekte Rekursion) gegenseitig aufrufen.
		Dabei wird die Methode innerhalb von sich selbst erneut gerufen.
*/
		int stammdicke = 5;												// Anzahl Rekursionen
		holzHacken(stammdicke);											// Initialer Methodenruf
		System.out.println("Baum fällt");
		
		gerade(0);														// Initialer Methodenruf
	}
	
	private static void holzHacken (int nochZuHacken) {					// Rekursionsmethode
		
		if (nochZuHacken > 0) {											// Abbruchkriterium !! Ganz wichtig (hier: wenn stammdicke 0 erreicht)
																		// vor Erstellung einer Rekursion sollte man sich immer zuerst Gedanken machen, wie
																		// das Abbruchkriterium aussehen soll/muss
			System.out.println("Holz hacken");
			holzHacken(nochZuHacken-1);									// direkter rekursiver Aufruf - übergebene Variablen änderen, damit Abbbruchkriterium
																		// irgendwann erfüllt wird
		}
	}

	private static void gerade (int zahl) {								// Ausgabe aller geraden Zahlen
		System.out.print(zahl + " ");
		ungerade(zahl+1);												// indirekter, rekursiver Aufruf
	}
	private static void ungerade (int zahl) {							// Ausgabe aller ungerade Zahlen
		if (zahl < 10) {												// Abbruchbedingung
			System.out.print(zahl + " ");
			gerade(zahl+1);												// indirekter, rekursiver Aufruf
		}
	}
}
