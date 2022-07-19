
package dotcomgame;

import java.util.*;

/****************************************************************************
 * <b>Title:</b> DotComGame.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> Dot Com Game:
 * <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 27, 2022
 * <b>updates:</b>
 *  
 ****************************************************************************/
/**
 * @author faith
 *
 */
public class DotComGame {

	private int numOfHits;

	Scanner input = new Scanner(System.in);

	Prompts p1 = new Prompts();

	// Initialize game
	public static void main(String[] args) {
		// game instance
		DotComGame g1 = new DotComGame();
		g1.process();

	}

	public void process() {

		int numOfGuesses = 0;	

		boolean isAlive = true;

		int randIndex = getRandomNum();
		int[] locations = { randIndex, randIndex + 1, randIndex + 2 };
		System.out.println(java.util.Arrays.toString(locations));

		while (isAlive) {

			System.out.println("Enter your guess");
			int playerGuess = input.nextInt();

			String result = checkGuess(locations, playerGuess);
			numOfGuesses++;

			if (result.equals("KILL")) {

				isAlive = false;
				System.out.println("It took you " + numOfGuesses + " tries");
				break;
			}
		}

	}

	public String checkGuess(int[] locations, int playerGuess) {

		String result = "MISS";

		for (int cell : locations) {
			if (playerGuess == cell) {
				result = "HIT";
				numOfHits++;
				break;
			}
		}

		if (numOfHits == locations.length) {
			result = "KILL";
			System.out.println("GAME OVER");
		}

		System.out.println(result);
		return result;

	}

	public int getRandomNum() {
		Random r = new Random();
		int min = 0;
		int max = 4;
		return r.nextInt(max - min) + min;
	}
}
