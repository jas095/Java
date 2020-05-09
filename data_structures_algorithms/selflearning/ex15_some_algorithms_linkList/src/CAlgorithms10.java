
public class CAlgorithms10 {

	public static void main(String[] args) {

		LinkedList aLinkedList	= new LinkedList(); 
		
		aLinkedList.insertAt(1,0);
		aLinkedList.insertAt(9,1); 
		aLinkedList.insertAt(13,2); 
		aLinkedList.insertAt(8,1); 
		aLinkedList.insertAt(3,2);

		System.out.println(aLinkedList);
		System.out.println("the length of the list: " + aLinkedList.length());

		aLinkedList.deleteAt(2); 
		aLinkedList.deleteAt(0); 
		aLinkedList.insertAt(19,2); 
		
		System.out.println(aLinkedList);
		aLinkedList.deleteGreater();
		System.out.println(aLinkedList);
		aLinkedList.convertToRing();
	}

}
