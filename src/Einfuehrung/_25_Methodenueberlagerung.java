package Einfuehrung;

public class _25_Methodenueberlagerung {

	public static void main(String[] args) {
		
		ueberlagert();									// Bei Methodenueberlagerung haben zwei oder mehr Methoden derselben Klasse den gleichen Namen
		ueberlagert(1);									// und unterscheiden sich nur an Hand ihrer Parameter, ein unterschiedlicher Rückgabewert 
														// ist unzulässig als Methodenueberlagerung
	}
	
	public static void ueberlagert () {					// Java ist so clever zu erkennen, zu welcher Methode die übergebenen Parameter gehören und
		System.out.println("Methode 1");				// welche Methode so gemeint ist
	}													// Beispiel die 'add'-Methode bei Listen: Es gibt sie mit einem Parameter(Objekt) oder
														//										  zwei Parametern (Index, Objekt)
	public static void ueberlagert (int i) {
		System.out.println("Methode 2");
	}

}
