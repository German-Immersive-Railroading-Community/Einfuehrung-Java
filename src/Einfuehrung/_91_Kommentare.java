package Einfuehrung;

public class _91_Kommentare {

	public static void main(String[] args) {
/*
		Kommentare sind zur besseren Verständlichkeit des Codes sehr wichtig.
		
		Bei Programmteilen, bei denen nicht direkt ersichtlich ist / klar wird, was der Code macht unterstützt der Kommentar den Programmierer
		Vorallem, wenn ihr das Programm nicht selbst geschrieben habt.
*/
		// Der doppelte Schrägstrich erzeugt einen Kommentar in derselben Zeile - alles was in der Zeile hinter "//" steht ist Kommentar
		
		/* markiert den Beginn eines Kommentars -
		   auch über mehrere Zeilen hinweg -
		   der Kommentar läuft bis zu */
		
		int[] array = {2,54,68,23,10,7,100,96};
		array = sortierAlgo(array, 0, 1);
		for (int i : array) {
			System.out.print(i + " ");
		}
		
	}	
		// Beispiel:
	
		// rekursiver, aufsteigender Sortieralgorithmus
		private static int[] sortierAlgo(int[] unsortiert, int i, int k) {		
			if (i < unsortiert.length) {					// markiert aktuelles erstes Tauschelement - läuft von Anfang an	
				if (k < unsortiert.length) {				// markiert aktuelles zweites Tauschelement
					if (unsortiert[k] < unsortiert[i]) {	// Prüfung ob erstes Element größer als zweites
						int speicher = unsortiert[i];		// ja: Tausch
						unsortiert[i] = unsortiert[k];
						unsortiert[k] = speicher;
					}
					sortierAlgo(unsortiert,i,k+1);			// noch nicht alle Elemente mit erstem Element geprüft -> rekursiver Aufruf
				} else {
					return unsortiert;						// Array vollständig durchlaufen -> kleinstes aktuelles Element steht vorn
				}
				sortierAlgo(unsortiert,i+1,i+2);			// Array vollständig durchlaufen -> erstes Tauschelement rückt eine Stelle weiter
			} else {
				return unsortiert;							// erstes Tauschelement am Ende des Arrays -> kein Tausch mehr möglich
			}
			return unsortiert;								// Rückgabe des sortierten Array
			
		}


}
