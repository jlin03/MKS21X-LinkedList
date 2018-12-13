public class MyLinkedList{
	private int size;
	private Node start,end;
	
	public MyLinkedList(Node s, Node e) {
		start = s;
		end = e;
		int length = 1;
		while(s.next() != null) {
			length++;
			s = s.next();
		}
		size = length;
	}

	public int size() {
		return size;
	}

	public boolean add(int value);
	
	public String toString();

}