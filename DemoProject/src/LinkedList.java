
public class LinkedList {
	
	private Node head;
	private Node tail;
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	
	public void add(Node node)
	{
		tail.getNext();
		tail=node;
		
	}

}
