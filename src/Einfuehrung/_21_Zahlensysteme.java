package Einfuehrung;
import java.util.LinkedList;
import java.util.Queue;

public class _21_Zahlensysteme {

/*		Neben dem täglich verwendeten Dezimalsystem gibt es noch viele weitere Zahlensysteme.
 * 		Das Zweitbekannteste sollte wohl das Binärsystem (oder auch Dualsystem) sein, mit dem z.B. der Computer arbeitet.
 * 		Im Grunde gibt es unmengen von Zahlensystemen, ich gehe hier aber nur auf die vier Wichtigsten ein (binär, oktal, dezimal und hexadezimal).
 * 
 * 		Jedem Zahlensystem liegt die Anzahl der verschiedenen Ziffern zu Grunde. Das Dezimalsystem nutzt 10 Ziffern (0-9) (daher dez (griech. für 10)).
 * 		Das Binärsystem nutzt nur die Ziffern 0 und 1. Zahlensysteme mit mehr als 10 Ziffern setzen die Ziffern mit Buchstaben fort
 * 		(z.B. Hexadezimal: 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f).
 * 
 * 		Jede Zahl des Dezimalsystems kann auch im Binärsystem oder Hexadezimalsystem angegeben werden. 11(dez) = 1011(bin) = b(hex)
 * 		Für die Umrechnung der Zahlensysteme per Hand, schaut euch einfach im Internet um, gibt genug Tutorials und Rechner.
 * 
 * 		Java kann diese Umrechnungen auch ohne, dass ihr dafür extra eine Methode schreiben müsst (mit einer Ausnahme). * 		
 */
	
	public static void main (String[] args) {
		Queue<Integer> binRaus = new LinkedList<Integer>();
		
		System.out.printf("%d\n",11);		// Mit %d und der Zahl als Parameter geben wir diese aus. Dass kennen wir ja schon.
		System.out.printf("%d\n",011);		// Mit dem Präfix '0' vor unserer Zahl geben wir an, dass es sich um eine Oktalzahl handelt.
		System.out.printf("%d\n",0x11);		// Mit dem Präfix '0x' vor unserer Zahl geben wir an, dass es sich um eine Hexadezimalzahl handelt.
		System.out.printf("%d\n",0b11);		// Mit dem Präfix '0b' vor unserer Zahl geben wir an, dass es sich um eine Binärzahl handelt.
		
		System.out.println("------");
		
		System.out.printf("%x\n",11);		// Mit %x wird die INTEGER-Zahl in Hexadezimalschreibweise ausgegeben
		System.out.printf("%o\n",11);		// Mit %o wird die INTEGER-Zahl in Oktalschreibweise ausgegeben
		binRaus = binaer(11);				// Um eine Zahl in binär auszugeben braucht es eine Umrechnungs-Methode
		for(int i : binRaus) {
			System.out.print(i);
		}
		
		System.out.printf("\n------\n");
		System.out.printf("%x\n", 0164);	// So kann man auch direkt verschiedene Zahlensysteme umrechnen.
		System.out.printf("%o\n", 0b100111101);
	}
	
	public static Queue<Integer> binaer (int dezimal) {
		Queue<Integer> bin = new LinkedList<Integer>();
		
		while (dezimal > 0) {
			bin.add(dezimal % 2);
			dezimal /= 2;
		}	
		return bin;
	}
}
