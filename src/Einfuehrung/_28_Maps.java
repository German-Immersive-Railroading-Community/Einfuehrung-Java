package Einfuehrung;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _28_Maps {

	public static void main(String[] args) {
		
		Map<Integer,String> PLZzuOrt = new HashMap<>();							// Erstellen einer neuen HashMap, eine Map besteht aus "Key" und "Value" - jeder "Key" weist ein "Value" aus
																				// Neben "HashMap" gibt es noch "TreeMap" (diese speichert die Eingaben gemäß ihrer Wertigkeit (Zahlen aufsteigend oder
																				// alphabetisch)) und "LinkedHashMap" (diese Speichert die Eingaben gemäß ihrer Eingabereihenfolge), diese sind laufzeit-
																				// technisch aber langsamer als HashMaps.
//					  Key    Value		
		PLZzuOrt.put(13452,"Ausdorf");											// put-Methode zum hinzufügen neuer Werte
		PLZzuOrt.put(45678,"Waldstadt");
		PLZzuOrt.put(25896,"Greenville");
		
		PLZzuOrt.put(41287, "Greenville");										// es können mehrere Keys ein Value ausweisen, aber nicht anderes herum, da man immer über den Key an das Value kommt und
																				// bei gleichen Keys das Value nicht eindeutig bestimmt werden kann
		PLZzuOrt.put(13452, "Ausdorf-Mitte");									// wenn man dem gleichen Key ein anderes Value gibt, wird das einfach überschrieben, aber lieber die replace-Methode verwenden
		PLZzuOrt.replace(45678,"Waldstadt-Zentrum");

		Set<Integer> plz = PLZzuOrt.keySet();									// Keys kann man in einer Map nicht auslesen, also einen Set erstellen (Keys sind ja eh einzigartig) und die Keys mit der
																				// Methode "keySet()" in den Set schreiben.
		for (Integer s : plz) {													// Nun kann man mit einer for-each-Schleife durch den Set gehen, um die Keys auszulesen.
			System.out.println(s + " ist die PLZ von " + PLZzuOrt.get(s));		// Die Methode "get" nimmt den Key als Parameter und gibt den Value zurück.
		}
		PLZzuOrt.containsKey(45678);											// Mit "containsKey" prüft man ob ein Key in der Map ist.
		PLZzuOrt.containsValue("Burgland");										// Mit "containsValue" prüft man ob ein Value in der Map ist.
		PLZzuOrt.equals(null);													// zwei Maps vergleichen
		PLZzuOrt.isEmpty();														// prüfen ob in der Map ein Eintrag vorhanden ist
		PLZzuOrt.remove(41287);													// Einträge aus der Map entfernen
		PLZzuOrt.size();														// Anzahl der Einträge der Map (ein Key und ein Value sind ein Eintrag)
		PLZzuOrt.toString();													// Einträge in einen String schreiben
		PLZzuOrt.clear();														// alle Einträge aus der Map löschen
	}

}
