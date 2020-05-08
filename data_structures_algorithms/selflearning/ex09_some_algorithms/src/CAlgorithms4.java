/*
 * 1.Add a recursive method to the program shown in the previous section (ex7_some_algorithms)
 * that indicates how many times a particular value appears in the stack. 
 * 
*/
public class CAlgorithms4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Stack myStack = new Stack();
        myStack.push(5);
        myStack.push(7);
        myStack.push(9);
        myStack.push(3);
        myStack.push(3); 
        myStack.push(5); 
        myStack.push(7);
        myStack.push(5); 
        myStack.push(9);
        myStack.push(5);
        System.out.println("items in the stack:");
        myStack.printReversOrder();
        System.out.println("\nThe value '5' appears on the Stack: " + myStack.appear(5) + " times");
        System.out.println("The value '7' appears on the Stack: " + myStack.appear(7) + " times");
        System.out.println("The value '3' appears on the Stack: " + myStack.appear(3) + " times");
        System.out.println("The value '9' appears on the Stack: " + myStack.appear(9) + " times");
        System.out.println("The value '1' appears on the Stack: " + myStack.appear(1) + " times");
	}

}
