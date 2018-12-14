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

	public boolean contains(Integer value) {
		if(this.size() > 0) {
			Node s = start;
			for(int i = 0;i < this.size(); i++) {
				if(s.getData() == value) {
					return true;
				}
				s = s.next();
			}
		}
		return false;
	}

	public int indexOf(Integer value) {
		if(this.size() > 0) {
			Node s = start;
			for(int i = 0;i < this.size(); i++) {
				if(s.getData() == value) {
					return i;
				}
				s = s.next();
			}
		}
		return -1;
	}

	private Node getNthNode(int index) {
		Node s = start;
		if(index < this.size() - 1 && index >= 0) {
			for(int i = 0;i < index; i++) {
				s = s.next();
			}
			return s;
		}
		return null;
	}

	public Integer get(int index) {
		Node n = null;
		if(index < this.size() - 1 && index >= 0) {
			n = getNthNode(index);
			return n.getData();
		}
		return null;
	}

	public Integer set(int index, Integer value) {
		Node n = null;
		if(index >= 0 && index < this.size()) {
			n = getNthNode(index);
			n.setData(value);
		}
		return value;
	}

	public boolean add(Integer value) {
		Node n = new Node(value);
		n.setNext(null);
		if(this.size() > 0) {
			n.setPrev(end);
			end.setNext(n);
			end = n;
		}
		else {
			n.setPrev(null);
			start = n;
			end = n;
		}
		size++;
		return true;
	}



	public String toString() {
		String out = "";
		Node s = start;
		out += s.getData() + ",";
		while(s.next() != null) {
			out += s.next().getData() + ",";
			s = s.next();
		}
		return out;
	}

}
