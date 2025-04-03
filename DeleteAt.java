package linkedListPractise;

public class DeleteAt {
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
		public void display() {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
		public void deleteAt(int idx) {
			Node temp = head;
			for(int i = 1; i <= idx-1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertAtEnd(4);
		ll.insertAtEnd(3);
		ll.insertAtEnd(6);
		ll.insertAtEnd(8);
		ll.deleteAt(3);
		ll.display();
	}
}
