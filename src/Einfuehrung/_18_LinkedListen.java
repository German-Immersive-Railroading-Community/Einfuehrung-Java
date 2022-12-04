package Einfuehrung;

import java.util.LinkedList;											// Linked-Listen müssen mit java.util importiert werden

public class _18_LinkedListen {

	public static void main(String[] args) {
		
		LinkedList meineListe = new LinkedList();						// Erstellung einer neuen Datenstruktur-unspezifischen Liste
		LinkedList<Integer> Liste2 = new LinkedList<Integer>();			// Erstellung einer neuen Integer-spezifischen Liste
																		// -> Siehe Arraylisten
		
/*		Unterschied Arraylisten / Linkedlisten
		
		LinkedListe: Aufbau:([LinkedList],[zeiger]) -> ([1],[zeiger]) -> ([2],[zeiger]) -> ([3],[zeiger]) -> NULL
					 LinkdListen bestehen aus einzelnen Containern die jeweils auf den nächsten Container zeigen
		ArrayListe: ([ArrayList],[zeiger]) -> [1,2,3]
					 Arraylisten bestehen aus einem Container der auf ein Array mit Werten zeigt
		
*/		
//		nur für LinkedListen:
		Liste2.add(1);													// Fügt der Liste an der Letzten Stelle eine 1 hinzu
		Liste2.add(0,1);												// Fügt der Liste am index 0 eine 1 hinzu
		Liste2.remove();												// Entfernt das letzte Element der Liste und gibt dieses zurück
		Liste2.remove(0);												// Entfernt das Element mit Index 0 und gibt dieses zurück

		Liste2.addFirst(1);												// Fügt eine 1 als erstes Element der Liste ein
		Liste2.removeFirst();											// Entfernt das erste Listenelement und gibt dieses zurück
		Liste2.removeLast();											// Entfernt das letzte Listenelement und gibt dieses zurück
		Liste2.element();												// Gibt das erste Element der Liste zurück ohne dieses zu entfernen
//		---------------------
// 		auch für anderes (siehe Folie 19)
		Liste2.isEmpty();												// Prüft ob die Liste leer ist und gibt den boolean zurück
		Liste2.contains(1);												// Prüft ob die Liste das Element 1 enthält und gibt den boolean zurück
		Liste2.get(0);													// Gibt das Element an Index 0 zurück
		Liste2.getFirst();												// Gibt das erste Element der Liste zurück
		Liste2.getLast();												// Gibt das letzte Element der Liste zurück
		Liste2.size();													// Gibt die Anzahl der Elemente der Liste zurück
		Liste2.indexOf(1);												// Gibt ein Integer mit den Index von 1 zurück
																		// sollte 1 mehrmals in der Liste stehen, so wird nur der niedrigste index zurückgegeben
		Liste2.set(0, 1);												// Ersetzt das Element an Index 0 mit dem Wert 1
		Liste2.toString();												// Schreibt die Elemente der Liste in einen String und gibt diesen zurück
		Liste2.toArray();												// Schreibt die Elemente der Liste in ein Array und gibt dieses zurück
		Liste2.equals(meineListe);										// Prüft ob die Elemente der beiden Listen gleich sind und gibt den boolean zurück
		Liste2.clear();													// Löscht die Liste
		

	}

}
