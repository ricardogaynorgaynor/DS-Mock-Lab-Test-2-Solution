
public class Queue {
	
	private Node front;
	
	public Queue() {
		front = null;
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public boolean isFull() {
		Node temp = new Node();
		if(temp == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void enqueue(Character data) {
		if(isFull()) {
			System.out.println("Unable to add data to queue");
		}else {
			Node temp = new Node(data);
			if(isEmpty()) {
				front = temp;
			}else {
				Node current = front;
				while(current.getNext() != null) {
					current = current.getNext();
				}
				current.setNext(temp);
			}
			
		} 
	}
	
	public Character dequeue() {
		Character data = null;
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			
			Node temp = front;
			front = front.getNext();
			data = temp.getData();
			temp = null;
		}
		return data;
	} 
	
	public Character getFront() {
		return front != null ? front.getData() : null;
	}
	
	public void destroy() {
		while(this.dequeue() != null);
	}

}
