package linkedList;

public class PrintRecursive {
	
	public static class Node {
		// TODO Auto-generated constructor stub
		int val;
		Node next;
		Node(int val){
			this.val = val;
		}
	}

	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;
		
		Node head = reverse(a);
		
		while(head != null) {
			System.out.print(head.val + "->");
			head = head.next;
		}
		System.out.print("null");

	}
	
	public static Node reverse(Node head){
		Node data = head;
		if(data == null) {
			return data;
		}
		
		reverse(data.next);
		System.out.print(data.val + " ");
		return data;
	}

}
