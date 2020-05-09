
public class LinkList {

	private Node first; // reference for the first node -> first
	private Node last; // reference for the last node -> last

	public LinkList()
	{
		first = null;
		last = null;
	}
	
	public boolean isEmpty() // Returns 'true' if there is no node
	{ return first==null; }
	
	
	
	
	public void insertElement(int dd) // insert an item in the list
	{
		Node newNode = new Node(dd); 
		if( isEmpty() ) 
			first = newNode; 
		else
			last.next = newNode; 
		last = newNode;
	}
	
	
	public long deleteFirst()  // Delete the first node first link
	{ 							
		long temp = first.value;
		if(first.next == null) 
			last = null; 
		first = first.next; 
		return temp;
	}
	
	
	
	public void displayList() //Method that prints the list items...
	{
		System.out.print("The list has the following elements : ");
		Node current = first; 
		while(current != null)
		{
			current.displayLink(); 
			current = current.next;
		}
		System.out.println(""); 
	}
	


}
