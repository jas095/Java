
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
		tempPointer.nextNode = top;
		top = tempPointer;
	}

	int pop()
	{
		int tempValue;
		tempValue = top.value;
		top = top.nextNode;
		return tempValue;
	}

	void printStack()
	{
		Node aPointer = top;
		String tempString = "";
		while (aPointer != null)
		{
			tempString = tempString + aPointer.value + " ";
			aPointer = aPointer.nextNode;
		}
		System.out.println(tempString);
	}

	boolean hasValue(int v)
	{


		if (top.value == v)
		{	


			return true;
		}
		else	

		{
			return hasValueSubList(top,v);	
		}
	}	


	boolean hasValueSubList(Node ptr, int v)
			{
		if (ptr.nextNode == null)	

	{
		return false;	

	}
	else if (ptr.nextNode.value == v)	

	{
		return true;	

	}
	else	
	{	
		return hasValueSubList(ptr.nextNode,v);
	}
			}
}
