package bst;

public class Node {

	private int value;
	private int amount;
	private Node left;
	private Node right;

	public Node(int value) {
		this.value = value;
		this.amount = 1;
		right = null;
		left = null;
	}

	public int getValue() {
		return this.value;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	/**
	 * Returns the value of the node and the amount of times it was added to the
	 * tree.
	 */
	@Override
	public String toString() {
		return String.valueOf(this.value) + "(" + this.amount + ")";

	}

}
