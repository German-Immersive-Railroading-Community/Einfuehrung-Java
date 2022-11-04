package Einfuehrung;
import java.util.Scanner;							// Um Scanner und Random zu nutzem müssen sie, wie jede andere Klasse auch, importiert werden
import java.util.Random;


public class _16_ScannerAndRandom {

	public static void main (String[] args) {
		
	
		Scanner eingabe = new Scanner (System.in);		// Erstellen eines neuen Scanner-Objekts -> Es muss System.in übergeben werden!
		Random zufall = new Random ();					// Erstellen eines neuen Random-Objekts
	
		int a = zufall.nextInt();						// Es wird eine Zufallszahl im Bereich von 4 byte (-2,147,483,648 bis 2,147,483,647) erstellt
		int b = zufall.nextInt(100);					// Es wird eine Zufallszahl von 0 bis 99 erstellt (die 100 ist nicht dabei!)
		int c = zufall.nextInt(25,50);					// Es wird eine Zufallszahl von 25 bis 49 erstellt (die 50 ist nicht dabei!)
		
		boolean d = zufall.nextBoolean();				// Es wird zufällig zwischen wahr und falsch gewählt
		
		// Es können diese Datentype zufällig erzeugt werden: boolean, double, float, int, long
		// außer 'boolean' können alle in Bereich eingeschränkt werden (wie bei nextInt)
		
		int e = eingabe.nextInt();						// Das Programm wartet auf die nächste Eingabe, Eingaben mit 'Enter' bestätigen
														// Die Eingabe muss dem Datentypen entsprechen (hier int) sonst stürzt das Programm ab!
		
		String f = eingabe.nextLine();					// Abweichung: zur Eingabe eines String ist die Methode "nextLine" zuständig
		
		// Es können alle primitiven Datentypen und Strings eingegeben werden.
		
		eingabe.close();								// sind alle Eingaben abgeschlossen, so sollte der Scanner aus Effizienzgründen geschlossen werden
	}
}
