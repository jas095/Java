
public class CAlgorithms11 {

	public static void main(String[] args) {
		/*
		 * int popValue;
			Stack myStack = new Stack();
			myStack.push(5);
			myStack.push(7);
			myStack.push(9);
			myStack.printStack();
			popValue = myStack.pop();
			popValue = myStack.pop();
			myStack.printStack();
		 */
		
		//Create the queue
		Queue myQueue = new Queue();
		// insert elements at one end into the queue
		myQueue.push(20); 
		myQueue.push(40);
		//Print the items in the queue
		myQueue.displayQueue(); 
		
		myQueue.push(60); // insert items
		myQueue.push(80); 
		myQueue.displayQueue(); 
		// Make Extractions of elements at the other end
		myQueue.pop(); 
		myQueue.pop(); 
		//Print the items in the queue
		myQueue.displayQueue(); 


	}

}
