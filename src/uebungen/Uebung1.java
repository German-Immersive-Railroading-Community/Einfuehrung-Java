package uebungen;

/*
 * Uebung zu schleifen und rekursion Abgabe per Discord in meine DMs
 * 
 * Punkte Gesamt: 18 Abgabe spaetestens: 02.10.2022 (Dann werden Loesungen veroeffentlicht)
 */
public class Uebung1 {
	
	// Punkte 4
	public static void leicht_schleifen() {
		/**
		 * Gebe alle Zahlen von 1 bis 100 aus. Das print statement darf nur einmal verwendet werden. EDIT: Die Ergebnisse
		 * duerfen nicht in eine String hardcoded werden EDIT: Es muss eine Schleife sinvoll verwendet werden Es duerfen nur
		 * eingefuehrte Operationen verwendet werden. (Siehe Paket Einfuehrung)
		 */
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
	
	// Punkte 6
	public static void mittel_schleifen() {
		/**
		 * Gebe alle Zahlen von 1 bis 100 aus, die nicht durch 3 oder 5 Teilbar sind. Ist die Zahl durch 3 Teilbar so wird Fizz
		 * ausgegeben. Ist die Zahl durch 5 Teilbar so wird Buzz ausgegeben. Ist die Zahl sowohl durch durch 3 als auch durch 5
		 * Teilbar gebe FizzBuzz aus. Alle andere Zahlen werden normal ausgegeben Es duerfen nur eingefuehrte Operationen
		 * verwendet werden. (Siehe Paket Einfuehrung)
		 */
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print("Fizz");
			}
			if (i % 5 == 0) {
				System.out.print("Buzz");
			}
			if (i % 3 != 0 && i % 5 != 0) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	// Punkte 8
	public static void schwer_schleifen(final int x) {
		/**
		 * Gebe alle Primzahlen aus von 2 bis 'x' Achte darauf das 'x' sinvoll ist TIPP: Du kannst den Algo in eine seperate
		 * Methode auslagern TIPP: Fuer X kann zum testen 100 verwendet werden. TIPP: Es duerfen mehrere Schleifen verwendet
		 * werden TIPP: Zum wurzel ziehen kann `Math.sqrt(x)` verwendet werden Es duerfen keine Arrays verwendet werden
		 * Darueberhinaus duerfen nur eingefuehrte Operationen verwendet werden. (Siehe Paket Einfuehrung)
		 */
		for (int i = 2; i < x; i++) {
			boolean print = true;
			for (int divider = 2; divider < Math.sqrt(x); divider++) {
				if (i % divider == 0 && i != divider) {
					print = false;
					break;
				}
			}
			if (print) {
				System.out.println(i);
			}
		}
	}
	
}
