package inlupg2;

public class DoubleLinkedList<E> {
	private ObjectNode<E> first, last;
	private int size;
	
	public DoubleLinkedList(ObjectNode<E> first, ObjectNode<E> last) {
		this.first = first;
		this.last = last;
		this.first.setNext(this.last);
		if(this.last != null) {
			this.last.setPrevious(this.first);
		}
		size = 1;
	}
	
	public int size() {
		return size;
	}
	
	public ObjectNode<E> get(int index) {
		if(size >= index + 1) {
			ObjectNode<E> node = first;
			for(int i = 0; i < index; i++) {
				node = node.getNext();
			}
			return node;
		} else {
			return null;
		}
	}
	
	public void add(E object, int index) {
		if(index < size && index > 0) {
			ObjectNode<E> objectNode = new ObjectNode<E>(object, get(index + 1), get(index - 1));
			size++;
		}
	}
	
	public void remove(int index) {
		ObjectNode<E> target = get(index);
		if(target != first && target != last) {
			
		}
	}
}
