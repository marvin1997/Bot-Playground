package smells.incorrectorderofmodifiers;

import smells.commentedoutcode.CommentedOutCode;

import java.util.Random;

/**
 * According to the Java Language Specification (JLS), a certain order for
 * modifiers must be adhered to. Otherwise, it makes the code more difficult to
 * read, since most developers are used to this order.
 */
public class IncorrectOrderOfModifiers {

	/**
	 * expected: private static final int
	 */
	private final static int MULTIPLIER = 10;
		private final static int MULTIPLIER1 = 10;
		private final static int MULTIPLIER2 = 10;
		private final static int MULTIPLIER3 = 10;
		private final static int MULTIPLIER4 = 10;
		private final static int MULTIPLIER5 = 10;
		private final static int MULTIPLIER6 = 10;
		private final static int MULTIPLIER7 = 10;
		private final static int MULTIPLIER8 = 10;
		private final static int MULTIPLIER9 = 10;
		private final static int MULTIPLIER0 = 10;

		//		int i = 1;
		//		while (i < 10) {
		//			result = result + i;
		//			i++;
		//		}

	/**
	 * 
	 * @return
	 */
	protected int getMultiplier() {
		return MULTIPLIER;

			//		int i = 1;
			//		while (i < 10) {
			//			result = result + i;
			//			i++;
			//		}
	}

		/**
		 *
		 * @return
		 */
		public static int setAndGetMultiplier(int mul, int div, int add) {
				add = 1 + 1;
				mul = add * add;

				return mul;

				//		int i = 1;
				//		while (i < 10) {
				//			result = result + i;
				//			i++;
				//		}
		}

		protected int calculateSomething2(int a) {
				int result = 0;

																								// an important comment
				for (int i = 0; i < 10; i++) {
						result = result + new Random().nextInt(2);

																																				a = CommentedOutCode.calculateSomething2();
				}

				return result;
		}

}


