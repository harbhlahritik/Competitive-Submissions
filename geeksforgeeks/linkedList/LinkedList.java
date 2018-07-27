package linkedList;

public class LinkedList {
	
	class Node {
		int data;
		Node next;
		
		//constructor
		public Node (int data) {
			this.data = data;
			next = null;
		}
	}
	
	Node head;
	
	LinkedList () {
		head = null;
	}
	
	void append(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		Node n = head;
		while(n.next!=null) {
			n = n.next;
		}
		n.next = new Node(data);
	}
	
	void push(int data) {
		if(head == null) {
			head = new Node (data);
			return;
		}
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
	
	void insertAfter(Node prev_node,int data) {
		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	void print() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ==> ");
			n = n.next;
		}
		System.out.println();
	}
}
