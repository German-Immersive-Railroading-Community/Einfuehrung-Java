package Einfuehrung;

public enum _22_Enums {						// Enum ist kurz für Enumeration (engl. Aufzählung)
	FRÜHLING, SOMMER, HERBST, WINTER 		// Die Einträge eines Enums sind mit Komma getrennt
}

public class Main {
	
	public static void main (String[] args) {
		
		_22_Enums jahreszeiten;				// Enums werden wie Objekte deklatriert.
		
		switch (jahreszeiten) {				// Der Vorteil von Enums wird besonders in Switches deutlich:
			case FRÜHLING: System.out.println("Alles blüht."); break;
			case SOMMER: System.out.println("So schön warm :)"); break;
			case HERBST: System.out.println("Die Bäume lassen ihre Blätter fallen"); break;
			case WINTER: System.out.println("Schlitten fahren im Schnee"); break;
		}
											// Mit Enums besteht keine Gefahr (anders als bei Listen), dass auf ein Element zugegriffen werden
											// würde, welches nicht existiert
	}
}