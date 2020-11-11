package it.unibo.oop.lab.nesting2;

import java.util.List;

/**
 * Implementation of {@link Acceptable}.
 * Checks if a sequence of generic elements matches exactly
 * the content and order of a fixed {@link List} of elements
 * of the same type.
 *
 * @param <T>
 * 			generic element to be evaluated by the {@link Acceptor}.
 */
public class OneListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> acceptableList;
	
	/**
	 * Builds a new {@link OneListAcceptable} with a {@link List} of elements
	 * that will used by the {@link Acceptor}.
	 * 
	 * @param acceptable
	 * 			{@link List} containing a sequence of acceptable elements.
	 */
	public OneListAcceptable(final List<T> acceptable) {
		this.acceptableList = acceptable;
	}

	/**
	 * {@inheritDoc}
	 */
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {
			private int currentPos = 0;
			
			/**
			 * {@inheritDoc}
			 */
			public void accept(final T newElement) {
				if (OneListAcceptable.this.acceptableList.indexOf(newElement) == this.currentPos) {
					this.currentPos++;
				} else {
					throw new ElementNotAcceptedException(newElement);
				}
			}
			/**
			 * {@inheritDoc}
			 */
			public void end() {
				if (this.currentPos < OneListAcceptable.this.acceptableList.size()) {
					throw new EndNotAcceptedException();
				}
			}	
		};
	}
}
