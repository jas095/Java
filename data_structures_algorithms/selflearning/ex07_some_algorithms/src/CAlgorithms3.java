/*
 * expected outputs:
 * true
 * 5 9 8 7 6 5 4 3 2 
 * 9 8 7 6 5 4 3 2 
 * 
 * */

public class CAlgorithms3{
	public static void main(String[] args){
		
		Stack myStack = new Stack();
		
		for (int i = 2; i < 10; i++) {
			myStack.push(i);
		}
		myStack.push(5);
		//Search for a value in the Stack
		System.out.println(myStack.hasValue(5));
		
		//print what's in the Stack
		myStack.printStack();
		myStack.pop();
		myStack.printStack();
	}
}

