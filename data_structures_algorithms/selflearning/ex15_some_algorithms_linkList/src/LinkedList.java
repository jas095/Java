
public class LinkedList {
	Node head;	//head = null;

	LinkedList()
	{
	}

	int length()
	{
		Node tempPtr; int result = 0; tempPtr = head;

		while (tempPtr != null)
		{
			tempPtr = tempPtr.nextNode; result = result + 1;
		}

		return(result);
	}

	void insertAt(int v, int position)
	{
		Node newNode = new Node(v,null); Node tempPtr;
		int tempPosition = 0;

		if((head == null) || (position ==0))
		{
			newNode.nextNode = head; head = newNode;
		}
		else
		{
			tempPtr = head;
			while((tempPtr.nextNode != null)&&(tempPosition < position -1))
			{
				tempPtr = tempPtr.nextNode; tempPosition = tempPosition + 1;
			}
			if (tempPosition == (position - 1))
			{
				newNode.nextNode = tempPtr.nextNode; tempPtr.nextNode = newNode;
			}
		}
	}

	public String toString()
	{
		Node tempPtr;

		tempPtr = head; String result = "";

		while(tempPtr != null)
		{
			result = result + "[" + tempPtr.value + "| ]-->"; tempPtr = tempPtr.nextNode;
		}
		result = result + "null"; return result;
	}


	void deleteAt(int position)
	{
		Node tempPtr = head; int tempPosition = 0;

		if (position < this.length())
		{
			if (head == null)
			{
				//do nothing
			}
			else if ((head.nextNode == null) && (position == 0))
			{
				head = null;
			}
			else if (position == 0)
			{
				head = head.nextNode;
			}
			else
			{
				while((tempPosition < (position - 1))&& (tempPtr.nextNode.nextNode != null))
				{
					tempPtr = tempPtr.nextNode; tempPosition++;
				}
				if (tempPosition == (position - 1))
				{
					tempPtr.nextNode = tempPtr.nextNode.nextNode;
				}
			}
		}
	}




	void deleteGreater()
	{
		Node tempPtr = head; int value = -1;
		int posi = 0;

		if(head==null) {};//if head is itself greater than value

		while(tempPtr.nextNode.nextNode != null){
			if(tempPtr.nextNode.value > value)
			{
				posi++;
				tempPtr = tempPtr.nextNode;}
			// System.out.println("Valor: "+posi);
		}
		deleteAt(posi);
		//tempPtr  = tempPtr.nextNode.nextNode;

	}

	void convertToRing(){

		Node tempPtr = head;

		if(head==null) {};
		while(tempPtr.nextNode != null){
			tempPtr = tempPtr.nextNode;
		}
		
		//System.out.println("El ultimo: "+tempPtr.value);
		
		tempPtr.nextNode = head;
		System.out.println("The last points to: "+tempPtr.nextNode.value);
		
	}

}
