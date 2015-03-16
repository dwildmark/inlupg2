package inlupg2;

public class MainDLL {
	public static void main(String[] args) {
		ObjectNode<String> node1 = new ObjectNode("Hej", null, null);
		DoubleLinkedList<String> list = new DoubleLinkedList(node1, null);
		list.add("jag", 1);
		System.out.println(list.get(1).getData());
	}
}
