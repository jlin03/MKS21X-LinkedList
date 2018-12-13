public class MyLinkedList{
	private int size;
	private Node start,end;

	public MyLinkedList() {
		start = null;
		end = null;
		size = 0;
	}

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

	public boolean add(int value) {
		Node n = new Node(value);
		n.setNext(null);
		if(this.size() > 0) {
			n.setPrev(end);
			end.setNext(n);
			end = n;
			size++;
		}
		else {
			n.setPrev(null);
			start = n;
			end = n;
		}

		return true;
	}

	public String toString() {
		String out = "";
		Node s = start;
		out += s.get() + ",";
		while(s.next() != null) {
			out += s.next().get() + ",";
			s = s.next();
		}
		return out;
	}

}
