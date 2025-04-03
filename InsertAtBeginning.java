package linkedListPractise;

public class InsertAtBeginning {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	public static class LinkedList{
		Node head = null;
		Node tail = null;
		public void insertAtBeginning(int data) {
			Node temp = new Node(data);
			if(head == null) {
				head = temp;
				tail = temp;
			}else {
				temp.next = head;
				head = temp;
			}
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
		ll.insertAtBeginning(4);
		ll.insertAtBeginning(3);
		ll.insertAtBeginning(6);
		ll.insertAtBeginning(8);
		ll.display();
	}
}
