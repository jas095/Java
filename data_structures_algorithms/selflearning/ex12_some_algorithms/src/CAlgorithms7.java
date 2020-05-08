/*
 * 4.Add a recursive method to the program shown in the previous section (ex11_some_algorithms)
 * that indicates how many nodes the stack has.
*/


public class CAlgorithms7 {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(5);
        myStack.push(7);
        myStack.push(9);

        System.out.print("We print the Stack values in reverse order: ");
        myStack.printReversOrder();

        System.out.println("\nStack size: " + myStack.length());

        System.out.println("\nWe take out of the Stack " + myStack.pop());

        System.out.print("\nWe print the Stack values in reverse order: ");
        myStack.printReversOrder();

        System.out.println("\n Now the size of the Stack: " + myStack.length()); 

        System.out.println("\nWe take out of the Stack " + myStack.pop());

        System.out.print("\nWe print the Stack values in reverse order: ");
        myStack.printReversOrder();

        System.out.println("\nNow the size of the Stack: " + myStack.length());

    }
}