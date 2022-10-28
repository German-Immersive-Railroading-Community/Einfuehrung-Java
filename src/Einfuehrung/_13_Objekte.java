package Einfuehrung;

public class _13_Objekte {
// In der Objekt-Klasse gibt man den Bauplan für das Objekt an.
// Hier Beispielsweise für ein Haus:
	
	private int geschosse;							// Eine Klasse kann zwei Dinge beinhalten:
	private String strassenname;					// 1. Atribute (globale Variablen)
	private int hausnummer;						// 2. Methoden
	private boolean hatAufzug;
	
	
	// Der Konstruktor ist der Initialaufruf unseres erstellten Objektes, in ihm werden alle Atribute uebergeben oder standartmaessig auf einen Wert gesetzt.
	// Er heisst EXAKT so wie die Klasse, damit er bei Erstellung eines Objektes automatisch gerufen wird
	public _13_Objekte (int geschosse, String strassenname, int hausnummer, boolean aufzug) {
		this.geschosse = geschosse;					// Das Schluesselwort "this" gibt eine Referenz auf das Objekt zurueck
		this.strassenname = strassenname;			// So koennen z.B. Nameskonflikte zwischen globalen und lokalen Variablen aufgeloest werden.
		this.hausnummer = hausnummer;				// Die Methode bedient sich immer zuerst der lokalen Variablen, wenn sich dort keine findet, dann den Globalen 
		hatAufzug = aufzug;							// <- Man sieht: heissen lokale und globale Variablen verschieden, so tritt auch kein Konflikt auf
	}
	
	public int getGeschosse () {					// Mit "Geter"-Methoden koennen einzelne Werte der Objekte abgefragt werden.
		return geschosse;
	}
	public boolean getHatAufzug() {					// Dabei beginnt der Bezeichner der Methode mit "get" und danach der Name der Variablen, welche abgefragt wird
		return hatAufzug;
	}
	public String getStrasse () {
		return strassenname;
	}
	public int getHausnummer () {
		return hausnummer;
	}
	
	public void setGeschosse (int geschosse) {		// Mit "Seter"-Methoden koennen einzelne Werte der Objekte geaendert werden.
		this.geschosse = geschosse;
	}
	public void setHatAufzug (boolean aufzug) {		// Dabei beginnt der Bezeichner der Methode mit "set" und danach der Name der Variablen, welche geaendert wird
		hatAufzug = aufzug;
	}
	public boolean setStrasse (String strasse) {	// will man sichergehen, dass die Variable geaendert wurde, dann kann die Funktion auch ein boolean zurueckgeben
		strassenname = strasse;						// Dies ist aber unueblich, da durch diese Zuweisung hier links, theoretisch das if nie false werden kann.
		if (strassenname.equals(strasse)) {
			return true;
		}
		return false;
	}
	public void setHausnummer (int hausnummer) {
		this.hausnummer = hausnummer;
	}
	
	// Diese drei Dinge muss eine "Bauplan"-Klasse immer haben: Atribute, Geter & Seter und einen Konstruktor.
	// Zusätzlich kann die Klasse nun noch weitere Methoden beinhalten, die das Objekt spaeter koennen soll.
	
	public void saeubern () {
		// Code fuers saeubern des Hauses 
	}
	public void beschmieren (String schriftzug) {
		//Code fuers beschmieren
	}
}

public class Main {
	public static void main (String[] args) {
		
		_13_Objekte einfamilienhaus = new _13_Objekte(3, "Bahnhofstrasse", 1, false);
													// Mit "new" koennen wir nun ein neues Objekt erstellen. Dieses besitz noch keine Werte, es wurde nur Speicher
													// fuer dieses reserviert.
													// die erste "_13_Objekte" bezieht sich auf die Klasse, in der der "Bauplan" für das Objekt liegt. Ist diese
													// in einem anderen package, so muessen wir diese erst mit "import [package-name].[klassen-name]" importieren.
													// direkt nach Erstellung des Objekts wird automatischder Konstruktor gerufen, dem die spezifischen Werte dieses 
													// Objektes übergeben werden (also in der Klammer des neuen Objektes).
		_13_Objekte hochhaus = new _13_Objekte(50, "Zentrumsstrasse", 1, true);
		hochhaus.setGeschosse(52);					// wird das Hochhaus erweitert, so kann ueber die set-Methode der neue Variablenwert DIESES Objektes eingetragen werden.
		System.out.println(hochhaus.getGeschosse());// mit get sieht man, dass die Aenderung uebernommen wurde
													// !Das geht hier nicht, da zwei Klassen in einem file liegen!
		
		_13_Objekte zweitesHochhaus = hochhaus;		// ACHTUNG! Das erstellt kein neues Objekt! Hier wird lediglich eine zweite Referenz auf "hochhaus" angelegt
													// aendert man einen Wert in "zweitesHochhaus" wird dieser Wert auch in "hochhaus" geaendert und umgekehrt, da
													// beide Referenzen auf dasselbe Objekt sind!
		
		
	}				
}