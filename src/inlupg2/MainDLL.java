package inlupg2;


public class MainDLL {
	DoublyLinkedList<String> list = new DoublyLinkedList<String>();
	private void test1() {
		System.out.println("Listan är tom: " + "\n" + list.toString());
		System.out.println();
		
		list.add("Objekt 1", 0);
		list.add("Objekt 2", 1);
		list.add("Objekt 3", 2);
		list.addLast("Objekt 4");
		System.out.println("Fyra objekt tillagda: " + "\n" + list.toString());
		System.out.println();
		
		list.addFirst("Objekt 0");
		System.out.println("Objekt tillagt först med addFirst(): " + "\n" + list.toString());
		System.out.println();
		
		list.addLast("Objekt 5");
		System.out.println("Objekt tillagt sist med addLast(): " + "\n" + list.toString());
		System.out.println();
		
		list.add("Objekt index 2", 2);
		System.out.println("Objekt tillagt på index 2" + "\n" + list.toString());
		System.out.println();
	}
	
	private void test2() {
		System.out.println("Storleken på arrayen: " + "\n" + list.size());
		System.out.println();
		
		System.out.println("Hämta data ur objekt på index 3: " + "\n" + list.get(3).getData());
		System.out.println();
		
		list.remove(3);
		System.out.println("Ta bort objekt på index 3: " + "\n" + list.toString());
		System.out.println();
		
		System.out.println("Ta bort första och sista objektet: " + "\n" + 
		"Objekt borttagna: " + list.removeFirst().getData() + " " + 
				list.removeLast().getData() + "\n" + "Uppdaterad lista: " + list.toString());
		System.out.println();
		
		System.out.println("Försök lägga till objekt med index 7: ");
		list.add("Objekt index 7", 7);
		System.out.println();
		
		System.out.println("Försök att ta bort objekt med index 9: ");
		list.remove(9);
		System.out.println();
		
		System.out.println("Försök att hämta objekt med index -1: ");
		list.get(-1);
		System.out.println();
		
		System.out.println("Skriv ut listan baklänges: " + "\n" + list.toStringBackwards());
	}
	
	public static void main(String[] args) {
		MainDLL main = new MainDLL();
		main.test1();
		main.test2();
	}
}
