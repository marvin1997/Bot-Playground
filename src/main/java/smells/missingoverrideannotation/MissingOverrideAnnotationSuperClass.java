package smells.missingoverrideannotation;

import java.util.Random;

public class MissingOverrideAnnotationSuperClass {

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double addition(double a, double b) {
		return a + b;

																}

		/**
		 *
		 * @param a
		 * @param b
		 * @return
		 */
		public double addition2(double a, double b) {
				return a + b;

																						}

		public int addition(int a, int b) {
				return a + b;

																						}

		protected int addition3() {
				int result = 0;

																								// an important comment
				for (int i = 0; i < 10; i++) {
						result = result + new Random().nextInt(2);
				}

				return result;
		}
	
}




