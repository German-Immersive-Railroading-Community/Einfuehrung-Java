package Einfuehrung;

import Einfuehrung.Gens;

public class _29_Generics {

	public static void main(String[] args) {
				
		Integer[] natZahlen = {1,2,3,4,5,6};										// Erstellung einiger Arrays mit Wrapper-Klassen
		Float[] kommaZahlen = {0.5f,1.3f,2.7f,3.9f};
		String[] begruessungen = {"Hey","Hallo","Moin","Servus"};

		auslesen(natZahlen);														// Aufruf der Funktion mit den Arrays als Parameter
		auslesen(kommaZahlen);
		auslesen(begruessungen);
		
		int[] primitiv = {2,4,6,8,10};												// Beispiel der Konvertierung eines primitiven Arrays zu einem einer Wrapper-Klasse, da
		Integer[] wrapper = new Integer[primitiv.length];							// Generics nicht mit primitiven Datentypen arbeiten können
		
		for(int i = 0; i < primitiv.length; i++) {
			wrapper[i] = primitiv[i];
		}
		
		auslesen(wrapper);															// Aufruf der Funktion mit dem Inhalt aus "primitiv"
		
		Gens<Integer> list = new Gens<Integer>(1,2,3);								// Erstellung zweier Objekte, in den spitzen Klammeren wird das Generic spezifiziert (wie bei Listen, Sets etc)
		Gens<String> list2 = new Gens<String>("Guten Tach","Helloooo","Hey");		// Probiert mal den Datentypen (und die Parameter) zu ändern und schaut was passiert.
		ausgabe(list);																// Aufruf der "ausgabe"-Funktion
		ausgabe(list2);
	}
	
	public static <Generic> void auslesen (Generic[] begruessungen) {				// Generics in Methoden werden zwischen "static"(falls vorhanden) und dem Rückgabetyp eingefügt. Das übergebene Array
																					// wird ebenfalls mit den Generic als Datentypen ausgewiesen, damit die Methode später jede Art von Array auslesen kann.
		for (Generic wort : begruessungen) {										// for-each-Schleife zum Auslesen der Arrays (da "begruessungen" von Typ "Generic" ist, muss auch "wort" vom Typ "Generic" sein)
			System.out.print(wort + " ");
		}
		System.out.printf("\t%s\n",begruessungen.getClass());						// Dieses Print zur Veranschaulichung, dass "begruessungen" nicht vom Typ "Generic" ist, sondern immer jeweils den Typ des
	}																				// übergebenen Arrays hat. (Wir sehen: Integer, Float und String)
	
	public static <T> void ausgabe (T list) {										// Die Konvention zur Schreibweise von generics ist nur ein 'T', deshalb nutze ich die ab jetzt auch.
		for (int i = 1; i <= 3; i++) {
			System.out.println( ((Gens<T>) list).get(i));							// Printen der 3 Objekte aus "Gens"
		}	

	}

}

public class Gens <T> {																// Generics in Klassen kommen nach dem Bezeichner und vor "extends"/"implements".
	private final T objekt;															// Erstellen dreier Atribute mit dem Generic
	private final T objekt2;
	private final T objekt3;

	public Gens (final T o1, final T o2, final T o3) {								// Konstruktor
		objekt = o1;
		objekt2 = o2;
		objekt3 = o3;
	}
	
	public T get (int i) {															// Funktion zur Rückgabe des entsprechenden Objektes (dafür auch die for-Schleife in der Methode "ausgabe")
		if (i == 1) {
			return this.objekt;
		} else if (i == 2) {
			return this.objekt2;
		} else {
			return this.objekt3;
		}
	}
																					// Generics stehen also stellvertretend für Datentypen, wenn noch nicht klar ist, um welchen Datentypen es sich zur Laufzeit
																					// hadelt bzw. wenn eine Methode/Klasse für mehrere Datentypen funktional sein soll.
																					// Generics sind kein eigener Datentyp und nehmen zur laufzeit den Datentypen der Parameter an.
}

