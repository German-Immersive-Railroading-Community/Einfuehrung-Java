package Einfuehrung;

public interface _27_Interface {									// Interfaces sind in gewisser Weise wie Superklassen, haben aber trotzdem wichtige Unterschiede.
																	// Ein Interface (dt. "Schnittstelle") erstellt man mit den Schlüsselwort "interface".
	String getName();												// In einem Interface werden dann alle Methoden, welche die Klasse später implementieren soll, angegeben.
	void setName(String a);											// Es werden ausschließlich Methoden und keine Attribute angegeben.
																	// Es werden bei Methoden nur Rückgabetyp, Bezeichner und Parameter angegeben.
	static void bellen() { System.out.println("Wuff"); }			// Ausnahmen: "static" oder "default"-Methoden erforden den Methoden-Körper
}

public class Hunde implements _27_Interface {						// Das Schlüsselwort "implements" gibt an, dass ein Interface implementiert wird
	
	private String name;
	private int alter;
	
	public void setName(String name) {								// Sämtliche vom interface vorgegebenen Methoden müssen von der Klasse implementiert werden, sonst wirft
		this.name = name;											// Java einen Fehler.
	}																// So ist sichergestellt, dass alle Klassen, welche das interface implementieren die vom interface geforderten
	public String getName() {										// Methoden besitzen. (daher auch der Name "Schnittstelle")
		return this.name;
	}
	public static void bellen() {
		System.out.println("Wuff");
	}
	
	public void setAlter(int jahre) {								// Neben den vorgegebenen Methoden können natürlich weitere hinzukommen.
		alter = jahre;
	}
	public int getAlter() {
		return alter;
	}
	
}

public class Main {
	
	public static void main (String[] args) {
		
		Hunde hund1 = new Hunde();
		hund1.setName("willy");
		System.out.println(hund1.getName());
		hund1.setAlter(1);
		
		Hunde.bellen();
		
		_27_Interface hund2 = new Hunde();							// Ein Interface kann auch als Objekt-"Klasse" (hier natürlich "Objekt-Interface") eingesetzt werden.
		hund2.setName("wuffi");										// Dem Objekt stehen dann nur die Methoden des Interfaces zur Verfügung.
		System.out.println(hund2.getName());
		hund2.setAlter;
	}
}
