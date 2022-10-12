package uebungen;

/*
 * Uebung zu schleifen und rekursion Abgabe per Discord in meine DMs
 * 
 * Punkte Gesamt: 18
 * 
 * Abgabe spaetestens: 11.10.2022 (Dann werden Loesungen veroeffentlicht)
 */
public class Uebung2 {
	
	// Punkte 4
	public static void leicht_rekursion(final int i, final int x) {
		/*
		 * Gebe alle Zahlen von 1 bis x aus, die nicht durch 2 Teilbar sind. Es darf KEINE Schleife verwendet werden.
		 * Tipp:Erstelle eine Methode mit der definition: `public static void leicht_rekursion(int i, int x) {}`
		 * 
		 * Tipp: Zum Testen kannst du `leicht_rekursion(0, 100);` aufrufen
		 * 
		 * Es duerfen nur eingefuehrte Operationen verwendet werden. (Siehe Paket Einfuehrung)
		 */
		if (i > x) {
			return;
		}
		if (i % 2 != 0) {
			System.out.println(i);
		}
		leicht_rekursion(i + 1, x);
	}
	
	// Punkte 6
	public static void mittel_arrays() {
		/*
		 * Erstelle ein array mit den Zahlen von 1 bis 100 (automatisch befuellen)
		 * 
		 * Danach drehe das array um (sodass 100 vorne und 1 hinten ist) (auch automatisch)
		 * 
		 * Gebe das Array danach aus
		 * 
		 * Es duerfen nur eingefuehrte Operationen verwendet werden. (Siehe Paket Einfuehrung)
		 */
		final int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		
		for (int i = 0; i < array.length / 2; i++) {
			final int z = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = z;
		}
		
		for (final int i : array) {
			System.out.println(i);
		}
	}
	
	// Punkte 8
	public static void schwer_arrays(final int[] array) {
		/*
		 * Erstelle ein methode "public static void schwer_arrays(int[] array)"
		 * 
		 * Sortiere das array was du rein bekommst absteigend
		 * 
		 * Und gebe das array am ende aus
		 * 
		 * TIPP: Zum testen kannst du die methode mit einem test array ausfuehren
		 * 
		 * Es duerfen nur eingefuehrte Operationen verwendet werden. (Siehe Paket Einfuehrung)
		 */
		boolean swaps;
		do {
			swaps = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i + 1]) {
					final int z = array[i];
					array[i] = array[i + 1];
					array[i + 1] = z;
					swaps = true;
				}
			}
		} while (swaps);
		
		for (final int i : array) {
			System.out.println(i);
		}
	}
	
}
