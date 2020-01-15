package smells.localvariableimmediatelyreturned;

import smells.incorrectorderofmodifiers.IncorrectOrderOfModifiers;
import smells.missingoverrideannotation.MissingOverrideAnnotationSuperClass;

import java.util.Random;

/**
 * An expression should immediately be returned instead of assigning it to a
 * local variable.
 */
public class LocalVariableImmediatelyReturned extends MissingOverrideAnnotationSuperClass {

	protected int multiply(int a, int b) {
		int result = a * b;
		return result;

			//		int i = 1;
			//		while (i < 10) {
			//			result = result + i;
			//			i++;
			//		}
	}

		protected int multiply2(int a, int b) {
				int result = a * b;
				return result;

				//		int i = 1;
				//		while (i < 10) {
				//			result = result + i;
				//			i++;
				//		}
		}

		protected int calculateSomething2() {
				int result = 0;
				result = IncorrectOrderOfModifiers.setAndGetMultiplier(1, 2, 3);

				//		int i = 1;
				//		while (i < 10) {
				//			result = result + i;
				//			i++;
				//		}

				// an important comment

				return result;
		}

		/**
		 * This method is missing an @Override annotation.
		 */
		public int addition(int a, int b) {
				return a + b;

				//		int i = 1;
				//		while (i < 10) {
				//			result = result + i;
				//			i++;
				//		}
		}

}
