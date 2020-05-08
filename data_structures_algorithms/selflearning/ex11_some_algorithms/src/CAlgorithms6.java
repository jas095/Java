/*
 * 3.Add a recursive method to the program shown in the previous section (ex10_some_algorithms)
 * that allows you to remove the last node in the stack.
 */


public class CAlgorithms6 {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(5);
        myStack.push(7);
        myStack.push(9);


        System.out.print("We print the Stack values in reverse order: ");
        myStack.printReversOrder();
        System.out.println("\n The first of the Stack: " + myStack.top.value);

        System.out.println("\nWe remove the last one from the Stack.");
        myStack.removeLast(); //method that deletes the bottom value


        System.out.print("\nPrint again the Stack values: ");
        myStack.printReversOrder();
        System.out.println("\nThe first of the Stack: " + myStack.top.value);

        System.out.println("\nWe remove the last one from the Stack.");
        myStack.removeLast(); //method that deletes the bottom value

        System.out.print("\nPrint again the Stack values: ");
        myStack.printReversOrder();
        System.out.println("\nThe first of the Stack: " + myStack.top.value);
    }
}
