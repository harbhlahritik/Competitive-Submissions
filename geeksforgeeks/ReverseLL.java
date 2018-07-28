package linkedList;

import linkedList.LinkedList.Node;

public class ReverseLL {
	
	public static Node reversell(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.append(10);
		ll.append(20);
		ll.append(30);
		ll.append(40);
		
		ll.print();
		
		ll.head = reversell(ll.head);
		
		ll.print();
	}
}
