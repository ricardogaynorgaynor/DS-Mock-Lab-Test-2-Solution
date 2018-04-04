
public class Stack {
	
	private Node top;
	
	public Stack() {
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public boolean isFull() {
		Node temp = new Node();
		if(temp == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(Character data) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			Node temp = new Node(data);
			if(isEmpty()) {
				top = temp;
			}else {
				temp.setNext(top);
				top = temp;
			}
		}
	}
	
	public Character pop() {
		Character data = null;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			
			Node temp = top;
			top = top.getNext();
			data = temp.getData();
			temp = null;
			
		}
		 
		return data;
	}
	
	
	public Character getTop() {
		return top != null ? top.getData() : null;
	}
	
	public void destroy() {
		while(this.pop() != null);
	}
	

}
