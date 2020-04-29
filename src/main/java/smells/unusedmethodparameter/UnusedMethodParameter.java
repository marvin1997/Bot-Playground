package smells.unusedmethodparameter;

import java.util.Random;

/**
 * Unused method parameters confuse developers and should therefore be removed.
 */
public class UnusedMethodParameter {

	/**
 * 
 * @param a
 * @param c
 * @return
 */
	protected int calculateSomething(int a, int c) {
		int result = (a + c) * 0;
		result = result + 1;
		return result;
	}

		/**
 * 
 * @param a
 * @param c
 * @return
 */
		protected int calculateSomething2(int a, int c) {
				int result = (a + c) * 0;
				result = result + 1;
				return result;
		}

	/**
	 * This method contains a method call to the method with an unused parameter.
	 * When removing the unused parameter, the argument should be removed as well.
	 * 
	 * @return
	 */
	protected int calculateSomethingElse() {
			int i = calculateSomething2(4,6);
		return calculateSomething(1, 3);
	}

		protected int addition3() {
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

				return result;
		}

		protected int addition3(int i, int b) {
				int result = 0;

				//		int i = 1;
				//		while (i < 10) {
				//			result = result + i;
				//			i++;
				//		}

				// an important comment
				for (int j = 0; i < b; i++) {
						result = result + new Random().nextInt(2);
				}

				return result;
		}

}




