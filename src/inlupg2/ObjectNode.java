package inlupg2;

public class ObjectNode <E> {
	private ObjectNode<E> nextNode;
	private ObjectNode<E> previousNode;
	private E data;
	
	public ObjectNode (E data, ObjectNode<E> next, ObjectNode<E> previous) {
		this.data = data;
		setNext(next);
		setPrevious(previous);
	}
	public E getData() {
		return data;
	}
	
	public ObjectNode<E> getNext() {
		return nextNode;
	}
	
	public ObjectNode<E> getPrevious() {
		return previousNode;
	}
	
	public void setNext(ObjectNode<E> nextNode) {
		this.nextNode = nextNode;
	}
	
	public void setPrevious(ObjectNode<E> previousNode) {
		this.previousNode = previousNode;
	}
	
}
