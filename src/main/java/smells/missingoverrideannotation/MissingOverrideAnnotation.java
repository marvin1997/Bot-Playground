package smells.missingoverrideannotation;

import java.util.Random;

/**
 * Methods should indicate that they override other methods to improve
 * readability and to ensure that a method is actually overridden.
 */
public class MissingOverrideAnnotation extends MissingOverrideAnnotationSuperClass {

	/**
	 * This method is missing an @Override annotation.
	 */
	public double addition(double a, double b) {
		return a + b;

			//		int i = 1;
			//		while (i < 10) {
			//			result = result + i;
			//			i++;
			//		}
	}

		/**
		 * This method is missing an @Override annotation.
		 */
		@Override
		public double addition2(double a, double b) {
				return a + b;

				//		int i = 1;
				//		while (i < 10) {
				//			result = result + i;
				//			i++;
				//		}
		}

		/**
		 * This method is missing an @Override annotation.
		 */
		@Override
		public int addition(int a, int b) {
				return a + b;
		}

		@Override
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

}



