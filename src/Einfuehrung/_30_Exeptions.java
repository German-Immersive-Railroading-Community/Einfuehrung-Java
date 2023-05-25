package Einfuehrung;
import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _30_Exeptions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Exeptions sind Programm-Fehler die erst zur Laufzeit des Programms auftreten. (bspw. nach Zahleneingabe das teilen durch 0)
		//Exeptions bringen das Programm zum Absturz, jedoch nicht sofort (s.u.)
		//wichtige Exeptions
		_30_Exeptions fehler = null; 			// NullPointerExeption -> es wird auf eine Variable / ein Objekt zugegriffen, welches nicht initialisiert wurde
		int[] fehler2 = new int[2];
		fehler2[2] = 1;							// ArrayIndexOutOfBoundsExeption -> es wird auf einen Index im Array zugegriffen, der größer als das Array ist
		scan.nextInt();							// InputMismatchExeption -> es wird ein 'int' erwartet, aber etwas anderes (z.B. ein Buchstabe) eingegeben
		int a = 4/0;							// ArithmeticExeption -> mathematisch verbotene Operation wird ausgeführt (z.B. Teilen durch 0, Wurzel aus neg. Zahl)
		(double) int b = 0;						// ClassCastExeption -> die Klasse kann nicht in die gewünschte andere Klasse gecastet werden
												// IllegalArgumentException -> 
												// IllegalStateException -> 
		
		
		//try-catch-Konstruktion
		//Mit einer try-catch-Konstruktion können Exeptions abgefangen werden, so dass sie das Programm nicht zum Absturz bringen
		boolean weiter = true;
		while (weiter) {
			try { 									// hier kommt der Code rein, in der die Exeption auftreten könnte
				weiter = false;
				int eing = scan.nextInt();
				int b = 10 / eing;
				System.out.println(b);
			} catch (InputMismatchException e1) {	// hier kommt der Code rein, der ausgeführt werden soll, wenn eine Exception auftritt
				weiter = true;
			} catch (ArithmeticException e2) {		// es können mit weiteren 'catch' mehrere Exceptions abgefangen werden
				weiter = true;
			} catch (Exception e3) {				// dieses Statement fänge alle möglichen auftretenden Exceptions ab,
				weiter = true;						// da ist aber natürlich keine Einschätzung möglich, welche Exception aufgetreten ist
			} finally {
				if (!weiter) {
					scan.close();
				}
			}
		}
		try {
			exeptionWerfer();						// Exceptions bringen das Programm nicht sofort zum Absturz sondern werden in den aufrufenden Methoden
													// hochgereicht, d.h. eine geworfene Exception kann auch erst in einer "höheren" Methode abgefangen werden
		} catch (IllegalAccessException e3) {
			System.out.println(e3.getMessage());	// mit 'getMessage()' kann der Fehlertext aufgerufen werden
		}
	}
	
	public static void exeptionWerfer () throws IllegalAccessException {
													// das Schlüsselwort 'throws' (nicht 'throw'!!) zeigt, dass die Klasse oder Methode absichtlich
													// eine Exception zurückgibt (was im normal Fall ja gerade verhindert werden will)	
		 throw new IllegalAccessException("Diese Methode darfst du nicht rufen!");
		 											// das Schlüsselwort 'trow' (!) + 'new' wirft eine festgelegte Exception, in den Klammern kann der
		 											// anzuzeigende Fehlertext festgelegt werden, die Methode bricht an dieser Stelle ab
	}
}
