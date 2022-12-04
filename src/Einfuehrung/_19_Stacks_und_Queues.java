package Einfuehrung;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayDeque;
import java.util.Queue;

public class _19_Stacks_und_Queues {

	public static void main(String[] args) {

		Stack<Integer> meinStack = new Stack<Integer>();			//LIFO-Prinzip (last in, first out)
		// Das letzte Element, welches in den Stack gelegt wurde muss als erstes wieder entfernt werden.
		
		meinStack.push(1);						// Fügt dem Stack das Element 1 hinzu
		meinStack.peek();						// Gibt das oberste Element des Stacks zurück
		meinStack.pop();						// Entfernt das oberste Element des Stacks und gibt dieses zurück
		
		Queue<Integer> meineQueue = new ConcurrentLinkedQueue<Integer>();	//FIFO-Prinzip (first in, first out)
		// Das erste Element, welches in die Queue gelegt wurde muss als erstes wieder entfernt werden.
		
		meineQueue.add(1);						// Fügt der Queue das Element 1 hinzu
		meineQueue.peek();						// Gibt das erste Element der Queue zurück
		meineQueue.poll();						// Entfernt das erste Element der Queue und gibt dieses zurück
		
		// Weitere sinnvolle Methoden stehen in Folie 18
	}

}
