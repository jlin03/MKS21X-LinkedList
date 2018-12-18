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
		if(this.size() > 0) {
			n.setPrev(end);
			end.setNext(n);
			end = n;
		}
		else {
			start = n;
			end = n;
		}
		size++;
		return true;
	}

	public void add(int index,Integer value) {
		if(index >= 0 && index < this.size()) {
			Node n = new Node(value);
			if(index == 0) {
				n.setNext(start);
				start.setPrev(n);
				start = n;
			}
			else {
				n.setNext(getNthNode(index+1));
				n.setPrev(getNthNode(index-1));
				getNthNode(index+1).setPrev(n);
				getNthNode(index-1).setNext(n);
			}
			size++;
		}
	}

	public Integer remove(int index) {
		Integer val = null;
		if(index >= 0 && index < this.size()) {
			val = getNthNode(index).getData();
			if(this.size() == 2) {
				if(index == 0) {
					end.setPrev(null);
					start = end;
				}
				if(index == 1) {
					start.setNext(null);
					end = start;
				}
			}
			if(this.size() == 1) {
				start = null;
				end = null;
			}
			else {
				if(index == 0) {
					start = start.next();
					start.setPrev(null);
				}
				if(index == 1) {
					end = end.prev();
					end.setNext(null);
				}
				else {
					getNthNode(index - 1).setNext(getNthNode(index + 1));
					getNthNode(index + 1).setNext(getNthNode(index - 1));
				}
			}
			size--;
		}
		return val;
	}
	
	public boolean remove(Integer value) {
		int s = this.size();
		remove(indexOf(value));
		return(s != this.size());
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
