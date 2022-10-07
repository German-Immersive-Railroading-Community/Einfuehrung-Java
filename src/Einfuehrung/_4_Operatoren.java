package Einfuehrung;

public class _4_Operatoren {
	public static void main(String[] args) {
		
		int zahl1 = 4;
		int zahl2 = 2;
		int zahl3 = 0;
	
		// arithmetische Operatoren
		
		int summe = zahl1 + zahl2;		// der + Operator addiert
		int differenz = zahl1 - zahl2;	// der - Operator subtrahiert oder
		int negativeZahl = -12;			// negiert den Wert einer Zahl
		int produkt = zahl1 * zahl2;	// der * Operator multipliziert
		int quotient = zahl1 / zahl2;	// der / Operator dividiert
		int modulo = zahl1 % zahl2;		// der % Operator gibt den ganzzahligen Rest einer Division zurück
		zahl3++;						// der ++ Operator erhöht den Wert um 1 (Inkrement)
		zahl3--;						// der -- Operator verringert den Wert um 1 (Dekrement)
		
		// ACHTUNG! Es macht einen Unterschied ob das Inkrement bzw Dekrement vor oder nach der Variablen steht
		zahl3= 5;
		System.out.print(zahl3 +" ");
		System.out.print(zahl3++ + " ");
		System.out.println(zahl3);
		zahl3 = 5;
		System.out.print(zahl3 +" ");
		System.out.print(++zahl3 + " ");
		System.out.println(zahl3);
		
		// Zuweisungsoperatoren
		
		zahl1 = 2;						// der Variablen zahl1 wird der Wert '2' zugewiesen
		zahl1 += 2;						// zu 'zahl1' wird 2 addiert
		zahl1 -= 2;						// von 'zahl1' wird 2 abgezogen
		zahl1 *= 2;						// 'zahl1' wird mit 2 multipliziert
		zahl1 /= 2;						// 'zahl1' wird mit 2 dividiert
		zahl1 %= 2;						// 'zahl1' wird der Rest der Division aus sich und 2 zugewiesen (zahl1 = zahl1 % 2)
		
		// Vergleichsoperatoren
/*
 		Vergleichsoperatoren geben immer einen boolschen Wert zurück (true oder false)
 		
		zahl1 == zahl2 (gleich)			// ist zahl1 gleich zahl2
		zahl1 != zahl2 (ungleich)		// ist zahl1 ungleich zahl2
		zahl1 > zahl2 (echt größer)		// ist zahl1 echt größer als zahl2
		zahl1 < zahl2 (echt kleiner)	// ist zahl1 echt kleiner als zahl2
		zahl1 >= zahl2 (größer gleich)	// ist zahl1 größer oder gleich zahl2
		zahl1 <= zahl2 (kleiner gleich)	// ist zahl1 kleiner oder gleich zahl2

		// boolsche Operatoren

		!Ausdruck1 (Negation)			// nicht Ausdruck1 (true -> false, false -> true)
		Ausdruck1 && Ausdruck2 (AND)	// Ausdruck1 und Ausdruck2 (true && true -> true, true && false -> false, false && false -> false)
		Ausdruck1 || Ausdruck2 (OR)		// Ausdruck1 oder Ausdruck2 (true || true -> true, true || false -> true, false || false -> false)
		Ausdruck2 ^ Ausdruck2 (XOR)		// Ausdruck1 exclusive oder Ausdruck2
										// (true ^ true -> false, true ^ false -> true, false ^ false -> false)
		
		
		// jetzt kommt ADVANCED STUFF! wollte es der Vollständigkeit halber mit rein nehmen
		
		// Bit-Operatoren
		 
		~Ausdruck1 (Bit-Flipping) 		// invertiert die Bits eines Ausdrucks (~01101110 -> 10010001)
		Ausdruck1 & Ausdruck2 (bit-AND)	// Bits von Ausdruck1 und Ausdruck2 (01101110 & 01011100 -> 01001100)
		Ausdruck1 | Ausdruck2 (bit-OR)	// Bits von Ausdruck1 oder Ausdruck2 (01101110 & 01011100 -> 01111110)
		Ausdruck1 ^ Ausdruck2 (bit-XOR) // Bits von Ausdruck1 exclusive oder Ausdruck2 (01101110 ^ 01011100 -> 00110010)
	
		Ausdruck1 >> x (rechts-shift)	// Bits von Ausdruck1 um Anzahl x nach rechts schieben, es wird mit der Zahl links aufgefüllt,
										// die rechts raus geschoben wurde (10111011 >> 1 = 11011101, 10111011 >> 2 = 11101110)
		Ausdruck1 << x (links-shift) 	// Bits von Ausdruck1 um Anzahl x nach links schieben, es wird mit der Zahl rechts aufgefüllt,
										// die links raus geschoben wurde (10111011 << 1 = 01110111, 10111011 << 2 = 11101110)
		Ausdruck1 >>> x (logischer shift) // Bits von Ausdruck1 um Anzahl x nach rechts schieben, es wird mit '0' links aufgefüllt
										  // (10111011 >>> 1 = 01011101, 10111011 >>> 2 = 00101110)
*/
		// Zuweisungsoperatoren Fortsetzung

		zahl1 &= zahl2; 				// bit-AND-Zuweisung: Übereinstimmende Bits von zahl1 und zahl2 werden zahl1 zugewiesen
		zahl1 |= zahl2;					// bit-OR-Zuweisung: Bits von zahl1 oder zahl2 werden zahl1 zugewiesen
		zahl1 ^= zahl2;					// bit-XOR-Zuweisung: Bits von zahl1 exclusive oder zahl2 werden zahl1 zugewiesen
		zahl1 >>= 1;					// rechts-shift-Zuweisung: Bits von zahl1 werden nach rechts geshiftet und zahl1 zugewiesen
		zahl1 <<= 1;					// links-shift-Zuweisung: Bits von zahl1 werden nach links geshiftet und zahl1 zugewiesen
		zahl1 >>>= 1;					// logischer-shift-Zuweisung: Bits von zahl1 werden geshiftet und mit '0' aufgefüllt und zugewiesen
	}
}
