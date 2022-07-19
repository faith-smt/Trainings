/**
 * 
 */
package dotcomgame;

import java.util.*;

/****************************************************************************
 * <b>Title:</b> Prompts.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> CHANGE ME!! <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 28, 2022
 * <b>updates:</b>
 *  
 ****************************************************************************/
/**
 * @author faith
 *
 */
public class Prompts {

	/**
	 * 
	 */
	// create map of prompts
	Map<String, String> english = new HashMap<>();

	public Prompts() {
		english.put("welcome", "Welcome to the Dot Com Game.");
		english.put("guess", "Enter a number between 0-7");
		english.put("kill", "Kill! GAME OVER");
		english.put("hit", "Hit! Keep up the good work");
		english.put("miss", "Miss. Keep trying");
	}
}
