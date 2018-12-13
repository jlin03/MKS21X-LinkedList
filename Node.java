public class Node{
	private int data;
	private Node next,prev;
	
	public Node(int val) {
		data = val;
	}
	
	public int get() {
		return data;
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
