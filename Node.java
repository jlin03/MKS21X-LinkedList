public class Node{
	private Integer data;
	private Node next,prev;

	public Node() {}

	public Node(Integer val) {
		data = val;
	}

	public int getData() {
		return data;
	}

	public void setData(Integer val) {
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
