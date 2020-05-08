
public class Stack {

    protected Node top;

    Stack() {
        top = null;
    }

    boolean isEmpty() {
        return (top == null);
    }

    void push(int v) {
        Node tempPointer;
        tempPointer = new Node(v);
        tempPointer.nextNode = top;
        top = tempPointer;
    }

    int pop() {
        int tempValue;
        tempValue = top.value;
        top = top.nextNode;
        return tempValue;
    }

    void printStack() {
        Node aPointer = top;
        String tempString = "";
        while (aPointer != null) {
            tempString = tempString + aPointer.value + "\n";
            aPointer = aPointer.nextNode;
        }
        System.out.println(tempString);
    }

    boolean hasValue(int v) {
        if (top.value == v) {
            return true;
        } else {
            return hasValueSubList(top, v);
        }
    }

    boolean hasValueSubList(Node ptr, int v) {
        if (ptr.nextNode == null) {
            return false;
        } else if (ptr.nextNode.value == v) {
            return true;
        } else {
            return hasValueSubList(ptr.nextNode, v);
        }
    }

    //it is assumed that the stack has at least one node
    int higherValue() {
        return higherValue(top);
    }

    private int higherValue(Node ptr) {
        if (ptr.nextNode == null) {
            return ptr.value;
        } else {
            int temp = higherValue(ptr.nextNode);
            if (ptr.value >= temp) {
                return ptr.value;
            } else {
                return temp;
            }
        }
    }

    void printReversOrder() {
        printReversOrder(top);
    }

    void printReversOrder(Node ptr) {
        if (ptr == null) {
            return;
        } else if (ptr.nextNode == null) {
            System.out.print(ptr.value + " ");
        } else {
            printReversOrder(ptr.nextNode);
            System.out.print(ptr.value + " ");
        }
    }

    int repeats(int value) {
        return repeats(top, value);
    }

    private int repeats(Node ptr, int value) {
        if (ptr == null) {
            return 0;
        }

        if (ptr.nextNode == null) {
            if (ptr.value == value) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (ptr.value == value) {
                return 1 + repeats(ptr.nextNode, value);
            } else {
                return repeats(ptr.nextNode, value);
            }
        }
    }

    void pushAtBottom(int value) {
        pushAtBottom(top, value);
    }

    private void pushAtBottom(Node ptr, int value) {
        if (ptr == null) {
            push(value);
        } else if (ptr.nextNode == null) {
            ptr.nextNode = new Node(value);
        } else {
            pushAtBottom(ptr.nextNode, value);
        }
    }

    /* recursive method removes the last node from the stack*/

    void removeLast() {
    	removeLast(top);
    }

    private void removeLast(Node ptr) {
        if (top == null) {
            System.out.println("Empty");
        } else if (top.nextNode == null) {
            top = null;
        }

        if (ptr.nextNode.nextNode == null) {
            ptr.nextNode = null;
        } else {
        	removeLast(ptr.nextNode);
        }
    }
}
