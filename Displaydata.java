package linkedListPractise;

public class Displaydata {
	public static void displayWithRecursion(Node node1) {
		if(node1 == null) {
			return;
		}
		System.out.print(node1.data+" ");
		displayWithRecursion(node1.next);
	}
	
	public static void displayWithForLoop(Node node1) {
		Node temp = node1;
		for(int i = 1; i <= 5; i++) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static void displayWithWhileLoop(Node node1) {
		Node temp1 = node1;
		while(temp1 != null) {
			System.out.print(temp1.data+" ");
			temp1 = temp1.next;
		}
	}
	
	class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Displaydata obj = new Displaydata();
		Node node1 = obj.new Node(3);
		Node node2 = obj.new Node(5);
		Node node3 = obj.new Node(6);
		Node node4 = obj.new Node(7);
		Node node5 = obj.new Node(8);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		displayWithForLoop(node1);
		System.out.println();
		displayWithWhileLoop(node1);
		System.out.println();
		displayWithRecursion(node1);
		
	}
}