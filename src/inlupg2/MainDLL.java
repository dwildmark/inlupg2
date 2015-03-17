package inlupg2;

public class MainDLL {
	public static void main(String[] args) {
		ObjectNode<String> node1 = new ObjectNode<String>("Hej", null, null);
		DoubleLinkedList<String> list = new DoubleLinkedList<String>(node1);
		list.addFirst("jag");
		list.addFirst("heter");
		list.addLast("Dennis");
		list.add("index 0", 3);
		System.out.println(list.get(0).getData());
		System.out.println(list.size());
	}
}
