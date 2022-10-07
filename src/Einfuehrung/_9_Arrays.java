package Einfuehrung;

public class _9_Arrays {

	public static void main(String[] args) {
		
		int[] beispielArray = {1,2,3,4,5};						// Deklaration und Initialisierung eines Arrays, Arrays werden mit eckigen Klammern hinter dem Datentyp
																// gekennzeichnet, das Array kann 5 Elemente beinhalten (Index 0-4)
		int[] zweitesArray = new int[10];						// Deklaration des Arrays - keine Beschreibung, nur Reservierung des Speichers, in eckigen Klammern
																// stehen dann die Anzahl an Elementen des Arrays
																// das Array kann 10 Elemente beinhalten ([10]) (Index 0-9)
		for (int j : beispielArray) {							// zur Ausgabe von Arrays eignet sich die for-each-Schleife besonders gut
			System.out.print(j + " ");
		}
		
		System.out.println();
		System.out.println("Länge: " + zweitesArray.length);	// mit der Methode .length kann die Länge des Array ermittelt werden -> hier wird nicht mit 0 angefangen zu zählen
		
		for (int i = 0;i < zweitesArray.length; i++) {			// die for-i-Schleife eignet sich gut, wenn es um den Index eines Arrays geht
			zweitesArray[i] = i+1;								// mit 'Arrayname[Index]' kann auf das gewünschte Element des Arrays zugegriffen werden
		}
		for (int k : zweitesArray) {
			System.out.print(k + " ");
		}
/*
		Ein Array kann nur die bei der Deklaration festgelegte Anzahl an Elementen aufnehmen - die Größe ist unveränderlich.
		Das erste Element hat den Index 0, die folgenden die natürlichen Zahlen.
		
		!ACHTUNG! Wenn ein Array 10 Elemente hat, kann niemals auf das Element 10 zugegriffen werden, da die Indexe nur bis 9 reichen.
		Es entsteht ein "Index out of bounce"-Error

*/
		int[][] mehrDimArray1= {{1,2,3},{4,5,6},{7,8,9}};		// Arrays können auch zwei oder mehr (bis unendlich) Dimensionen haben
		int[][] mehrDimArray2 = new int[3][4];					// Man muss sich das vorstellen, wie in Index 0 liegt ein zweites Array von 0-2,
																// in Index 1 und 2 ebenso (s.B.)

/*		äußeres Array		[0]		[1]			[2]
		inneres Array	[0][1][2] [0][1][2] [0][1][2]
		Inhalt			 a  b  c   d  e  f   g  h  i
*/
		mehrDimArray2[2][0] = 45;								// mit Angabe der Indexe kann auf mehrdimensionale Arrays genauso zugegriffen werden, wie auf Eindimensionale
		System.out.println();
		System.out.println("Länge außen: " + mehrDimArray2.length);	// die length-Methode greift immer nur auf das äußerste Array zu
		System.out.println("Länge innen: " + mehrDimArray2[0].length);// für die Länge des inneren Arrays ist die Angabe eines Indexes notwendig
	}

}
