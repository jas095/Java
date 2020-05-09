
public class Queue {

	private LinkList theList;
	//--------------------------------------------------------------
	public Queue()
// constructor
	{ theList = new LinkList(); } // make a 2-ended list
	//--------------------------------------------------------------
	public boolean isEmpty()
	// true if queue is empty
	{ return theList.isEmpty(); }
	//--------------------------------------------------------------
	public void push(int j)
	// insert, rear of queue
	{ theList.insertElement(j); }
	//--------------------------------------------------------------
	public long pop()// remove, front of queue
	{ return theList.deleteFirst(); }
	//--------------------------------------------------------------
	public void displayQueue()
	{
	System.out.print("Queue items (Queue - FIFO): ");
	theList.displayList();
	}
	//--------


}
