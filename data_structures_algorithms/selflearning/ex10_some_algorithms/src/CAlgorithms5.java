/*
 * 2.Add a recursive method to the program shown in the previous section (ex9_some_algorithms)
 *  that allows inserting a value at the end of the stack.
 *  
 */

public class CAlgorithms5 {
	
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(5);
        myStack.push(7);
        myStack.push(9);
        
        System.out.print("We print the Stack values in reverse order. \n before inserting an element at the end.\n ");
        myStack.printReversOrder();

        System.out.println("\n We insert the value 4 at the end of the Stack.");
        myStack.insertAtEnd(4);

        System.out.print("Print the Stack values again in reverse order.\n");
        myStack.printReversOrder();

        System.out.println("\n The first value of the Stack: " + myStack.top.value);
        System.out.println();

        System.out.println("\n We insert the value 6 at the end of the Stack.");
        myStack.insertAtEnd(6);

        System.out.print(" Print the Stack values again in reverse order.\n");
        myStack.printReversOrder();

        System.out.println("\n The first value of the Stack: " + myStack.top.value);
    }
}