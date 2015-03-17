package inlupg2;

public class DoubleLinkedList<E> {
	private ObjectNode<E> first, last;
	
	public DoubleLinkedList(ObjectNode<E> first) {
		this.first = first;
		this.last = first;
		this.first.setNext(this.last);
		this.last.setPrevious(this.first);
	}
	
	public int size() {
		ObjectNode<E> temp = first;
		int count = 1;
		while(temp.getNext() != null) {
			temp = temp.getNext();
			count++;
		}
		return count;
	}
	
	public ObjectNode<E> get(int index) {
		if(size() > index) {
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
		ObjectNode<E> prev, next;
		if(index < size() - 1 && index > 0) {
			prev = get(index - 1);
			next = get(index + 1);
			ObjectNode<E> objectNode = new ObjectNode<E>(object, next, prev);
			prev.setNext(objectNode);
			if(next != null) {
				next.setPrevious(objectNode);
			}
		} else if(index == 0) {
			addFirst(object);
		} else if(index == size()) {
			addLast(object);
		}
	}
	
	public void addFirst(E object) {
		ObjectNode<E> objectNode = new ObjectNode<E>(object, first, null);
		first.setPrevious(objectNode);
		first = objectNode;
	}
	
	public void addLast(E object) {
		ObjectNode<E> objectNode = new ObjectNode<E>(object, null, last);
		last.setNext(objectNode);
		last = objectNode;
	}
	
	public void remove(int index) {
		ObjectNode<E> target = get(index);
		if(target != first && target != last) {
			
		}
	}
}
