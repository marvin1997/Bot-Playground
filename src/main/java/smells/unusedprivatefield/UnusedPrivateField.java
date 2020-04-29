package smells.unusedprivatefield;

import java.util.Random;

/**
 * Unused private fields confuse developers and should therefore be removed.
 */
public class UnusedPrivateField {

	/**
	 * This is an unused private field. The value is never read.
	 */
	private int foo;
	
	/**
	 * However, the value could be set as in this constructor.
	 */
	public UnusedPrivateField() {
		this.foo = 42;

			//		int i = 1;
			//		while (i < 10) {
			//			result = result + i;
			//			i++;
			//		}
	}

		/**
		 * However, the value could be set as in this constructor.
		 */
		public void methodUnusedPrivateField2() {


																									this.foo = 42;
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


