package smells.incorrectorderofmodifiers;

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
		protected int setAndGetMultiplier(int mul, int div, int add) {
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

				//		int i = 1;
				//		while (i < 10) {
				//			result = result + i;
				//			i++;
				//		}

				// an important comment
				for (int i = 0; i < 10; i++) {
						result = result + new Random().nextInt(2);

						//		int i = 1;
						//		while (i < 10) {
						//			result = result + i;
						//			i++;
						//		}
				}

				return result;
		}

}
