package linkedListPractise;

public class LengthofLinkedList {
	public static int length(Node node1) {
		int counter = 0;
		while(node1!=null) {
			counter++;
			node1 = node1.next;
		}
		return counter;
	}
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	public static void main(String[] args) {
		LengthofLinkedList obj = new LengthofLinkedList();
		Node node1 = obj.new Node(3);
		Node node2 = obj.new Node(6);
		Node node3 = obj.new Node(1);
		Node node4 = obj.new Node(9);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		int length = length(node1);
		System.out.println(length);
	}
}
