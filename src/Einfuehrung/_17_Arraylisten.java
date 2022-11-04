package Einfuehrung;
import java.util.ArrayList;							// Arraylisten müssen wie andere Klassen importiert werden

public class _17_Arraylisten {

	public static void main(String[] args) {
		
		ArrayList ungenaueListe = new ArrayList();	// Erstellen einer Arrayliste (Achtung! Da nicht spezifiziert welcher Datentyp in der Arrayliste stehen soll,
													// können alle Datentypen eingegeben, aber keiner abgerufen werden.
		
		ArrayList<Integer> neueListe = new ArrayList<Integer>();
													// Erstellen einer Arrayliste in welcher nur Integer-Werte gespeichert werden können.
													// das 'Integer' muss groß und ausgeschrieben werden, da es hier nicht um den primitiven Datentypen geht
		
		neueListe.add(100);							// an nächsten Index der Liste wird der Wert 100 abgelegt
		neueListe.add(1,50);						// an Index 1 wird der Wert 50 abgelegt, steht an Index 1 bereits ein Wert, so werden alle Werte nach-
													// folgender Indizes ein Indize nach hinten verschoben
		
		//ACHTUNG! Fehlt ein Wert zwischen der bestehenden Liste und dem eingefügten Wert am Indize, kann die Liste nicht verwendet werden, da es keinen
		// 		   Pointer im vorherigen Wert gibt, der auf die nächste Stelle weißt
		neueListe.add(30);
		neueListe.get(2);							// gibt den Wert an Index 2 zurück
		neueListe.remove(2);						// gibt den Wert an Index 2 zurück und löscht ihn aus der Liste, alle nachfolgenden Werte rücken
													// ein Indize auf
													// sollten keine primitiven Datentypen in der Liste stehen, so kann mit "remove" auch der name des Objektes
													// eingegeben werden, welches entfernt werden soll
		neueListe.removeAll(neueListe);				// löscht alle Einträge der Liste
		neueListe.isEmpty();						// gibt einen boolean Wert aus, ob in der Liste ein Eintrag ist
		neueListe.equals(ungenaueListe);			// gibt boolean zurück, ob eine Liste dieselben Einträge wie eine andere hat
		neueListe.contains(1);						// gibt boolean zurück, ob das übergebene Objekt in der Liste steht
		neueListe.size();							// gibt die Menge der Einträge als int zurück
		neueListe.set(0, 2);						// überschreibt den Wert am Indize mit dem übergebenen Wert
		
		// Das ACHTUNG von "add" auch hier beachten!
		
		neueListe.toArray();						// der Inhalt der Liste wird in ein Array mit Länge der Liste geschrieben und zurückgegeben
		neueListe.toString();						// der Inhalt der Liste wird in einen String geschrieben und zurückgegeben
		neueListe.clear();							// löscht alle Elemente in der Liste und die Liste selbst
		

	}

}
