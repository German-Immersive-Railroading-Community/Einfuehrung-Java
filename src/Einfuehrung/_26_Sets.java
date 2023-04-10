package Einfuehrung;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class _26_Sets {

	public static void main(String[] args) {
		
		Set<Integer> ersterSet = new HashSet<>();			// Ein Set ist eine Datenstuktur, ähnlich einer Liste, aber in einem Set tritt jedes Element nur einmal auf.
															// Heißt: In einem Set gibt es keine doppelten Einträge.
															// Neben "HashSet" gibt es noch "TreeSet" (dieser speichert die Eingaben gemäß ihrer Wertigkeit (Zahlen aufsteigend oder
															// alphabetisch)) und "LinkedHashSet" (dieser Speichert die Eingaben gemäß ihrer Eingabereihenfolge), diese sind laufzeit-
															// technisch aber langsamer als HashSets.
		ersterSet.add(3);
		ersterSet.add(2);
		ersterSet.add(1);
		ersterSet.add(3);
		ersterSet.add(2);
		System.out.println(ersterSet);						// Wie man sieht, stehen trotz 5 Eingaben nur 3 Einträge im Set.
															// Achtung!: Da in einem Set die Werte nicht in der gleichen Reinfolge stehen in der sie eingegeben wurden,
															// gibt es daher auf keine ".get()" Methode.
															// Sämtliche anderen Methoden sind identisch zu anderen Datenstrukturen (siehe _17_Arraylisten)
		Iterator<Integer> it = ersterSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
/*		
		Set<Integer> zweiterSet = Set.of(1,2,3,4);			// Neben der bekannten Erstellung eines Sets, gibt es noch eine Möglichkeit mit der Methode "Set.of()".
															// Aber Achtung!: Dieser Set ist mit seinen Werten festgelegt (es können weder Werte hinzugefügt noch gelöscht werden).
		
		Set<Waffen> waffenSet = new HashSet<>();			
		waffenSet.add(new Waffen("Pistole"));
		waffenSet.add(new Waffen("Sniper"));
		waffenSet.add(new Waffen("Gewehr"));
		waffenSet.add(new Waffen("Pistole"));
		for (Waffen s : waffenSet) {
			System.out.println(s.getName());				// Obwohl in einem Set eigentlich jedes Element einzigartig sein sollte, sehen wir hier, dass Pistole 2x im Set auftaucht.
		}													// Warum ist das so?
															// Das Problem liegt darin, dass wir in den Set nicht Strings sondern Objekte einlagern. Mit "new" wird immer ein neues Objekt
		for (Waffen s : waffenSet) {						// mit einer neuen Speicheraddresse erstellt.
			System.out.println(s);							// Das sieht man wenn man sich die Addressen mal ausgeben lässt. Da jede Addresse verschieden ist, wird sie als einzigartig im
		}													// im Set angesehen. Zum beheben dieses Problems stehen unten zwei Methoden, die der Objektklasse einzugefügt werden müssen.
	}

}

public class Waffen {
	private String name;
	
	public Waffen (final String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
/*	
	import java.util.Objects;

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Weapon other = (Weapon) obj;
		return Objects.equals(name, other.name);
*/	}
	
}


