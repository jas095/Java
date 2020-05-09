
public class Node {
	
	int	value;
	Node next;

	public Node() {}

	Node(int v, Node n){
		value = v;
		next = n;
	}

	Node (int v){
		this(v,null);
	}
	
	public void displayLink() //It shows the value of the variable 'value', that is, the data of the node.
	{ System.out.print(value + " "); }

}
