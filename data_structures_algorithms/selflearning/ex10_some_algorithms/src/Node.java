
public class Node {

    int value;
    Node nextNode;

    Node(int v, Node n) {
        value = v;
        nextNode = n;
    }

    Node(int v) {
        this(v, null);
    }

}
