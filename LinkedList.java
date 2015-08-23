
class Node1{
		
		int value;
		Node1 next;
		
		public Node1(int value, Node1 next){
		
			this.value = value;
			this.next = next;
		}
		
	}

public class LinkedList {

	
	
	public static void addNode1(){
	}
	
	public static void createList(){
	
		
	}
	
	
	
	public static Node1 reverse(Node1 head, Node1 prev){
		
		if(head==null|| head.next==null)
			return head;
		
		Node1 cur = head;
		head = head.next;
		cur.next = prev;
		prev = head;
		
		return reverse(head, prev);
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node1 n1 = new Node1(1, null);
		Node1 n2 = new Node1(2, n1);
		Node1 n3 = new Node1(3, n2);
		
		Node1 n = reverse(n3, null);
		System.out.print(n.value);
		System.out.print(n.next.value);
		
	}

}
