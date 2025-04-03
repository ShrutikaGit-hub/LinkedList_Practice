package linkedListPractise;

public class GetValueAt {
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
		public int getAt(int idx) {
			Node temp = head;
			for(int i = 1; i <= idx; i++) {
				temp = temp.next;
			}
			return temp.data;
		}
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertAtEnd(4);
		ll.insertAtEnd(3);
		ll.insertAtEnd(6);
		ll.insertAtEnd(8);
		System.out.println(ll.getAt(1));
	}
}
