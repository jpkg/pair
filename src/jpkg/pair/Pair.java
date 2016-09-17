package jpkg.pair;

public class Pair<L, R> {
	
	private L left;
	private R right;
	
	/**
	 * Construct a new pair
	 * @param left The value on the left side
	 * @param right The value on the right side
	 */
	
	public Pair(L left, R right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * Retrieve the left value
	 * @return The value
	 */
	
	public L getLeft() {
		return left;
	}
	
	/**
	 * Retrieve the right value
	 * @return The value
	 */
	
	public R getRight() {
		return right;
	}

	/**
	 * Change the left value
	 * @param newval
	 * @return This pair, for easy chaining
	 */
	
	public Pair<L, R> setLeft(L newval) {
		left = newval;
		return this;
	}
	
	/**
	 * Change the right value
	 * @param newval
	 * @return This pair, for easy chaining
	 */
	
	public Pair<L, R> setRight(R newval) {
		right = newval;
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 5;
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Pair))
			return false;
		
		@SuppressWarnings("rawtypes")
		Pair other = (Pair) obj;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String leftstr = (left == null) ? "null" : (left.toString());
		String rightstr = (right == null) ? "null" : (right.toString());
		return "(" + leftstr + ", " + rightstr + ")";
	}
}
