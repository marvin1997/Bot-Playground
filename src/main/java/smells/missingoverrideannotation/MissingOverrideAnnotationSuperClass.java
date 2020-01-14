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

			//		int i = 1;
			//		while (i < 10) {
			//			result = result + i;
			//			i++;
			//		}
	}

		/**
		 *
		 * @param a
		 * @param b
		 * @return
		 */
		public double addition2(double a, double b) {
				return a + b;

				//		int i = 1;
				//		while (i < 10) {
				//			result = result + i;
				//			i++;
				//		}
		}

		public int addition(int a, int b) {
				return a + b;

				//		int i = 1;
				//		while (i < 10) {
				//			result = result + i;
				//			i++;
				//		}
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
	
}
