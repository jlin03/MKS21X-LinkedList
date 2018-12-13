public class Node{
	private Integer data;
	private Node next,prev;

	public Node() {}

	public Node(Integer val) {
		data = val;
	}

	public int get() {
		return data;
	}

	public void set(Integer val) {
		data = val;
	}

	public Node next() {
		return next;
	}

	public Node prev() {
		return prev;
	}

	public void setNext(Node n) {
		next = n;
	}

	public void setPrev(Node p) {
		prev = p;
	}
}
