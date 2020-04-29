package smells.commentedoutcode;

import smells.incorrectorderofmodifiers.IncorrectOrderOfModifiers;

import java.util.Random;

/**
 * Commented out code reduces readability and should therefore be removed.
 */
public class CommentedOutCode {
	
	protected int calculateSomething() {
		int result = 0;
		
//		int i = 1;
//		while (i < 10) {
//			result = result + i;
//			i++;
//		}
		
		// an important comment
		for (int i = 0; i < 10; i++) {
			result = result + new Random().nextInt(2);

														}
		result = IncorrectOrderOfModifiers.setAndGetMultiplier(1, 2, 3);
		
		return result;
	}

		public static int calculateSomething2() {
				int result = 0;

																// an important comment
				for (int i = 0; i < 10; i++) {
						result = result + new Random().nextInt(2);
				}
				result = IncorrectOrderOfModifiers.setAndGetMultiplier(1, 2, 3);

				return result;
		}
	
}


