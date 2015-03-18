package inlupg2;


/**
 * DoublyLinkedList handles a list of ObjectNodes that are linked.
 * The class contains methods for adding, getting and removing 
 * items from the list.
 * It also contains some other useful methods such as size and toString.
 * @author DennisW
 *
 * @param <E> the data type to be stored in the nodes.
 */
public class DoublyLinkedList<E> {
	private ObjectNode<E> first = null, last = null;

	/**
	 * Returns the size of the list.
	 * @return size
	 */
	public int size() {
		ObjectNode<E> temp = first;
		int count = 0;
		while (temp != null) {
			temp = temp.getNext();
			count++;
		}
		return count;
	}

	/**
	 * Returns the object at a specified index.
	 * @param index the index of the object
	 * @return ObjectNode at a specified index.
	 */
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

	/**
	 * Adds an object to the list at a specified index.
	 * @param object the object to be added.
	 * @param index the index of the object in the list.
	 */
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

	/**
	 * Adds an object at the first position in the list.
	 * @param object the object to be added.
	 */
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

	/**
	 * Adds an object at the last position of the list.
	 * @param object the object to be added.
	 */
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

	/**
	 * Removes and returns an object at a specified index in the list.
	 * @param index the index of the object
	 * @return the object.
	 */
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

	/**
	 * Removes and returns the first object of the list.
	 * @return the first object.
	 */
	public ObjectNode<E> removeFirst() {
		ObjectNode<E> target = first;
		ObjectNode<E> next = first.getNext();
		next.setPrevious(null);
		first = next;
		return target;
	}

	/**
	 * Removes and returns the last object of the list.
	 * @return the last object.
	 */
	public ObjectNode<E> removeLast() {
		ObjectNode<E> target = last;
		ObjectNode<E> prev = target.getPrevious();
		prev.setNext(null);
		last = prev;
		return target;
	}

	/**
	 * Returns the first object of the list.
	 * @return the first object.
	 */
	public ObjectNode<E> getFirst() {
		return first;
	}

	/**
	 * Returns the last object of the list.
	 * @return the last object.
	 */
	public ObjectNode<E> getLast() {
		return last;
	}

	/**
	 * Returns a String containing the data of all ObjectNodes in the list.
	 * The string is generated using the objects toString-method.
	 * @return string
	 */
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
	
	public String toStringBackwards() {
		String res = "";
		if(last != null) {
			ObjectNode<E> node = last;
			while(node != null) {
				res += "[ " + node.getData().toString() + " ]";
				node = node.getPrevious();
			}
		}
		return res;
	}

}
