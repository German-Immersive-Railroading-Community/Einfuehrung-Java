package Einfuehrung;

public class _15_Vererbung {
	//Erstellen einer Bauplanklasse für Lebewesen
	
	private int alter;
	private int groesse;
	
	public void fortpflanzen () {
		//... Was auch immer hier dann passiert
	}
	public void wachsen () {
		groesse++;
	}
	public void altern () {
		alter++;
	}
	
	public int getAlter () {
		return alter;
	}
	public int getGroesse () {
		return groesse;
	}
	
	public _15_Vererbung () {
		alter = 0;
		groesse = 0;
	}
	
}

// Das Schlüsselwort 'extends' (dt. "erwitern") sagt aus, dass die Klasse von einer anderen Klasse erbt
public class Tier extends _15_Vererbung { // extends "lebewesen"
	
	private int ausdauer;
	public void laufen () {
		ausdauer--;
	}
	
	public Tier (final int ausdauer) {
		this.ausdauer = ausdauer;
		
	}
}
public class Pflanze extends _15_Vererbung { // extends "lebewesen"
	
	private final boolean hatStacheln;
	public void photosynthese () {
		// ... 
	}
	public Pflanze (final boolean stacheln) {
		this.hatStacheln = stacheln;
	}
}

public class Zoo {
	
	public static void main (String[] args) {
		Tier elefant = new Tier (25);
		Pflanze rose = new Pflanze(true);
		
		elefant.laufen();					// "elefant" kann wie jedes andere Objekt auch auf Methoden und Variablen aus seiner Klasse zugreifen
		rose.photosynthese();				// "rose" kann wie jedes andere Objekt auch auf Methoden und Variablen aus ihrer Klasse zugreifen
		
		elefant.altern();					// Dadurch, dass "Tier" und "Pflanze" von "_15_Vererbung (Lebewesen)" erben können Objekte von "Tier" und
		rose.altern();						// "Pflanze" auch auf Variablen und Methoden der "Lebewesen"-Klasse zugreifen
		elefant.fortpflanzen();
		rose.fortpflanzen();				// Diese Vererbung von Klassen kann unendlich weiter fortgesetzt werden. Jede Klasse verbt von ihrer vorherigen.
		
		rose.laufen();						// Da "Tier" nicht von "Pflanze" erbt und anders herum, kann nicht auf die Methoden der anderen Klassen
		elefant.photosynthese();			// zugegriffen werden.
	}
	
}
