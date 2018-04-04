
public class Node {
	
	private Character data;
	private Node next;
	
	public Node() {
		this(null);
	}
	
	public Node(Character data) {
		super();
		this.data = data;
		this.next = null;
	}
	
	
	public Character getData() {
		return data;
	}
	public void setData(Character data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
	

}
