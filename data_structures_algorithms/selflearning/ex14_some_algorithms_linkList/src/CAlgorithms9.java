
public class CAlgorithms9 {

	public static void main(String[] args) {
		
		// Declaration of the new list
		LinkList myList = new LinkList();
		
		// insert at rear
		myList.insertElement(11); //Must be the first element pointed to by the last
		myList.insertElement(33);
		myList.displayList(); //Show items on the list so far 33.
		
		myList.insertElement(55);
		myList.insertElement(22);
		myList.insertElement(77);
		
		myList.deleteFirst(); //Delete the first
		myList.deleteFirst(); 
		myList.displayList();
		
		
		myList.insertElement(66);
		myList.insertElement(99);
		// Show the items in the list again.
		// This method starts in 'first', through a 'while'
		// and advance to the next node
		// Thus showing the circular list.
		myList.displayList(); 
		
		
		} 


}
