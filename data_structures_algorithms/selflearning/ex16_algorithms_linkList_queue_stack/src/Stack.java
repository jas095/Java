
public class Stack {

	protected Node top;

	Stack()
	{
		top = null;
	}

	boolean isEmpty()
	{
		return( top == null);
	}

	void push(int v)
	{
		Node tempPointer;
		tempPointer = new Node(v);
		tempPointer.next = top;
		top = tempPointer;
	}

	int pop()
	{
		int tempValue;
		tempValue = top.value;
		top = top.next;
		return tempValue;
	}

	void printStack()
	{
		Node aPointer = top;
		String tempString = "";
		while (aPointer != null)
		{
			tempString = tempString + aPointer.value + "\n";
			aPointer = aPointer.next;
		}

		System.out.println(tempString);
	}
}
