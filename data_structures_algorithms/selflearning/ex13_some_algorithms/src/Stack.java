
public class Stack {
	
	public Stack(String name) {
		top = last=null;
		this.name = name;
	}
	
	private static class Node{
		private Object data;
		private Node next;
		private Node(Object object) {
			this(object,null);
		}
		private Node(Object object, Node node) {
			data = object;
			next = node;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "" + data + "_____";
		}
	}
	
	

	private Node top;
	private Node last;
	private String name;
	
	public Stack() {
		// TODO Auto-generated constructor stub
		this("Lista");
	}
	
	
	
	public boolean isEmpty() {
		return top == null;
	}

	public Object peek() {
		return top.data;
	}
	public void push(Object data) {
		
			Node auxtop = new Node(data,top);
			auxtop.next = top;
			top = auxtop;

	}
	public Object pop() throws Exception {
		if(isEmpty()) {
			throw new Exception( "Empty" );

		}
		Object data = top.data;
		if(top == last) {
			top = last = null;
		}else {
			top = top.next;
		}
		
		return data;
	}

		
	
	public void outputs() {
		
		Node actual = top;
		if(isEmpty()) {
			System.out.println("Is empty");
			return;
		}
		while(actual != null) {
			top.toString();
			System.out.println("\nactual: "+actual);
			actual = actual.next;
			
		}
		
	}

}
