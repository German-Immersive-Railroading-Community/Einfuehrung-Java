package Einfuehrung;
import java.util.ArrayList;

public class _14_Static {
		
		// Erstellen einer Klasse für Autos 
		private final String model;
		private final int serie;
		private int psZahl;
		private boolean fluegeltueren;
		
		protected static boolean rueckruf;			// Initialisierung einer static Variablen
		// Variablen immer auf 'private' setzen; hier aus Demonstrationsgründen geändert
		
		public _14_Static (final String model, final int seriennummer, final int ps, final boolean fluegeltueren) {
			this.model = model;
			this.serie = seriennummer;
			this.psZahl = ps;
			this.fluegeltueren = fluegeltueren;
			_14_Static.rueckruf = false;			// Erklärung dazu weiter unten
		}
		
		public void setPS (final int ps) {
			this.psZahl = ps;
		}
		public int getPS () {
			return this.psZahl;
		}
		public void setTueren (final boolean tueren) {
			this.fluegeltueren = tueren;
		}
		public boolean getTueren () {
			return this.fluegeltueren;
		}
		public String getModel () {
			return this.model;
		}
		public int getSerie () {
			return this.serie;
		}
		public boolean getRueckruf () {
			return _14_Static.rueckruf;				// Erklärung dazu weiter unten
		}
		
		public static void zurueckrufen () {		// Initialisierung einer static-Methode
			rueckruf = true;
			System.out.println("Fahrzeuge werden zurückgerufen!");
		}
	
}

public class Vertreiber {

	public static void main(String[] args) {
		
		// Erstellen dreier Objekte
		_14_Static fahrzeug1 = new _14_Static ("VW", 1, 160, false);
		_14_Static fahrzeug2 = new _14_Static ("Audi", 2, 170, false);
		_14_Static fahrzeug3 = new _14_Static ("Skoda", 4, 250, false);
		
		// Ausgabe von "rueckruf" von jedem der Objekte
		System.out.printf("Fahrzeug1: %B, Fahrzeug2: %B, Fahrzeug3: %B\n",fahrzeug1.getRueckruf(),fahrzeug2.getRueckruf(),fahrzeug3.getRueckruf());
		
		fahrzeug1.rueckruf = true;	// In Objekt1 wird "rueckruf" auf 'true' geändert
		
		System.out.printf("Fahrzeug1: %B, Fahrzeug2: %B, Fahrzeug3: %B\n",fahrzeug1.getRueckruf(),fahrzeug2.getRueckruf(),fahrzeug3.getRueckruf());
		// Wir sehen dass in allen Objekten "rueckruf" geändert wurde!
		// Das liegt daran, dass sich "rueckruf" durch 'static' nicht auf ein Objekt der Klasse bezieht, sondern auf die Klasse selbst

		_14_Static.rueckruf = false;	// Bezug zu Zeile 19 & 41
		// Da die Variable "rueckruf" nicht an ein Objekt, wie "fahrzeug1" gebunden ist, sollte sie auch durch die Klasse referenziert werden

		System.out.printf("Fahrzeug1: %B, Fahrzeug2: %B, Fahrzeug3: %B\n",fahrzeug1.getRueckruf(),fahrzeug2.getRueckruf(),fahrzeug3.getRueckruf());
		// Ausgangszustand
		
		_14_Static.zurueckrufen(); // Da die Methode "zurueckrufen" als 'static' deklariert wurde, ist sie ebenso wie static-Variablen nicht an
		// ein Objekt gebunden, sondern an die Klasse selbst und sollte/kann daher ohne ein konkrettes Objekt gerufen werden
		
		System.out.printf("Fahrzeug1: %B, Fahrzeug2: %B, Fahrzeug3: %B\n",fahrzeug1.getRueckruf(),fahrzeug2.getRueckruf(),fahrzeug3.getRueckruf());
		// In alle Objekten wurde "rueckruf" wieder auf 'true' gesetz durch den Ruf von "zurueckrufen"
		
		// Dadurch ist auch klar, wieso "main" static sein muss: da es die erste Methode ist, die gerufen wird, kann vorher kein Objekt erzeugt werden.

	}

}
