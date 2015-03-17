package inlupg2;

/**
 * ObjectNode is a wrapper containing data of the type E.
 * It also contains references to next and previous node in a DoublyLinkedList.
 * @author DennisW
 *
 * @param <E> the type of Object to be stored in the node.
 */
public class ObjectNode <E> {
	private ObjectNode<E> nextNode;
	private ObjectNode<E> previousNode;
	private E data;
	
	/**
	 * Creates a node containing E data. 
	 * Next and previous node references are set to null.
	 * @param data the data to be stored.
	 */
	public ObjectNode(E data) {
		this.data = data;
		setNext(null);
		setPrevious(null);
	}
	
	/**
	 * Creates a node containing E data.
	 * Next and previous references are set 
	 * to the ObjectNodes specified in the parameters.
	 * @param data the data to be stored.
	 * @param next reference to the next node in a DoublyLinkedList.
	 * @param previous reference to the next node in a DoublyLinkedList.
	 */
	public ObjectNode (E data, ObjectNode<E> next, ObjectNode<E> previous) {
		this.data = data;
		setNext(next);
		setPrevious(previous);
	}
	
	/**
	 * Returns the data contained in the node.
	 * @return E data
	 */
	public E getData() {
		return data;
	}
	
	/**
	 * Returns a reference to the next node in a DoublyLinkedList.
	 * @return next ObjectNode
	 */
	public ObjectNode<E> getNext() {
		return nextNode;
	}
	 
	/**
	 * Returns a reference to the previous node in a DoublyLinkedList.
	 * @return previous ObjectNode
	 */
	public ObjectNode<E> getPrevious() {
		return previousNode;
	}
	
	/**
	 * Sets the next node reference to what is specified in the parameter.
	 * @param nextNode reference to the next node in a DoublyLinkedList.
	 */
	public void setNext(ObjectNode<E> nextNode) {
		this.nextNode = nextNode;
	}
	
	/**
	 * Sets the previous node reference to what is specified in the parameter.
	 * @param previousNode reference to the previous node in a DoublyLinkedList.
	 */
	public void setPrevious(ObjectNode<E> previousNode) {
		this.previousNode = previousNode;
	}
	
}
