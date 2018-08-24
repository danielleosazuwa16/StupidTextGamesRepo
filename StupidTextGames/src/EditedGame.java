/**
 * @author danielleosazuwa16
 *
 */

import java.util.Scanner;
public class EditedGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		System.out.println("Stupid Game 2.0! Pick a game.");
		System.out.println("1: game one");
		System.out.println("2: game two");
		
		int choice = console.nextInt();
		play(choice);
	}

	public static void play(int choice) {
		if (choice == 1) {
			System.out.println("You played a game, had fun, won.");
		} else {
			System.out.println("You played a game, had fun, lost.");
		}
	}
}