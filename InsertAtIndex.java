package linkedListPractise;

public class InsertAtIndex {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	public static class LinkedList{
		Node head = null;
		Node tail = null;
		public void insertAtEnd(int data) {
			Node temp = new Node(data);
			if(head == null) {
				head = temp;
				tail = temp;
			}else {
				tail.next = temp;
				tail = temp;
			}
		}
		public void insertAt(int idx, int data) {
			Node t = new Node(data);
			Node temp = head;
			for(int i = 1; i <= idx-1; i++) {
				temp = temp.next;
			}
			t.next = temp.next;
			temp.next = t;
		}
		public void display() {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertAtEnd(4);
		ll.insertAtEnd(3);
		ll.insertAtEnd(6);
		ll.insertAtEnd(8);
		ll.insertAt(2,9);
		ll.display();
	}
}
