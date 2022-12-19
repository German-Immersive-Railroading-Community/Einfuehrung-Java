package Einfuehrung;

public class _24_Methodenueberschreibung {

	public static void main(String[] args) {
		
 // zunächst etwas zu Casting (wichtig):
		Fahrzeug fahrzeug1 = new PKW ();			// Das Objekt "fahrzeug1" ist ein Objekt der Klasse "PKW", bezieht sich jedoch nur auf die Klasse Fahrzeug, genannt: "Upcast"
													// Das Bedeutet es sieht nur die Methoden und Attribute der Klasse Fahrzeug, werden jedoch von "PKW" Methoden überschrieben,
													// so werden die Methoden von "PKW" gerufen
		
		PKW fahrzeug2 = fahrzeug1;					// Die Erstellung einer zweiten Referenz auf "fahrzeug1" mit einem Objekt vom Typ "PKW" funktioniert nicht, da "fahrzeug1"
													// vom Typ "Fahrzeug" ist und dass eine Superklasse von "PKW" ist ("fahrzeug1" wurde spezialisiert)
		PKW fahrzeug3 = (PKW) fahrzeug1;			// Die Erstellung einer Referenz funktioniert erst, wenn wir dem Programm versichern, dass fahrzeug eins wirklich ein Objekt
													// der Klasse "PKW" ist, in dem wir die Klasse in runden Klammern davor schreiben, genannt: Downcast
													// "fahrzeug3" wurde so verallgemeinert
													// ACHTUNG! Java wirft hier keinen Fehler, wenn der Downcast nicht funktioniert, weil z.B."fahrzeug1" gar nicht von der Klasse
													//			Klasse "PKW" wäre - Java vertraut hier komplett auf den Entwickler
// zweites Beispiel:
		double a = 10.0;
		int b = (int) a;							// Wir Downcasten 'a' zu einem int, damit wir es b zuweisen können (die Nachkommastellen entfallen)
		
// nun zu Methodenueberschreibung:
		Fahrzeug auto = new PKW();					// Wir erstellen ein Upcast-Objekt
		auto.fahren();								// Das Objekt "auto" sieht nur Methoden der Klasse Fahrzeug (probiert mal die 'test'-Methode auszuwählen)
													// Überraschend: Trotzdem wird die 'fahren'-Methode der PKW-Klasse gerufen -> Methodenueberschreibung 
		System.out.println(auto.geschw);			// Wichtig: Nur Methoden werden überschrieben, Varaiblen nicht!
		System.out.println(auto.getGeschw());		// Lösung eine Getter-Methode, diese Überschreibt wieder die Getter-Methode der Superklasse und returnt 'geschw' der Subklasse
	}

}
// public abstract class Klasse : mit dem Schlüsselwort abstract kann eine Klasse keine Objekte mehr erzeugen und dient daher nur noch als Superklasse zur Bereitstellung von Methoden

public class Fahrzeug {								// Superklasse
	
	final int geschw = 80; 
	
	public void fahren() { 							// Die Superklasse initialisiert eine Methode "fahren"
		System.out.println("Motor gestartet!");
	}
	
	public int getGeschw () {
		return this.geschw;
	}
	
}

public class PKW extends Fahrzeug {					// Subklasse
	
	final int geschw = 120;
	
	@Override										// Das Schlüsselwort '@Override' sagt Programm und Entwickler, dass die nachfolgende Methode eine Methode der Superklasse überschreibt
	public void fahren() {							// Die Subklasse überschreibt die Methode der Superklasse, Wichtig: Damit eine Methode überschrieben werden kann muss sie den
													// gleichen Namen, den gleichen Rückgabewert und die gleichen Parameter besitzen
		super.fahren();								// Mit dem Schlüsselwort 'super' kann die Methode der Superklasse gerufen werden
		System.out.println( "PKW fährt los");
	}
	
	@Override
	public int getGeschw () {
		return this.geschw;
	}
	
	public void test() {
		//...
	}

}