package inlupg2;


/**
 * 
 * @author DennisW
 *
 * @param <E>
 */
public class DoublyLinkedList<E> {
	private ObjectNode<E> first = null, last = null;

	public int size() {
		ObjectNode<E> temp = first;
		int count = 0;
		while (temp != null) {
			temp = temp.getNext();
			count++;
		}
		return count;
	}

	public ObjectNode<E> get(int index) {
		if (index > -1 && index < size()) {
			ObjectNode<E> node = first;
			for (int i = 0; i < index; i++) {
				node = node.getNext();
			}
			return node;
		} else {
			System.out.println("Fel när nod hämtades: Index utanför listan");
			return null;
		}
	}

	public void add(E object, int index) {
		ObjectNode<E> prev, next;
		if (index < size() && index > 0) {
			prev = get(index - 1);
			next = get(index);
			ObjectNode<E> objectNode = new ObjectNode<E>(object, next, prev);
			prev.setNext(objectNode);
			if (next != null) {
				next.setPrevious(objectNode);
			}
		} else if (index == 0) {
			addFirst(object);
		} else if (index == size()) {
			addLast(object);
		} else {
			System.out.println("Fel när nod lades till: Index utanför listan");
		}
	}

	public void addFirst(E object) {
		ObjectNode<E> objectNode = new ObjectNode<E>(object);
		if (first != null) {
			objectNode.setNext(first);
			first.setPrevious(objectNode);
			first = objectNode;
		} else {
			first = objectNode;
			last = objectNode;
		}
	}

	public void addLast(E object) {
		ObjectNode<E> objectNode = new ObjectNode<E>(object);
		if (last != null) {
			objectNode.setPrevious(last);
			last.setNext(objectNode);
			last = objectNode;
		} else {
			first = objectNode;
			last = objectNode;
		}
	}

	public ObjectNode<E> remove(int index) {
		if (index > -1 && index < size()) {
			ObjectNode<E> target = get(index);
			ObjectNode<E> next, prev;
			if (target != first && target != last) {
				prev = target.getPrevious();
				next = target.getNext();
				next.setPrevious(prev);
				prev.setNext(next);
				return target;
			} else if (target == first) {
				return removeFirst();
			} else if (target == last) {
				return removeLast();
			} else {
				return null;
			}
		} else {
			System.out.println("Fel när nod togs bort: Index utanför listan");
			return null;
		}
	}

	public ObjectNode<E> removeFirst() {
		ObjectNode<E> target = first;
		ObjectNode<E> next = first.getNext();
		next.setPrevious(null);
		first = next;
		return target;
	}

	public ObjectNode<E> removeLast() {
		ObjectNode<E> target = last;
		ObjectNode<E> prev = target.getPrevious();
		prev.setNext(null);
		last = prev;
		return target;
	}

	public ObjectNode<E> getFirst() {
		return first;
	}

	public ObjectNode<E> getLast() {
		return last;
	}

	public String toString() {
		String res = "";
		if (first != null) {
			ObjectNode<E> node = first;
			while (node != null) {
				res += "[ " + node.getData().toString() + " ]";
				node = node.getNext();
			}
		}
		return res;
	}

}
