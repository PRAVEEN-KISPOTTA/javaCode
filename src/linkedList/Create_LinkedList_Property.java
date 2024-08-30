package linkedList;

public class Create_LinkedList_Property {
	public static class Node{
		int val;
		Node next;
		
		Node(int val){
			this.val = val;
		}
	}
	
	public static class linkedList{
		Node head = null;
		Node tail = null;
		
		public void insertAtEnd(int data){
			Node temp = new Node(data);
			if(head == null) {
				head = temp;
			}
			else {
				tail.next = temp;
				
			}
			tail = temp;
		}
		
		void display() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.val + "->");
				temp = temp.next;
			}
			System.out.println("null");
		}
		
		void size() {
			Node temp = head;
			int count = 0;
			
			while(temp != null) {
				count++;
				temp = temp.next;
			}
			System.out.println("count - " + count);
		}
		
		void insertAtHead(int num) {
			Node temp = head;
			Node node = new Node(num);
			
			if(temp == null) {
				head = node;
				tail = node;
			}
			else {
				node.next = temp;
			}
			head = node;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList ll = new linkedList();
		ll.insertAtEnd(2);
		ll.insertAtEnd(0);
		ll.insertAtEnd(32);
		
		ll.insertAtHead(4);
		ll.insertAtHead(32);
		
		ll.display();
		ll.size();
		

	}

}
